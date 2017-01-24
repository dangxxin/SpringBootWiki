package net.liuxuan.SprKi.service.labthink;


import net.liuxuan.SprKi.entity.DTO.FAQSearchDTO;
import net.liuxuan.SprKi.entity.labthink.FAQContent;

import java.util.List;

/**
 * Copyright (c) 2010-2016.  by Liuxuan   All rights reserved. <br/>
 * ***************************************************************************
 * 源文件名:  net.liuxuan.SprKi.service.labthink.FAQContentService
 * 功能:
 * 版本:	@version 1.0
 * 编制日期: 2016/3/16 15:22
 * 修改历史: (主要历史变动原因及说明)
 * YYYY-MM-DD |    Author      |	 Change Description
 * 2016/3/16  |    Moses       |     Created
 */
public interface FAQContentService {
    /**
     * Save faq content.
     *
     * @param faq the faq
     */
    void saveFAQContent(FAQContent faq);

    /**
     * Find all faq contents by dto list.
     *
     * @param dto the dto
     * @return the list
     */
    List<FAQContent> findAllFAQContentsByDto(FAQSearchDTO dto);

    /**
     * Disable faq content by id.
     *
     * @param id the id
     */
    void deleteFAQContentById(Long id);
    /**
     * Revert faq content by id.
     *
     * @param id the id
     */
    void revertFAQContentById(Long id);

    /**
     * Delete faq content by id,FOR EVER!!!
     *
     * @param id the id
     */
    void deleteForEverFAQContentById(Long id);

    /**
     * Find by id faq content.
     *
     * @param id the id
     * @return the faq content
     */
    FAQContent findById(Long id);

    /**
     * Gets faq contents count.
     *
     * @return the faq contents count
     */
    long getFAQContentsCount();


    List<?> getFaqGroupByCount();
}
