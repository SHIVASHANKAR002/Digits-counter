package com.packages;

import java.util.Scanner;

class count {
    int num;
    int c;
    public void inp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter multiple digits : ");
        num = sc.nextInt();
    }
    public int count(){
        int n = num;
        while (n > 0){
            n /= 10;
            c++;
        }
        return c;
    }
}


public class digitCounter {
    public static void main(String[] args) {
        count co = new count();
        co.inp();
        System.out.println("the numbers you have entered are :" + co.count());
    }

}
