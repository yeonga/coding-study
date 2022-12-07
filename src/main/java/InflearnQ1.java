import java.util.Scanner;

/**
 *  01-01
 *  1. 문자 찾기
 *
 *  result = 첫 번째에 못품
 */
public class InflearnQ1 {
    public int solution(String str, char c) {
        int answer=0;
        str=str.toUpperCase();
        c=Character.toUpperCase(c);
        for (char x : str.toCharArray()) {
            if(x==c) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        InflearnQ1 main = new InflearnQ1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();    //문자열 얻어옴
        char character = scanner.next().charAt(0);
            System.out.println(main.solution(str, character));
        }
}
