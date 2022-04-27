package com.dev.bookserver.controller;

import com.dev.bookserver.entity.RespEntity;
import com.dev.bookserver.entity.User;
import com.dev.bookserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    UserService userService;

    @PostMapping("/regUser")
    public RespEntity regUser(User user) {

        boolean save = userService.save(user);
        if (save) return RespEntity.ok("成功");
        else return RespEntity.error("失败");
    }

    @PostMapping("/updateUser")
    public RespEntity updateUser(User user) {

        boolean save = userService.updateById(user);
        if (save) return RespEntity.ok("成功");
        else return RespEntity.error("失败");
    }

    @GetMapping("/cancelUser")
    public RespEntity cancelUser(int user_id) {
        boolean result = userService.removeById(user_id);
        if (result) return RespEntity.ok("成功");
        else return RespEntity.error("失败");

    }



}
