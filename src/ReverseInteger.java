
public class ReverseInteger {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // IMPORTANT: Please reset any member data you declared, as  
        // the same Solution instance will be reused for each test case.  
        long sum = 0;   
          
        while(n != 0)  
        {  
            int temp = n % 10;  
            sum = sum * 10 + temp;  
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)   //Òç³ö´¦Àí  
            {  
                return 0;  
            }  
            n = n / 10;  
        }  
        return (int) sum;  
    }  
}; 