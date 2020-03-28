package com.chanpion.mall.common;

/**
 * @author April Chen
 * @date 2020/3/23 10:13
 */
public class RegexUtil {

    /**
     * 匹配中文字符
     */
    public static final String ZH = "[\\u4e00-\\u9fa5]";

    /**
     * 匹配邮箱
     */
    public static final String EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

    /**
     * 匹配网址URL
     */
    public static final String URL = "[a-zA-z]+://[^\\s]*";

    /**
     * 匹配IP地址
     */
    public static final String IP = "\\d+\\.\\d+\\.\\d+\\.\\d+";

    /**
     * 正整数
     */
    public static final String POSITIVE_INTEGER = "^[1-9]\\d*$　";

    /**
     * 手机号
     */
    public static final String mobile = "^1[3|4|5|8][0-9]\\\\d{8}$";
}
