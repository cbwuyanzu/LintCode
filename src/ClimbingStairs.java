
public class ClimbingStairs {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n == 0 || n == 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
