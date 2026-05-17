package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    //@Autowired  private  MemberService memberService; 필드 주입 -> 별로 안좋다.
    //Setter 주입
    /*private  MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}


