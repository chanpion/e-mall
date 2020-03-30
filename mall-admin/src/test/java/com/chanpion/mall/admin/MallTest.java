package com.chanpion.mall.admin;

import com.chanpion.mall.admin.auth.EncryptUtil;
import org.junit.Test;

/**
 * @author April Chen
 * @date 2020/3/30 16:50
 */
public class MallTest {

    @Test
    public void testEncrypt() {
        System.out.println(EncryptUtil.encrypt("123456", "test"));
    }
}
