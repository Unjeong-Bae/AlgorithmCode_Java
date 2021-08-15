package Backjoon_001;
//1978번 소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            int cnt2 = 0;
            int num = Integer.parseInt(st.nextToken());
            for(int j = 2; j <= num; j++) {
                if (num % j == 0) cnt2++;
            }

            if (cnt2 == 1) cnt++;
        }
        System.out.println(cnt);
    }
}
