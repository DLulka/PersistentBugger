package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.persistence(999));
    }
    public static int persistence(long n) {
     long multi = 1, ans = 0;
     while(n >= 10){
         while(n > 0) {
             multi = multi * (n % 10);
             n = n / 10 ;
         }
         if(multi >= 10)
             n = multi;
         multi = 1;
         ans ++;
     }
        return (int) ans;
    }
}
