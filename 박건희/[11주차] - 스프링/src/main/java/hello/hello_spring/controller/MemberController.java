package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
/**
* 컨트롤러에 다른 데이터를 불러오기 위해서 Service나 레포에 애노테이션을 달아서 스프링이 인식할 수 있게 함.
 * */
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}