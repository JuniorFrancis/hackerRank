package hackerrank.com.desafios.arraySum;

import java.util.List;
//Link Challeng: https://www.hackerrank.com/challenges/simple-array-sum/problem

public class Main {
    public static void main(String[] args) {
        List<Integer> ar = List.of(10, 30, 12, 19, 3);

        arraySum sumArray = new arraySum();
        System.out.println(sumArray.sumArray(ar));


    }
}
