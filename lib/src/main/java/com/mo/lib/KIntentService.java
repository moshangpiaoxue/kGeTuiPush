package com.mo.lib;


import android.content.Context;
import android.util.Log;

import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;

/**
 * @ author：mo
 * @ data：2019/9/18:10:44
 * @ 功能：接收推送
 * <p>
 * 继承 GTIntentService 接收来自个推的消息, 所有消息在线程中回调, 如果注册了该服务, 则务必要在 AndroidManifest中声明, 否则无法接受消息<br>
 */

public class KIntentService extends GTIntentService {
    public KIntentService() {
    }

    /** 程序启动时：1、接收pid */
    @Override
    public void onReceiveServicePid(Context context, int pid) {
    }

    /** 程序启动时：2、接收 clientId */
    @Override
    public void onReceiveClientId(Context context, String clientid) {
        Log.i(GTIntentService.TAG, "onReceiveClientId -> " + "clientid = " + clientid);
    }

    /** 各种事件处理回执 */
    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage cmdMessage) {
        Log.i(GTIntentService.TAG, "各种事件处理回执=" + "" + cmdMessage.toString());
    }

    /** 有消息时：0.离线上线通知 */
    @Override
    public void onReceiveOnlineState(Context context, boolean online) {
    }

    /** 有消息时：1.通知到达，只有个推通道下发的通知会回调此方法 */
    @Override
    public void onNotificationMessageArrived(Context context, GTNotificationMessage msg) {
        Log.i(GTIntentService.TAG, "通知到达，只有个推通道下发的通知会回调此方法；" + "" + msg.toString());
    }

    /** 有消息时：2.通知点击，只有个推通道下发的通知会回调此方法 */
    @Override
    public void onNotificationMessageClicked(Context context, GTNotificationMessage msg) {
        Log.i(GTIntentService.TAG, "通知点击，只有个推通道下发的通知会回调此方法；" + "" + msg.toString());
    }

    /**
     * 有消息时：3.处理透传消息
     * 透传消息获取方式：new String(msg.getPayload())，注意：1、msg.getPayload()有可能为null 2、这玩意是个键值对的json，还要转一下
     * 第三方回执调用接口，actionid范围为90000-90999，可根据业务场景执行：PushManager.getInstance().sendFeedbackMessage(context, taskid, messageid, 90001)
     */
    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage msg) {

    }

}