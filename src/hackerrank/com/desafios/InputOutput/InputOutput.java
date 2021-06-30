package hackerrank.com.desafios.InputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3 ; i++){
         a.add(scan.nextInt());
        }

        a.forEach(n -> System.out.println(n));
    }
}
