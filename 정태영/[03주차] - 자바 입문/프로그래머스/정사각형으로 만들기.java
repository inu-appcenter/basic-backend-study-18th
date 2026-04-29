class Solution {
    public int[][] solution(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;

        if (rowLength == colLength) return arr;

        int size = Math.max(rowLength, colLength);
        int[][] answer = new int[size][size];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                answer[i][j] = arr[i][j];
            }
            // 나머지는 자동으로 0 (Java 기본값)
        }

        return answer;
    }
}