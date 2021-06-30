package com.tsf.csde.user.controller;

import com.tsf.common.entity.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/heloWorld")
    public CommonResponse heloWorld(){
        return CommonResponse.ComResBuilder.success(null);
    }

}
