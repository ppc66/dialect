package com.wpc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpc.entity.Record;
import com.wpc.service.RecordService;
import com.wpc.mapper.RecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【record】的数据库操作Service实现
* @createDate 2023-01-02 15:48:36
*/
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record>
    implements RecordService{

}




