package com.dev.bookserver.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Classname RespEntity
 * @Description 返回对象
 * @Version 1.0.0
 * @Date 2022/4/17 22:15
 * @Created by CC
 */

@Component
@Data
public class RespEntity {

    private Integer status;

    private String msg;

    private Object obj;

    public static RespEntity build() {
        return new RespEntity();
    }

    public static RespEntity ok(String msg) {
        return new RespEntity(200, msg);
    }

    public static RespEntity ok(String msg, Object obj) {
        return new RespEntity(200, msg, obj);
    }

    public static RespEntity error(String msg) {
        return new RespEntity(500, msg);
    }

    public static RespEntity error(String msg, Object obj) {
        return new RespEntity(500, msg, obj);
    }

    private RespEntity() {

    }

    private RespEntity(Integer status, String msg) {
        this.msg = msg;
        this.status = status;
    }
    private RespEntity(Integer status, String msg, Object obj) {
          this.status = status;
          this.msg = msg;
          this.obj = obj;
    }
}
