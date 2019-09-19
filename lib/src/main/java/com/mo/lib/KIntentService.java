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
 *
 * 继承 GTIntentService 接收来自个推的消息, 所有消息在线程中回调, 如果注册了该服务, 则务必要在 AndroidManifest中声明, 否则无法接受消息<br>
 */

public class KIntentService extends GTIntentService {

    public KIntentService() {
    }

    @Override
    public void onReceiveServicePid(Context context, int pid) {
    }

    // 处理透传消息
    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage msg) {

    }

    // 接收 cid
    @Override
    public void onReceiveClientId(Context context, String clientid) {
        Log.i(GTIntentService.TAG,"onReceiveClientId -> " + "clientid = " + clientid);
    }

    // cid 离线上线通知
    @Override
    public void onReceiveOnlineState(Context context, boolean online) {
    }

    // 各种事件处理回执
    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage cmdMessage) {
        Log.i(GTIntentService.TAG ,"各种事件处理回执="+""+cmdMessage.toString());

    }

    // 通知到达，只有个推通道下发的通知会回调此方法
    @Override
    public void onNotificationMessageArrived(Context context, GTNotificationMessage msg) {
        Log.i(GTIntentService.TAG ,"通知到达，只有个推通道下发的通知会回调此方法；"+""+msg.toString());
    }

    // 通知点击，只有个推通道下发的通知会回调此方法
    @Override
    public void onNotificationMessageClicked(Context context, GTNotificationMessage msg) {
        Log.i(GTIntentService.TAG ,"通知点击，只有个推通道下发的通知会回调此方法；"+""+msg.toString());
    }
}