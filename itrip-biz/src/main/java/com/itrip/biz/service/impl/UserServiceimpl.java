package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.dao.user.UserMapper;
import com.itrip.utils.PagedData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Resource
    UserMapper usermapper;
    @Override
    public PagedData<User> pagedDate(int pageIndex, int pageSize) {
    int from=(pageIndex-1)*pageSize;
        List<User> users = usermapper.getUsers(from,pageSize);
        int cnt = usermapper.getUserCount();
        PagedData<User>pagedData=new PagedData<>(pageSize,pageIndex,cnt,users);
        return pagedData;
    }
}
