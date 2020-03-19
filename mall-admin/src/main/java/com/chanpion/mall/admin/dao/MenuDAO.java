package com.chanpion.mall.admin.dao;

import com.chanpion.mall.admin.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/17 13:23
 */
@Repository
public interface MenuDAO {

    /**
     * 获取全部菜单
     *
     * @return
     */
    List<Menu> findAll();

    /**
     * 根据父菜单id查询
     *
     * @param pid
     * @return
     */
    List<Menu> findByPid(long pid);
}
