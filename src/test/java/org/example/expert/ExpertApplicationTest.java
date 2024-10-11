package org.example.expert;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.expert.config.*;
import org.example.expert.domain.security.SecurityUtil;
import org.example.expert.domain.user.entity.User;
import org.example.expert.domain.user.repository.UserRepository;
import org.example.expert.domain.user.service.UserService;
import org.example.expert.util.S3Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
class ExpertApplicationTest {
    @Autowired
    private UserRepository userRepository;  // 실제 리포지토리 주입

    @Autowired
    private UserService userService;  // 실제 서비스 주입

    @MockBean
    private SecurityUtil securityUtil;

    @MockBean
    private S3Util s3Util;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @MockBean
    JwtUtil jwtUtil;

    @MockBean
    S3Config s3Config;

    @MockBean
    QueryDslConfig queryDslConfig;

    @MockBean
    PersistenceConfig persistenceConfig;

    @MockBean
    FilterConfig filterConfig;

    @Test
    @WithMockUser(username = "testUser", roles = {"USER"})
    void 닉네임_검색_요청_테스트() {
        List<User> users = userService.findByNickname("d17a0cdd");

        // then: 결과가 기대한 값과 일치하는지 확인합니다.
        assertThat(users).isNotEmpty();
        assertThat(users.get(0).getNickname()).isEqualTo("d17a0cdd");
    }
}