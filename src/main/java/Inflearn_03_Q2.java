import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *  2. 공통원소구하기(two pointers algorithm)
 *  A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성
 */
public class Inflearn_03_Q2 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 1. a, b 배열을 오른차순으로 먼저 만든다.
        // 배열을 내림차순 정렬할 때는 Collections 클래스의 reverseOrder() 함수를 사용 => Arrays.sort(정렬하고 싶은 배열의 값,Collections.reverseOrder());
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;

        while(p1<n && p2<m) {
            if(a[p1] == b[p2]) {
                answer.add(a[p1]);
                p2++;
            } else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_03_Q2 main = new Inflearn_03_Q2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }
        // 배열을 이용한 for문 => for( 배열구성한 값 :  배열 )
        for(int x : main.solution(n, m, a, b)) System.out.print(x+" ");
    }
}
