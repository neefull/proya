package com.proya.common;

/**
 * Created by wzf on 2017/5/25.
 */
public abstract class BaseService<T>  /*implements Manager<T>*/ {

    protected BaseDao<T> basedao;

    public int insert(T t) {
        return basedao.insert(t);
    }

}
