package com.guier.ad.sponsor.controller;

import com.alibaba.fastjson.JSON;
import com.guier.ad.common.exceptions.AdException;
import com.guier.ad.sponsor.service.IUserService;
import com.guier.ad.sponsor.vo.CreateUserRequest;
import com.guier.ad.sponsor.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserOPController {

    private final IUserService userService;

    @Autowired
    public UserOPController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }
}

