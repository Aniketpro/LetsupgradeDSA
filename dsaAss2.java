
package com.mycompany.practice;
import java.util.Scanner;
public class dsaAss2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int start;
        int prev;
        for(int i = 1; i<=5; i++){
            if(i%2 != 0){
                start=1;
                prev = start;
                System.out.print(start+" ");
                for(int j = 1; j<i; j++){
                    if(prev == 1){
                        System.out.print(0+" ");
                        prev = 0;
                    }
                    else{
                        System.out.print(1+" ");
                        prev = 1;
                    }
                }
            }
            
            else{
                start=0;
                prev = start;
                System.out.print(start+" ");
                for(int j = 1; j<i; j++){
                    if(prev == 1){
                        System.out.print(0+" ");
                        prev = 0;
                    }
                    else{
                        System.out.print(1+" ");
                        prev = 1;
                    }
                }
            }
            System.out.println();
        }
    }
}
