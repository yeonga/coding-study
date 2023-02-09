
/**
 * 오프라인/온라인 판매 데이터 통합하기
 * 1. CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요.
 *     이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.
 */
public class Programmers_SQL_Q1 {

    // 소수점 반올림 할 때 ROUND 사용, 소수 첫 번째 자리는 0, 두 번째 자리는 1, 일의 자리는 -1, 십의 자리는 -2 ...
/*
    SELECT ROUND(AVG(DAILY_FEE), '0') AS AVERAGE_FEE
    FROM CAR_RENTAL_COMPANY_CAR
    WHERE CAR_TYPE = 'SUV'
    */

}
