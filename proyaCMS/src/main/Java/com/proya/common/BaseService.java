package com.proya.common;

/**
 * Created by wzf on 2017/5/25.
 */
public abstract class BaseService<T>  {

    protected BaseDao<T> basedao;

    int insert(T t) {
        return basedao.insert(t);
    }

}
