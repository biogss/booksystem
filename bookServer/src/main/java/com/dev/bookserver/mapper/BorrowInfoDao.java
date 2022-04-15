package com.dev.bookserver.mapper;

import com.dev.bookserver.entity.BorrowInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王浩
 * @since 2022-04-15
 */
@Mapper
public interface BorrowInfoDao extends BaseMapper<BorrowInfo> {

}
