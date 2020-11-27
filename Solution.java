import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        int n = scan.nextInt();
        for (int i=0;i<n;i++) {
            arr.add(new ArrayList<Integer>());
        }
        for (int i=0;i<n;i++) {
            int d = scan.nextInt();
            for (int j=0;j<d;j++){
                int num = scan.nextInt();
                arr.get(i).add(num); 
            }
            
        }
        int q = scan.nextInt();
        for (int i=0;i<q;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}


