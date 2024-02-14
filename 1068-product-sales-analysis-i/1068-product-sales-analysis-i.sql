# Write your MySQL query statement below

SELECT P.product_name product_name , S.year year, S.priCE price FROM SALES s left JOIN PRODUCT P ON 
S.product_id = P.product_id;