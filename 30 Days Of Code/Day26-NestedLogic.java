import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int actD = scan.nextInt();
        int actM = scan.nextInt();
        int actY = scan.nextInt();
        int expD = scan.nextInt();
        int expM = scan.nextInt();
        int expY = scan.nextInt();
        int fine=0;

        if(actY < expY){fine=0;}

        else{
            if(actY > expY) {fine=10000;}
            else if(actM>expM) {fine=500 * (actM - expM);}
            else if(actD > expD) {fine=15 * (actD - expD);}
        }

        System.out.println(fine);
    }
}