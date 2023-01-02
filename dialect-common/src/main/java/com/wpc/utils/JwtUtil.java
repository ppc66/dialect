package com.wpc.utils;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTPayload;
import cn.hutool.jwt.JWTUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    private static final String key = "123";
     public static String getToken(){

         Map<String, Object> map = new HashMap<String, Object>() {
             private static final long serialVersionUID = 1L;
             {
                 put("uid", Integer.parseInt("123"));
                 //30天
                 put("expire_time", System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 30);
             }
         };
         String token = JWTUtil.createToken(map, key.getBytes());
         return token;
     }

     public static boolean verify(String token){
         boolean verify = JWTUtil.verify(token, key.getBytes());
         return verify;
     }

    @Test
    public void testJwt(){
        String token = JwtUtil.getToken();
        System.out.println("token = " + token);
        boolean verify = JwtUtil.verify(token);
        System.out.println("verify = " + verify);
    }
}
