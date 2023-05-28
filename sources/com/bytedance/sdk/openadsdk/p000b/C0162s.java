package com.bytedance.sdk.openadsdk.p000b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10633j;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.b.s */
/* compiled from: StatsEventRepertoryImpl */
public class C0162s implements C0139f<C0818c.C0821a> {

    /* renamed from: a */
    protected final C0434c f614a = C0434c.m1779a(mo459e());

    /* renamed from: b */
    private final Context f615b;

    /* renamed from: c */
    public String mo456c() {
        return "logstats";
    }

    public C0162s(Context context) {
        this.f615b = context;
    }

    /* renamed from: e */
    public Context mo459e() {
        Context context = this.f615b;
        return context == null ? C0558m.m2663a() : context;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047 A[Catch:{ all -> 0x0075 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bytedance.sdk.openadsdk.p042h.p045c.C0818c.C0821a> mo401a(int r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 <= 0) goto L_0x001d
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " DESC limit "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto L_0x001e
        L_0x001d:
            r11 = 0
        L_0x001e:
            r7 = r11
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.bytedance.sdk.openadsdk.multipro.aidl.c r12 = new com.bytedance.sdk.openadsdk.multipro.aidl.c
            android.content.Context r0 = r10.mo459e()
            java.lang.String r1 = r10.mo456c()
            java.lang.String r8 = "id"
            java.lang.String r9 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r8, r9}
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.p050a.C0895a.m4285a(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.<init>(r0)
        L_0x0041:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            int r0 = r12.getColumnIndex(r8)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x0075 }
            int r1 = r12.getColumnIndex(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r12.getString(r1)     // Catch:{ all -> 0x0075 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0041 }
            com.bytedance.sdk.openadsdk.h.c.c$a r1 = new com.bytedance.sdk.openadsdk.h.c.c$a     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0041 }
            r11.add(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0041
        L_0x0071:
            r12.close()
            return r11
        L_0x0075:
            r11 = move-exception
            r12.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0162s.mo401a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public synchronized void mo404a(C0818c.C0821a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", aVar.f3025a);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.f3026b.toString());
        contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry", 0);
        C0895a.m4287a(mo459e(), mo456c(), contentValues);
    }

    /* renamed from: a */
    public synchronized void mo405a(List<C0818c.C0821a> list) {
        if (!C10633j.m31221a(list)) {
            LinkedList linkedList = new LinkedList();
            for (C0818c.C0821a aVar : list) {
                linkedList.add(aVar.f3025a);
            }
            C0895a.m4286a(mo459e(), "DELETE FROM " + mo456c() + " WHERE " + m749a("id", linkedList, 1000, true));
        }
    }

    /* renamed from: a */
    public synchronized void mo403a(int i, long j) {
        m750b(i, j);
    }

    /* renamed from: b */
    private synchronized void m750b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context e = mo459e();
        String c = mo456c();
        C0895a.m4282a(e, c, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    /* renamed from: a */
    public synchronized void mo406a(List<C0818c.C0821a> list, int i, long j) {
        if (!C10633j.m31221a(list)) {
            try {
                m751b(list);
                m750b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m751b(List<C0818c.C0821a> list) {
        LinkedList linkedList = new LinkedList();
        for (C0818c.C0821a aVar : list) {
            linkedList.add(aVar.f3025a);
        }
        C0895a.m4286a(mo459e(), "UPDATE " + mo456c() + " SET " + "retry" + " = " + "retry" + "+1" + " WHERE " + m749a("id", linkedList, 1000, true));
    }

    /* renamed from: a */
    public void mo407a(boolean z) {
        this.f614a.mo1177a("stats_serverbusy_flag", z);
    }

    /* renamed from: a */
    public boolean mo408a() {
        return this.f614a.mo1181b("stats_serverbusy_flag", false);
    }

    /* renamed from: b */
    public int mo409b() {
        return this.f614a.mo1178b("stats_serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo402a(int i) {
        this.f614a.mo1174a("stats_serverbusy_retrycount", i);
    }

    /* renamed from: f */
    public static String m752f() {
        return "CREATE TABLE IF NOT EXISTS " + "logstats" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }

    /* renamed from: a */
    private static String m749a(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String a = m748a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(a);
            sb.append("')");
        }
        String sb2 = sb.toString();
        return m748a(sb2, str + str2 + "('')");
    }

    /* renamed from: a */
    private static String m748a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
