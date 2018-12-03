package com.wantdo.security.common.context;

import com.google.common.collect.Maps;
import com.wantdo.security.common.constant.CommonConstants;
import com.wantdo.security.common.util.StringHelper;

import java.util.Map;

/**
 * @author luanx
 */

public class BaseContextHandler {

    private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    private static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = Maps.newHashMap();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    private static Object get(String key) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = Maps.newHashMap();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static void setUserId(String userId) {
        set(CommonConstants.CONTEXT_KEY_USER_ID, userId);
    }

    public static void setUserName(String userName) {
        set(CommonConstants.CONTEXT_KEY_USER_NAME, userName);
    }

    public static void setToken(String userToken) {
        set(CommonConstants.CONTEXT_KEY_USER_TOKEN, userToken);
    }


    public static String getUserId() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_ID);
        return StringHelper.getObjectValue(value);
    }

    public static String getUserName() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_NAME);
        return StringHelper.getObjectValue(value);
    }

    public static String getUserToken() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_TOKEN);
        return StringHelper.getObjectValue(value);
    }

    public static void remove() {
        threadLocal.remove();
    }

}
