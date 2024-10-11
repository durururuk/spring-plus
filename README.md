# Spring Plus

Health Check API : (IP):8080/actuator/health

## 주요 기능
일정 검색 기능
제목,담당자명,생성일 기준 기간 검색으로 일정을 검색할 수 있습니다. 제목, 담당자는 부분적으로 일치해도 검색이 가능하고, 기간 검색은 처음날짜, 끝 날짜를 같이 요청해야 합니다.

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
