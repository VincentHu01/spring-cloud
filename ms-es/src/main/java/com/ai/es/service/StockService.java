package com.ai.es.service;

import com.ai.es.dao.MybatisDao;
import com.ai.es.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockService {

    @Autowired
    MybatisDao mybatisDao;

    public Stock select(){
        return mybatisDao.select();
    }
}
