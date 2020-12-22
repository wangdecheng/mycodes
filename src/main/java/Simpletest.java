import org.apache.commons.lang3.StringUtils;

/**
 * Created by wangdecheng on 27/02/2018.
 */
public class Simpletest {

 private static  Simpletest simpletest;
 static int a;
 public static void coutnt(){
    a++;
    System.out.print(a);
 }

 public static void main(String[] args){
    System.out.println(StringUtils.abbreviate("abcdefghijk",6));
 }
}
