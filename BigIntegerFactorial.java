import java.math.BigInteger;

public class BigIntegerFactorial {

 
    public static void main(String[] args) {

        calculateFactorial(100);

    }
   public static void calculateFactorial(int n) {

         

        BigInteger result = BigInteger.ONE;

        for (int i=1; i<=n; i++) {

            result = result.multiply(BigInteger.valueOf(i));

        }

        System.out.println(n + "! = " + result);
        
        
        String digits = result.toString();
        
        
        int sum=0;
 for(int i = 0; i < digits.length(); i++) {
    int digit = (int) (digits.charAt(i) - '0');
    sum = sum + digit;
}

System.out.println(sum);  
   
   
    

    }

     

}
