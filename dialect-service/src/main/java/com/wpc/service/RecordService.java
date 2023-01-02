package com.wpc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wpc.entity.Record;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【record】的数据库操作Service
* @createDate 2023-01-02 15:48:36
*/
@Mapper
public interface RecordService extends IService<Record> {

}
