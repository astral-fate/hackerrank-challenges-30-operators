import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        //return solve();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
      

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          //the percentage of  being added as tip

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //he percentage of  being added as tax

         double tip = (tip_percent*meal_cost/100);
         double tax=(tax_percent*meal_cost/100);
         double total_cost=(meal_cost+tip+tax);
         int rand=(int)Math.round(total_cost);
        //round(double total_cost);
          

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
        
        System.out.println(rand);
    }
}
