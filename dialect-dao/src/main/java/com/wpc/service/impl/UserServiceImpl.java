package com.wpc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpc.entity.User;
import com.wpc.service.UserService;
import com.wpc.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-01-02 15:48:36
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




