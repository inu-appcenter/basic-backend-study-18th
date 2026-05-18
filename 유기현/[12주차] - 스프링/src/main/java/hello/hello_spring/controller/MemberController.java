package hello.hello_spring.controller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {  // Model은 스프링 MVC가 자동으로 전달해주는 객체로,
                                       // 컨트롤러의 데이터를 화면(View)으로 넘길 때 사용한다.
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); //members라는 이름으로 members데이터를 사용할 수 있다.
        return "members/memberList";
    }
}


