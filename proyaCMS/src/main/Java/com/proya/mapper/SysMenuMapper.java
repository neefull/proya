package com.proya.mapper;


import com.proya.common.BaseDao;
import com.proya.entity.sys.SysMenu;

/**
 *
 */
public interface SysMenuMapper extends BaseDao<SysMenu> {
    int deleteByPrimaryKey(String id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}