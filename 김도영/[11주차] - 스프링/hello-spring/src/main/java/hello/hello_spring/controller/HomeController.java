package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 먼저 찾고 컨트롤러가 있어서 home.html을 불러온 것이고(무시되는 것) 없다면 static에 있는 index.html을 불러오게 되는 거임.
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
