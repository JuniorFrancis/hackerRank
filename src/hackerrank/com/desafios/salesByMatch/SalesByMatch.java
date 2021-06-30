package hackerrank.com.desafios.salesByMatch;

import java.util.ArrayList;

public class SalesByMatch {

    public int salesByMatch(ArrayList ar)
    {
        ArrayList pairs = new ArrayList();
        int currentTotalPairs = 0;
        int count = 0;
        int finalTotal = 0;
        int restDivision = 0;

        for(int i = 0; i < ar.size(); i++)
        {
            if (!pairs.contains(ar.get(i)))
            {
                pairs.add(ar.get(i));
            }
        }

        for(int i = 0; i < pairs.size(); i++)
        {
            for (int j = 0; j < ar.size(); j++)
            {
                if (pairs.get(i) == ar.get(j))
                {
                    count++;
                }
            }
            if(count>1)
            {
                restDivision = count % 2;
                currentTotalPairs = (count / 2 ) - restDivision;
                finalTotal += currentTotalPairs;
                count=0;
            }
        }
        return finalTotal;
    }

}
