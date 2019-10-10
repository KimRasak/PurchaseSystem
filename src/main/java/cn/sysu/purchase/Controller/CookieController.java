package cn.sysu.purchase.Controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@RestController
public class CookieController {

    private static Logger log = Logger.getLogger(CookieController.class);

    @RequestMapping("/test/cookie")
    public String cookie(HttpServletRequest request,
                         HttpServletResponse response,
                         HttpSession session) {

        Cookie[] cookies = request.getCookies();
        if(cookies !=null) {
            Arrays.stream(cookies).forEach((cookie) ->
                    log.info(cookie.getName() + " : " + cookie.getValue())
            );
        }

        return "index";
    }

    @RequestMapping("/test/cookie1")
    public String cookie1( HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        return session.getId();
    }
}