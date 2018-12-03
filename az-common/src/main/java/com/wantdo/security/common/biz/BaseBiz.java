package com.wantdo.security.common.biz;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author luanx
 */

@Setter
public abstract class BaseBiz<M extends Mapper<T>, T> {

    @Autowired
    protected M mapper;

    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> selectList(T entity) {
        return mapper.select(entity);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public int selectCount(T entity) {
        return mapper.selectCount(entity);
    }

    public void insert(T entity) {
    }

    public void insertSelective(T entity) {

    }

    public void delete(T entity){
        mapper.delete(entity);
    }

    public void deleteById(Object id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void update(T entity){

    }

    public void updateSelective(T entity){

    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

}
