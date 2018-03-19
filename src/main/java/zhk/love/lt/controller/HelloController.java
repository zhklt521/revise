package zhk.love.lt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhklt521 on 2018/3/19.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello.action")
    public String index() {
        return "/WEB-INF/hello.jsp";
    }
}
