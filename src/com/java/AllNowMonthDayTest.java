package com.java;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 说明：输出本月已过的日子
 * <b>项目名称：</b>Java-Daily-Train<br>
 * <b>类名称：</b>com.java.AllNowMonthDayTest<br>
 * <b>创建人：</b>hasee<br>
 * <b>类描述：</b><br>
 * <b>创建时间：</b>2020-07-29 21:37<br>
 */
public class AllNowMonthDayTest {
    @Test
    public void test(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String Str=sdf.format(calendar.getTime());
        try {
            Date date = sdf.parse(Str);
            calendar.setTime(date);
            Date enddate = calendar.getTime();
            calendar.setTime(date);
            calendar.add(Calendar.MONTH, 0);
            calendar.set(Calendar.DAY_OF_MONTH,1); //设置为1号,当前日期既为本月第一天
            while(calendar.getTime().before(enddate)){
                System.out.println(sdf.format(calendar.getTime()));
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
