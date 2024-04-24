package api.login.domain.client;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.toMap;

import api.login.domain.type.SocialType;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Component
public class SocialClientComposite {

    private final Map<SocialType, SocialClient> mapping;

    public SocialClientComposite(Set<SocialClient> clients) {
        mapping = clients.stream()
                .collect(toMap(
                        SocialClient::supportServer,
                        identity()
                ));
    }

    private SocialClient getClient(SocialType socialType) {
        return Optional.ofNullable(mapping.get(socialType))
                .orElseThrow(() -> new RuntimeException("지원하지 않는 소셜 로그인입니다."));
    }

}
