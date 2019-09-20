package com.mo.lib;

import android.content.Context;

import com.igexin.sdk.GTIntentService;

/**
 * @ author：mo
 * @ data：2019/9/19:16:11
 * @ 功能：个推工具类，在Application里调用
 * @ 文档：http://docs.getui.com/getui/mobile/android/androidstudio_maven/
 */
public class GeTuiUtil {
    /**
     * 初始化个推SDK
     * @param var1  上下文
     * @param var3  消息处理Service (必须继承GTIntentService) 可null，
     * @param <T2>  .
     */
    public static <T2 extends GTIntentService> void initGeTui(Context var1, Class<T2> var3) {
        // DemoPushService 为【步骤2.6】自定义的推送服务
        com.igexin.sdk.PushManager.getInstance().initialize(var1, KPushService.class);
        // DemoIntentService 为第三方自定义的推送服务事件接收类
        com.igexin.sdk.PushManager.getInstance().registerPushIntentService(var1, var3 == null ? KIntentService.class : var3);
    }
}
