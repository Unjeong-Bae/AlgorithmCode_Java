package Backjoon_001;
//2693번 N번째 큰 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] array = null;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            array = new int[10];
            for(int j = 0; j < 10; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array);
            sb.append(array[7]).append("\n");

            //int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //Arrays.sort(array);
            //System.out.println(array[array.length - 3]);
        }

        System.out.println(sb.toString());
    }
}
