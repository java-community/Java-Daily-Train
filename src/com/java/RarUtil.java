package com.java;

import java.io.File;
import java.io.FileOutputStream;

import de.innosystec.unrar.Archive;
import de.innosystec.unrar.rarfile.FileHeader;

public class RarUtil {

    /**
     * 描述：支持rar解压
     * @param args
     */
    public static void main(String[] args) {
        String filename = "C:/Users/hasee/Desktop/4444.rar";
        File f = new File(filename);
        Archive a = null;
        try{
            a = new Archive(f, "1234", false);  //extract mode
        }catch(Exception e){
            e.printStackTrace();
        }

        if(a!=null){
            a.getMainHeader().print();
            FileHeader fh = a.nextFileHeader();
            while (fh != null) {
                try {
                    File out = new File("C:/Users/hasee/Desktop/aa/"
                            + fh.getFileNameString().trim());
                    System.out.println(out.getAbsolutePath());
                    FileOutputStream os = new FileOutputStream(out);
                    a.extractFile(fh, os);
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fh = a.nextFileHeader();
            }
        }
    }
}
