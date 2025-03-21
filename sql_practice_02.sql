-- JOIN을 이용하여 여러 테이블을 조회 시에는 모든 컬럼에 테이블 별칭을 사용하는 것이 좋다.

-- 1. 직급이 대리이면서 아시아 지역에 근무하는 직원의 사번, 이름, 직급명, 부서명, 지역명, 급여를 조회하세요
SELECT E.EMP_ID
	 , E.EMP_NAME
     , J.JOB_NAME
     , DL.DEPT_TITLE
     , DL.LOCAL_NAME
     , E.SALARY
  FROM EMPLOYEE E
  JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
  JOIN (SELECT D.DEPT_ID
			 , D.DEPT_TITLE
			 , L.LOCAL_NAME
		  FROM DEPARTMENT D
          JOIN LOCATION L
            ON D.LOCATION_ID = L.LOCAL_CODE
	 ) DL
    ON E.DEPT_CODE = DL.DEPT_ID
 WHERE DL.LOCAL_NAME LIKE 'ASIA%'
 ;
-- 2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원의 이름, 주민등록번호, 부서명, 직급명을 조회하세요.
SELECT E.EMP_NAME
	 , E.EMP_NO
     , D.DEPT_TITLE
     , J.JOB_NAME
  FROM EMPLOYEE E
  JOIN DEPARTMENT D
    ON E.DEPT_CODE = D.DEPT_ID
  JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
 WHERE E.EMP_NO LIKE '7%-2%'
   AND E.EMP_NAME LIKE '전%'
   ;
-- 3. 이름에 '형'자가 들어가는 직원의 사번, 이름, 직급명을 조회하세요.
SELECT E.EMP_ID
	 , E.EMP_NAME
     , J.JOB_NAME
  FROM EMPLOYEE E
  JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
 WHERE E.EMP_NAME LIKE '%형%'
 ;
-- 4. 해외영업팀에 근무하는 직원의 이름, 직급명, 부서코드, 부서명을 조회하세요.
SELECT E.EMP_NAME
	 , J.JOB_NAME
     , D.DEPT_ID
     , D.DEPT_TITLE
  FROM EMPLOYEE E
  JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
  JOIN DEPARTMENT D
    ON E.DEPT_CODE = D.DEPT_ID
 WHERE D.DEPT_TITLE LIKE '해외영업%'
 ;
-- 5. 보너스포인트를 받는 직원의 이름, 보너스, 부서명, 지역명을 조회하세요.
SELECT E.EMP_NAME
	 , E.BONUS
     , DL.DEPT_TITLE
     , DL.LOCAL_NAME
  FROM EMPLOYEE E
  JOIN (SELECT D.DEPT_ID
			 , D.DEPT_TITLE
			 , L.LOCAL_NAME
		  FROM DEPARTMENT D
          JOIN LOCATION L
            ON D.LOCATION_ID = L.LOCAL_CODE
	 ) DL
    ON E.DEPT_CODE = DL.DEPT_ID
 WHERE E.BONUS IS NOT NULL
 ;
-- 6. 부서코드가 D2인 직원의 이름, 직급명, 부서명, 지역명을 조회하세오.
SELECT E.EMP_NAME
     , J.JOB_NAME
     , DL.DEPT_TITLE
     , DL.LOCAL_NAME
  FROM EMPLOYEE E
  JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
  JOIN (SELECT D.DEPT_ID
			 , D.DEPT_TITLE
			 , L.LOCAL_NAME
		  FROM DEPARTMENT D
          JOIN LOCATION L
            ON D.LOCATION_ID = L.LOCAL_CODE
	 ) DL
    ON E.DEPT_CODE = DL.DEPT_ID
 WHERE E.DEPT_CODE = 'D2'
 ;
-- 7. 한국(KO)과 일본(JP)에 근무하는 직원의 이름, 부서명, 지역명, 국가명을 조회하세요.
SELECT E.EMP_NAME
	 , DLN.DEPT_TITLE
     , DLN.LOCAL_NAME
     , DLN.NATIONAL_NAME
  FROM EMPLOYEE E
  JOIN (SELECT D.DEPT_ID
			 , D.DEPT_TITLE
			 , LN.LOCAL_NAME
             , LN.NATIONAL_CODE
             , LN.NATIONAL_NAME
		  FROM DEPARTMENT D
          JOIN (SELECT L.LOCAL_CODE
					 , L.LOCAL_NAME
					 , N.NATIONAL_CODE
                     , N.NATIONAL_NAME
				  FROM LOCATION L
                  JOIN NATION N
                    ON L.NATIONAL_CODE = N.NATIONAL_CODE
				) LN
            ON D.LOCATION_ID = LN.LOCAL_CODE
	 ) DLN
    ON E.DEPT_CODE = DLN.DEPT_ID
 WHERE DLN.NATIONAL_CODE IN ('KO', 'JP')
 ;