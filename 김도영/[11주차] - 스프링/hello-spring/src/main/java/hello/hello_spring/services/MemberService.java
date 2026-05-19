package hello.hello_spring.services;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// 스프링이 서비스로 인식하고 올림.
// @Component라고 해도되는데, Service에도 Component 어노테이션이 있기에 Service 해도 됨.
//@Service
public class MemberService {
    private final MemberRepository memberRepository;

    //@Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    // 회원가입
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원 안됨.
        // Optional 가독성 안좋음.
        //Optional<Member> result = memberRepository.findByName(member.getName());
        //result.ifPresent(m -> {
        //    throw new IllegalStateException("이미 존재하는 회원입니다.");
        //});

        //long start = System.currentTimeMillis(); // 실행 시작 시간 AOP 사용 전
        //try{
        //    validateDuplicateMember(member);
        //    memberRepository.save(member);
        //    return member.getId();
        //} finally {
        //    long finish = System.currentTimeMillis();
        //    long timeMs = finish - start;
        //    System.out.println("join = "+timeMs+"ms");
        //}
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();

    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        //long start = System.currentTimeMillis();

        //try{
        //    return memberRepository.findAll();
        //} finally {
        //    long finish = System.currentTimeMillis();
        //    long timeMs = finish - start;
        //    System.out.println("findMembers = "+timeMs+"ms");
        //}
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
