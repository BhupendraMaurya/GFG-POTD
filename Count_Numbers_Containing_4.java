public class Count_Numbers_Containing_4 {

    //❌ First Approach : TC : O(nlogn), as converting any number from integer to string takes O(log n) and ❌
    // searching also takes O(log n).
    public static int countNumberswith4(int n) {
        
        int ans = 0;
        
        // traversing from 1 to n,
        for(int i=1;i<=n;i++){
            
            //taking current number and converting it in String.
            String s = Integer.toString(i);
            
            // checking that current element is present in string or not
            if(s.contains("4")){
                ans++;
            }
        }
        
        return ans;
    }


    private static boolean contains(int n){
        // if number is less than 3, then cant have 4.
        if(n<=3){
            return false;
        }
        
        
        //finding all the digits in current number and searching that 
        // whether it is 4 or not,
        while(n>0){
            int lastDigit = n%10;
            if(lastDigit == 4){
                return true;
            }
            
            n = n/10;
        }
        
        return false;
    }
    
    //TC : O(nlogn);
    // Number of digits: The number of times the loop will run is proportional to the number of digits in n.
    // For a number n, the number of digits is approximately, [log(i)]+1.

    public static int countNumberswith4_(int n) {
        
        int ans = 0;
        
        //In this method, taking all the numbers from 1 to n and
        // check that the current element having 4 or not,
        
        for(int i=1;i<=n;i++){
            if(contains(i)){
                ans++;
            }
        }
        
        return ans;
    }
}


