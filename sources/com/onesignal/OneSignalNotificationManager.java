package com.onesignal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.Iterator;

public class OneSignalNotificationManager {
    static int getGrouplessSummaryId() {
        return -718463522;
    }

    static String getGrouplessSummaryKey() {
        return "os_group_undefined";
    }

    static NotificationManager getNotificationManager(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    static Integer getGrouplessNotifsCount(Context context) {
        int i = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if (!NotificationCompat.isGroupSummary(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    static StatusBarNotification[] getActiveNotifications(Context context) {
        try {
            return getNotificationManager(context).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    static ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = NotificationLimitManager.isGroupSummary(statusBarNotification);
            boolean z = notification.getGroup() == null || notification.getGroup().equals(getGrouplessSummaryKey());
            if (!isGroupSummary && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    static void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            NotificationManagerCompat.from(context).notify(next.getId(), Notification.Builder.recoverBuilder(context, next.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    static Integer getMostRecentNotifIdFromGroup(OneSignalDbHelper oneSignalDbHelper, String str, boolean z) {
        String str2 = z ? "group_id IS NULL" : "group_id = ?";
        Cursor query = oneSignalDbHelper.query("notification", (String[]) null, str2 + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z ? null : new String[]{str}, (String) null, (String) null, "created_time DESC", "1");
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex("android_notification_id")));
        query.close();
        return valueOf;
    }

    public static boolean areNotificationsEnabled(Context context, String str) {
        NotificationChannel notificationChannel;
        if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationManager(context).getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
