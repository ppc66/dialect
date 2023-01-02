package com.wpc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {
    private Boolean success;
    private String msg;
    private T data;
    private Integer code;

    public static <T> Result<T> ok(){
        return new Result(true, null, null, 200);
    }

    public static <T> Result<T> ok(T data){
        return new Result(true, null, data, null);
    }
    public static <T> Result<T> ok(T data,String msg){
        return new Result(true, msg, data, null);
    }

    public static Result ok(List<?> data){
        return new Result(true, null, data, null);
    }

    public static Result fail(String msg){
        return new Result(false, msg, null, null);
    }

    public static Result fail(String msg,Integer code){
        return new Result(false, msg, null, code);
    }
}
