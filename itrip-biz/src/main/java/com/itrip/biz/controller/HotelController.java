package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.PagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    /**
     *   获取分页的酒店信息
     * @return
     */
    @RequestMapping("/hotel/queryHotelsByCityId")
    public Dto getPagedHotels(
            @RequestParam("cityId") int cityId,
            @RequestParam(value="pageIndex",defaultValue = "1") int pageIndex){

        //根据城市id查询分页的数据
        PagedData<Hotel> pagedHotels = hotelService.getPagedHotelByCityId(cityId, pageIndex, 5);
        //封装成dto
        if (pagedHotels.getList().size() > 0){
            return DtoUtil.returnSuccess(pagedHotels,"found data of hotel");
        }else{
//            return DtoUtil.returnSuccess("no data found");
            return DtoUtil.returnFail("no data found");
        }

    }

}
