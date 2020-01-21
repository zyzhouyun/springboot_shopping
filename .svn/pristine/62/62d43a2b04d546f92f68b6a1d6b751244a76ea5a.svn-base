package com.rocket.dream.shopping.dao;

import com.rocket.dream.shopping.pojo.Buy;
import com.rocket.dream.shopping.pojo.BuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {
    long countByExample(BuyExample example);

    int deleteByExample(BuyExample example);

    int deleteByPrimaryKey(Integer buyId);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExample(BuyExample example);

    Buy selectByPrimaryKey(Integer buyId);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}