package hello.hello_spring.controller;

import hello.hello_spring.HelloSpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String heelo(Model model){
        // key-value 형태임.
        model.addAttribute("data","hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // http에서 body부분에 return한 데이터를 직접 넣어주겠다.(html의 body태그 아님!!) 그래서 페이지보면 데이터 그대로만 있음.(html 태그 없음.)
    public String helloString(@RequestParam("name") String name){
        return "hello "+ name;
    }

    // 만약 데이터를 내놓으라하면? = 객체
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
