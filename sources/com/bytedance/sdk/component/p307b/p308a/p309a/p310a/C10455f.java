package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p307b.p308a.C10478j;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import com.bytedance.sdk.component.p307b.p308a.C10484n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.f */
/* compiled from: NetResponse */
public class C10455f extends C10483m {

    /* renamed from: a */
    HttpURLConnection f26063a;

    /* renamed from: b */
    C10479k f26064b;

    /* renamed from: a */
    public long mo63885a() {
        return 0;
    }

    /* renamed from: b */
    public long mo63888b() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public C10455f(HttpURLConnection httpURLConnection, C10479k kVar) {
        this.f26063a = httpURLConnection;
        this.f26064b = kVar;
    }

    /* renamed from: c */
    public int mo63889c() {
        try {
            return this.f26063a.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public boolean mo63891d() {
        return mo63889c() >= 200 && mo63889c() < 300;
    }

    /* renamed from: e */
    public String mo63892e() throws IOException {
        return this.f26063a.getResponseMessage();
    }

    /* renamed from: f */
    public C10484n mo63893f() {
        try {
            return new C10456g(this.f26063a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C10469e mo63894g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f26063a.getHeaderFields().entrySet()) {
            for (String str : (List) entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase((String) entry.getKey()) || mo63889c() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new C10469e((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: a */
    public String mo63886a(String str) {
        return this.f26063a.getHeaderField(str);
    }

    /* renamed from: a */
    public String mo63887a(String str, String str2) {
        return !TextUtils.isEmpty(mo63886a(str)) ? mo63886a(str) : str2;
    }

    public void close() {
        try {
            mo63893f().close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public C10478j mo63895h() {
        return C10478j.HTTP_1_1;
    }
}
