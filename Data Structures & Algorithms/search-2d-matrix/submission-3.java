class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lRow = 0;
        int rRow = matrix.length - 1;

        while (lRow <= rRow) {
            int midRow = (lRow + rRow) / 2;
            int first = matrix[midRow][0];
            int last = matrix[midRow][matrix[midRow].length - 1];

            if (target < first) {
                rRow = midRow - 1;
            } else if (target > last) {
                lRow = midRow + 1;
            } else {
                int l = 0;
                int r = matrix[midRow].length - 1;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    int val = matrix[midRow][mid];
                    if (val == target) {
                        return true;
                    } else if (val < target) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}