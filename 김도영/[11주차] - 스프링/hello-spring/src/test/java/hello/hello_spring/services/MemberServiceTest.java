package hello.hello_spring.services;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Fail.fail;

public class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    // dependency injection(DI) 의존성 주입: 다른 객체를 직접 생성하지 않고 외부에서 받아 사용하는 방식
    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

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
    @Test
    void findMembers(){

    }
    @Test
    void findOne(){

    }
}
