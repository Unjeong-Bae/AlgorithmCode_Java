package Backjoon_001;
//2501번 약수 구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2501 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for(int i = 1; i <= N; i++) {
                if (N % i == 0) cnt++;
                if (cnt == K) {
                    System.out.println(Integer.toString(i));
                    break;
                }
            }

            if (K > cnt) System.out.println("0");
            br.close();
        }
        catch(Exception ex) { ex.printStackTrace(); }
    }
}
