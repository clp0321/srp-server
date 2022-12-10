package com.srp.server.config.data;

/**
 * @author wuweifeng wrote on 2017/10/23.
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Response genSuccessResult() {
        return new Response().setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Response genSuccessResult(Object data) {
        return new Response()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Response genFailResult(String message) {
        return new Response()
                .setCode(ResultCode.FAIL)
                .setMsg(message);
    }

    public static Response genFailResult(ResultCode resultCode, String message) {
        return new Response()
                .setCode(resultCode)
                .setMsg(message);
    }
}
