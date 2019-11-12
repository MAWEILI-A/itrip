package com.itrip.biz.service;

import com.itrip.beans.pojo.Hotel;
import com.itrip.utils.PagedData;

/**
 * 酒店的业务逻辑接口
 */
public interface HotelService {

    /**
     * 查询分页的酒店信息
     * @param cityId 城市id
     * @param pageIndex 页码
     * @param pageSize 页大小
     * @return 酒店的分页对象
     */
    PagedData<Hotel> getPagedHotelByCityId(int cityId,int pageIndex,int pageSize);

}
