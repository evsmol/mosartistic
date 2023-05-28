package com.appsgeyser.sdk.push;

import android.content.Context;
import android.util.Log;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.server.RequestQueueHolder;
import com.appsgeyser.sdk.server.StatController;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OneSignal;
import java.util.HashMap;
import org.json.JSONObject;

public class OneSignalNotificationReceivedHandler implements OneSignal.OSRemoteNotificationReceivedHandler {
    private final String KEY_MESSAGE = "message";
    private final String KEY_TITLE = "title";

    public void remoteNotificationReceived(Context context, OSNotificationReceivedEvent oSNotificationReceivedEvent) {
        Log.d("OneSignalData", "remoteNotificationReceived");
        JSONObject additionalData = oSNotificationReceivedEvent.getNotification().getAdditionalData();
        if (additionalData != null) {
            Log.i("OneSignalData", additionalData.toString());
            Log.i("OneSignalData", "getTitle = " + oSNotificationReceivedEvent.getNotification().getTitle());
            Log.i("OneSignalData", "getBody = " + oSNotificationReceivedEvent.getNotification().getBody());
            String prefString = new PreferencesCoder(context).getPrefString("ServerResponse", (String) null);
            if (prefString != null) {
                StatController.getInstance().init(new HashMap(ConfigPhp.parseFromJson(prefString).getStatUrls()));
                HashMap hashMap = new HashMap();
                hashMap.put("title", oSNotificationReceivedEvent.getNotification().getTitle());
                hashMap.put("message", oSNotificationReceivedEvent.getNotification().getBody());
                RequestQueueHolder.getInstance(context);
                StatController.getInstance().sendRequestAsyncByKey("onesignal_push_received", hashMap, context, true);
            }
        }
    }
}
