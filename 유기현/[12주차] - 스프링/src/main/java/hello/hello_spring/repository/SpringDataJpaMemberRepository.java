package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //JpaRepository가 있으면 자동으로 구현체를 만들어서 스프링 빈을 등록해준다.
    Optional<Member> findByName(String name);
}