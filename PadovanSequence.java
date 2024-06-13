//  https://www.geeksforgeeks.org/problems/padovan-sequence2855/1

// This problem is same as fibonacci series and can be solved using recursion, both dp ways(memoization and tabulation) and space optmization
class PadovanSequence
{
    
  public int padovanSequence(int n)
    {
        int a = 1;
        int b = 1;
        int c = 1;
        
        int d = 0;
        
        for(int i=3;i<=n;i++){
            d = (a + b)%1000000007;
            a = b;
            b = c;
            c = d;
        }
        
        return c;
        
    }
    
}
