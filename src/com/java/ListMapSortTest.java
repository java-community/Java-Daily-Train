package com.java;

import org.junit.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 使用for循环进行排序
 * 说明：根据List<Map<String, String>>中map的value值（比如时间），然后对list中的若干个map进行排序
 * <b>项目名称：</b>Java-Daily-Train<br>
 * <b>类名称：</b>com.java.listMapSortTest<br>
 * <b>创建人：</b>hasee<br>
 * <b>类描述：</b><br>
 * <b>创建时间：</b>2020-07-29 14:09<br>
 */
public class ListMapSortTest {
    @Test
    public void Sort() throws ParseException {
        //创建对象
        Map<String, Object> A = new HashMap<String, Object>();
        Map<String, Object> B = new HashMap<String, Object>();
        Map<String, Object> C = new HashMap<String, Object>();
        Map<String, Object> D = new HashMap<String, Object>();
        Map<String, Object> E = new HashMap<String, Object>();
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //初始化
        A.put("time", "2020-09-01 12:12:00");
        B.put("time", "2020-09-02 12:12:01");
        C.put("time", "2020-09-02 12:12:00");
        D.put("time", "2020-09-03 12:12:00");
        E.put("time", "2020-09-04 12:12:00");
        listMap.add(A);
        listMap.add(B);
        listMap.add(C);
        listMap.add(D);
        listMap.add(E);

        //使用for循环，按最新的时间进行排序
        for (int i = 0; i < listMap.size(); i++) {
            for (int j = 0; j < listMap.size() - 1 - i; j++) {
                if (df.parse((String) listMap.get(j).get("time")).getTime() < df.parse((String) listMap.get(j + 1).get("time")).getTime()) {
                    Map<String, Object> Temp = listMap.get(j);
                    listMap.set(j, listMap.get(j + 1));
                    listMap.set(j + 1, Temp);
                }
            }
        }
        //打印输出
        for (Map<String, Object> map : listMap) {
            for (String key : map.keySet()) {
                System.out.println(key + ":" + map.get(key));
            }
        }
    }
}
