// package Day7;

public class StarPattern {
    public static void main(String[] args) {
        Pattern1(5);
    }
    static void Pattern1(int n){
        for(int row = 0; row < n; row++ ){
            for(int col = 0; col <n -row ;col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}



// * * * * *    row = 5 ;  col 5 
// * * * *
// * * *
// * *
// *