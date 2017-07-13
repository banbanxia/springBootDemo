package com.example.demo;

/**
 * Created by LinyuZhang on 2017/7/13.
 */
import java.util.Iterator;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserLogin;
import com.example.demo.UserLoginDao;

@RestController
public class UserLoginController {

    @Resource
    UserLoginDao userLoginDAO;

    @RequestMapping("/userLogin")
    @ResponseBody
    public String login(String userName, String password){
        UserLogin ul = userLoginDAO.findByloginName(userName);

        if(ul==null) {
            return "未注册";
        }

        else {
            return ul.getLoginName()+" "+ul.getLoginPassword();
        }

    }

}
