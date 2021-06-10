package hackerrank.com.desafios.algorithms.arraySum;

import java.util.List;

public class arraySum {


    public int sumArray(List<Integer> ar)
    {
        int currentSum = 0;
        for(int i = 0; i < ar.size(); i++)
        {
            currentSum+= ar.get(i);
        }

        return currentSum;
    }
}
