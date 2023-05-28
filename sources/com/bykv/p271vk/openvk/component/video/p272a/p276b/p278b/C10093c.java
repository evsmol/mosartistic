package com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.p328f.C10619h;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b.c */
/* compiled from: VideoProxyDB */
public class C10093c {

    /* renamed from: b */
    private static volatile C10093c f24936b;

    /* renamed from: a */
    private final SparseArray<Map<String, C10091a>> f24937a = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10096d f24938c;

    /* renamed from: d */
    private final Executor f24939d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C10619h(5, "video_proxy_db"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile SQLiteStatement f24940e;

    private C10093c(Context context) {
        this.f24938c = new C10096d(context.getApplicationContext());
        this.f24937a.put(0, new ConcurrentHashMap());
        this.f24937a.put(1, new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static C10093c m28755a(Context context) {
        if (f24936b == null) {
            synchronized (C10093c.class) {
                if (f24936b == null) {
                    f24936b = new C10093c(context);
                }
            }
        }
        return f24936b;
    }

    /* renamed from: a */
    public C10091a mo62712a(String str, int i) {
        C10091a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = this.f24937a.get(i);
        if (map == null) {
            aVar = null;
        } else {
            aVar = (C10091a) map.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            Cursor query = this.f24938c.getReadableDatabase().query("video_http_header_t", (String[]) null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    aVar = new C10091a(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (!(aVar == null || map == null)) {
                map.put(str, aVar);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo62714a(final C10091a aVar) {
        if (aVar != null) {
            Map map = this.f24937a.get(aVar.f24934d);
            if (map != null) {
                map.put(aVar.f24931a, aVar);
            }
            this.f24939d.execute(new Runnable() {
                public void run() {
                    try {
                        if (C10093c.this.f24940e == null) {
                            SQLiteStatement unused = C10093c.this.f24940e = C10093c.this.f24938c.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            C10093c.this.f24940e.clearBindings();
                        }
                        C10093c.this.f24940e.bindString(1, aVar.f24931a);
                        C10093c.this.f24940e.bindString(2, aVar.f24932b);
                        C10093c.this.f24940e.bindLong(3, (long) aVar.f24933c);
                        C10093c.this.f24940e.bindLong(4, (long) aVar.f24934d);
                        C10093c.this.f24940e.bindString(5, aVar.f24935e);
                        C10093c.this.f24940e.executeInsert();
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo62715a(Collection<String> collection, int i) {
        if (collection != null && !collection.isEmpty()) {
            int size = collection.size() + 1;
            String[] strArr = new String[size];
            int i2 = -1;
            Map map = this.f24937a.get(i);
            for (String next : collection) {
                if (map != null) {
                    map.remove(next);
                }
                i2++;
                strArr[i2] = next;
            }
            strArr[i2 + 1] = String.valueOf(i);
            try {
                SQLiteDatabase writableDatabase = this.f24938c.getWritableDatabase();
                writableDatabase.delete("video_http_header_t", "key IN(" + m28757b(size) + ") AND " + "flag" + "=?", strArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private String m28757b(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo62713a(final int i) {
        Map map = this.f24937a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f24939d.execute(new Runnable() {
            public void run() {
                try {
                    C10093c.this.f24938c.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
