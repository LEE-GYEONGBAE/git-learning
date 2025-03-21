package com.ohgiraffers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            HashMap<String, Integer> map = new HashMap<>();
//            for(int i = 0; i < input[0]; i++) {
//                String word = br.readLine();
//                if(word.length() < input[1]) {
//                    continue;
//                }
//                map.put(word, map.getOrDefault(word, 0) + 1);
//            }
//
//            int N = 3;
//            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            int width = 2 * inputs.length;
//            int height = input[0] + input[N-1] + IntStream.range(0, N).reduce((a, b) -> Math.abs(inputs[b] - inputs[a])).getAsInt();
//
//            Comparator<Map.Entry<String, Integer>> comparator = (o1, o2) -> o2.getValue() - o1.getValue();
//            new Comparator<Map.Entry<String, Integer>>().thenComparing()
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        test();

    }

    static void test() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = nmx[0], M = nmx[1], x = nmx[2];
            int[] height = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int Q = Integer.parseInt(br.readLine());
            String[] arrD = br.readLine().split(" ");
            int result = 0;
            for(int i = 0; i < Q; i++) {
                if(height[x-1] >= M) {
                    result += height[x-1];
                    height[x-1] = 0;
                }
                switch(arrD[i]) {
                    case "L" -> x = (x-1) % N;
                    case "R" -> x = (x+1) % N;
                    default -> x = x % N;
                }
                for(int j = 0; j < height.length; j++) {
                    height[j]++;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*

*/