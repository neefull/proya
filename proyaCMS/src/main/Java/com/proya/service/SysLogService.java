package com.proya.service;

import com.proya.dao.SysLogMapper;
import com.proya.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzf on 2017/5/29.
 */
@Service
public class SysLogService {
    @Autowired
    private SysLogMapper mapper;

    public int insert(SysLog sysLog) {
        return mapper.insert(sysLog);
    }

    public SysLog selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
