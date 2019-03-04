package com.ai.es.dao;

//import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.ai.es.domain.Stock;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import javax.annotation.Resource;

@Component
@org.apache.ibatis.annotations.Mapper
public interface MybatisDao extends Mapper<Stock> {

    Stock select();

}
