package hackerrank.com.desafios.java.IfElseTest;

import java.util.Scanner;

//Link Challenge: https://www.hackerrank.com/challenges/java-if-else/problem?h_r=next-challenge&h_v=zen

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para analisarmos: ");
        int n = scan.nextInt();

        analyzeNumber an = new analyzeNumber();
        an.analyzeNumber(n);



    }


}
