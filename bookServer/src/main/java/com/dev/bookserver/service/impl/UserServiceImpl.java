package com.dev.bookserver.service.impl;

import com.dev.bookserver.entity.User;
import com.dev.bookserver.mapper.UserDao;
import com.dev.bookserver.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
