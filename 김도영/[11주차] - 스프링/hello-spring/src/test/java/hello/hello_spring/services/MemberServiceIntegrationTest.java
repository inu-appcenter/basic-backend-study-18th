package hello.hello_spring.services;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

// 이거 2개를 적어줘야 통합 테스트 가능
// 컨테이너 올리지 않아도 테스트가 가능한 단일 테스트여야 좋은 테스트일 확률이 높다.
@SpringBootTest
@Transactional // 트랜잭션을 먼저 실행하고 아래 테스트 다 실행 후 롤백함. 그래서 반복해서 테스트 가능함. aftereach,beforeeach 쓸 필요 없이.
public class MemberServiceIntegrationTest {

    // 테스트는 그냥 autowired 기반으로 받는거도 좋음. 어디에 또 쓸게 아니니까.
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    // 테스트 한글로도 가능함.
    @Test
    void 회원가입() {
        // given: 어떤게 주어졌는데
        Member member = new Member();
        member.setName("hello");

        // when: 어떨때
        Long saveId = memberService.join(member);

        // then: 이렇게 돼.
        Member findMember =  memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    // 너무 단순함. 예외도 봐야함.
    @Test
    public void 중복_회원_예외(){
        // given
        Member member1 = new Member();
        member1.setName("spring1");

        Member member2 = new Member();
        member2.setName("spring1");

        // when
        memberService.join(member1);
        IllegalAccessError e =  org.junit.jupiter.api.Assertions.assertThrows(IllegalAccessError.class,() -> memberService.join(member2));
        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        //memberService.join(member2); // 한번더 join하면 setName이 같으면 예외가 터짐.
        //try {
        //    memberService.join(member2);
        //    fail();
        //} catch (IllegalStateException e) {
        //    Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        //}
        // then

    }
}
