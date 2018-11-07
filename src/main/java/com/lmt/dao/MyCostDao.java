package com.lmt.dao;

import com.lmt.entity.Cost;
import com.lmt.entity.CostSimple;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/2.
 */
//SqlSessionTemplate的使用案例，不完整，尚待补充
@Repository
public class MyCostDao implements CostDao {

    private SqlSessionTemplate template;
    //使用前要取消@Autowired的注释
    //@Autowired
    public void setTemplate( SqlSessionTemplate template) {
        this.template = template;
    }
    public void save(Cost cost) {
        System.out.println("请求插入");
    }

    public List<Cost> findAll() {
        System.out.println("使用了findAll方法");
        return template.selectList("findAll");
    }

    public List<Cost> findByPage(HashMap map) {
        return template.selectList("findPage",map);
    }

    public int findTotalPage(int pageSize) {
        return template.selectOne("findTotalPage",pageSize);
    }

    public List<CostSimple> findAllCostSimple() {
        return template.selectList("findAllCostSimple");
    }
}
