package com.dev.bookserver.entity;

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
@TableName("t_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户姓名
     */
    private String realName;

    /**
     * 18身份证号码
     */
    private String idNumber;

    /**
     * 住址
     */
    private String address;

    /**
     * 性别 1-男0-女
     */
    private String sex;

    /**
     * 数据创建时间
     */
    private Date createDate;

    /**
     * 数据更新时间
     */
    private Date updateDate;


}
