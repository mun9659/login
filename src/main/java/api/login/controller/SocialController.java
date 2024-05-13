package api.login.controller;

import api.login.domain.type.SocialType;
import api.login.service.SocialService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/social")
public class SocialController {

    private final SocialService socialService;

    @GetMapping("")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello!");
    }

    @SneakyThrows
    @GetMapping("/auth/{socialType}")
    ResponseEntity<Void> redirectAuthCodeRequestUrl(
            @PathVariable SocialType socialType
            , HttpServletResponse response) {

        String redirectUrl = socialService.getAuthCodeRequestUrl(socialType);
        response.sendRedirect(redirectUrl);
        return ResponseEntity.ok().build();
    }

}
