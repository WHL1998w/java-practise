package practise.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName IOPractise
 * @Description 随机生成100以内的随机数，将其存入本地文件(原始方法)
 * @Author wanghuanle
 * @Date 2020/1/13
 **/
public class RandomNumberIo1 {
    public static void main(String[] args) throws IOException {
        //生成100个0-99之间的数将其放入list集合
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            int number = (int) (Math.random() * 100);
            lists.add(number);
        }
        //创建文件夹
        File file = new File("F:/RandomNumber.txt");
        //判断是否有这个文件夹，若没有就创建
        if (!file.exists()) {
            System.out.println("未在指定目录下找到文件名为“RandomNumber.txt”的文本文件！正在创建...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("创建成功！");
        } else {
            Writer writer = new FileWriter(file);
            writer.write(String.valueOf(lists)+"\t");
            writer.close();
            System.out.println("写入成功！");
        }
   }
}