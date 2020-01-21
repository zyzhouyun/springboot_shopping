package com.rocket.dream.shopping.dao;

import com.rocket.dream.shopping.pojo.BillType;
import com.rocket.dream.shopping.pojo.BillTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillTypeMapper {
    long countByExample(BillTypeExample example);

    int deleteByExample(BillTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(BillType record);

    int insertSelective(BillType record);

    List<BillType> selectByExample(BillTypeExample example);

    BillType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByExample(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByPrimaryKeySelective(BillType record);

    int updateByPrimaryKey(BillType record);
}