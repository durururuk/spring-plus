# Spring Plus

Health Check API : (IP):8080/actuator/health

## 주요 기능
일정 검색 기능
제목,담당자명,생성일 기준 기간 검색으로 일정을 검색할 수 있습니다. 제목, 담당자는 부분적으로 일치해도 검색이 가능하고, 기간 검색은 처음날짜, 끝 날짜를 같이 요청해야 합니다.

해당 기능 API 명세서

제목으로 검색   
https://beautiful-passive-a2e.notion.site/11df1db8463d80f7afb3cf7cfba0cda0

담당자 닉네임으로 검색  
https://beautiful-passive-a2e.notion.site/11ef1db8463d8033a353d43c7b540d87?pvs=25

생성일 기준 기간 검색  
https://beautiful-passive-a2e.notion.site/11ef1db8463d8094b1bdfa1786ed8946?pvs=25

## AWS

**EC2**

인바운드 : 스프링부트 포트는 IP 전부 열고 SSH는 본인 컴퓨터와 깃헙액션 IP만 열었습니다. 나머지는 차단. 

![chrome_aHqqroShtM](https://github.com/user-attachments/assets/b1496e32-b9f2-4513-8889-92c4b76f802c)

**RDS**

VPC 내부망 제외 전부 차단

![chrome_XvN6IZiVnW](https://github.com/user-attachments/assets/3af95cbb-ab08-4127-9a43-58a68a202268)

**S3**

퍼블릭 전부 차단, 이미지 열람 요청이 오면  Presigned URL만 만들어서 반환

![chrome_aR4s9oYgrS](https://github.com/user-attachments/assets/14d6ced7-6bce-4bf7-bc9d-af152ae1a28f)

## CI/CD With Github Actions

![chrome_QnCL7GO4b6](https://github.com/user-attachments/assets/45d4a46a-ec8b-4f0a-ac53-cd2bfea0db5d)

## 조회 성능 개선
DB테이블에 100만개의 USER 더미데이터를 만들고 닉네임(완전일치)으로 조회했을 때 걸리는 시간을 기준으로 성능 측정, 각 경우마다 50회 측정

1.아무 작업도 하지 않은 쿼리메서드(findByNickname())
 :::평균 실행시간 : 394ms

2.NICKNAME 컬럼에 인덱스 추가 후 1.과 동일한 쿼리메서드
:::평균 실행시간 : 107ms


그 외 추가 실험예정) 
Redis에 DB캐싱한 뒤 조회 실험 


