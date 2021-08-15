package Backjoon_001;
//1292번 쉽게 푸는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int idx = 1;
        int result = 0;
        //int[] array = new int[1001];

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                //System.out.println(i);
                if (idx >= n1 && idx <= n2) result += i;
                idx++;
                //array[idx++] = i;

                if (idx > n2) break;
            }
            if (idx > n2) break;
        }

        System.out.println(result);
    }
}
