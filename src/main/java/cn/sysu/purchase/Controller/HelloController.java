package cn.sysu.purchase.Controller;

import org.apache.catalina.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String helloworld(HttpServletRequest request) {
        Session session = (Session) request.getSession();
        return "Hello World 呵呵";
    }
}
