package com.wpc.mapper;

import com.wpc.entity.Record;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【record】的数据库操作Mapper
* @createDate 2023-01-02 15:48:36
* @Entity com.wpc.entity.Record
*/
@Mapper
public interface RecordMapper extends BaseMapper<Record> {

}




