/*
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587
 * 레벨: level2
 * 알고리즘: 큐
 */

package 프로그래머스;
import java.util.*;
class Process {
    public int solution(int[] priorities, int location) {

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{i, priorities[i]});
        }

        int answer = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            boolean isMax = true;

            for (int proc[] : queue){
                if (proc[1] > current[1]){
                    isMax = false;
                    break;
                }
            }

            if (!isMax){
                queue.offer(current);
            } else {
                answer++;
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}