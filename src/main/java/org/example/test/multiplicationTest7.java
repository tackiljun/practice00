package org.example.test;

public class multiplicationTest7 {
    
    public static void main(String[] args) {
        
        // test.
        // for(int i = 1; i < 10; i++) {

        //     for(int j = 2; j < 10; j++) {

        //         // System.out.println(j + " X " + i + " = " + j * i);
                
        //         // 줄여서 바꿔보고.

        //         // System.out.println(j + " X " + i + " = " + (j * i));
        //         // 괄호쳐도 변화없고.

        //     }

        // }

        // j로 i를 감싸보자.
        for(int j = 2; j < 10; j++) {

            for(int i = 1; i < 10; i++) {

                System.out.println(j + " X " + i + " = " + j * i);

                // 완성.

            }
        }

    }
}
