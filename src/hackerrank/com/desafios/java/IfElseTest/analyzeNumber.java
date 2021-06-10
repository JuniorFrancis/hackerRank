package hackerrank.com.desafios.java.IfElseTest;

public class analyzeNumber {
    public void analyzeNumber(int n)
    {

        if(n%2==1 || (n%2==0) && (n>=6 && n<=20) ){
            System.out.println("Weird");
        }
        else{
            if((n%2==0) && (n>=2 && n<=5) || (n>20)){
                System.out.println("Not Weird");
            }
        }

    }


}
