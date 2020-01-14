package practise.io;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName RandomNumberIo
 * @Description 随机生成0-99共一百个数，将其存入本地文件(改进之后的方法)
 * @Author wanghuanle
 * @Date 2020/1/14
 **/
public class RandomNumberIo2 {
    private static final int LENGTH = 100;

    public static void main(String[] args) throws IOException {
        int [] numbers = new int[LENGTH];
        Random random = new Random();
        for (int i = 0;i < LENGTH;i++){
            numbers[i] = random.nextInt(LENGTH);
        }
        System.out.println(Arrays.toString(numbers));
        File file = new File("F:/RandomNumber.txt");
        Writer writer = new FileWriter(file,true);
        PrintWriter out = new PrintWriter(writer);
        out.print(Arrays.toString(numbers));
        out.flush();
        out.close();
        writer.close();
    }

}