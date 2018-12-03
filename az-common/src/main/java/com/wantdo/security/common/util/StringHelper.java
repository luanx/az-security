package com.wantdo.security.common.util;

/**
 * @author luanx
 */

public class StringHelper {

    public static String getObjectValue(Object obj) {
        return obj == null ? "" : obj.toString();
    }

}
