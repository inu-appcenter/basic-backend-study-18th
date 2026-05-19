package hello.hello_spring;

import hello.hello_spring.app.TimeTraceApp;
import hello.hello_spring.repository.*;
import hello.hello_spring.services.MemberService;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// 직접 자바코드로 스프링 빈 등록하기
@Configuration
public class SpringConfig {

    // jdbc로 바꿈.
    //private DataSource dataSource;

    // jpa
    //private EntityManager em;

    // jpa 인터페이스
    private final MemberRepository memberRepository;

    //public void setDataSource(DataSource dataSource) {
    //    this.dataSource = dataSource;
    //}
    //public SpringConfig(EntityManager em){
    //    this.em = em;
    //}

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        //return new MemoryMemberRepository();
//        //return new JdbcMemberRepository(dataSource);
//        //return new JdbcTemplateMemberRepository(dataSource);
//        //return new JpaMemberRepository(em);
//
 //    }
}
