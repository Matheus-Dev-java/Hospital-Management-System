package com.matheusdevjava.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logger utility generated automatically.
 */
public class LoggerUtil {
    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    public static void info(String msg) {
        LOGGER.log(Level.INFO, msg);
    }
    public static void warn(String msg) {
        LOGGER.log(Level.WARNING, msg);
    }
    public static void error(String msg, Throwable t) {
        LOGGER.log(Level.SEVERE, msg);
        if (t != null) {
            t.printStackTrace();
        }
    }
    public static void debug(String msg) {
        LOGGER.log(Level.FINE, msg);
    }
}
