package com.codetoday;

public class Main {

    public static void main(String[] args) {

        // write your code here
        call(3);



    }
    private  static void call(int value) {

        if(value >0) {
            System.out.println("Value is :: " + value );
            call(value -1);
            call(value -1);
        }
    }
}

