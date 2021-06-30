package hackerrank.com.desafios.salesByMatch;

import java.util.ArrayList;
import java.util.Scanner;

//Challenge

public class Main {
    public static void main(String args[])
    {
        SalesByMatch sm = new SalesByMatch();
        ArrayList arTotalSocks = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many socks do you have?");
        int totalSocks = sc.nextInt();

        for (int i=0; i < totalSocks; i++)
        {
            arTotalSocks.add(sc.nextInt());
        }
        sc.close();

        System.out.println(sm.salesByMatch(arTotalSocks));
    }
}
