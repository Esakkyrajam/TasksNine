CREATE DATABASE employee

USE employee

SELECT ename, sal
FROM employees
WHERE sal >= 2200;


SELECT *
FROM employees
WHERE comm IS NULL OR comm = 0;


SELECT ename, sal
FROM employees
WHERE sal NOT BETWEEN 2500 AND 4000;


SELECT ename, job, sal
FROM employees
WHERE mgr IS NULL;


SELECT ename
FROM employees
WHERE ename LIKE '__A%';


SELECT ename
FROM employees
WHERE ename LIKE '%T';

