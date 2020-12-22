package xylink.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

/**
 * Created by wangdecheng on 2019/1/10.
 */
public class SNGenerator {
    public static void main(String[] args){
        for(int k=0;k<100;k++) {
            String sn = "7TEST2005";
            for (int i = 0; i < 3; i++) {
                Random random = new Random();
                int r = random.nextInt(26);
                char c = (char) (r + 'A');
                sn += c;
            }
            String encryptStr = sn + ")G$d";
            String md5Sub = DigestUtils.md5Hex(encryptStr).substring(28);
            String correctSn = sn + md5Sub.toUpperCase();
            System.out.println(correctSn);
        }
    }
}
