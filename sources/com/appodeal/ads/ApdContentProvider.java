package com.appodeal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appodeal.ads.context.C9158g;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/ads/ApdContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class ApdContentProvider extends ContentProvider {

    /* renamed from: com.appodeal.ads.ApdContentProvider$a */
    public static final class C8982a extends Thread {

        /* renamed from: b */
        public static boolean f22715b;

        /* renamed from: a */
        public final Context f22716a;

        /* renamed from: com.appodeal.ads.ApdContentProvider$a$a */
        public static final class C8983a {
            /* renamed from: a */
            public static void m27076a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (!C8982a.f22715b) {
                    C8982a.f22715b = true;
                    new C8982a(context, 0).start();
                }
            }
        }

        public C8982a(Context context) {
            this.f22716a = context;
            setName("AppodealPrepare");
        }

        public /* synthetic */ C8982a(Context context, int i) {
            this(context);
        }

        public final void run() {
            try {
                C9213i.m27354c(this.f22716a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        Context applicationContext;
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return false;
        }
        NetworkStatus.INSTANCE.init(applicationContext);
        C9158g.f22974b.setApplicationContext(applicationContext);
        boolean z = C8982a.f22715b;
        C8982a.C8983a.m27076a(applicationContext);
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
