package hackerrank.com.desafios.salesByMatch;

import java.util.ArrayList;

public class SalesByMatch2 {

    public int SalesByMatch2(ArrayList ar)
    {
        ArrayList pairs = new ArrayList();

        int pair;
        int count = 0;

        for(int i = 0; i < ar.size()-1; i++)
        {
            for (int j = i+1; j< ar.size(); i++)
            {
                if (!ar.contains(ar.get(i)))
                {
                    pairs.add(ar.get(i));
                }

            }

        }
        System.out.println(pairs);
        return 1;
    }

}
