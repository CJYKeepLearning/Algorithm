public class LC_773Test {
    public static void main(String[] args) {
        LC_773two test = new LC_773two();
        int[][] board = {{3,2,4},{1,5,0}};
        int res = test.slidingPuzzle(board);
        System.out.println(res);
    }
}
