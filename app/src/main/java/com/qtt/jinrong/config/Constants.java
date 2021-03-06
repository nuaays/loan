package com.qtt.jinrong.config;

import android.os.Environment;

import java.io.File;

/**
 * 常量数据
 */
public class Constants {

    public static final String SD_CARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static final String SEPARATOR = File.separator;
    /** SDK 根目录*/
    public static final String FILE_ROOT_DIR = "qttloan";
    public static final String ROOT_PATH = SD_CARD_PATH + SEPARATOR + FILE_ROOT_DIR + SEPARATOR;
    public static final String APK_DIR = "apk";
    public static final String CACHE_DIR = ROOT_PATH+"cache";
    public static final String DATAINFO_DIR = ROOT_PATH+"datainfo";

    /** 登录失效码*/
    public static final int LOGIN_EXPIRED = 10001;

    /** 客服电话*/
    public static final String CUSTOMER_SERVICE_PHONE = "400-8217-290";

    public static final int EXIT_INTERVAL = 2000;

    public static final int PAGE_SIZE = 10;

    public static final int RECOMMEND_SIZE = 3;

    /** 短信验证码发送间隔时间*/
    public static final int REQUEST_CODE_TIME = 60000;

    public static final int PIC_WIDTH = 2048;
    public static final int PIC_HEIGHT = 1536;
}
