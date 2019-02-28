class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 == 1 && A[right] % 2 == 0) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                right--;
                left++;
            } else if (A[left] % 2 == 0) {
                left++;
            } else if (A[right] % 2 == 1) {
                right--;
            }   
        }
        
        return A;   
    }
}
