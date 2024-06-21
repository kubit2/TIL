/*
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12948
 * 레벨: level1
 * 알고리즘: X
 */

package 프로그래머스;
class Phone {
    public String solution(String phone_number) {
        String answer = "";
        String chg = phone_number.substring(phone_number.length()-4);
        for (int i = 0; i < phone_number.length()-4; i++){
            answer += "*";
        }
        answer += chg;
        return answer;
    }
}