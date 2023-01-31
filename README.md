# [비트캠프 - 해커톤] 관리 시스템 만들기(백엔드 + 프론트엔드)
![html](https://img.shields.io/badge/HTML5-dd4b24?style=flat-square&logo=HTML5&logoColor=white) 
![css](https://img.shields.io/badge/CSS3-3595cf?style=flat-square&logo=CSS3&logoColor=white) 
![JS](https://img.shields.io/badge/JS-yellow?style=flat-square&logo=Javascript&logoColor=white) 
![java](https://img.shields.io/badge/Java-017397?style=flat-square&logo=Java&logoColor=white) 
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white) 
![Eclipse](https://img.shields.io/badge/Eclipse-2c1f54?style=flat-square&logo=eclipse&logoColor=white) 

## 해커톤 과제 내용
<details>
<summary>여기를 눌러주세요</summary>
  <div markdown="1">       

    1. 해커톤 과제:

    - 자유 주제로 CRUD 기능이 구현된 관리 시스템을 만든다.
    - 백엔드는 스프링부트 기반으로 구현한다.
    - 프론트엔드는 HTML, CSS, JavaScript, AJAX, JSON 기술을 활용하여 구현한다.
    - 백엔드 또는 프론트엔드를 구현할 때 외부 라이브러리를 이용할 수 있다.
    - 최종적으로 프로젝트를 구현한 과정 및 결과를 발표한다.
    - 팀 프로젝트를 관리를 위해 git 저장소를 이용해야 한다.


    2. 과제 제출 조건:

    - zip 압축파일로 제출할 것.
    - 백엔드, 프론트엔드 소스를 별도의 디렉토리로 분류할 것.
    - 압축 파일을 풀었을 때 디렉토리 구조는 다음과 같아야 한다.

      - hackathon2-backend/
      - hackathon2-frontend/

    - 팀원 각자가 팀 프로젝트 파일을 제출할 것
    - 제출 내용에 다음과 같이 팀명 및 팀원을 명시할 것

       예) 1팀: 홍길동, 임꺽정, 유관순, 안중근, 윤봉길


    3. 제출 마감일:

    - 개발 기간: 2023-01-13 16:00 ~ 2023-01-16 16:00 (토,일 포함)
    - 발표: 2023-01-16 16:00 ~ 2023-01-16 18:00
    - 제출: 2023-01-16 18:00


    4. 구성원(5팀): 서영훈, 서길원, 양창덕, 안진수, 이성민

  </div>
</details>

<br/>

## 해커톤 프로젝트명 : CRUD를 적용한 배송관리시스템
### 1. 프로젝트 컨셉
 - 쇼핑몰에서 발송하는 배송물(택배)을 배송관리시스템으로 관리
 - 전체현황 : 배송현황 / 배송준비 / 배송중 / 배송 완료

<br/>

 ### 2. Backend 파트
  - delivery class에 사용할 변수 선언
  - 이클립스 소스 기능을 이용하여 getter, setter를 만들었음
  - @Configuration을 사용하여 인스턴스를 자동 생성
  - CORS 해결을 위하여 addCorsMappings 메소드를 사용
  - 관리 시스템 구현에 필요한 Method들을 DeliveryDao에 선언함
  - CRUD 구현을 위한 Method <br/>
    @PostMapping <br/>
    @GetMapping <br/>
    @PutMapping <br/>
    @DeleteMapping <br/>

### 3. Frontend 파트
  - BootStrap DashBoard 사용
  - PostMapping 경우, 입력받은 데이터를 innerHTML를 이용하여 tbody에 출력
  - 실시간 데이터 출력
  - 실시간 배송현황 카운트
  - 카카오 주소찾기 Api 적용
  - 적용 버튼 구현 및 변경/삭제 <br/>

### 4. 기타사항
  - 깃허브 팀레포 생성하여 적용
