import java.util.Scanner;

/**
 *  01-02
 *  2. 대소문자 변환
 *
 *  result = 첫 번째 성공
 *
 *  memo1 = isUpperCase, isLowerCase는 대소문자 확인하는 것으로 Character 타입에서 사용되는 것이다.
 *  memo2 = foreach문 사용하는 법 잘 알기. 많이 사용함
 *
 */
public class InflearnQ2 {

    // 내 풀이
    public String solution1(String str) {
        String answer = "";
        for (Character x : str.toCharArray()) {
            answer += (Character.isUpperCase(x)) ? x.toString().toLowerCase() : x.toString().toUpperCase();

            // 인강 풀이 후 소스 update
            // answer += (Character.isUpperCase(x)) ? Character.toLowerCase(x) : Character.toUpperCase(x);
        }
        return answer;
    }

    // 인강 풀이
    public String solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            // 방법 1.
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

            // 방법 2. ASKI NUM 대문자 : 65~90 & 소문자 : 97~122까지 => 대소문자 32 차이 남 (97-65) => 소문자(더 큰 숫자)에서 32 빼면 대문자가 됨
            // character는 정수형이므로 숫자와 비교 됨
            if(x>=97 && x<=122) answer += (char)(x-32);             // 소문자 -> 대문자
            else answer += (char)(x+32);                                    // 대문자 -> 소문자
        }
        return answer;
    }

    public static void main(String[] args) {
        InflearnQ2 main = new InflearnQ2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(main.solution1(str));
    }
}
