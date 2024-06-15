//❌  https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1


public class ArmstrongNumber{
    static String armstrongNumber(int n) {
        
        int givenValue = n;
        
        int sum = 0;
        while(n > 0){
            // taking one digit at a time to find the cube of this digit
            int lastDigit = n%10;
            
            // finding cube of this digit
            int cube = lastDigit * lastDigit * lastDigit;
            
            //adding the cube in final value
            sum += cube;
            
            // reducing the given number;
            n = n/10;
        }
        
        if(sum == givenValue){
            return "true";
        }
        
        return "false";
    }
}