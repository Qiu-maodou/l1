package com.example.mapper;

import com.example.bean.Account;
import com.example.demo.DbCount;
import tk.mybatis.mapper.common.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@org.apache.ibatis.annotations.Mapper
public interface AccountMapper extends Mapper<Account> {
    @Select("select * from db_counter where  id=#{id}")
    Account getAcct(@Param("id") long id);

//    Account getAcct(Long id);

//    public Account getAcct(Long id);
}
