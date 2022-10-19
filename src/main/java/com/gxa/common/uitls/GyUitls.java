package com.gxa.common.uitls;


import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class GyUitls {
    public static SimpleHash salt(String mm){
//        String hashAlgorithName ="MD5";
//        Object credentials="";
//        ByteSource salt=ByteSource.Util.bytes("123");
//        SimpleHash simpleHash=new SimpleHash("MD5",mm,"123",1024);
        return new SimpleHash("MD5",mm,"123",1024);
    }
}
