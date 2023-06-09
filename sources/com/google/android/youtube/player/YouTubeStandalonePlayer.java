package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Intent;

public final class YouTubeStandalonePlayer {
    /* renamed from: a */
    private static Intent m11236a(Intent intent, Activity activity, String str, int i, boolean z, boolean z2) {
        YouTubeIntents.m11235a(intent, activity).putExtra("developer_key", str).putExtra("autoplay", z).putExtra("lightbox_mode", z2).putExtra("start_time_millis", i).putExtra("window_has_status_bar", (activity.getWindow().getAttributes().flags & 1024) == 0);
        return intent;
    }

    public static Intent createVideoIntent(Activity activity, String str, String str2, int i, boolean z, boolean z2) {
        if (str2 == null) {
            throw new NullPointerException("The videoId cannot be null");
        } else if (str != null) {
            return m11236a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", str2), activity, str, i, z, z2);
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }
}
