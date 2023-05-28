package com.bytedance.sdk.openadsdk.p049k;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0933c;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.k.h */
/* compiled from: TrackRetryRepertoryImpl */
public class C0893h implements C0892g {

    /* renamed from: a */
    private Context f3180a;

    public C0893h(Context context) {
        this.f3180a = context;
    }

    /* renamed from: a */
    public synchronized List<C0891f> mo2752a() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        C0933c cVar = new C0933c(C0895a.m4285a(this.f3180a, "trackurl", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null));
        while (cVar.moveToNext()) {
            try {
                linkedList.add(new C0891f(cVar.getString(cVar.getColumnIndex("id")), cVar.getString(cVar.getColumnIndex("url")), cVar.getInt(cVar.getColumnIndex("retry"))));
            } finally {
                cVar.close();
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo2753a(C0891f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo2748a());
        contentValues.put("url", fVar.mo2750b());
        contentValues.put("replaceholder", 1);
        contentValues.put("retry", Integer.valueOf(fVar.mo2751c()));
        C0895a.m4287a(this.f3180a, "trackurl", contentValues);
    }

    /* renamed from: b */
    public synchronized void mo2754b(C0891f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo2748a());
        contentValues.put("url", fVar.mo2750b());
        contentValues.put("replaceholder", 1);
        contentValues.put("retry", Integer.valueOf(fVar.mo2751c()));
        C0895a.m4281a(this.f3180a, "trackurl", contentValues, "id=?", new String[]{fVar.mo2748a()});
    }

    /* renamed from: c */
    public synchronized void mo2755c(C0891f fVar) {
        C0895a.m4282a(this.f3180a, "trackurl", "id=?", new String[]{fVar.mo2748a()});
    }

    /* renamed from: b */
    public static String m4269b() {
        return "CREATE TABLE IF NOT EXISTS " + "trackurl" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "url" + " TEXT ," + "replaceholder" + " INTEGER default 0, " + "retry" + " INTEGER default 0" + ")";
    }
}
