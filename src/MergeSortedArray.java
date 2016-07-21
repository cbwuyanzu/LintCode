class mergeSortedArray {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        for (int i = 0; i < n; i++){
            A[m + i] = B[i];
        }
        for (int i = 0; i < m + n - 1; i++){
            int pos = i;
            for (int j = i + 1; j < m + n; j++){
                if (A[j] < A[pos]){
                    pos = j;
                }
            }
            int temp = A[i];
            A[i] = A[pos];
            A[pos] = temp;
        }
    }
}