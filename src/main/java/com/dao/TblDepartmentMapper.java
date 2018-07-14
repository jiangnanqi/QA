package com.dao;

import com.pojo.TblDepartment;
import com.pojo.TblDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDepartmentMapper {
    int countByExample(TblDepartmentExample example);

    int deleteByExample(TblDepartmentExample example);

    int deleteByPrimaryKey(String departmentid);

    int insert(TblDepartment record);

    int insertSelective(TblDepartment record);

    List<TblDepartment> selectByExample(TblDepartmentExample example);

    TblDepartment selectByPrimaryKey(String departmentid);

    int updateByExampleSelective(@Param("record") TblDepartment record, @Param("example") TblDepartmentExample example);

    int updateByExample(@Param("record") TblDepartment record, @Param("example") TblDepartmentExample example);

    int updateByPrimaryKeySelective(TblDepartment record);

    int updateByPrimaryKey(TblDepartment record);
}