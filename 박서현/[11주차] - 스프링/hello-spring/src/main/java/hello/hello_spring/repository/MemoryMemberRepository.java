package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    //램에 저장
    private static Map<Long, Member> store = new HashMap<>();
    //sequence: key값을 생성
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                //넘어온 name이 파라미터 name과 같은지 검사
                .filter(member -> member.getName().equals(name))
                .findAny(); //하나라도 찾으면 반환
        //하나도 못 찾으면 null 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
