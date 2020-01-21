package com.rocket.dream.shopping.dao;

import com.rocket.dream.shopping.pojo.OrderBillExample;
import com.rocket.dream.shopping.pojo.OrderBillKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderBillMapper {
    long countByExample(OrderBillExample example);

    int deleteByExample(OrderBillExample example);

    int deleteByPrimaryKey(OrderBillKey key);

    int insert(OrderBillKey record);

    int insertSelective(OrderBillKey record);

    List<OrderBillKey> selectByExample(OrderBillExample example);

    int updateByExampleSelective(@Param("record") OrderBillKey record, @Param("example") OrderBillExample example);

    int updateByExample(@Param("record") OrderBillKey record, @Param("example") OrderBillExample example);
}