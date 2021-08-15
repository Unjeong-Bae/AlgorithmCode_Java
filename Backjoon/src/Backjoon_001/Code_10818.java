package Backjoon_001;
//10818번 최소, 최대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (max < num)
            {
                max = num;
            }

            if (min > num)
            {
                min = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);

        // 더 오랜 시간이 소요됨
//		String[] str_array = br.readLine().split(" ");
//		int[] array = Arrays.stream(str_array).mapToInt(Integer::parseInt).toArray();
//		Arrays.sort(array);
//
//		StringBuilder sb = new StringBuilder();
//		sb.append(array[0]).append(" ").append(array[array.length - 1]);
//
//		System.out.println(sb);
    }
}
