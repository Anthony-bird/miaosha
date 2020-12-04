package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {
    //通用错误类型100001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOW_ERROR(10002,"未知错误"),
    //20000开头为用户相关错误
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"手机或密码不存在"),
    USER_NOT_LOGIN(20003,"用户还未登陆"),
    //30000开头为交易型错误
    STOCK_NOT_ENOUGH(30001,"库存不足")
    ;


    private int errorCode;
    private String errmsg;
    private EmBusinessError(int errCode,String errMsg) {
        this.errorCode=errCode;
        this.errmsg=errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errorCode;
    }

    @Override
    public String getErrMsg() {
        return this.errmsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errmsg = errMsg;
        return this;
    }
}
