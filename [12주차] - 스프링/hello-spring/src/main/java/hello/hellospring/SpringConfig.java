package hello.hellospring;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

  private final MemberRepository memberRepository;

  public SpringConfig(MemberRepository memberRepository) {
      this.memberRepository = memberRepository;
  }
  @Bean
    public MemberService memberService() {
      return new MemberService(memberRepository);
  }
}
