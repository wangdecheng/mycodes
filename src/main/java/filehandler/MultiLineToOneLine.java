package filehandler;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by wangdecheng on 2017/12/20.
 */
public class MultiLineToOneLine {

    public static void main(String[] args){

        //updatesql();
        split1();
    }

    private static void updatesql(){
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("data/MultiLineToOneLine"));
            String line;
            while( (line=fileReader.readLine())!=null) {
                String[] fields = line.trim().split(" ");
                System.out.println("update ainemo.libra_conference_number set number='"+fields[0]+"' where number='"+fields[1]+"';");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void split1(){
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("data/MultiLineToOneLine"));
            String line;
            while( (line=fileReader.readLine())!=null) {
                // System.out.println("{\"deviceSN\":\""+line.trim().replace("'","")+"\"}");
                System.out.print(line.trim().replace("'","")+" | ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
