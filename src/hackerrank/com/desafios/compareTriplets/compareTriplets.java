package hackerrank.com.desafios.compareTriplets;

import java.util.List;

public class compareTriplets {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int bobPoints = 0;
        int alicePoints = 0;

        for (int i = 0; i < a.size(); i++)
        {

            if(b.get(i) > a.get(i))
            {
                bobPoints++;
            }else if(a.get(i) > b.get(i))
            {
                alicePoints++;
            }
        }

        List<Integer> points =  List.of(alicePoints, bobPoints);
        return points;


    }
}
