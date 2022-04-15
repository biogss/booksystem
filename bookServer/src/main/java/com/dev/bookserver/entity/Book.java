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
@TableName("t_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 书籍编号
     */
    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;

    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍代码
     */
    private String bookCode;

    /**
     * 书籍价格
     */
    private Float bookPrice;

    /**
     * 书籍类型
     */
    private String bookType;

    /**
     * 书籍作者
     */
    private String bookAuthor;

    /**
     * 书籍出版社
     */
    private String bookPublishingHouse;

    /**
     * 书籍折旧率
     */
    private Integer bookDepreciation;

    /**
     * 书籍封面
     */
    private String bookCover;

    /**
     * 书籍状态 0-下架1-上架2-回收3-借阅
     */
    private String bookStatus;

    /**
     * 书籍描述
     */
    private String bookDesc;

    /**
     * 书籍出版时间
     */
    private Date bookPublishDate;

    /**
     * 数据创建时间
     */
    private Date createDate;

    /**
     * 数据更新时间
     */
    private Date updateDate;


}
