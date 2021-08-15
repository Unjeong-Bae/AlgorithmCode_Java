package Backjoon_001;
//10870번 피보나치 수5

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Code_10870 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            int result = fibo(n);

            bw.write(Integer.toString(result));

            bw.flush();
            br.close();
            bw.close();
        }
        catch(Exception ex) {ex.printStackTrace();}
    }

    static int fibo(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}
