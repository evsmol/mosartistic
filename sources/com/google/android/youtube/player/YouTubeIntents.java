package com.google.android.youtube.player;

import android.content.Context;
import android.content.Intent;
import com.google.android.youtube.player.internal.C3967z;

public final class YouTubeIntents {
    /* renamed from: a */
    static Intent m11235a(Intent intent, Context context) {
        intent.putExtra("app_package", context.getPackageName()).putExtra("app_version", C3967z.m11238d(context)).putExtra("client_library_version", C3967z.m11237a());
        return intent;
    }
}
