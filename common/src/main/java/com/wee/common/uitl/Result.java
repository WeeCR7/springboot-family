package com.wee.common.uitl;

import com.wee.common.constant.CommonConstant;
import lombok.Data;

/**
 * @author zhanjiawei
 */
@Data
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public static Result success(){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.SUCCESS_CODE);
        result.setMsg("成功");
        return result;
    }

    public static Result fail(){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.FAIL_CODE);
        result.setMsg("失败");
        return result;
    }

    public static Result fail(String msg){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.FAIL_CODE);
        result.setMsg(msg);
        return result;
    }

    public static<T> Result success(T data){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    public static<T> Result success(String msg){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.SUCCESS_CODE);
        result.setMsg(msg);
        return result;
    }

    public static<T> Result success(T data,String msg){
        Result result = new Result();
        result.setCode(CommonConstant.ResultCode.SUCCESS_CODE);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

}
