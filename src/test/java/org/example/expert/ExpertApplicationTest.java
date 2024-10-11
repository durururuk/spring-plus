//package org.example.expert;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.example.expert.config.JwtUtil;
//import org.example.expert.config.S3Config;
//import org.example.expert.domain.security.SecurityUtil;
//import org.example.expert.domain.user.entity.User;
//import org.example.expert.domain.user.service.UserService;
//import org.example.expert.util.S3Util;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Slf4j
//@RequiredArgsConstructor
//@ActiveProfiles("test")
//class ExpertApplicationTest {
//    @Autowired
//    private UserService userService;  // 실제 서비스 주입
//
//    @MockBean
//    JwtUtil jwtUtil;
//
//    @MockBean
//    SecurityUtil securityUtil;
//
//    @MockBean
//    S3Util s3Util;
//
//    @MockBean
//    S3Config s3Config;
//
//    @Test
//    @WithMockUser
//    void 닉네임_검색_요청_테스트() {
//        long startTime = System.currentTimeMillis();
//        List<User> users = userService.findByNickname("d17a0cdd");
//        long endTime = System.currentTimeMillis();
//        long executionTime = endTime - startTime;
//
//        log.info(":::실행 시간 : {}ms", executionTime);
//
//        // then: 결과가 기대한 값과 일치하는지 확인합니다.
//        assertThat(users).isNotEmpty();
//        assertThat(users.get(0).getNickname()).isEqualTo("d17a0cdd");
//
//    }
//}