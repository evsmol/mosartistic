package com.apm.insight.p177k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.C6595b;
import com.apm.insight.entity.C6599e;
import com.apm.insight.nativecrash.C6700b;
import com.apm.insight.nativecrash.C6707c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p165a.C6549a;
import com.apm.insight.p167c.C6583a;
import com.apm.insight.p169e.C6589a;
import com.apm.insight.p173g.C6608a;
import com.apm.insight.p177k.C6642c;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6686p;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6737b;
import com.apm.insight.runtime.C6747h;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6766s;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.b */
public final class C6635b {

    /* renamed from: d */
    private static volatile C6635b f14256d;

    /* renamed from: a */
    List<File> f14257a = new ArrayList();

    /* renamed from: b */
    List<File> f14258b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f14259c;

    /* renamed from: e */
    private int f14260e = -1;

    /* renamed from: f */
    private C6641b f14261f;

    /* renamed from: g */
    private HashMap<String, C6641b> f14262g;

    /* renamed from: h */
    private volatile boolean f14263h = false;

    /* renamed from: i */
    private Runnable f14264i = new Runnable() {
        public void run() {
            C6635b.this.m16390g();
        }
    };

    /* renamed from: j */
    private Runnable f14265j = new Runnable() {
        public void run() {
            C6635b.this.m16388e();
        }
    };

    /* renamed from: com.apm.insight.k.b$a */
    static class C6640a {

        /* renamed from: a */
        File f14275a;

        /* renamed from: b */
        long f14276b = -1;

        /* renamed from: c */
        long f14277c = -1;

        /* renamed from: d */
        CrashType f14278d;

        /* renamed from: e */
        String f14279e;

        C6640a(File file, long j, CrashType crashType) {
            this.f14275a = file;
            this.f14276b = j;
            this.f14278d = crashType;
            this.f14279e = file.getName();
        }

