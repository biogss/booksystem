package com.dev.bookserver.service.impl;

import com.dev.bookserver.entity.BorrowInfo;
import com.dev.bookserver.mapper.BorrowInfoDao;
import com.dev.bookserver.service.BorrowInfoService;
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
public class BorrowInfoServiceImpl extends ServiceImpl<BorrowInfoDao, BorrowInfo> implements BorrowInfoService {

}
