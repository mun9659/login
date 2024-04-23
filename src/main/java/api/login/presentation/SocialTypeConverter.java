package api.login.presentation;

import api.login.domain.type.SocialType;
import org.springframework.core.convert.converter.Converter;

public class SocialTypeConverter implements Converter<String, SocialType> {

    @Override
    public SocialType convert(String source) {
        return SocialType.fromName(source);
    }
}
