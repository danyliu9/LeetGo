class Solution {
    public int[] sortedSquares(int[] A) {
        int[] ret = new int[A.length];

        for (int i = 0; i < A.length; i++){
            int square = A[i];
            ret[i] = square*square;
        }
        
        Arrays.sort(ret);
        return ret;
    }
}