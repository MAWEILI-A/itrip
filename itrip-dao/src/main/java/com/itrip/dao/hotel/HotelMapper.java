package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 酒店的数据访问接口
 */
public interface HotelMapper {
    /**
     * 根据城市id，查询酒店集合信息
     * @param cityId
     * @return
     */
    List<Hotel> getHotelListByCityId(@Param("cityId") int cityId,
                                     @Param("from") int from,
                                     @Param("pageSize") int pageSize);

    /**
     * 根据城市id，查询酒店的个数
     * @param cityId
     * @return
     */
    int getHotelCountByCityId(@Param("cityId") int cityId);

}
