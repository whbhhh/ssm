package com.whb.controller;

import com.whb.common.JsonData;
import com.whb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    private String query() {
        return "user";
    }

    @RequestMapping("/query")
    @ResponseBody
    private JsonData query(Integer uid){
        return JsonData.success(userService.query(uid));
    }

}
