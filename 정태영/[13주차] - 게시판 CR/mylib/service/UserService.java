package com.myapp.mylib.service;

import com.myapp.mylib.domain.User;
import com.myapp.mylib.domain.UserRole;
import com.myapp.mylib.dto.LoginRequest;
import com.myapp.mylib.dto.SignupRequest;
import com.myapp.mylib.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional // 회원가입 과정은 트랜잭션으로 처리해야 함
    public void signup(SignupRequest request){

        if (userRepository.findByEmail(request.email()).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
        }

        User user = new User(
                request.email(),
                request.password(),
                request.name(),
                UserRole.USER // 일단 일반 유저로 설정
        );

        userRepository.save(user);
    }

    @Transactional
    public User login(LoginRequest request){

        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원"));

        if(!user.getPassword().equals(request.password())){
            throw new IllegalArgumentException("비밀번호 불일치");
        }

        return user;
    }
}
