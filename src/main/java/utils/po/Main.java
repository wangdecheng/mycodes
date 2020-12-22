package utils.po;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by wangdecheng on 2019/1/19.
 */
public class Main {

    public static void main(String[] args){
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("data/create.sql"));
            StringBuilder sb = new StringBuilder();
            String line;
            while( (line=fileReader.readLine())!=null) {
                sb.append("'"+line.trim().replace("'","")+"',");
                //sb.append(line.trim().replace("'","")+"|");
            }
            System.out.println(sb.substring(0,sb.length()-1));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
