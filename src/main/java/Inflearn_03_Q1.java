import java.util.ArrayList;
import java.util.Scanner;

/**
 * Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *  1. 두 배열 합치기
 *  오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성
 */
public class Inflearn_03_Q1 {

    // O(n)
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        // p1이나 p2 중 한 개라도 n,m으로 가면 거짓이 됨
        while (p1<n && p2<m) {
            if(a[p1] < b[p2]) answer.add(a[p1++]);      // p1이 가리키는 값을 먼저 answer에 add하고 값을 증가함 (후위 증감 연산자)
            else answer.add(b[p2++]);
        }
        // 둘 중 하나가 끝났을 때 만약 p1의 값이 남아있는 상태라면
        while (p1<n) answer.add(a[p1++]);
        // 둘 중 하나가 끝났을 때 만약 p2의 값이 남아있는 상태라면
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_03_Q1 main = new Inflearn_03_Q1();
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

    // 메소드 만들지 않고 한 번에 출력할 때
    /*
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0; // 두개의 포인터를 선언
        while (p1 < n && p2 < m) { // 두개의 포인터중 길이가 넘칠경우 정지하는 루프 시작
            if (a[p1] < b[p2]) // p1 포인터가 가리키는 값이 더 작으면
                answer.add(a[p1++]);
            else
                answer.add(b[p2++]);
        }

        while (p1 < n) // p1에 남아있는 값들을 answer에 추가
            answer.add(a[p1++]);
        while (p2 < m) // p2에 남아있는 값들을 answer에 추가
            answer.add(b[p2++]);

        for (int integer : answer) {
            System.out.print(integer + " ");
        }
    }
    */
}
