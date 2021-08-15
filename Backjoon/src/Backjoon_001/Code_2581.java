package Backjoon_001;
//2581번 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = n2;
        StringBuilder sb = new StringBuilder();

        for (int i = n1; i <= n2; i++) {
            int cnt = 0;
            if (i == 1) continue;
            for (int j = 2; j <= Math.sqrt((double)i); j++) {
                if (i % j == 0) cnt++;
            }

            if (cnt == 0) {
                sum += i;
                if (min > i) min = i;
            }
        }

        if (sum == 0) sb.append(-1);
        else {
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb.toString());
    }
}
