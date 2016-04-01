package net.liuxuan.SprKi.service${subpackage};


import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.liuxuan.SprKi.entity${subpackage}.${model_name};


/**
* Copyright (c) 2010-2016.  by Liuxuan   All rights reserved. <br/>
* ***************************************************************************
* 源文件名:  net.liuxuan.SprKi.service${subpackage}.${model_name}Service
* 功能:
* 版本:	@version 1.0
* 编制日期: ${date?string("yyyy/MM/dd HH:mm")}
* 修改历史: (主要历史变动原因及说明)
* YYYY-MM-DD |    Author      |	 Change Description
* ${date?string("yyyy-MM-dd")}  |    ${author}        |     Created
*/
public interface ${model_name}Service {
    public void save${model_name}(${model_name} ${model_name_firstSmall});

    public ${model_name} find${model_name}ById(Long id);

    public void delete${model_name}ById(Long id);
}