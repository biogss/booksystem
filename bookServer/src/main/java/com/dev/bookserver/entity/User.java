package com.dev.bookserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王浩
 * @since 2022-04-15
 */
@Getter
@Setter
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String mobileNo;

    /**
     * 用户类型1-VIP，2-管理员
     */
    private String userType;

    /**
     * 数据创建时间
     */
    private Date createDate;

    /**
     * 数据更新时间
     */
    private Date updateDate;


}
