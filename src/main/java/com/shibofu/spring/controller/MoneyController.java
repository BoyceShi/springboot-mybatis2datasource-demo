package com.shibofu.spring.controller;

import com.shibofu.spring.db2.service.MoneyService;
import com.shibofu.spring.model.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author potter.fu
 * @date 2018-12-07 15:38
 */
@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/query")
    public Money testQuery() {
        Money money = moneyService.selectMoneyById(1);
        return money;
    }
}
