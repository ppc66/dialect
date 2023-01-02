package com.wpc.mapper;

import com.wpc.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【comment】的数据库操作Mapper
* @createDate 2023-01-02 15:48:36
* @Entity com.wpc.entity.Comment
*/
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}




