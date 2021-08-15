package Backjoon_001;
//3460번 이진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sr = new StringBuilder();
        StringBuilder result = new StringBuilder();

        String[] arr = null;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String str = Integer.toBinaryString(N);
            sr.append(str).reverse();
            str = sr.toString();
            arr = str.split("");

            for(int j = 0; j < arr.length; j++) {
                if (arr[j].equals("1"))
                    result.append(j).append(" ");
            }
            arr = null;
            sr.setLength(0);
            result.append("\n");
        }

        System.out.println(result);
    }
}
