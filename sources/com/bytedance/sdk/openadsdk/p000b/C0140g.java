package com.bytedance.sdk.openadsdk.p000b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10633j;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.b.g */
/* compiled from: AdEventRepertoryImpl */
public class C0140g implements C0139f<C0106a> {

    /* renamed from: a */
    private final Context f536a;

    /* renamed from: b */
    private final C0434c f537b = C0434c.m1779a(mo411c());

    /* renamed from: d */
    public String mo412d() {
        return "adevent";
    }

    public C0140g(Context context) {
        this.f536a = context;
    }

    /* renamed from: c */
    public Context mo411c() {
        Context context = this.f536a;
        return context == null ? C0558m.m2663a() : context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(3:13|14|28)(1:27)|26|9|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[Catch:{ all -> 0x0070 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.p000b.C0106a> mo401a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            if (r9 <= 0) goto L_0x001e
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = " DESC limit "
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            r0.append(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x001e:
            r7 = r0
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x0075 }
            r9.<init>()     // Catch:{ all -> 0x0075 }
            com.bytedance.sdk.openadsdk.multipro.aidl.c r10 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x0075 }
            android.content.Context r0 = r8.mo411c()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r8.mo412d()     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "id"
            java.lang.String r3 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x0075 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.p050a.C0895a.m4285a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0075 }
            r10.<init>(r0)     // Catch:{ all -> 0x0075 }
        L_0x0041:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0041 }
            r2.<init>(r1)     // Catch:{ all -> 0x0041 }
            com.bytedance.sdk.openadsdk.b.a r1 = new com.bytedance.sdk.openadsdk.b.a     // Catch:{ all -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0041 }
            r9.add(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0041
        L_0x006b:
            r10.close()     // Catch:{ all -> 0x0075 }
            monitor-exit(r8)
            return r9
        L_0x0070:
            r9 = move-exception
            r10.close()     // Catch:{ all -> 0x0075 }
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0140g.mo401a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public synchronized void mo404a(C0106a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.f423a);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.mo306b().toString());
            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry", 0);
            C0895a.m4287a(mo411c(), mo412d(), contentValues);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo405a(List<C0106a> list) {
        if (!C10633j.m31221a(list)) {
            LinkedList linkedList = new LinkedList();
            for (C0106a aVar : list) {
                linkedList.add(aVar.f423a);
            }
            C0895a.m4286a(mo411c(), "DELETE FROM " + mo412d() + " WHERE " + m641a("id", linkedList, 1000, true));
        }
    }

    /* renamed from: a */
    public synchronized void mo403a(int i, long j) {
        m642b(i, j);
    }

    /* renamed from: b */
    private synchronized void m642b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context c = mo411c();
        String d = mo412d();
        C0895a.m4282a(c, d, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    /* renamed from: a */
    public synchronized void mo406a(List<C0106a> list, int i, long j) {
        if (!C10633j.m31221a(list)) {
            try {
                m643b(list);
                m642b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m643b(List<C0106a> list) {
        LinkedList linkedList = new LinkedList();
        for (C0106a aVar : list) {
            linkedList.add(aVar.f423a);
        }
        C0895a.m4286a(mo411c(), "UPDATE " + mo412d() + " SET " + "retry" + " = " + "retry" + "+1" + " WHERE " + m641a("id", linkedList, 1000, true));
    }

    /* renamed from: a */
    public void mo407a(boolean z) {
        this.f537b.mo1177a("serverbusy_flag", z);
    }

    /* renamed from: a */
    public boolean mo408a() {
        return this.f537b.mo1181b("serverbusy_flag", false);
    }

    /* renamed from: b */
    public int mo409b() {
        return this.f537b.mo1178b("serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo402a(int i) {
        this.f537b.mo1174a("serverbusy_retrycount", i);
    }

    /* renamed from: e */
    public static String m644e() {
        return "CREATE TABLE IF NOT EXISTS " + "adevent" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }

    /* renamed from: a */
    private static String m641a(String str, List<?> list, int i, boolean z) {
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
            String a = m640a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
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
        return m640a(sb2, str + str2 + "('')");
    }

    /* renamed from: a */
    private static String m640a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
