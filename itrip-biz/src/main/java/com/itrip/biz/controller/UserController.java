package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.PagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/queryUser")
    public Dto getPageUser(@RequestParam(value="pageIndex",defaultValue = "1") int pageIndex){
        int pageSize=5;
        PagedData<User> pagedData = userService.pagedDate(pageIndex, pageSize);
        if(pagedData.getList().size()>0){
            return DtoUtil.returnSuccess(pagedData,"found data of user");
        }else{
            return DtoUtil.returnFail("no data found");
        }
    }
}
