/**
 * Created by Катя on 29.10.2016.
 */
public class second {
    public static double commision (double withdraw){
        return withdraw*0.05;
    }
    public static void main (String[]arg){
        double balance =100;
        double withdraw=10;
        double commision= commision(withdraw);
        if(balance>=(withdraw+commision)){
            System.out.println("OK");
            System.out.println("Commision: "+0.5);
            double res=balance-withdraw-commision;
            System.out.println("Balance after withdrawal "+res);

        }
        else System.out.println("NO");
    }
}
