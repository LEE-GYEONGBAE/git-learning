package com.ohgiraffers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int result = 0;
        Calculator.Plus plus = (a, b) -> a + b;
        Calculator.Minus minus = (a, b) -> a - b;
        Calculator.Multiply multiply = (a, b) -> a * b;
        Calculator.Divide divide = (a, b) -> a / b;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫번째 수를 입력해주세요: ");
            int first = sc.nextInt();

            System.out.print("연산자(+ - * /)를 입력해 주세요: ");
            String operator = sc.next();
            if(!"+-*/".contains(operator)) {
                throw new InputMismatchException();
            }

            System.out.print("두번째 수를 입력해주세요: ");
            int second = sc.nextInt();

            result = switch (operator) {
                case "+" -> plus.plus(first, second);
                case "-" -> minus.minus(first, second);
                case "*" -> multiply.multiply(first, second);
                case "/" -> divide.divide(first, second);
                default -> throw new RuntimeException();
            };

            System.out.println("연산 결과: " + result);
        } catch(InputMismatchException e) {
            System.err.println("입력 값 오류");
        } catch(ArithmeticException e) {
            System.err.println("연산 오류");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
