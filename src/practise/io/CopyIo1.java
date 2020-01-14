package practise.io;

import java.io.*;

/**
 * @ClassName CopyIo
 * @Description 使用缓冲流实现文件的拷贝，该程序只能实现一种文件类型的拷贝，图片或者文本文件
 * @Author wanghuanle
 * @Date 2020/1/14
 **/
public class CopyIo1 {
    public static void main(String[] args) {
        //文本文件
        final String text = "txt";
        //要复制的文件路径
        File startFile = new File("F:/java-test/test.txt");
        //得到文件名（图片名）
        String startFileName = startFile.getName();
        //得到文件路径
        String start = startFile.getPath();
        //得到.的位置
        int position = startFileName.indexOf(".");
        //取得文件扩展名
        String suffixName = startFileName.substring(position+1);
        try {
            //实现文本文件的复制
            if (suffixName.equals(text)){
                BufferedReader br = new BufferedReader(new FileReader(start));
                BufferedWriter bw = new BufferedWriter(new FileWriter("F:/java-test/Copy"+"."+suffixName));
                String line;
                while ((line = br.readLine())!=null){
                    bw.write(line);
                }
                bw.close();
                br.close();
                //实现图片的复制
            } else{
                BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(start));
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("F:/java-test/Copy1"+"."+suffixName));
                int len;
                while ((len = fileInputStream.read())!=-1){
                    fileOutputStream.write(len);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }
            System.out.println("拷贝成功");
        } catch (IOException e){
            System.out.println("拷贝失败");
        }
    }
}