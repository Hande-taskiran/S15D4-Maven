package org.example;


import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat i saw ?"));
        System.out.println("******************************");
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));

    }
    public static boolean checkForPalindrome(String string){
        String cleaned = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length()-1;
        while(left<right){
            if (cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static String convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binaryResult = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }

        while (!stack.isEmpty()) {
            binaryResult.append(stack.pop());
        }

        return binaryResult.toString();
    }

}