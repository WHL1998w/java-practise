package practise.io;

import java.io.*;

/**
 * @ClassName CopyIo1
 * @Description 使用不同的缓冲流复制文本文件和图片
 * @Author wanghuanle
 * @Date 2020/1/14
 **/
public class CopyIo2 {
    public static void main(String[] args) throws IOException {
        //1.实现文本文件的复制
        //要复制的文本文件路径
        File startFile = new File("F:/java-test/test.txt");
        BufferedReader br = new BufferedReader(new FileReader(startFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:/java-test/Copy.txt"));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
        }
        bw.close();
        br.close();
        System.out.println("文本文件复制成功");
        //2.实现图片的复制
        //要复制的图片路径
        File startFile1 = new File("F:/java-test/1.jpg");
        BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(startFile1));
        BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("F:/java-test/Copy1.jpg"));
        int len;
        while ((len = fileInputStream.read())!=-1){
            fileOutputStream.write(len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        System.out.println("图片复制成功");
    }
}