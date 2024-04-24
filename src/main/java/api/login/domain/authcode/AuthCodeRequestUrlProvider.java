package api.login.domain.authcode;

import api.login.domain.type.SocialType;

public interface AuthCodeRequestUrlProvider {

    SocialType supportServer();

    String provide();

}
