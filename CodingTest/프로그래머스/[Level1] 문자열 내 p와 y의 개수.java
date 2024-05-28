/*
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
 * 레벨: level1
 * 알고리즘: X
 */

package 프로그래머스;
class Solution {
    boolean solution(String s) {
        int pCount = 0; // p의 개수
        int yCount = 0; // y의 개수

        s = s.toLowerCase(); // 소문자 변환

        for (int i = 0; i < s.length(); i++){
            // 문자열을 한 글자씩 받아서, p인지 y인지 판별
            char c = s.charAt(i);
            if ( c == 'p'){
                pCount++; // p의 개수 추가
            } else if ( c == 'y'){
                yCount++; // y의 개수 추가
            }
        }

        return pCount == yCount; // p의 개수와 y의 개수가 같으면 True, 다르면 False 리턴
    }
}