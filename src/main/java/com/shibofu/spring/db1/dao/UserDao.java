package com.shibofu.spring.db1.dao;

import com.shibofu.spring.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author potter.fu
 * @date 2018-12-07 15:33
 */
@Qualifier("db1SqlSessionTemplate")
@Repository
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    // @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);
}
