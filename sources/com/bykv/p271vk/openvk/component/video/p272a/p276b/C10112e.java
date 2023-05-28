package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.content.Context;
import android.util.Log;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10077b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e */
/* compiled from: Proxy */
public class C10112e {

    /* renamed from: a */
    static volatile C10077b f24977a;

    /* renamed from: b */
    static volatile C10079c f24978b;

    /* renamed from: c */
    public static final boolean f24979c = C10638l.m31240c();

    /* renamed from: d */
    public static volatile boolean f24980d;

    /* renamed from: e */
    static volatile boolean f24981e = true;

    /* renamed from: f */
    static volatile boolean f24982f;

    /* renamed from: g */
    static volatile int f24983g = 0;

    /* renamed from: h */
    public static volatile int f24984h = 3;

    /* renamed from: i */
    public static volatile Integer f24985i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static volatile C10093c f24986j;

    /* renamed from: k */
    private static volatile Context f24987k;

    /* renamed from: a */
    public static Context m28782a() {
        return f24987k;
    }

    /* renamed from: a */
    public static void m28785a(boolean z) {
        f24981e = z;
    }

    /* renamed from: b */
    public static void m28787b(boolean z) {
        f24982f = z;
    }

    /* renamed from: a */
    public static void m28783a(int i) {
        f24983g = i;
    }

    /* renamed from: a */
    public static void m28784a(C10079c cVar, Context context) {
        if (cVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f24987k = context.getApplicationContext();
        if (f24978b == null) {
            C10077b bVar = f24977a;
            if (bVar == null || !bVar.f24893a.getAbsolutePath().equals(cVar.f24895a.getAbsolutePath())) {
                f24978b = cVar;
                f24986j = C10093c.m28755a(context);
                f24978b.mo62684a((C10079c.C10086a) new C10079c.C10086a() {
                    /* renamed from: a */
                    public void mo62692a(String str) {
                        if (C10112e.f24979c) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + str);
                        }
                    }

                    /* renamed from: a */
                    public void mo62693a(Set<String> set) {
                        C10112e.f24986j.mo62715a((Collection<String>) set, 0);
                        if (C10112e.f24979c) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set);
                        }
                    }
                });
                C10121f a = C10121f.m28816a();
                a.mo62756a(cVar);
                a.mo62757a(f24986j);
                C10102d c = C10102d.m28766c();
                c.mo62724a(cVar);
                c.mo62725a(f24986j);
                return;
            }
            throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
        }
    }

    /* renamed from: b */
    public static C10079c m28786b() {
        return f24978b;
    }

    /* renamed from: c */
    public static C10077b m28788c() {
        return f24977a;
    }
}
