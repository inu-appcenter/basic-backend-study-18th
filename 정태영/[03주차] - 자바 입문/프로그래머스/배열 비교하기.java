class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length)
            return 1;
        else if(arr1.length < arr2.length)
            return -1;
        else if(sum(arr1) == sum(arr2))
            return 0;
        
        int answer = sum(arr1) > sum(arr2) ? 1 : -1;
        
        return answer;
    }
    public static int sum(int[] arr){
        int sum = 0;
        
        for(int num : arr)
            sum += num;
        
        return sum;
        
    }
    
}