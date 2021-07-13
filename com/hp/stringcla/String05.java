package com.hp.stringcla;

import java.util.Random;
import java.util.Scanner;
/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 *
 */
public class String05 {
    public static void main(String[] args) {
        String str = createCode();
               System.out.println("验证码为:"+str);
       System.out.println("请输入验证码:(大小写不限)");
        Scanner scan = new Scanner(System.in);
        while(true){
            String input = scan.nextLine();
            if(str.toLowerCase().equals(input.toLowerCase()))
            {
                System.out.println("验证成功!");
                break;

            }else{
                System.out.println("验证码为:"+str);

                System.out.println("输入错误,请重新输入:");

            }
        }
    }
    public static String createCode(){
        String code = "";
        Random rand = new Random();
        for(int i=0;i<5;i++){
            code+=rand.nextInt(2)==0?(char)('A'+rand.nextInt(26)):(char)('a'+rand.nextInt(26));
        }
        return code;
    }
}
