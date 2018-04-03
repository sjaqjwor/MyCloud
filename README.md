#MyCloud

나만의 클라우드 시스템


1 소개하기
사진 및 동영상, 공부자료등 나만의 정리 페이지를 만들고 싶었습니다.   

2 시작하기
작업은 Ubuntu+Intellj+java8 환경에서 작업을 했습니다.<br />
이 프로젝트에는 다음과 같은 **의존성 프로젝트**가 포함되어 있습니다.<br />

**pom.xml**에 이와같이 **의존성 프로젝트**를 추가 해주세요<br />

```xml
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

##저자
 * **이승기**
 
