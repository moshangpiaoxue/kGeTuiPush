package com.mo.lib;

import android.app.Service;
import android.content.Context;

import com.igexin.sdk.GTIntentService;

/**
 * @ author：mo
 * @ data：2019/9/19:16:11
 * @ 功能：
 */
public class GeTuiUtil {

public static <T2 extends GTIntentService> void initGeTui(Context var1, Class<T2> var3){
    // DemoPushService 为【步骤2.6】自定义的推送服务
    com.igexin.sdk.PushManager.getInstance().initialize(var1, KPushService.class);
    // DemoIntentService 为第三方自定义的推送服务事件接收类
    //        com.igexin.sdk.PushManager.getInstance().registerPushIntentService(getApplicationContext(), DemoIntentService.class);
    com.igexin.sdk.PushManager.getInstance().registerPushIntentService(var1, var3==null?KIntentService.class:var3);
}
}
