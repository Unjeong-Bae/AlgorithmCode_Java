package Backjoon_001;
//2460번 지능형 기차 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2460 {
    public static void main(String[] args) throws IOException {
        int max = -1;
        int now = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            //System.out.println(st.nextToken());
            //System.out.println(st.nextToken());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            now = now - out + in;
            if (max < now)
                max = now;

            st = null;
        }

        System.out.println(max);
    }
}
