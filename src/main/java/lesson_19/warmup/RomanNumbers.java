package main.java.lesson_19.warmup;

import java.util.Scanner;

public class RomanNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        System.out.println(romanNumeralToInteger(number));
    }

    public static int romanNumeralToInteger(String input){
        int a=0;
        char c[]=input.toCharArray();
        int j=1;
        for (int i = 0 ;j<=input.length(); i++) {

            if(j!=input.length() && c[i]=='I' &&( c[i+1]=='V' || c[i+1]=='X' || c[i+1]=='L' || c[i+1]=='C' || c[i+1]=='D' || c[i+1]=='M' )){
                a-=1;
            }
            else if(j!=input.length() && c[i]=='V' &&( c[i+1]=='X' || c[i+1]=='L' || c[i+1]=='C' || c[i+1]=='D' || c[i+1]=='M' )){
                a-=5;
            }
            else if(j!=input.length() && c[i]=='X' &&( c[i+1]=='L' || c[i+1]=='C' || c[i+1]=='D' || c[i+1]=='M' )){
                a-=10;
            }
            else if(j!=input.length() && c[i]=='L' &&( c[i+1]=='C' || c[i+1]=='D' || c[i+1]=='M' )){
                a-=50;
            }
            else if(j!=input.length() && c[i]=='C' &&(c[i+1]=='D' || c[i+1]=='M' )){
                a-=100;
            }
            else if(j!=input.length() && c[i]=='D' &&(c[i+1]=='M' )){
                a-=500;
            }


            else if(c[i]=='I'){
                a+=1;
            }
            else if(c[i]=='V'){
                a+=5;
            }
            else if(c[i]=='X'){
                a+=10;
            }
            else if(c[i]=='L'){
                a+=50;
            }
            else if(c[i]=='C'){
                a+=100;
            }
            else if(c[i]=='D'){
                a+=500;
            }
            else if(c[i]=='M'){
                a+=1000;
            }
            j++;
        }
        return a;
    }
}
