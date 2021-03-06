package com.cold.framework.dao.mapper;

import com.cold.framework.dao.model.UserDevice;
import com.cold.framework.dao.util.ColdMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDeviceMapper extends ColdMapper<UserDevice> {

    @Select("SELECT * FROM user_device WHERE id=#{deviceId} AND status=1")
    UserDevice getByDeviceId(@Param("deviceId") String deviceId);

    @Select("SELECT * FROM user_device WHERE phone_number=#{phoneNumber} AND status=1")
    UserDevice getByPhone(@Param("phoneNumber") String phoneNumber);
}