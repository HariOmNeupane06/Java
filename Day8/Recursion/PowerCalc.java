public class PowerCalc {

    public static int  CalculatePower(int x, int n ){
if(n==0){
return 1;
}
if(x == 0){
    return 0;
}
        // work
        int xPownm1 = CalculatePower(x, n-1);
        int xPowern = x * xPownm1;
        return xPowern;



    }
    public static void main(String[] args) {
        
int x=2,  n = 5;
int ans =  CalculatePower(x , n);
System.out.println(ans);


    }
}
