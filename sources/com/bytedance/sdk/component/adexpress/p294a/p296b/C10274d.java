package com.bytedance.sdk.component.adexpress.p294a.p296b;

import android.text.TextUtils;
import com.appnext.base.p264b.C8849c;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10279b;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10280c;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.d */
/* compiled from: TmplDiffManager */
public class C10274d {

    /* renamed from: a */
    private static volatile C10274d f25366a;

    /* renamed from: b */
    private AtomicBoolean f25367b = new AtomicBoolean(false);

    /* renamed from: a */
    public static C10274d m29528a() {
        if (f25366a == null) {
            synchronized (C10274d.class) {
                if (f25366a == null) {
                    f25366a = new C10274d();
                }
            }
        }
        return f25366a;
    }

    private C10274d() {
    }

    /* renamed from: a */
    public C10279b mo63116a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C10272c.m29519a().mo63109a(str);
    }

    /* renamed from: b */
    public Set<String> mo63119b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C10272c.m29519a().mo63113b(str);
    }

    /* renamed from: b */
    private void m29532b() {
        if (C10262a.m29464a().mo63095c() != null) {
            int a = C10262a.m29464a().mo63095c().mo1818a();
            if (a <= 0) {
                a = 100;
            }
            List<C10279b> b = C10272c.m29519a().mo63112b();
            if (b.isEmpty() || a >= b.size()) {
                C10638l.m31235b("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + a + ", 目前存储的模版的个数 " + b.size());
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (C10279b next : b) {
                treeMap.put(next.mo63153g(), next);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (((float) b.size()) - (((float) a) * 0.75f));
            int i = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i < size) {
                    i++;
                    ((Long) entry.getKey()).longValue();
                    C10279b bVar = (C10279b) entry.getValue();
                    if (bVar != null) {
                        hashSet.add(bVar.mo63144b());
                    }
                }
            }
            mo63118a((Set<String>) hashSet);
            this.f25367b.set(false);
        }
    }

    /* renamed from: c */
    private JSONObject m29534c(String str) {
        if (C10262a.m29464a().mo63095c() == null) {
            return null;
        }
        C10579b g = C10262a.m29464a().mo63095c().mo1824g();
        g.mo64176a(str);
        C10576b a = g.mo64172a();
        if (a != null) {
            try {
                if (a.mo64166f() && a.mo64164d() != null) {
                    return new JSONObject(a.mo64164d());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo63117a(C10280c cVar, String str) {
        if (cVar == null) {
            C10638l.m31242e("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = cVar.f25391a;
        final String str3 = cVar.f25393c;
        final String str4 = cVar.f25392b;
        final String str5 = cVar.f25394d;
        final String str6 = cVar.f25395e;
        final String h = TextUtils.isEmpty(str) ? C10262a.m29464a().mo63095c() != null ? C10262a.m29464a().mo63095c().mo1825h() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            C10638l.m31242e("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            C10615e.m31160a(new C10618g("saveTemplate") {
                public void run() {
                    C10274d.this.m29531a(str2, str3, str4, str5, str6, h);
                }
            }, 10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m29531a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r7.mo63116a((java.lang.String) r8)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0021
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m29533b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x001f:
            monitor-exit(r7)
            return
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002b
            r7.m29530a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0035
            r7.m29530a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x0035:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m29533b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
        L_0x003f:
            boolean r8 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29543b(r12)     // Catch:{ all -> 0x0055 }
            boolean r9 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a.m29501f()     // Catch:{ all -> 0x0055 }
            if (r9 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x0053
        L_0x004b:
            com.bytedance.sdk.component.adexpress.a.b.b r8 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.m29502a()     // Catch:{ all -> 0x0055 }
            r9 = 1
            r8.mo63099a((boolean) r9)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r7)
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10274d.m29531a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private void m29533b(String str, String str2, String str3, String str4, String str5, String str6) {
        C10272c.m29519a().mo63110a(new C10279b().mo63141a(str).mo63143b(str2).mo63145c(str3).mo63147d(str4).mo63149e(str5).mo63151f(str6).mo63140a(Long.valueOf(System.currentTimeMillis())));
        m29532b();
    }

    /* renamed from: a */
    private void m29530a(String str, String str2, String str3) {
        JSONObject c;
        if (!TextUtils.isEmpty(str) && (c = m29534c(str)) != null) {
            String optString = c.optString("md5");
            String optString2 = c.optString("version");
            String optString3 = c.optString(C8849c.DATA);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C10279b a = new C10279b().mo63141a(str2).mo63143b(str3).mo63145c(optString).mo63147d(str).mo63149e(optString3).mo63151f(optString2).mo63140a(Long.valueOf(System.currentTimeMillis()));
                C10272c.m29519a().mo63110a(a);
                m29532b();
                if (C10276e.m29543b(optString2)) {
                    a.mo63151f(optString2);
                    C10268b.m29502a().mo63099a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63118a(Set<String> set) {
        try {
            C10272c.m29519a().mo63111a(set);
        } catch (Throwable th) {
            C10638l.m31235b("TmplDiffManager", th.getMessage());
        }
    }
}
