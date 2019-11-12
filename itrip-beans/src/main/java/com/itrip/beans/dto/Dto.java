package com.itrip.beans.dto;

/**
 * 数据传输对象
 * @param <T>
 */
public class Dto<T> {
    /**
     * 传输的数据，可能是实体类，或者vo，或者其他封装的数据格式
     */
    private T data;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 消息描述
     */
    private String msg;

    /**
     * 成功标识
     */
    private String success;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
