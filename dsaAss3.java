package com.mycompany.practice;
import java.util.Scanner;
public class dsaAss3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(i)+"*".repeat(6));
        }
    }
}
