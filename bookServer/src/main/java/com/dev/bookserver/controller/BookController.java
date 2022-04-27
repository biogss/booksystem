package com.dev.bookserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.bookserver.entity.Book;
import com.dev.bookserver.entity.RespEntity;
import com.dev.bookserver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王浩
 * @since 2022-04-15
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    /**
     *功能描述 根据名称搜索书籍
     * @author 王浩
     * @date 2022/4/15
     * @param bookName 书名
     * @param page 页数
     * @param pageSize 每页条数
     * @return IPage<Book>
     */
    @GetMapping("/getPageByName")
    public IPage<Book> getPageByName(String bookName, int page, int pageSize) {
        Page<Book> bookPage = new Page<>(page, pageSize);
        QueryWrapper<Book> bookPageWrapper = new QueryWrapper<>();
        bookPageWrapper.like("book_name", bookName);
        return bookService.page(bookPage, bookPageWrapper);
    }

    /**
     *功能描述 根据类型查询书籍
     * @author 王浩
     * @date 2022/4/15
     * @param bookCategory 书籍分类
     * @param page 页数
     * @param pageSize 每页条数
     * @return IPage<Book>
     */
    @GetMapping("/getPageByCategory")
    public IPage<Book> getPageByCategory(String bookCategory,int page,int pageSize) {
        Page<Book> bookPage = new Page<>(page, pageSize);
        QueryWrapper<Book> bookPageWrapper = new QueryWrapper<>();
        bookPageWrapper.eq("book_category", bookCategory);
        return bookService.page(bookPage, bookPageWrapper);
    }

    /**
     *功能描述 新增书籍
     * @author 王浩
     * @date 2022/4/17
     * @param book
     * @return RespEntity
     */
    @PostMapping("/addBook")
    public RespEntity addBook(@RequestBody Book book) {
        boolean save = bookService.save(book);
        if (save) {
            return RespEntity.ok("成功");
        }else {
            return RespEntity.error("失败");
        }
    }

    @GetMapping("/upOrDownBook")
    public RespEntity upOrDownBook(String bookName, String bookStatus) {
        UpdateWrapper<Book> bookUpdateWrapper = new UpdateWrapper<>();
        bookUpdateWrapper.set("bookStatus", bookStatus);
        bookUpdateWrapper.eq("bookName", bookName);
        boolean update = bookService.update(bookUpdateWrapper);
        if (update) {
            return RespEntity.ok("成功");
        }else {
            return RespEntity.error("失败");
        }
    }

    @GetMapping("/getBookInfoById")
    public Book getBookInfoById(int bookId) {

        return bookService.getById(bookId);
    }

}
