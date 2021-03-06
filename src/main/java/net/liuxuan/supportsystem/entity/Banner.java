/*
 * Copyright (c) 2010-2016.  by Moses   All rights reserved.
 *
 */

package net.liuxuan.supportsystem.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Moses on 2016/2/5.
 */
@Data
@Entity  //实体类
@Table(name = "Sprki_banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @NotNull
    public String name;

}
