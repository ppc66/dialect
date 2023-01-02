package com.wpc.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.jwt.JWT;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpc.dto.Result;
import com.wpc.entity.User;
import com.wpc.mapper.UserMapper;
import com.wpc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-01-02 15:48:36
*/
/*
我明明什么都不懂 只是拿着别人给我搭好的架子上涂抹一些自己颜色
我明明什么都不懂 我根本不知道那些东西怎么实现 我连23种设计模式都不知道
我明明什么都不懂 我连java泛型能不能用他子类都不知道
我连HashMap 链表。。。。底层怎么实现的都不知道
我连这些框架怎么实现的都不知道
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public Result<String> test() {
        return Result.ok("Test测试......");
    }

    @Override
    public Result register(User user) {
        user.setRegisterDate(new Date());
        //MD5
        user.setPassword(DigestUtil.md5Hex(user.getPassword()));
        boolean save = save(user);
        if (save){
            log.info("注册成功");
        }else{
            log.error("注册失败",user);
        }
        return Result.ok(save);
    }

    @Override
    public Result<String> login(String username, String password) {
        User user = query().eq("username", username).one();
        if (user == null)return Result.fail("用户名或密码不正确");
        String token = UUID.fastUUID().toString(true);
        return Result.ok(token);
    }



    @Override
    public Result<Boolean> UserExist(Integer id, String username) {
        return null;
    }

}