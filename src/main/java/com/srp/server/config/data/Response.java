package com.srp.server.config.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="基础返回类",description="基础返回类")
public class Response<T> {
    @ApiModelProperty(value = "状态码",example = "200")
    private int code;
    @ApiModelProperty(value = "业务提示语", example = "SUCCESS")
    private String msg;
    @ApiModelProperty("数据对象")
    private T data;

    public int getCode() {
        return code;
    }

    public Response<T> setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Response<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

}
