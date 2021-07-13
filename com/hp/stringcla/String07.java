package com.hp.stringcla;
import java.util.Scanner;
public class String07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的地址：");
        String adress = sc.nextLine();
        int a = adress.indexOf(".com");
        String sub = adress.substring(4,a);
        System.out.println("sub = " + sub);
    }
}
