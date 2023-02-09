
/**
 * 조건에 맞는 도서와 저자 리스트 출력하기
 *  1. '경제' 카테고리에 속하는 도서들의 도서 ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트를 출력하는 SQL문을 작성해주세요.
 * 결과는 출판일을 기준으로 오름차순 정렬해주세요.
 */
public class Programmers_SQL_Join_Q1 {

/*
        SELECT BOOK.BOOK_ID, AUTHOR.AUTHOR_NAME, DATE_FORMAT(BOOK.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
        FROM BOOK
        INNER JOIN AUTHOR ON BOOK.AUTHOR_ID = AUTHOR.AUTHOR_ID
        WHERE BOOK.CATEGORY = '경제'
        ORDER BY BOOK.PUBLISHED_DATE ASC
    */

}
