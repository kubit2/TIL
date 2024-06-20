/*
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12935#
 * 레벨: level1
 * 알고리즘: X
 */

package 프로그래머스;
class SmallNum {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int num : arr){
            if(num != min){
                answer[index++] = num;
            }
        }
        return answer;
    }
}