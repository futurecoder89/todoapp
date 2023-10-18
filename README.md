# todoapp

소개: 스프링 연습용 todo앱입니다
연습내용
1. 의존성 주입
2. 데이터베이스 연결 - h2 데이터베이스에 연결함. /build.gradle에 의존 추가 runtimeOnly 'com.h2database:h2'
3. 새로운 어노테이션 사용해보기 -   1) GETTER / SETTER. auto-gerate기능으로 안하고 어노테이션으로 해봤습니다
                                 2) @Table(name= "테이블명") 테이블과 자동연결
                                 3)ALLArgsConstructor //생성자 자동생성 4)NoArgsConstructor //빈 기본생성자

기능
1. input type = text에 문자열 입력하면 데이터베이스에 저장되고 그 정보를 화면에 띄웁니다.

