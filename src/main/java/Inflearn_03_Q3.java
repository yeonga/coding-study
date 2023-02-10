import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *  3. 최대 매출
 *  현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * 12 15 11 20 25 10 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 */
public class Inflearn_03_Q3 {

    /**
     * 슬라이딩 윈도우 (옆으로 밀고 가는 것)
     * O(n)
     *
     **/
    public int solution(int n, int k, int[] arr) {
        int answer, sum=0;
        for(int i=0; i<k; i++) sum += arr[i];
        answer=sum;
        for(int i=k; i<n; i++) {
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_03_Q3 main = new Inflearn_03_Q3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        // 배열을 이용한 for문 => for( 배열구성한 값 :  배열 )
        System.out.print(main.solution(n, k, arr));
    }
}
