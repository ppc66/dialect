package com.wpc.controller;

import com.wpc.dto.Result;
import com.wpc.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @GetMapping("/test")
    public Result<String> test(){
        return userService.test();
    }

}
