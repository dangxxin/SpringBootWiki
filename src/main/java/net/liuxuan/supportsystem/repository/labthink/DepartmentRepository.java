package net.liuxuan.supportsystem.repository.labthink;

import net.liuxuan.supportsystem.entity.labthink.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2010-2016.  by Liuxuan   All rights reserved. <br/>
 * ***************************************************************************
 * 源文件名:  net.liuxuan.SprKi.repository.labthink.DepartmentRepository
 * 功能:
 * 版本:	@version 1.0
 * 编制日期: 2016/3/14 16:35
 * 修改历史: (主要历史变动原因及说明)
 * YYYY-MM-DD |    Author      |	 Change Description
 * 2016/3/14  |    Moses       |     Created
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findBydepartmentName(String  departmentName);

    List<Department> findBydepartmentNameNot(String  departmentNotName);

    List<Department> findBydepartmentNameNotOrderByDepartmentName(String  departmentNotName);
}
