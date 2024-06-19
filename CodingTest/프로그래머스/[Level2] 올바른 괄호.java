/*
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * 레벨: level2
 * 알고리즘: 스택
 */

package 프로그래머스;
import java.util.*;

class Bracket {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            // 문자열 한 글자씩 받아서 ( 이면 스택에 ( 푸시
            if (s.charAt(i) == '('){
                st.push('(');
                // 문자열 한 글자씩 받아서 ) 이면,
                // 스택 맨 위에서 꺼내어서 ) 에 대응하는 (를 제거
            } else if (s.charAt(i) == ')'){
                if (st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }
}