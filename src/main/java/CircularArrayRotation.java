
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        System.out.println("Input array =" + Arrays.toString(a));
        System.out.println("Rotation count =" + k);
        System.out.println("Queries =" + Arrays.toString(queries));
        for (int j = 0; j < k; j++) {
            int[] tempArray = new int[a.length];
            for (int i = 0; i < a.length-1; i++) {
                tempArray[i+1] = a[i];
            }
            tempArray[0] = a[a.length-1];
            System.out.println(Arrays.toString(tempArray));
            a = tempArray;
        }
        for(int i=0; i<queries.length; i++){
            queries[i]=a[queries[i]];
        }
        return queries;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            //  bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                //    bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
