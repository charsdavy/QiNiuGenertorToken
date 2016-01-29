package com.qiniu;

import com.qiniu.util.Auth;

public class Test {

    public static void main(String[] args) {  
    	//前一个参数是从七牛网站上得到的AccessKey,后一个参数是SecretKey
        Auth auth=Auth.create("sfPKD6WfFblx2v9I1CgIXDpGZzz2MSeI", "TWCtZRkgeqAX0Eslrrw0WhIIVCmK6");
        //第一个参数是你建立的空间名称，第三个是时间长度(按毫秒算的，我这里写的是10年)
        System.out.println("the token is:");
        String token=auth.uploadToken("mynotes", null, 1000*3600*24*12*10, null);
        System.out.println(token);
    }
}
