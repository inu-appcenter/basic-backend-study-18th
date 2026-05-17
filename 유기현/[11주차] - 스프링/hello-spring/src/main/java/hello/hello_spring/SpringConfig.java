package hello.hello_spring;

import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 빈에 등록
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    //MemberService가 MemoryMemberRepository를 사용하도록 연결해주는 코드
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}