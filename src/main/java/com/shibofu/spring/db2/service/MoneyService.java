package com.shibofu.spring.db2.service;

import com.shibofu.spring.db2.dao.MoneyDao;
import com.shibofu.spring.model.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author potter.fu
 * @date 2018-12-07 15:34
 */
@Service
public class MoneyService {
    @Autowired
    private MoneyDao moneyDao;

    /**
     * 根据名字查找用户
     */
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }
}
