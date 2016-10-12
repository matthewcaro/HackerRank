import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        String emailRegEx = "[a-z]+@gmail\\.com$";


        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();

            if (emailID.endsWith("@gmail.com")){
                names.add(firstName);
            }


        }
        Collections.sort(names);
        for (String name : names){
            System.out.println(name);
        }

    }
}