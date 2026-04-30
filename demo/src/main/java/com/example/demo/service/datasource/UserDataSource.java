package com.example.demo.service.datasource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataSource implements DataSource<User> {

    @Autowired
    private UserService userService;

    @Override
    public Page<User> doSearch(String searchText, long pageNum, long pageSize) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 只有当搜索词不为空时，才拼接模糊查询条件
        if (searchText != null && !searchText.trim().isEmpty()) {
            queryWrapper.like("username", searchText)
                    .or()
                    .like("userProfile", searchText);
        }
        // 调用 MyBatis-Plus 的分页查询
        return userService.page(new Page<>(pageNum, pageSize), queryWrapper);
    }
}