package org.example.test;

public class multiplicationTest {
    
    public static void main(String[] args) {

        System.out.println("===============구구단 mix===============");
        
        // 구구단 mix.
        for(int i = 1; i < 10; i++) {

            for(int j = 1; j < 10; j++) {

                int result = (9 * i) + (8 * j);

                System.out.println("(" + "9 X " + i + ")" + " + " + "(" + "8 X " + j + ")" + " = " + result);

            }

        }
        
    }
    
}
