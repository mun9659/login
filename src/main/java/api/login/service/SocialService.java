package api.login.service;

import api.login.domain.authcode.AuthCodeRequestUrlProviderComposite;
import api.login.domain.type.SocialType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SocialService {

    private final AuthCodeRequestUrlProviderComposite authCodeRequestUrlProviderComposite;

    public String getAuthCodeRequestUrl(SocialType socialType) {
        return authCodeRequestUrlProviderComposite.provide(socialType);
    }

}
