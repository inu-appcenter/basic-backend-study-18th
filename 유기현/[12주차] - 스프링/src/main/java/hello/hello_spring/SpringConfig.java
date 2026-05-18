package hello.hello_spring;

import hello.hello_spring.repository.JdbcMemberRepository;
import hello.hello_spring.repository.JpaMemberRepository;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Date;

@Configuration //스프링 빈에 등록
public class SpringConfig {

    private final  MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /*private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/
    /*private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository); //memberRepository()-> memberRepository로 변경
    }
    //MemberService가 MemoryMemberRepository를 사용하도록 연결해주는 코드

    //@Bean
    //public MemberRepository memberRepository() {
       // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource); //교체 -> DI!!
        //return new JpaMemberRepository(em);
    //}
}