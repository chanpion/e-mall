package com.chanpion.mall.admin.auth;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author April Chen
 * @date 2020/3/30 16:35
 */
public class EncryptUtil {

    /**
     * 使用md5明文加密
     *
     * @param plaintext 明文
     * @param salt      盐
     * @return 密文
     */
    public static String encrypt(String plaintext, String salt) {
        return new SimpleHash("md5", plaintext, salt(salt), 2).toHex();
    }

    public static ByteSource salt(String salt) {
        return ByteSource.Util.bytes(salt);
    }
}
