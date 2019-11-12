package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import com.itrip.utils.PagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 酒店的业务逻辑实现类
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public PagedData<Hotel> getPagedHotelByCityId(int cityId, int pageIndex, int pageSize) {
        //查询某个城市id的，某一页的酒店信息
        int from = (pageIndex - 1) * pageSize;
        List<Hotel> hotels = hotelMapper.getHotelListByCityId(cityId, from, pageSize);
        //查询某个城市id的酒店个数
        int cnt = hotelMapper.getHotelCountByCityId(cityId);
        //封装成分页对象
        PagedData<Hotel> pagedHotels = new PagedData<>(pageIndex,pageSize,cnt,hotels);
        return pagedHotels;
    }
}
