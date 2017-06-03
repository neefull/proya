package proya.common;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wzf on 2017/5/30.
 */
public class BaseService<T, E extends BaseDao<T>>{
    @Autowired
    protected E dao;

    public void setDao(E dao) {
        this.dao = dao;
    }


    public boolean insert(T t) {
        int result = dao.insert(t);
        return result > 0 ? true : false;
    }

    public boolean delete(String id) {
        int result = dao.delete(id);
        return result > 0 ? true : false;
    }

    public boolean delete(T t) {
        int result = dao.delete(t);
        return result > 0 ? true : false;
    }

    public boolean update(T t) {
        return false;
    }
}
