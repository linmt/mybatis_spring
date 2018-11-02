package com.lmt.dao;

import com.lmt.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * Created by 热带雨林 on 2018/10/28.
 */
//这个案例中用不到
public interface DeptMapper {
    void addDept(Dept dept);
    void deleteDept(Dept dept);
    void updateDept(Dept dept);
    Dept findDeptById(Integer deptno);
    List<Dept> findAllDept();
    List<Dept> findDeptByLoc(String loc);
    List<Map<String, Object>> findAllDname(String loc);
}
