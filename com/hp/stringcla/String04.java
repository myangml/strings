package com.hp.stringcla;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 *
 */
public class String04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的email地址：");
        String adress = sc.nextLine();
        int a = adress.indexOf("@");
        String sub = adress.substring(0,a);
        System.out.println("sub = " + sub);
    }
}
