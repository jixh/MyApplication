package com.jc.apps.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by jktaihe on 3/5/17.
 * blog: blog.jktaihe.com
 */

public class LocalHistoryUtils{

    public static final String SEPARATOR = "£¬";

    public static String[] getHistory(String allSaveData) {

        if (TextUtils.isEmpty(allSaveData))return new String[0];

        return allSaveData.replaceAll("\\[|\\]","").split(SEPARATOR);
    }

    public static String saveHistory(String allSaveData,String key){
        String histroy = allSaveData.replaceAll("\\["+key+"\\]\\,","");
        return  "["+key+"],"+histroy;
    }


}
