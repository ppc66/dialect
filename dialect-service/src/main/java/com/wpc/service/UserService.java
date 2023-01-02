package com.wpc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wpc.dto.Result;
import com.wpc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service
* @createDate 2023-01-02 15:48:36
*/
@Mapper
public interface UserService extends IService<User> {
    Result<String> test();
    Result<String> login(String username,String password);
    Result register(User user);
    Result<Boolean> UserExist(Integer id,String username);
}
