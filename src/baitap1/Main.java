package baitap1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE = "D:/MD2_BAI16_BAITAP/src/bai16_baitap/countries.csv";
            br = new BufferedReader(new FileReader(PATH_FILE));
            while ((line = br.readLine())!=null){
                printCountry(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br!=null)
                    br.close();
            }catch (IOException e){

            }
        }
    }
    public static List<String>parseCsvLine(String csvLine){
        List<String>result = new ArrayList<>();
        if (csvLine!=null){
            String[] splistData = csvLine.split(",");
            for (int i = 0; i < splistData.length; i++) {
                result.add(splistData[i]);
            }
        }
        return result;
    }
    public static void printCountry(List<String>country){
        System.out.println("Country [id="+country.get(0)+",code="+country.get(1)+",name="+country.get(2)+"]");
    }
}