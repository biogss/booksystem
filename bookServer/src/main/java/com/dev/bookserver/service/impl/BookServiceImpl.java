package com.dev.bookserver.service.impl;

import com.dev.bookserver.entity.Book;
import com.dev.bookserver.mapper.BookDao;
import com.dev.bookserver.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王浩
 * @since 2022-04-15
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

}
