package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String heelo(Model model){
        // key-value 형태임.
        model.addAttribute("data","hello!!");
        return "hello";
    }
}
