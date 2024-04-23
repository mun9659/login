package api.login.domain.type;

import java.util.Locale;

public enum SocialType {

    GOOGLE,
    NAVER,
    KAKAO;

    public static SocialType fromName(String type) { return SocialType.valueOf(type.toUpperCase(Locale.ENGLISH)); }

}
