package baitap1;

import java.io.*;
import java.util.Scanner;

public class Reader_Writer {
    public static void main(String[] args) throws Exception {
        String source = "D:\\MD2_BAI16_BAITAP\\src\\baitap1\\source.txt";
        String target = "D:\\MD2_BAI16_BAITAP\\src\\baitap1\\source.txt";
        Reader_Writer(source,target);
    }
    private static void Reader_Writer(String source,String target){
        {
            Scanner scanner = new Scanner(System.in);
            File sourceFile = new File(source);
            File targetFile = new File(target);
            if (!sourceFile.exists()) {
                System.err.println("tep khong ton tai");
                return;
            }
            boolean next = true;
            if (targetFile.exists()){
                next = false;
                System.err.println("tep da ton tai");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.err.println("tap tin se bi ghi de");
                        next = true;
                        break;
                    case 2:
                        System.err.println("tap tin khong bi ghi de");
                        break;
                }
            }
            if (next){
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
                    String line;
                    while ((line = reader.readLine())!=null){
                        writer.write(line);
                    }
                }catch (IOException e){
                    System.err.println("error");
                }
                System.out.println("coppy thanh cong");
            }
            System.out.println("exit");
        }
    }{

    }
}
