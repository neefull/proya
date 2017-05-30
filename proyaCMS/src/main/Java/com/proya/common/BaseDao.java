package com.proya.common;

/**
 * Created by wzf on 2017/5/25.
 */
public interface BaseDao<T>{
    /**
     * 增加记录
     *
     * @param t
     * @return
     */
     int insert(T t);

    /**
     * 修改记录
     *
     * @param t
     * @return
     */
     int update(T t);


    /**
     * 刪除
     *
     * @param id
     * @return
     */
     int delete(String id);

    /**
     * 刪除
     *
     * @param id
     * @return
     */
     int delete(T t);
}
