package com.tsf.common.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CommonResponse<T> {
    private String code;
    private String msg;
    private T body;



    @Data
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static class ComResBuilder<T>{

        private static final String SUC_CODE = "00";

        private static final String SUC_MSG = "操作成功";

        private CommonResponse res;

        public static ComResBuilder init(){
            return new ComResBuilder(new CommonResponse());
        }

        private ComResBuilder code(String code){
            this.res.setCode(code);
            return this;
        }

        private ComResBuilder msg(String msg){
            this.res.setMsg(msg);
            return this;
        }

        private ComResBuilder body(T body){
            this.res.setBody(body);
            return this;
        }

        private CommonResponse build(){
            return this.res;
        }

        public static<T> CommonResponse<T> success(T body){
            return ComResBuilder.init().code(SUC_CODE).msg(SUC_MSG).body(body).build();
        }
    }
}
