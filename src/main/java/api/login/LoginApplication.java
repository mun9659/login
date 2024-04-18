package api.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

	// Security 없이 확장성을 넓힌 Oauth2.0를 이용한 네이버, 카카오, 구글 로그인
	// https://ttl-blog.tistory.com/1434#hELLO

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
