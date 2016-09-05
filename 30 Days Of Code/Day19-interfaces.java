//Write your code here
class Calculator implements AdvancedArithmetic{
    
    private int sum = 0;
    public int divisorSum(int n){
        for (int i = n; i>0;i--){
            if (n%i == 0){
                sum+=i;
            }
        }
        return sum;
    }
}