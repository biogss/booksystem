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
@TableName("t_borrow_info")
public class BorrowInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 书籍编号
     */
    private Integer bookId;

    /**
     * 借阅开始时间
     */
    private Date borrowStartTime;

    /**
     * 借阅结束时间
     */
    private Date borrowEndTime;

    /**
     * 数据创建时间
     */
    private Date createDate;

    /**
     * 数据更新时间
     */
    private Date updateDate;


}
