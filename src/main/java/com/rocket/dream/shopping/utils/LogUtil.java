package com.rocket.dream.shopping.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

public class LogUtil {

    private static final Logger LOGGER= LoggerFactory.getLogger(LogUtil.class);


    public static void debug(String str){
        LOGGER.debug(str);
    }

    public static void info(String str){
        LOGGER.info(str);
    }
}
