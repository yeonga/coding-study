import java.util.Scanner;

/**
 * 01-03
 * 3. 문장 속 단어
 * <p>
 * result = 실패
 * <p>
 * 내가 시도하려던 것은 split(" ")으로 공백으로 잘라 그것의 개수를 비교하여 값을 도출하려는 것이었음
 * 실패 원인 : 한 문장 -> scanner.nextLine() 사용
 */
public class InflearnQ3 {

    // 내 풀이
    public String solution(String str) {
        String answer = "";
        int num = 0;
/*        // 1. 인강 풀이 후 소스 update
        int num = Integer.MIN_VALUE;          // 가장 작은 값으로 초기화됨*/

/*        // 2. 인강 풀이 다른 방법
        int num = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > num) {
                num = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        // 마지막 단어는 str에 공백이 없기 때문에 처리해줘야함
        if (str.length() > num) answer = str;*/

        String[] strList = str.split(" ");
        for (String i : strList) {
            if (i.length() > num) {
                num = i.length();
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InflearnQ3 main = new InflearnQ3();
        Scanner scanner = new Scanner(System.in);
        // 실패의 원인 - 단어가 아니라 한 문장이므로 scanner.next가 아니라 scanner.nextLine을 사용해야함
        String str = scanner.nextLine();
        System.out.println(main.solution(str));
    }
}
