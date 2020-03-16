package com.chanpion.mall.admin.dao;

import com.chanpion.mall.admin.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author April Chen
 * @date 2020/3/16 17:09
 */
@Repository
public interface UserDAO {
    User findByName(@Param("username") String username);
}
