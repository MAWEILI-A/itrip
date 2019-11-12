package com.itrip.dao.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUsers(@Param("from") int from,@Param("pageSize") int pageSize);
    int getUserCount();
}
