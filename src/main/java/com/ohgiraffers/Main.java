package com.ohgiraffers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            System.out.println(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
