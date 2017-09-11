package com.theironyard.installparty;
import java.util.Scanner;

public class Main {

    public static int main(int args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

        int zero = 0;
        int one = 1;

        if (n == 0) {
            System.out.println(zero);
        } else if (n <=  2){
            System.out.println(one);
        }
        int m1;
        int m2;
        m1 = main(n - 1);
        m2 = main(n - 2);
        int fib = m1 + m2;
        System.out.println(fib);

        return fib;
    }

}

