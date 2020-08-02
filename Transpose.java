
public class Transpose {
    public int [][] transpose(int [][] arr){
        int colLength = arr[0].length;
        int rowLength = arr.length;

        int [][] transposeArr = new int[colLength][rowLength];
        for(int col = 0; col < colLength; col++){
            for(int row = 0; row < rowLength; row++){
                transposeArr[col][row] = arr[row][col];
            }
        }
        return transposeArr;
    }

    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 10, 100},
                { 3, 4, 11, 101},
                { 5, 6, 12, 102},
                { 7, 8, 13, 103},
                { 9, 10,14, 104},
        };

        Transpose transpose = new Transpose();
        int arrResult [][] = transpose.transpose(arr);

        for (int row = 0; row < arrResult.length; row++){
            for ( int col = 0; col < arrResult[row].length; col++){
                System.out.printf("%3d ",arrResult[row][col]);
            }
            System.out.println();
        }
    }
}
