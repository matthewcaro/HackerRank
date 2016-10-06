import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    static String isPrime(int k){
        String prime = "Prime";
        String notPrime = "Not prime";
        if (k==1){return notPrime;}
        if (k==2 || k==3){return prime;}
        else{
            for (int j =2; j < (k/2); j++){
                if (k%j == 0){return notPrime;}
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i =0; i<n; i++){
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i<n; i++){
            System.out.println(isPrime(numbers[i]));
        }

    }
}