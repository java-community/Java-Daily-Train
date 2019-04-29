package com.java;


import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import java.io.File;
import java.util.ArrayList;


/**
 * 说明:使用zip4j进行对zip文件进行加解密
 * @Author: mzy
 * @Date: 2019-4-29 17:26
 */
public class ZipEncryption {
    //加密
    public static void encryption() throws Exception {
        ZipFile zipFile = new ZipFile("C:\\Users\\hasee\\Desktop\\111.zip");
        ArrayList filesToAdd = new ArrayList();
        filesToAdd.add(new File("c:\\1.log"));
        filesToAdd.add(new File("d:\\1.pdf"));
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(true);
        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
        parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
        parameters.setPassword("123");
        zipFile.addFiles(filesToAdd, parameters);
    }

    //解密
    public static void Decrypt() throws Exception {
        ZipFile zipFile = new ZipFile("C:\\Users\\hasee\\Desktop\\111.zip");
        if (zipFile.isEncrypted()) {
            zipFile.setPassword("123");
        }
        zipFile.extractAll("C:\\Users\\hasee\\Desktop\\11111\\");
    }

    public static void main(String[] args) throws Exception {
        encryption();
        Decrypt();
    }
}
