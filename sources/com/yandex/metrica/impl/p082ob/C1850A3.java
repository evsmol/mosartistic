package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.A3 */
public class C1850A3 implements Parcelable {
    public static final Parcelable.Creator<C1850A3> CREATOR = new C1851a();

    /* renamed from: c */
    public static final String f5024c = UUID.randomUUID().toString();

    /* renamed from: a */
    private final ContentValues f5025a;

    /* renamed from: b */
    private ResultReceiver f5026b;

    /* renamed from: com.yandex.metrica.impl.ob.A3$a */
    class C1851a implements Parcelable.Creator<C1850A3> {
        C1851a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C2936f0.class.getClassLoader());
            return new C1850A3((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        public Object[] newArray(int i) {
            return new C1850A3[i];
        }
    }

    public C1850A3(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f5025a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f5024c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f5026b = resultReceiver;
    }

    /* renamed from: a */
    public static C1850A3 m6820a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (C1850A3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo15424b(com.yandex.metrica.C10725i r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.String> r0 = r4.f26872d     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6809a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x001c
            java.util.List<java.lang.String> r0 = r4.f26872d     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f5025a     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8537c((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "PROCESS_CFG_CUSTOM_HOSTS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f26870b     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6809a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f26870b     // Catch:{ all -> 0x0040 }
            java.util.Map r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8548i(r0)     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f5025a     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8546g(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "PROCESS_CFG_CLIDS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x003b
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x003b:
            r3.m6821a((com.yandex.metrica.C10725i) r4)     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1850A3.mo15424b(com.yandex.metrica.i):void");
    }

    /* renamed from: c */
    public ResultReceiver mo15426c() {
        return this.f5026b;
    }

    /* renamed from: d */
    public String mo15427d() {
        return this.f5025a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo15429e() {
        return this.f5025a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public String mo15430f() {
        return this.f5025a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public Integer mo15431g() {
        return this.f5025a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public String mo15432h() {
        return this.f5025a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public int mo15433i() {
        return this.f5025a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    /* renamed from: j */
    public boolean mo15434j() {
        return this.f5025a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f5025a + ", mDataResultReceiver=" + this.f5026b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f5025a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f5026b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m6821a(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.f26871c)) {
            String str = iVar.f26871c;
            synchronized (this) {
                this.f5025a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            synchronized (this) {
                this.f5025a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo15421a(List<String> list) {
        this.f5025a.put("PROCESS_CFG_CUSTOM_HOSTS", C2572Tl.m8537c(list));
    }

    /* renamed from: a */
    public Map<String, String> mo15419a() {
        return C2572Tl.m8540d(this.f5025a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: a */
    public synchronized void mo15422a(Map<String, String> map) {
        this.f5025a.put("PROCESS_CFG_CLIDS", C2572Tl.m8546g(map));
    }

    public C1850A3(C1850A3 a3) {
        synchronized (a3) {
            this.f5025a = new ContentValues(a3.f5025a);
            this.f5026b = a3.f5026b;
        }
    }

    /* renamed from: a */
    public synchronized void mo15420a(String str) {
        this.f5025a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    /* renamed from: b */
    public List<String> mo15423b() {
        String asString = this.f5025a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C2572Tl.m8539c(asString);
    }

    /* renamed from: b */
    public synchronized void mo15425b(String str) {
        this.f5025a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public C1850A3(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f5025a = contentValues == null ? new ContentValues() : contentValues;
        this.f5026b = resultReceiver;
    }
}
