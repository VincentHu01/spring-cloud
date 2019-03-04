package com.ai.msdev.dao;

//import org.apache.ibatis.annotations.Mapper;

import com.ai.msdev.domain.Stock;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//import com.ai.msdev.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

@Mapper
public interface MybatisDao {

    List<Stock> selectDemo();

}
