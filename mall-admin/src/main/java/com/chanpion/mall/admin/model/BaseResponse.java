package com.chanpion.mall.admin.model;

import lombok.Data;

/**
 * @author April Chen
 * @date 2020/3/28 13:57
 */
@Data
public class BaseResponse {
    private int statusCode = 0;
    private String statusMsg = "success";
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(Object data) {
        this.data = data;
    }

    public BaseResponse(int statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
