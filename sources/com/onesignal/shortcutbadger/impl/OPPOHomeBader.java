package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements Badger {
    private int mCurrentTotalCount = -1;

    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.mCurrentTotalCount != i) {
            this.mCurrentTotalCount = i;
            if (Build.VERSION.SDK_INT >= 11) {
                executeBadgeByContentProvider(context, i);
            } else {
                executeBadgeByBroadcast(context, componentName, i);
            }
        }
    }

    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.oppo.launcher");
    }

    private void executeBadgeByBroadcast(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        BroadcastHelper.sendIntentExplicitly(context, intent);
    }

    private void executeBadgeByContentProvider(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }
}
