package com.ai.msdev.service;

import com.ai.msdev.dao.MybatisDao;
import com.ai.msdev.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private MybatisDao mybatisDao;

    public List<Stock> select(){
        return mybatisDao.selectDemo();
    }

}
