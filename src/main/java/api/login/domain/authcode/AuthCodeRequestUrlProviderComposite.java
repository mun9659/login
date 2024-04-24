package api.login.domain.authcode;

import api.login.domain.type.SocialType;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

@Component
public class AuthCodeRequestUrlProviderComposite {

    private final Map<SocialType, AuthCodeRequestUrlProvider> mapping;

    public AuthCodeRequestUrlProviderComposite(Set<AuthCodeRequestUrlProvider> providers) {
        mapping = providers.stream()
                .collect(toMap(
                        AuthCodeRequestUrlProvider::supportServer,
                        identity()
                ));
    }

    public String provide(SocialType socialType) { return getProvider(socialType).provide(); }

    private AuthCodeRequestUrlProvider getProvider(SocialType socialType) {
        return Optional.ofNullable(mapping.get(socialType))
                .orElseThrow(() -> new RuntimeException("지원하지 않는 소셜 로그인입니다."));
    }

}
