package com.lmt.dao;

import com.lmt.entity.Cost;
import com.lmt.entity.CostSimple;
import com.lmt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/1.
 */
public class CostDaoImpl  implements CostDao {
    SqlSession session= MyBatisUtil.getSqlSession();
    public void save(Cost cost) {
        session.insert("save",cost);
        session.commit();
        session.close();
    }

    public List<Cost> findAll() {
        List<Cost> list=session.selectList("findAll");
        return list;
    }

    public List<Cost> findByPage(HashMap map) {
        List<Cost> list=session.selectList("findByPage",map);
        return list;
    }

    public int findTotalPage(int pageSize) {
        int totalPage=session.selectOne("findTotalPage",pageSize);
        return totalPage;
    }

    public List<CostSimple> findAllCostSimple() {
        List<CostSimple> list=session.selectList("findAllCostSimple");
        return list;
    }
}
