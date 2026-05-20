package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

//@Service 향후 리포지토리를 변경 할 예정이므로, 자바 코드로 스프링 빈을 설정한다.
@Transactional //JPA를 사용하려면 이게 꼭 필요하다.
public class MemberService {

    //private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final MemberRepository memberRepository;

    //@Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /*회원 가입*/
    public Long join(Member member) {
        //같은 이름이 중복 찾기

        long start = System.currentTimeMillis();

        /*첫번째 방식
       Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> {
           throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        -> 여기서 result결과는 Optional이기 때문에 result생략 가능
        */
        //try {
            validateDuplicateMember(member);//control + t 를 통해 메서드 리펙토링 한 결과

            memberRepository.save(member);
            return member.getId();
        //} finally {
            //long finsh = System.currentTimeMillis();
            //long timeMs = finsh - start;
            //System.out.println("join " + timeMs + "ms");
        //}
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //전체 회원 조회
    public List<Member> findMembers(){
        //long start = System.currentTimeMillis();
        //try {
            return memberRepository.findAll();
        //} finally {
            //long finish = System.currentTimeMillis();
            //long timeMs = finish - start;
            //System.out.println("findMembers " + timeMs + "ms");
        //}
    }
    //한명 조회
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
