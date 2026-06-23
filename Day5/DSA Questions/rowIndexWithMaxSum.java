public class rowIndexWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {10, 20, 30},
            {4, 5, 6}
        };
        int ans = finindSum(arr);
        System.out.println(ans);
        System.out.println();
        
    }

// method written

static int finindSum(int [][] arr){
    int maxSum = Integer.MIN_VALUE;

    int  answerRow = -1;

for(int row = 0; row < arr.length; row++ ){
    int sum= 0;
    for(int  col = 0; col<arr[row].length; col++ ){
sum += arr[row][col];
    }
    if(sum>maxSum){
        maxSum =sum;
        answerRow = row;
    }
}
return answerRow ;
}







}
