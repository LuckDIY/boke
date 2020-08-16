package com.boke.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResponseVo(){
        this.code=200;
        this.msg="success";
    }


}
