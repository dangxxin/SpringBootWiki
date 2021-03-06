package net.liuxuan.supportsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Copyright (c) 2010-2016.  by Liuxuan   All rights reserved.
 * ***************************************************************************
 * 源文件名:  net.liuxuan.SprKi.entity.CMSContentTags
 * 功能:
 * 版本:	@version 1.0
 * 编制日期: 2016/3/3 15:28
 * 修改历史: (主要历史变动原因及说明)
 * YYYY-MM-DD |    Author      |	 Change Description
 * 2016/3/3  |    Moses       |     Created
 */
@Data
@Entity  //实体类
@Table(name = "Sprki_CMS_Tags")
public class CMSContentTags {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = true,length = 100,nullable = false)
    private String name;

    @Column(length = 30,nullable = true)
    private String tagtype;

//    @ManyToMany(targetEntity=CMSContent.class)
//    private Set<CMSContent> contents = new HashSet<CMSContent>();
    @ManyToMany(mappedBy="tags")
    private List<CMSContent> contents;
}
