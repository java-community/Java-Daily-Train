package com.java;

import java.io.*;

/**
 * @Author: mzy
 * @Date: 2019-1-22 17:36
 */
public class Out_In_Put {
    /**
     * @输入流和输出流
     */
    public static void main(String[] args) {
        try{
            //构造一个BufferedReader对象
            File f=new File("myfile.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            System.out.println("请输入一行字符串：");
            while((br.readLine())!="bye"){//读一行
                String line=br.readLine();
                System.out.println("输出："+line);
                bw.write(line);
                bw.newLine(); //在文件里换行
            }
            //关闭流
            br.close();
            bw.flush();
            bw.close();
            System.out.println("文件输入成功!");
        }catch(FileNotFoundException ex){
            System.out.println("文件找不到");
        }catch(IOException ex){
            System.out.println("文件输入输出异常");
            ex.printStackTrace();
        }
    }
}
