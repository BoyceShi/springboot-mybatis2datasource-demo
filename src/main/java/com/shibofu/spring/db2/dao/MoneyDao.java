package com.shibofu.spring.db2.dao;

import com.shibofu.spring.model.Money;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author potter.fu
 * @date 2018-12-07 15:33
 */
@Qualifier("db2SqlSessionTemplate")
@Repository
public interface MoneyDao {
    /**
     * 通过id 查看工资详情
     */
    // @Select("SELECT * FROM money WHERE id = #{id}")
    Money findMoneyById(@Param("id") int id);
}
