public class matrixMul {
    public static void main(String[] args) {
        int[][] m1={{1,2,3},{4,5,6}};
        int[][] m2={{1,1},{1,2},{2,1}};
        int row=m1.length;
        int col=m2[0].length;
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                int sum=0;
                for(int k=0;k<m1[0].length;k++) {
                    int temp = m1[i][k]*m2[k][j];
                    sum+=temp;
                }
                ans[i][j]=sum;
            }
        }
        for (int[] res : ans) {
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }    
}
