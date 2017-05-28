package com.proya.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by wzf on 2017/5/28.
 */
@Repository("daoSupport")
public class DaoSupport implements BaseDao{

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public Object insert(String str, Object obj) throws Exception {
        return sqlSessionTemplate.insert(str, obj);
    }

    public Object update(String str, Object obj) throws Exception {
        return sqlSessionTemplate.update(str, obj);
    }

    public Object delete(String str, Object obj) throws Exception {
        return sqlSessionTemplate.delete(str, obj);
    }

    public Object findForObject(String str, Object obj) throws Exception {
        return null;
    }

    public Object findForList(String str, Object obj) throws Exception {
        return null;
    }

    public Object findForMap(String sql, Object obj, String key, String value) throws Exception {
        return null;
    }
}
