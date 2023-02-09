
/**
 * 오프라인/온라인 판매 데이터 통합하기
 *  2. ONLINE_SALE 테이블과 OFFLINE_SALE 테이블에서 2022년 3월의 오프라인/온라인 상품 판매 데이터의 판매 날짜, 상품ID, 유저ID, 판매량을 출력하는 SQL문을 작성해주세요.
 *      OFFLINE_SALE 테이블의 판매 데이터의 USER_ID 값은 NULL 로 표시해주세요.
 *      결과는 판매일을 기준으로 오름차순 정렬해주시고 판매일이 같다면 상품 ID를 기준으로 오름차순, 상품ID까지 같다면 유저 ID를 기준으로 오름차순 정렬해주세요.
 */
public class Programmers_SQL_Q2 {

    /**
     * UNION ALL와 UNION의 차이 => UNION ALL은 중복 허용 / UNION은 중복 제거 & 정렬 발생시킴
     * LEFT JOIN과 RIGHT JOIN은 MYSQL에서 지원을 하지만 FULL OUTER JOIN은 지원하지 않기 때문에  => LEFT JOIN과 RIGHT JOIN을 UNION 해야함
     * FULL OUTER JOIN과 UNION의 차이 => JOIN 은 테이블의 컬럼이 추가되는 형식으로 데이터가 옆으로 연결 / UNION 은 데이터가 추가되는 형식으로 아래에 연결
     **/
/*
    (SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
    FROM ONLINE_SALE
    WHERE YEAR(SALES_DATE) = 2022 AND MONTH(SALES_DATE) = 03
    UNION
    SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
    FROM OFFLINE_SALE
    WHERE YEAR(SALES_DATE) = 2022 AND MONTH(SALES_DATE) = 03)
    ORDER BY SALES_DATE ASC, PRODUCT_ID ASC, USER_ID ASC
    */

}
