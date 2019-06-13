package com.nigeltest.action;

import com.nigel.jedisTest.JedisTest;
import com.nigeltest.util.JedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Nigel on 2019/6/12 0012.
 */
@RestController
public class LoginAction
{

    @RequestMapping("/login")
    public String login(HttpSession httpSession,String name){

        JedisUtil.set(httpSession.getId(),name);

        return "redirect:/queryItem";
    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession httpSession,String name){

        JedisUtil.remove(httpSession.getId());

        return "成功签出";
    }

    @RequestMapping("/queryItem")
    public String queryItem(){

        return "aaaaaa";
    }

}