        C6640a(File file, CrashType crashType) {
            this.f14275a = file;
            this.f14278d = crashType;
            this.f14279e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b */
    static class C6641b {

        /* renamed from: a */
        String f14280a;

        /* renamed from: b */
        List<C6640a> f14281b = new ArrayList();

        /* renamed from: c */
        List<C6640a> f14282c = new ArrayList();

        /* renamed from: d */
        C6640a f14283d;

        /* renamed from: e */
        C6640a f14284e;

        /* renamed from: f */
        boolean f14285f = false;

        /* renamed from: g */
        int f14286g = 0;

        C6641b(String str) {
            this.f14280a = str;
        }
    }

    private C6635b(Context context) {
        this.f14259c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r13.put("lastAliveTime", com.amazon.device.ads.DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        com.apm.insight.entity.C6594a.m16164a(r13, "filters", "lastAliveTime", com.amazon.device.ads.DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0168 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.apm.insight.entity.C6599e m16371a(java.io.File r21, com.apm.insight.CrashType r22, java.lang.String r23, long r24, long r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r24
            java.lang.String r4 = "data"
            java.lang.String r5 = "unauthentic_version"
            java.lang.String r6 = "unknown"
            java.lang.String r7 = "true"
            java.lang.String r8 = "has_dump"
            java.lang.String r9 = "logcat"
            java.lang.String r10 = "header"
            java.lang.String r11 = "lastAliveTime"
            java.lang.String r12 = "filters"
            boolean r14 = r21.isFile()     // Catch:{ all -> 0x01da }
            if (r14 == 0) goto L_0x0028
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r21)     // Catch:{ all -> 0x0024 }
            r13 = 0
            goto L_0x01e9
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r13 = 0
            goto L_0x01dd
        L_0x0028:
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01da }
            if (r0 != r14) goto L_0x002e
            r14 = 1
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0049
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r21.getName()     // Catch:{ all -> 0x0045 }
            r3 = r21
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0024 }
            com.apm.insight.entity.e r0 = com.apm.insight.p178l.C6675i.m16543d((java.lang.String) r0)     // Catch:{ all -> 0x0024 }
            return r0
        L_0x0045:
            r0 = move-exception
            r3 = r21
            goto L_0x0025
        L_0x0049:
            com.apm.insight.entity.e r15 = com.apm.insight.p178l.C6675i.m16516a((java.io.File) r21, (com.apm.insight.CrashType) r22)     // Catch:{ all -> 0x01da }
            org.json.JSONObject r13 = r15.mo52073b()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r18 = r15.mo52073b()     // Catch:{ all -> 0x01d7 }
            if (r18 == 0) goto L_0x01d2
            r18 = r4
            com.apm.insight.CrashType r4 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x01d7 }
            if (r0 != r4) goto L_0x005e
            return r15
        L_0x005e:
            java.lang.String r0 = "crash_time"
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "app_start_time"
            r19 = r5
            r4 = r26
            r13.put(r0, r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r13.optJSONObject(r10)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x007d
            android.content.Context r0 = r1.f14259c     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.m16139a(r0, r2)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r0.mo52042f()     // Catch:{ all -> 0x01d7 }
            goto L_0x0082
        L_0x007d:
            if (r14 == 0) goto L_0x0082
            r13.remove(r10)     // Catch:{ all -> 0x01d7 }
        L_0x0082:
            java.lang.String r4 = "sdk_version_name"
            r5 = 0
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = "sdk_version"
            if (r4 != 0) goto L_0x008f
            java.lang.String r4 = "1.3.8.nourl-alpha.0"
        L_0x008f:
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r4 = r13.optJSONArray(r9)     // Catch:{ all -> 0x01d7 }
            boolean r4 = com.apm.insight.p178l.C6675i.m16534a((org.json.JSONArray) r4)     // Catch:{ all -> 0x01d7 }
            if (r4 == 0) goto L_0x00a3
            org.json.JSONArray r4 = com.apm.insight.runtime.C6751k.m16959b(r23)     // Catch:{ all -> 0x01d7 }
            r13.put(r9, r4)     // Catch:{ all -> 0x01d7 }
        L_0x00a3:
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_logcat"
            boolean r5 = com.apm.insight.p178l.C6678l.m16560a((org.json.JSONObject) r13, (java.lang.String) r9)     // Catch:{ all -> 0x01d7 }
            if (r5 != 0) goto L_0x00b1
            r16 = 1
            goto L_0x00b3
        L_0x00b1:
            r16 = 0
        L_0x00b3:
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "memory_leak"
            boolean r5 = com.apm.insight.entity.C6594a.m16170b((java.lang.String) r23)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "fd_leak"
            boolean r5 = com.apm.insight.entity.C6594a.m16171c((java.lang.String) r23)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "threads_leak"
            boolean r5 = com.apm.insight.entity.C6594a.m16172d(r23)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_devices"
            boolean r5 = com.apm.insight.entity.Header.m16141a()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_runtime"
            boolean r5 = com.apm.insight.nativecrash.NativeImpl.m16720e()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_x86_devices"
            boolean r5 = com.apm.insight.entity.Header.m16144b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_meminfo_file"
            boolean r5 = com.apm.insight.entity.C6594a.m16168a((java.lang.String) r23)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_root"
            boolean r5 = com.apm.insight.nativecrash.C6700b.m16747m()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "launch_did"
            android.content.Context r5 = r1.f14259c     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = com.apm.insight.p175i.C6624a.m16344a(r5)     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "crash_uuid"
            java.lang.String r5 = r21.getName()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "jiffy"
            r16 = r10
            long r9 = com.apm.insight.runtime.C6762q.C6763a.m17022a()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r9)     // Catch:{ all -> 0x01d7 }
            r4 = r23
            java.lang.String r4 = com.apm.insight.runtime.C6737b.m16910a(r2, r4)     // Catch:{ all -> 0x0168 }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0168 }
            long r2 = r4 - r2
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0168 }
            r9 = 60000(0xea60, double:2.9644E-319)
            int r17 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r17 >= 0) goto L_0x015b
            java.lang.String r2 = "< 60s"
            goto L_0x015d
        L_0x015b:
            java.lang.String r2 = "> 60s"
        L_0x015d:
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0168 }
            r13.put(r11, r2)     // Catch:{ all -> 0x0168 }
            goto L_0x016e
        L_0x0168:
            r13.put(r11, r6)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r6)     // Catch:{ all -> 0x01d7 }
        L_0x016e:
            r13.put(r8, r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r2 = "storage"
            java.lang.Object r2 = r13.opt(r2)     // Catch:{ all -> 0x01d7 }
            if (r2 != 0) goto L_0x0184
            android.content.Context r2 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = com.apm.insight.p178l.C6695w.m16683a((android.content.Context) r2)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C6594a.m16167a((org.json.JSONObject) r13, (org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
        L_0x0184:
            boolean r2 = com.apm.insight.entity.Header.m16145b((org.json.JSONObject) r0)     // Catch:{ all -> 0x01d7 }
            if (r2 == 0) goto L_0x018f
            r2 = r19
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r2, (java.lang.String) r2)     // Catch:{ all -> 0x01d7 }
        L_0x018f:
            com.apm.insight.entity.C6598d.m16214b(r13)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = r15.mo52073b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "upload_scene"
            java.lang.String r4 = "launch_scan"
            r2.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            if (r14 == 0) goto L_0x01cb
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x01d7 }
            r2.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "event_type"
            java.lang.String r4 = "start_crash"
            r13.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "stack"
            r4 = r18
            java.lang.Object r5 = r13.remove(r4)     // Catch:{ all -> 0x01d7 }
            r13.put(r3, r5)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x01d7 }
            r3.<init>()     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = r3.put(r13)     // Catch:{ all -> 0x01d7 }
            r2.put(r4, r3)     // Catch:{ all -> 0x01d7 }
            r3 = r16
            r2.put(r3, r0)     // Catch:{ all -> 0x01d7 }
            r15.mo52071a((org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01cb:
            java.lang.String r0 = "isJava"
            r2 = 1
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01d2:
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r21)     // Catch:{ all -> 0x01d7 }
        L_0x01d5:
            r13 = r15
            goto L_0x01e9
        L_0x01d7:
            r0 = move-exception
            r13 = r15
            goto L_0x01dd
        L_0x01da:
            r0 = move-exception
            r5 = 0
            r13 = r5
        L_0x01dd:
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r21)
            com.apm.insight.c r2 = com.apm.insight.C6553b.m16004a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo52019a((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x01e9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6635b.m16371a(java.io.File, com.apm.insight.CrashType, java.lang.String, long, long):com.apm.insight.entity.e");
    }

    /* renamed from: a */
    public static C6635b m16372a() {
        if (f14256d == null) {
            synchronized (C6635b.class) {
                if (f14256d == null) {
                    f14256d = new C6635b(C6617h.m16313g());
                }
            }
        }
        return f14256d;
    }

    /* renamed from: a */
    private JSONObject m16373a(C6700b bVar) {
        JSONObject d = bVar.mo52184d();
        if (d != null && d.length() != 0) {
            return d;
        }
        if (C6617h.m16310d()) {
            bVar.mo52191l();
        }
        if (!bVar.mo52183c()) {
            bVar.mo52190k();
            return null;
        } else if (!bVar.mo52186f()) {
            bVar.mo52190k();
            return null;
        } else if (bVar.mo52187g()) {
            bVar.mo52190k();
            return null;
        } else {
            bVar.mo52185e();
            return bVar.mo52189j();
        }
    }

    /* renamed from: a */
    private void m16374a(C6641b bVar) {
        C6675i.m16532a(C6685o.m16586a(this.f14259c, bVar.f14280a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r1.f14284e == r7) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[SYNTHETIC, Splitter:B:34:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c A[Catch:{ all -> 0x0161 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16375a(com.apm.insight.p177k.C6635b.C6641b r21, boolean r22, com.apm.insight.runtime.C6747h r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r23
            java.lang.String r3 = "crash_thread_name"
            java.lang.String r4 = "NPTH_CATCH"
            java.lang.String r5 = "aid"
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f14281b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            com.apm.insight.k.b$a r0 = r1.f14284e
            if (r0 != 0) goto L_0x001b
            com.apm.insight.k.b$a r0 = r1.f14283d
            r1.f14284e = r0
        L_0x001b:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f14281b
            java.util.Iterator r6 = r0.iterator()
        L_0x0021:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r6.next()
            r7 = r0
            com.apm.insight.k.b$a r7 = (com.apm.insight.p177k.C6635b.C6640a) r7
            java.io.File r14 = r7.f14275a     // Catch:{ all -> 0x0168 }
            com.apm.insight.CrashType r15 = r7.f14278d     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = r1.f14280a     // Catch:{ all -> 0x0168 }
            long r12 = r7.f14276b     // Catch:{ all -> 0x0168 }
            long r9 = r7.f14277c     // Catch:{ all -> 0x0168 }
            r8 = r20
            r16 = r9
            r9 = r14
            r10 = r15
            r19 = r6
            r18 = r14
            r6 = r15
            r14 = r16
            com.apm.insight.entity.e r8 = r8.m16371a(r9, r10, r11, r12, r14)     // Catch:{ all -> 0x0166 }
            if (r8 != 0) goto L_0x0050
        L_0x004b:
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r18)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0050:
            org.json.JSONObject r9 = r8.mo52073b()     // Catch:{ all -> 0x0166 }
            if (r9 != 0) goto L_0x0057
            goto L_0x004b
        L_0x0057:
            java.lang.String r0 = "header"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0060:
            if (r6 != 0) goto L_0x0098
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = r18.getName()     // Catch:{ all -> 0x0166 }
            r12 = r18
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0166 }
            boolean r10 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = r12.getName()     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = "_"
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ all -> 0x0166 }
            int r10 = r10.length     // Catch:{ all -> 0x0166 }
            r11 = 5
            if (r10 >= r11) goto L_0x009a
        L_0x0081:
            java.lang.String r0 = r8.mo52068a()     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.l r0 = com.apm.insight.p177k.C6647e.m16421b(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.mo52152a()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0179
        L_0x0093:
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0098:
            r12 = r18
        L_0x009a:
            java.io.File r10 = com.apm.insight.entity.C6595b.m16198a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            boolean r11 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r11 != 0) goto L_0x00a5
            goto L_0x0093
        L_0x00a5:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ all -> 0x0163 }
            java.lang.String r10 = com.apm.insight.p178l.C6675i.m16539c((java.io.File) r10)     // Catch:{ all -> 0x0163 }
            r11.<init>(r10)     // Catch:{ all -> 0x0163 }
            com.apm.insight.CrashType r10 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x0166 }
            if (r6 != r10) goto L_0x00c0
            java.lang.String r10 = "data"
            java.lang.Object r10 = r9.opt(r10)     // Catch:{ all -> 0x0166 }
            org.json.JSONArray r10 = (org.json.JSONArray) r10     // Catch:{ all -> 0x0166 }
            r13 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r13)     // Catch:{ all -> 0x0166 }
            goto L_0x00c1
        L_0x00c0:
            r10 = r9
        L_0x00c1:
            java.lang.String r13 = "ignore"
            java.lang.String r14 = "filters"
            if (r22 != 0) goto L_0x00cb
            com.apm.insight.k.b$a r15 = r1.f14284e     // Catch:{ all -> 0x0166 }
            if (r15 != r7) goto L_0x00d3
        L_0x00cb:
            java.lang.String r15 = r7.f14279e     // Catch:{ all -> 0x0166 }
            boolean r15 = r15.contains(r13)     // Catch:{ all -> 0x0166 }
            if (r15 == 0) goto L_0x0106
        L_0x00d3:
            java.lang.Object r15 = r0.opt(r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r5, (java.lang.String) r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = "has_ignore"
            r16 = r6
            java.lang.String r6 = r7.f14279e     // Catch:{ all -> 0x00f9 }
            boolean r6 = r6.contains(r13)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r6)     // Catch:{ all -> 0x00f9 }
            r6 = 2010(0x7da, float:2.817E-42)
            r0.put(r5, r6)     // Catch:{ all -> 0x00f9 }
            goto L_0x011e
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            r16 = r6
        L_0x00fe:
            com.apm.insight.c r6 = com.apm.insight.C6553b.m16004a()     // Catch:{ all -> 0x0166 }
            r6.mo52019a((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x011e
        L_0x0106:
            r16 = r6
            if (r2 == 0) goto L_0x011e
            java.lang.String r0 = "crash_md5"
            java.lang.String r6 = "default"
            java.lang.String r0 = r10.optString(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r2.mo52305a((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x011e
            java.io.File r0 = r7.f14275a     // Catch:{ all -> 0x0166 }
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x011e:
            java.lang.String r0 = "start_uuid"
            java.lang.String r6 = r1.f14280a     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "leak_threads_count"
            int r6 = r1.f14286g     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "unknown"
            java.lang.String r0 = r10.optString(r3, r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.p178l.C6689r.m16636a((org.json.JSONObject) r9)     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.b$3 r0 = new com.apm.insight.k.b$3     // Catch:{ all -> 0x0166 }
            r6 = r20
            r0.<init>(r8, r12, r1)     // Catch:{ all -> 0x0161 }
            com.apm.insight.entity.C6595b.m16206a((org.json.JSONObject) r9, (org.json.JSONArray) r11, (com.apm.insight.entity.C6595b.C6596a) r0)     // Catch:{ all -> 0x0161 }
            boolean r0 = com.apm.insight.p178l.C6675i.m16532a((java.io.File) r12)     // Catch:{ all -> 0x0161 }
            if (r0 != 0) goto L_0x015b
            com.apm.insight.e.a r0 = com.apm.insight.p169e.C6589a.m16122a()     // Catch:{ all -> 0x0161 }
            java.lang.String r8 = r12.getAbsolutePath()     // Catch:{ all -> 0x0161 }
            com.apm.insight.e.a.a r8 = com.apm.insight.p169e.p170a.C6590a.m16127a(r8)     // Catch:{ all -> 0x0161 }
            r0.mo52026a((com.apm.insight.p169e.p170a.C6590a) r8)     // Catch:{ all -> 0x0161 }
        L_0x015b:
            r8 = r16
            com.apm.insight.p177k.C6642c.m16398a((com.apm.insight.CrashType) r8, (org.json.JSONObject) r9)     // Catch:{ all -> 0x0161 }
            goto L_0x0179
        L_0x0161:
            r0 = move-exception
            goto L_0x016d
        L_0x0163:
            r6 = r20
            goto L_0x0179
        L_0x0166:
            r0 = move-exception
            goto L_0x016b
        L_0x0168:
            r0 = move-exception
            r19 = r6
        L_0x016b:
            r6 = r20
        L_0x016d:
            com.apm.insight.c r8 = com.apm.insight.C6553b.m16004a()
            r8.mo52019a((java.lang.String) r4, (java.lang.Throwable) r0)
            java.io.File r0 = r7.f14275a
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r0)
        L_0x0179:
            r6 = r19
            goto L_0x0021
        L_0x017d:
            r6 = r20
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6635b.m16375a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    /* renamed from: a */
    private void m16377a(File file, C6641b bVar) {
    }

    /* renamed from: a */
    private void m16378a(HashMap<String, C6641b> hashMap) {
        File[] listFiles = C6685o.m16604f(this.f14259c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                        String name = file.getName();
                        C6641b bVar = hashMap.get(name);
                        if (bVar == null) {
                            bVar = new C6641b(name);
                            hashMap.put(name, bVar);
                        }
                        JSONArray a = C6707c.m16775a(C6685o.m16617l(file), C6685o.m16618m(file));
                        bVar.f14286g = a.length();
                        if (bVar.f14286g > 0) {
                            try {
                                C6675i.m16526a(C6685o.m16619n(file), a, false);
                            } catch (Throwable unused) {
                            }
                        }
                        i++;
                    } else {
                        C6675i.m16532a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                    C6675i.m16532a(file);
                }
            }
        }
    }

    /* renamed from: a */
    private void m16379a(HashMap<String, C6641b> hashMap, C6641b bVar) {
        File[] listFiles = C6685o.m16598d(this.f14259c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                        String name = file.getName();
                        C6641b bVar2 = hashMap.get(name);
                        if (bVar2 == null) {
                            bVar2 = new C6641b(name);
                            hashMap.put(name, bVar2);
                        }
                        bVar2.f14282c.add(new C6640a(file, CrashType.NATIVE));
                        i++;
                    } else {
                        C6675i.m16532a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                    C6675i.m16532a(file);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r4.equals("launch") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16380a(java.util.HashMap<java.lang.String, com.apm.insight.p177k.C6635b.C6641b> r17, com.apm.insight.p177k.C6635b.C6641b r18, java.io.File r19, java.lang.String r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "G"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "_"
            java.lang.String[] r4 = r3.split(r4)
            int r5 = r4.length
            r6 = 5
            r7 = 0
            if (r5 >= r6) goto L_0x0026
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f14281b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            return
        L_0x0026:
            r5 = 0
            r6 = r4[r5]     // Catch:{ all -> 0x00b7 }
            long r8 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r6 = 4
            r6 = r4[r6]     // Catch:{ all -> 0x00b7 }
            long r10 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r1 = 2
            r6 = r4[r1]
            r12 = 1
            r4 = r4[r12]
            r13 = -1
            int r14 = r4.hashCode()
            r15 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r14 == r15) goto L_0x0063
            r5 = 96741(0x179e5, float:1.35563E-40)
            if (r14 == r5) goto L_0x0059
            r5 = 3254818(0x31aa22, float:4.560971E-39)
            if (r14 == r5) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            java.lang.String r5 = "java"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = 1
            goto L_0x006d
        L_0x0059:
            java.lang.String r5 = "anr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = 2
            goto L_0x006d
        L_0x0063:
            java.lang.String r14 = "launch"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r5 = -1
        L_0x006d:
            if (r5 == 0) goto L_0x007a
            if (r5 == r12) goto L_0x0077
            if (r5 == r1) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.ANR
            goto L_0x007c
        L_0x0077:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.JAVA
            goto L_0x007c
        L_0x007a:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.LAUNCH
        L_0x007c:
            java.lang.Object r1 = r0.get(r6)
            com.apm.insight.k.b$b r1 = (com.apm.insight.p177k.C6635b.C6641b) r1
            if (r1 != 0) goto L_0x008c
            com.apm.insight.k.b$b r1 = new com.apm.insight.k.b$b
            r1.<init>(r6)
            r0.put(r6, r1)
        L_0x008c:
            com.apm.insight.k.b$a r0 = new com.apm.insight.k.b$a
            r0.<init>(r2, r8, r7)
            r0.f14277c = r10
            com.apm.insight.k.b$a r2 = r1.f14283d
            if (r2 == 0) goto L_0x00a1
            com.apm.insight.k.b$a r2 = r1.f14283d
            long r4 = r2.f14276b
            long r8 = r0.f14276b
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
        L_0x00a1:
            if (r7 == 0) goto L_0x00b1
            com.apm.insight.CrashType r2 = com.apm.insight.CrashType.ANR
            if (r7 == r2) goto L_0x00b1
            java.lang.String r2 = "ignore"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x00b1
            r1.f14283d = r0
        L_0x00b1:
            java.util.List<com.apm.insight.k.b$a> r1 = r1.f14281b
            r1.add(r0)
            goto L_0x00e4
        L_0x00b7:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f14281b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            com.apm.insight.c r0 = com.apm.insight.C6553b.m16004a()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "err format crashTime:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.String r2 = "NPTH_CATCH"
            r0.mo52019a((java.lang.String) r2, (java.lang.Throwable) r1)
            return
        L_0x00e1:
            com.apm.insight.p178l.C6675i.m16532a((java.io.File) r19)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6635b.m16380a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m16381a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m16382b(C6641b bVar, boolean z, C6747h hVar) {
        boolean z2;
        final C6641b bVar2 = bVar;
        C6747h hVar2 = hVar;
        if (bVar2.f14282c.size() <= 1 && bVar2.f14282c.isEmpty()) {
            bVar2.f14284e = bVar2.f14283d;
            return;
        }
        boolean b = C6686p.m16623b(this.f14259c);
        bVar2.f14284e = bVar2.f14283d;
        C6700b bVar3 = new C6700b(this.f14259c);
        for (C6640a next : bVar2.f14282c) {
            final File file = next.f14275a;
            try {
                bVar3.mo52181a(file);
                JSONObject a = m16373a(bVar3);
                if (a != null) {
                    if (a.length() != 0) {
                        if (a.length() != 0) {
                            if (!z) {
                                long optLong = a.optLong("crash_time");
                                try {
                                    if (bVar2.f14284e == null) {
                                        bVar2.f14284e = next;
                                        bVar2.f14285f = true;
                                        if (hVar2 != null) {
                                            if (!hVar2.mo52305a(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                                                bVar3.mo52190k();
                                            }
                                        }
                                        z2 = b;
                                    } else {
                                        if (!bVar2.f14285f) {
                                            z2 = b;
                                            try {
                                                if (optLong < bVar2.f14284e.f14276b) {
                                                    bVar2.f14284e = next;
                                                    if (hVar2 == null || hVar2.mo52305a(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                                                        if (!m16381a(file)) {
                                                            m16377a(file, bVar2);
                                                        }
                                                        bVar2.f14285f = true;
                                                    } else {
                                                        bVar3.mo52190k();
                                                        b = z2;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                                                C6675i.m16532a(file);
                                                b = z2;
                                            }
                                        } else {
                                            z2 = b;
                                        }
                                        C6594a.m16164a(a, "filters", "aid", String.valueOf(a.optJSONObject("header").opt("aid")));
                                        a.optJSONObject("header").put("aid", 2010);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = b;
                                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                                    C6675i.m16532a(file);
                                    b = z2;
                                }
                            } else {
                                z2 = b;
                                if (hVar2 != null && !hVar2.mo52305a(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                                    bVar3.mo52190k();
                                }
                            }
                            C6594a.m16164a(a, "filters", "start_uuid", bVar2.f14280a);
                            C6594a.m16164a(a, "filters", "crash_thread_name", a.optString("crash_thread_name", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN));
                            if (z2) {
                                C6642c.C6644a aVar = new C6642c.C6644a(a, CrashType.NATIVE);
                                C6595b.m16206a(a, C6595b.m16203a(aVar.mo52130c(), aVar.mo52128a(), C6766s.m17031a().mo52318b(aVar.mo52129b() == -1 ? System.currentTimeMillis() : aVar.mo52129b())), (C6595b.C6596a) new C6595b.C6596a() {
                                    /* renamed from: a */
                                    public void mo51989a(JSONObject jSONObject) {
                                        C6645d.m16403a().mo52134a(jSONObject, file, C6685o.m16586a(C6635b.this.f14259c, bVar2.f14280a));
                                    }
                                });
                                if (!bVar3.mo52190k()) {
                                    bVar3.mo52188h();
                                }
                            }
                            C6642c.m16398a(CrashType.NATIVE, a);
                        } else {
                            z2 = b;
                        }
                        b = z2;
                    }
                }
                z2 = b;
                bVar3.mo52190k();
            } catch (Throwable th3) {
                th = th3;
                z2 = b;
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                C6675i.m16532a(file);
                b = z2;
            }
            b = z2;
        }
    }

    /* renamed from: b */
    private void m16384b(HashMap<String, C6641b> hashMap, C6641b bVar) {
        File[] listFiles = C6685o.m16585a(this.f14259c).listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            for (File file : listFiles) {
                try {
                    if (!C6589a.m16122a().mo52027a(file.getAbsolutePath())) {
                        if (!C6675i.m16547g(file)) {
                            if (!C6608a.m16263a().mo52099b(file.getName())) {
                                if (!file.isFile()) {
                                    m16380a(hashMap, bVar, file, file.getName());
                                }
                            }
                        }
                    }
                    C6675i.m16532a(file);
                } catch (Throwable th) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: c */
    private void m16386c(HashMap<String, C6641b> hashMap, C6641b bVar) {
        C6675i.m16532a(C6685o.m16590b(this.f14259c));
    }

    /* renamed from: d */
    private void m16387d() {
        if (this.f14261f == null) {
            this.f14261f = new C6641b("old_uuid");
            HashMap<String, C6641b> hashMap = new HashMap<>();
            this.f14262g = hashMap;
            m16378a(hashMap);
            m16384b(this.f14262g, this.f14261f);
            m16386c(this.f14262g, this.f14261f);
            m16379a(this.f14262g, this.f14261f);
            m16382b(this.f14261f, true, (C6747h) null);
            m16375a(this.f14261f, true, (C6747h) null);
            this.f14261f = null;
            if (this.f14262g.isEmpty()) {
                m16389f();
            } else {
                m16390g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16388e() {
        if (!this.f14263h && this.f14262g != null) {
            if (!C6686p.m16623b(this.f14259c)) {
                m16389f();
            }
            boolean h = m16391h();
            C6747h hVar = new C6747h(this.f14259c);
            for (C6641b b : this.f14262g.values()) {
                m16382b(b, h, hVar);
            }
            for (C6641b a : this.f14262g.values()) {
                m16375a(a, h, hVar);
            }
            for (C6641b a2 : this.f14262g.values()) {
                m16374a(a2);
            }
            hVar.mo52304a();
            C6737b.m16911a();
            m16389f();
        }
    }

    /* renamed from: f */
    private void m16389f() {
        this.f14263h = true;
        this.f14262g = null;
        NativeImpl.m16727i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m16390g() {
        if (!this.f14263h) {
            if (!C6686p.m16623b(this.f14259c) || (System.currentTimeMillis() - C6617h.m16316j() <= 5000 && C6617h.m16315i().isApmExists() && !Npth.hasCrash())) {
                C6761p.m17019b().mo52328a(this.f14264i, 5000);
            } else {
                m16388e();
            }
        }
    }

    /* renamed from: h */
    private boolean m16391h() {
        if (this.f14260e == -1) {
            if (C6718a.m16798b() && C6718a.m16805g()) {
                this.f14260e = 1;
            } else {
                this.f14260e = 0;
            }
        }
        return this.f14260e == 1;
    }

    /* renamed from: i */
    private void m16392i() {
        File[] listFiles = C6685o.m16612i(this.f14259c).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                if (file.getName().endsWith(".atmp")) {
                    C6549a.m15999a().mo51977a(file.getAbsolutePath());
                } else {
                    try {
                        C6599e e = C6675i.m16544e(file.getAbsolutePath());
                        if (e != null) {
                            if (e.mo52073b() != null) {
                                e.mo52073b().put("upload_scene", "launch_scan");
                            }
                            if (C6647e.m16417a(C6647e.m16429d(), e.mo52079e(), e.mo52077d(), e.mo52081f(), e.mo52082g())) {
                                C6675i.m16532a(file);
                                C6675i.m16533a(e.mo52075c());
                            }
                        } else {
                            C6675i.m16532a(file);
                        }
                    } catch (Throwable th) {
                        C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo52122a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            m16387d();
            m16392i();
            C6583a.m16113a();
        }
    }

    /* renamed from: b */
    public void mo52123b() {
        try {
            if (this.f14263h) {
                return;
            }
            if (C6662a.m16479b(C6617h.m16313g())) {
                C6761p.m17019b().mo52327a(this.f14265j);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public boolean mo52124c() {
        return this.f14263h;
    }
}
