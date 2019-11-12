package com.itrip.biz.service;

import com.itrip.beans.pojo.User;
import com.itrip.utils.PagedData;

public interface UserService {
    PagedData<User>pagedDate(int pageIndex,int pageSize);
}
