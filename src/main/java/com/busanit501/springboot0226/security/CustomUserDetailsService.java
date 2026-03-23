package com.busanit501.springboot0226.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
// 시큐리티에서, 요구하는 조건이 있는데, 너희가 로그인 처리를 하려면,
// 내가 원하는 규격이 있는데, 거기에 맞춰서 작업 해줘.
//
public class CustomUserDetailsService implements UserDetailsService {

    // 이 메서드는 로그인시, 처리를 담당하는 메서드,
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Loading user by username: " + username);
        // 화면에서 로그인한 유저명을 받아서, 디비에 연결해서,
        // 비교후, 로그인 (회원가입 등. 작업을 진행함.)
        return null;
    }
}
