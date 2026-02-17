public class twoDWaveArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int col=arr[0].length;
        int row=arr.length;
        for(int i=0;i<col;i++){
            if(i%2==0) {
                for(int j=0;j<row;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }

            if (i % 2 != 0) {
                for (int j = row-1; j>=0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }

    }
}
