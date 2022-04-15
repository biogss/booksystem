package com.dev.bookserver.service.impl;

import com.dev.bookserver.entity.UserInfo;
import com.dev.bookserver.mapper.UserInfoDao;
import com.dev.bookserver.service.UserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

}
