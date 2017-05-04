package com.jc.apps.utils;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */

public interface HistoryConstact {
    String[] getHistory(String allSaveData);
    String saveHistory(String allSaveData,String key);
}
