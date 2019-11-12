package com.itrip.utils;

import com.itrip.beans.dto.Dto;

/**
 * dto工具类
 */
public class DtoUtil {

    public static final String DTO_FLAG_SUCCESS = "success";
    public static final String DTO_FLAG_FAIL = "fail";

    public static Dto returnSuccess(){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_SUCCESS);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_NO_ERROR);
        return dto;
    }

    public static Dto returnSuccess(Object data){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_SUCCESS);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_NO_ERROR);
        dto.setData(data);
        return dto;
    }

    public static Dto returnSuccess(String msg){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_SUCCESS);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_NO_ERROR);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnSuccess(Object data,String msg){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_SUCCESS);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_NO_ERROR);
        dto.setData(data);
        dto.setMsg(msg);
        return dto;
    }

    public static Dto returnFail(){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_FAIL);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_DEFAULT_ERROR);
        return dto;
    }

    public static Dto returnFail(String msg){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.DTO_FLAG_FAIL);
        dto.setErrorCode(ErrorCodeConstant.ERROR_CODE_DEFAULT_ERROR);
        dto.setMsg(msg);
        return dto;
    }
}
