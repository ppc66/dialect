package com.wpc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpc.entity.Comment;
import com.wpc.service.CommentService;
import com.wpc.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2023-01-02 15:48:36
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




