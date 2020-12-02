package com.miaoshaproject.error;

//包装器业务异常类实现
public class BusinessException extends Exception implements CommonError{

    //emun
    private CommonError commonError;

    //直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    //接收自定义errMsg的方式构造业务异常（通过覆盖原本errMsg）
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }
    @Override
    public int getErrCode() {
        return commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        commonError.setErrMsg(errMsg);
        return this;
    }
}
