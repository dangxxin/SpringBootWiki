package net.liuxuan.spring.mvc.utilsinit;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.SimpleAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apdplat.word.dictionary.DictionaryFactory;
import org.apdplat.word.lucene.ChineseWordAnalyzer;
import org.apdplat.word.util.WordConfTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Copyright (c) 2010-2016.  by Liuxuan   All rights reserved.
 * ***************************************************************************
 * 源文件名:  net.liuxuan.spring.mvc.utilsinit.LuceneConfiguration
 * 功能:
 * 版本:	@version 1.0
 * 编制日期: 2016/3/1 16:20
 * 修改历史: (主要历史变动原因及说明)
 * YYYY-MM-DD |    Author      |	 Change Description
 * 2016/3/1  |    Moses       |     Created
 */
@Configuration
public class LuceneConfiguration {
    private static Logger log =  LoggerFactory.getLogger(LuceneConfiguration.class);


//    @Bean
//    public ChineseWordAnalyzer analyzer(){
//        WordConfTools.set("dic.path","classpath:dic.txt，classpath:config/mydic.txt");
//        WordConfTools.set("auto.detect", "false");
//        log.info("#######################Initialized ChineseWordAnalyzer ###########################");
//        return new ChineseWordAnalyzer();
//    }
    @Bean
    public Analyzer analyzer(){
        return new SimpleAnalyzer();
//        WordConfTools.set("dic.path","classpath:dic.txt，classpath:config/mydic.txt");
//        WordConfTools.set("auto.detect", "false");
//        log.info("#######################Initialized ChineseWordAnalyzer ###########################");
//        return new ChineseWordAnalyzer();
    }


    @Bean
    public IndexWriter indexWriter(Analyzer analyzer) throws IOException {
//    public IndexWriter indexWriter(ChineseWordAnalyzer analyzer) throws IOException {
        //TODO YML化
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Path path = Paths.get("d:/logs2");
        Directory d = new SimpleFSDirectory(path);

//        Analyzer analyzer = new ChineseWordAnalyzer();
        IndexWriterConfig conf = new IndexWriterConfig(analyzer);
        IndexWriter indexWriter = new IndexWriter(d, conf);
        return indexWriter;
    }
//    @Bean
    public boolean doconfig(){
        WordConfTools.set("dic.path","classpath:dic.txt，classpath:config/mydic.txt");
        DictionaryFactory.reload();//更改词典路径之后，重新加载词典
//        String path = WordConfTools.get("dic.path");
//        log.info("dic.path {}" ,path);
        return true;
    }
}