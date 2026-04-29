package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 테스트를 먼저 제작 후 테스트에 맞춰 개발 -> TDD 개발 방식
// 이건 그냥 만든 후 테스트 방식
class MemoryMemberRepositoryTest { // 굳이 공개할 필요 없으니까 public 삭제
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // Test가 끝날 때 마다 repository를 초기화해줌 -> 독립 시행을 위해
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result =  repository.findById(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result);
    }
    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get(); // Optional로 감싼 걸 한 번 까서 줌

        assertThat(result).isEqualTo(member1); // assertThat으로 확인
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2); // 갯수 확인도 가능
    }
}
