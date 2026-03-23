class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int inputIndex = n;
        for(int answerIndex=0; answerIndex < answer.length; answerIndex++){
            answer[answerIndex] = num_list[inputIndex%num_list.length];
            inputIndex++;
        }
        
        
        return answer;
    }
}