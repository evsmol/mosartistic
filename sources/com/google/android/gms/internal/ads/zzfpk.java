package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpk {
    private final zzeoj zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfiy zzf;
    private final zzfiz zzg;
    private final Clock zzh;
    private final zzapj zzi;

    public zzfpk(zzeoj zzeoj, zzchu zzchu, String str, String str2, Context context, zzfiy zzfiy, zzfiz zzfiz, Clock clock, zzapj zzapj) {
        this.zza = zzeoj;
        this.zzb = zzchu.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfiy;
        this.zzg = zzfiz;
        this.zzh = clock;
        this.zzi = zzapj;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzh((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzchn.zzl() ? "fakeForAdDebugLog" : str;
    }

    private static String zzh(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfix zzfix, zzfil zzfil, List list) {
        return zzd(zzfix, zzfil, false, "", "", list);
    }

    public final List zzd(zzfix zzfix, zzfil zzfil, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? BuildConfig.ADAPTER_VERSION : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String zzh2 = zzh(zzh(zzh((String) it.next(), "@gw_adlocid@", zzfix.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfil != null) {
                zzh2 = zzcfv.zzc(zzh(zzh(zzh(zzh2, "@gw_qdata@", zzfil.zzz), "@gw_adnetid@", zzfil.zzy), "@gw_allocid@", zzfil.zzx), this.zze, zzfil.zzX);
            }
            String zzh3 = zzh(zzh(zzh(zzh2, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcZ)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zzh3);
                }
            }
            if (this.zzi.zzf(Uri.parse(zzh3))) {
                Uri.Builder buildUpon = Uri.parse(zzh3).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzh3 = buildUpon.build().toString();
            }
            arrayList.add(zzh3);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfil r10, java.util.List r11, com.google.android.gms.internal.ads.zzccr r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch:{ RemoteException -> 0x00a8 }
            int r12 = r12.zzb()     // Catch:{ RemoteException -> 0x00a8 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ RemoteException -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzda
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzfiz r4 = r9.zzg
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzfya r4 = com.google.android.gms.internal.ads.zzfya.zzc()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.zzfiy r4 = r4.zza
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.zzfiy r4 = r9.zzf
        L_0x0037:
            com.google.android.gms.internal.ads.zzfya r4 = com.google.android.gms.internal.ads.zzfya.zzd(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.zzfpi r5 = com.google.android.gms.internal.ads.zzfpi.zza
            com.google.android.gms.internal.ads.zzfya r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfpj r7 = com.google.android.gms.internal.ads.zzfpj.zza
            com.google.android.gms.internal.ads.zzfya r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L_0x0059:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzh(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzh(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzh(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzh(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzh(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzh(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzX
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcfv.zzc(r6, r7, r8)
            r0.add(r6)
            goto L_0x0059
        L_0x00a7:
            return r0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.zze.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpk.zze(com.google.android.gms.internal.ads.zzfil, java.util.List, com.google.android.gms.internal.ads.zzccr):java.util.List");
    }
}
