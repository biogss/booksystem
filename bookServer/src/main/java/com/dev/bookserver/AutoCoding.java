package com.dev.bookserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class AutoCoding {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String moduleName = "bookserver";
        FastAutoGenerator.create("jdbc:mysql://139.9.38.167:3306/devbook?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                        "devbook", "Wh@930615")
                .globalConfig(builder -> {
                    builder.outputDir(projectPath + "/" + moduleName +  "/src/main/java")
//                            .enableSwagger()
                            .disableOpenDir()
                            .dateType(DateType.ONLY_DATE)
                            .author("王浩");

                })
                .packageConfig(builder -> {
                    builder.parent("com.dev." + moduleName)
                            .service("service")
                            //需要自定义sql，需要把xml文件指定路径到resource下，不然dao无法绑定sql
                            .pathInfo(Collections.singletonMap(OutputFile.xml,projectPath + "/" + moduleName +  "/src/main/resources/mappers"))
                            .serviceImpl("service.impl");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .strategyConfig(builder -> {
                    builder.addExclude("str")
                            .addTablePrefix("t_")
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .mapperBuilder()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .enableMapperAnnotation()
                            .formatMapperFileName("%sDao")
                            .formatXmlFileName("%sMapper")
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .entityBuilder()
                            .enableLombok()
//                            .naming(NamingStrategy.no_change)
                            .idType(IdType.AUTO);
//                            .enableTableFieldAnnotation()
//                            .formatFileName("%sEntity");
                })
                .execute();
    }
}
