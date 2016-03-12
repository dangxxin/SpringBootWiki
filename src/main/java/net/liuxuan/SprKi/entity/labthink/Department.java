package net.liuxuan.SprKi.entity.labthink;

import javax.persistence.*;
import lombok.Data;
/**
 * Copyright (c) 2010-2016.  by Liuxuan   All rights reserved. <br/>
 * ***************************************************************************
 * 源文件名:  net.liuxuan.SprKi.entity.labthink.Department
 * 功能:
 * 版本:	@version 1.0
 * 编制日期: 2016/3/8 10:34
 * 修改历史: (主要历史变动原因及说明)
 * YYYY-MM-DD |    Author      |	 Change Description
 * 2016/3/8  |    Moses       |     Created
 */
@Data
@Entity  //实体类
@Table(name = "Sprki_Labthink_Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(nullable = false,length = 80)
    String departmentName;

    @Column(nullable = false,length = 80)
    String departmentNameCN;
}