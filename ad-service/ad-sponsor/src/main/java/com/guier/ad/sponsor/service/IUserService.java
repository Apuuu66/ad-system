package com.guier.ad.sponsor.service;

import com.guier.ad.sponsor.vo.CreateUserRequest;
import com.guier.ad.sponsor.vo.CreateUserResponse;
import tmp.exceptions.AdException;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
