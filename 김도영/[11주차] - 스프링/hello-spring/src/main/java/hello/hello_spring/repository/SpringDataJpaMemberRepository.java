package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>, MemberRepository {

    // JPQL select m from Member m where m.name = ? 이 명령어가 돌아감.
    @Override
    Optional<Member> findByName(String name);
}
