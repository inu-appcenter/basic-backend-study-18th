package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
//import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member); //저장하기

        Member result = repository.findById(member.getId()).get();
        // System.out.println("result = " + (result ==member)); //가져온 member이랑 result랑 같은가?
        //Assertions.assertEquals(member, result);
        //Assertions.assertThat(result).isEqualTo(member);
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName() {

        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result =  repository.findByName("spring1").get();
        //.get()을 붙여서 Optional 안에 들어있는 실제 Member를 꺼냈다.
        //결과 적으로 Member result = member1; 이런식

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll(); //result안에 2명이 들어가게 된다.
        //List<Member> result = [member1, member2];

        assertThat(result.size()).isEqualTo(2); //2명인지 검증
    }
}
