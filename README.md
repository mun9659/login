# OAuth2.0을 이용한 로그인 방식

## Security 없이 확장성을 넓힌 Oauth2.0를 이용한 네이버, 카카오, 구글 로그인
## https://ttl-blog.tistory.com/1434#hELLO

* 이전 README 프로젝트에서 구현에만 급급하여 조금 알아보기 위해 작업.
  1. Security 없이 API 로그인 진행
    * HttpInterface, Converter 등 API URL을 자유롭게 사용하는 법을 알기 위함.
  2. Security 사용 후 API 로그인 진행(예정)
    * 이전 Security의 Oauth2.0 기능 활성화 시 기존 작성한 Rest API가 전부 OAuth2.0 기본 로그인 창으로 리다이렉트가 됨을 확인.
    * 이를 해결할 수 있는지 먼저 OAuth2.0을 진행할 프론트 화면 작업과 함께 진행. 