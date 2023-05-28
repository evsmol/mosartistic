package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.appodeal.ads.C9163d1;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.utils.ActivityRule;
import com.appodeal.ads.utils.C9609c;
import com.appodeal.ads.utils.C9614c0;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.app.C9605a;
import com.appodeal.ads.utils.app.C9606b;
import com.appodeal.ads.utils.exception_handler.C9623a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.appodeal.ads.i */
public final class C9213i {

    /* renamed from: g */
    public static EnumMap<AdType, C9213i> f23154g = new EnumMap<>(AdType.class);

    /* renamed from: h */
    public static final ArrayList f23155h = new ArrayList();

    /* renamed from: i */
    public static final ArrayList f23156i = new ArrayList();

    /* renamed from: j */
    public static final ConcurrentHashMap f23157j = new ConcurrentHashMap();

    /* renamed from: k */
    public static final AtomicBoolean f23158k = new AtomicBoolean(false);

    /* renamed from: l */
    public static final /* synthetic */ boolean f23159l = (!C9213i.class.desiredAssertionStatus());

    /* renamed from: a */
    public final ConcurrentHashMap f23160a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentHashMap f23161b = new ConcurrentHashMap();

    /* renamed from: c */
    public final CopyOnWriteArraySet f23162c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public final ConcurrentHashMap f23163d = new ConcurrentHashMap();

    /* renamed from: e */
    public final AtomicBoolean f23164e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f23165f = new AtomicBoolean(false);

    /* renamed from: com.appodeal.ads.i$b */
    public class C9215b {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f23166a;

        public C9215b(CountDownLatch countDownLatch) {
            this.f23166a = countDownLatch;
        }
    }

    /* renamed from: com.appodeal.ads.i$c */
    public static final class C9216c {

        /* renamed from: a */
        public final String f23167a;

        /* renamed from: b */
        public final String f23168b;

        /* renamed from: c */
        public final String f23169c;

        /* renamed from: d */
        public final JSONArray f23170d;

        public C9216c(String str, String str2, String str3, JSONArray jSONArray) {
            this.f23167a = str;
            this.f23168b = str2;
            this.f23169c = str3;
            this.f23170d = jSONArray;
        }
    }

    static {
        C9606b.All.mo61051a((C9605a) new C9214a());
    }

    /* renamed from: a */
    public static C9213i m27351a(AdType adType) {
        C9213i iVar = f23154g.get(adType);
        if (iVar == null) {
            synchronized (C9213i.class) {
                iVar = f23154g.get(adType);
                if (iVar == null) {
                    iVar = new C9213i();
                    f23154g.put(adType, iVar);
                }
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public static String m27352a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
            try {
                break;
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        inputStream.close();
        return sb.toString();
    }

    /* renamed from: a */
    public static void m27353a(AdNetwork adNetwork) {
        String version = adNetwork.getVersion();
        String recommendedVersion = adNetwork.getRecommendedVersion();
        if (!TextUtils.isEmpty(recommendedVersion) && !TextUtils.equals(version, recommendedVersion)) {
            String a = C9326n5.m27531a(adNetwork.getName());
            Log.e("Appodeal", String.format("%s [%s]: Your '%s' SDK version (%s) doesn't match recommended. Please use '%s' SDK version %s instead to be sure that everything will work correctly.", new Object[]{LogConstants.KEY_NETWORK, LogConstants.EVENT_ERROR, a, version, a, recommendedVersion}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList m27354c(android.content.Context r9) {
        /*
            java.lang.Class<com.appodeal.ads.i> r0 = com.appodeal.ads.C9213i.class
            monitor-enter(r0)
            java.util.ArrayList r1 = f23155h     // Catch:{ all -> 0x00a0 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return r1
        L_0x000d:
            android.content.res.AssetManager r2 = r9.getAssets()     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = "apd_adapters"
            java.lang.String[] r2 = r2.list(r3)     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0095
            int r3 = r2.length     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0095
        L_0x001e:
            int r1 = r2.length     // Catch:{ all -> 0x00a0 }
            r3 = 0
        L_0x0020:
            if (r3 >= r1) goto L_0x0091
            r4 = r2[r3]     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = ".apdnetwork"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x008e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x008a }
            android.content.res.AssetManager r6 = r9.getAssets()     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r7.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r8 = "apd_adapters/"
            r7.append(r8)     // Catch:{ all -> 0x008a }
            r7.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x008a }
            java.io.InputStream r4 = r6.open(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = m27352a((java.io.InputStream) r4)     // Catch:{ all -> 0x008a }
            r5.<init>(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "name"
            java.lang.String r4 = r5.optString(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "builder"
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "adapter_version"
            java.lang.String r7 = r5.optString(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r8 = "types"
            org.json.JSONArray r5 = r5.optJSONArray(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x0081
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            int r8 = r5.length()     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x007b
            goto L_0x0081
        L_0x007b:
            com.appodeal.ads.i$c r8 = new com.appodeal.ads.i$c     // Catch:{ all -> 0x008a }
            r8.<init>(r4, r6, r7, r5)     // Catch:{ all -> 0x008a }
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x008e
            java.util.ArrayList r4 = f23155h     // Catch:{ all -> 0x008a }
            r4.add(r8)     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r4 = move-exception
            com.appodeal.ads.utils.Log.log(r4)     // Catch:{ all -> 0x00a0 }
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0091:
            java.util.ArrayList r9 = f23155h     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)
            return r9
        L_0x0095:
            java.lang.String r9 = "SDK"
            java.lang.String r2 = "Initialize"
            java.lang.String r3 = "No adapters found in app assets"
            com.appodeal.ads.utils.Log.log((java.lang.String) r9, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)
            return r1
        L_0x00a0:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9213i.m27354c(android.content.Context):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m27355d(android.content.Context r7) {
        /*
            java.lang.Class<com.appodeal.ads.i> r0 = com.appodeal.ads.C9213i.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = f23158k     // Catch:{ all -> 0x009e }
            boolean r2 = r1.get()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            r2 = 1
            r1.set(r2)     // Catch:{ all -> 0x009e }
            java.util.ArrayList r7 = m27354c(r7)     // Catch:{ all -> 0x0098 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0019:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0098 }
            com.appodeal.ads.i$c r1 = (com.appodeal.ads.C9213i.C9216c) r1     // Catch:{ all -> 0x0098 }
            r2 = 0
        L_0x0026:
            org.json.JSONArray r3 = r1.f23170d     // Catch:{ all -> 0x0098 }
            int r3 = r3.length()     // Catch:{ all -> 0x0098 }
            if (r2 >= r3) goto L_0x0019
            org.json.JSONArray r3 = r1.f23170d     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r3.optString(r2)     // Catch:{ all -> 0x0098 }
            r4 = 0
            java.lang.String r5 = "banner"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0045
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Banner     // Catch:{ all -> 0x0098 }
        L_0x0043:
            r4 = r3
            goto L_0x007c
        L_0x0045:
            java.lang.String r5 = "mrec"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0050
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Mrec     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0050:
            java.lang.String r5 = "rewarded_video"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x005b
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x005b:
            java.lang.String r5 = "interstitial"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0066
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Interstitial     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0066:
            java.lang.String r5 = "video"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0071
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0071:
            java.lang.String r5 = "native"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x007c
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Native     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x007c:
            if (r4 == 0) goto L_0x0095
            com.appodeal.ads.i r3 = m27351a((com.appodeal.ads.modules.common.internal.adtype.AdType) r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r1.f23167a     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r1.f23168b     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = r1.f23169c     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ConcurrentHashMap r3 = r3.f23160a     // Catch:{ all -> 0x0098 }
            android.util.Pair r5 = android.util.Pair.create(r5, r6)     // Catch:{ all -> 0x0098 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0098 }
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0098:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r0)
            return
        L_0x009e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9213i.m27355d(android.content.Context):void");
    }

    /* renamed from: a */
    public final Set<String> mo59975a() {
        Set<String> keySet = this.f23160a.keySet();
        keySet.removeAll(this.f23162c);
        return keySet;
    }

    /* renamed from: a */
    public final synchronized void mo59976a(Context context) {
        synchronized (this.f23164e) {
            if (!this.f23164e.get()) {
                this.f23164e.set(true);
                new C9226j(this, context).start();
            }
        }
    }

    /* renamed from: a */
    public final void mo59977a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (f23159l || str != null) {
                this.f23162c.add(str);
                this.f23161b.remove(str);
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void mo59978a(String str, AdNetworkBuilder adNetworkBuilder, C9215b bVar) {
        if (this.f23162c.contains(str)) {
            if (adNetworkBuilder != null) {
                this.f23163d.put(str, adNetworkBuilder);
            }
            mo59977a(str);
            bVar.f23166a.countDown();
            return;
        }
        AdNetwork build = adNetworkBuilder.build();
        if (build != null) {
            this.f23161b.put(str, build);
            ArrayList arrayList = f23156i;
            synchronized (arrayList) {
                if (!arrayList.contains(str)) {
                    com.appodeal.ads.utils.Log.log(LogConstants.KEY_NETWORK, LogConstants.EVENT_INFO, String.format("%s - ver. %s", new Object[]{C9326n5.m27531a(build.getName()), build.getVersion()}), Log.LogLevel.verbose);
                    m27353a(build);
                    C9609c.f24357a.addAll(ActivityRule.f24334b.getActivityClassNameArray(build.getAdActivityRules()));
                    arrayList.add(str);
                    UnifiedAppStateChangeListener appStateChangeListener = build.getAppStateChangeListener();
                    if (appStateChangeListener != null) {
                        f23157j.put(str, appStateChangeListener);
                    }
                }
            }
            bVar.f23166a.countDown();
            return;
        }
        this.f23163d.put(str, adNetworkBuilder);
        mo59977a(str);
        bVar.f23166a.countDown();
    }

    /* renamed from: b */
    public final AdNetwork mo59980b(String str) {
        return (AdNetwork) this.f23161b.get(str);
    }

    /* renamed from: b */
    public final synchronized C9213i mo59981b(Context context) {
        synchronized (this.f23165f) {
            if (this.f23165f.get()) {
                return this;
            }
            m27355d(context);
            CountDownLatch countDownLatch = new CountDownLatch(this.f23160a.size());
            C9215b bVar = new C9215b(countDownLatch);
            for (Map.Entry entry : this.f23160a.entrySet()) {
                mo59979a((String) entry.getKey(), (String) ((Pair) entry.getValue()).first, bVar);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mo59978a(Constants.DEBUG_INTERSTITIAL, (AdNetworkBuilder) new C9163d1.C9167c(), bVar);
            this.f23165f.set(true);
            return this;
        }
    }

    /* renamed from: b */
    public final Collection<AdNetwork> mo59982b() {
        return this.f23161b.values();
    }

    /* renamed from: com.appodeal.ads.i$a */
    public class C9214a extends C9614c0 {
        /* renamed from: a */
        public final void mo59984a(Configuration configuration) {
            for (UnifiedAppStateChangeListener onAppStateChanged : C9213i.f23157j.values()) {
                Activity activity = C9148b.f22956b.f22957a.getActivity();
                onAppStateChanged.onAppStateChanged(activity, AppState.ConfChanged, C9609c.m28357a(activity));
            }
        }

        /* renamed from: a */
        public final void mo59983a(Activity activity, AppState appState) {
            for (UnifiedAppStateChangeListener onAppStateChanged : C9213i.f23157j.values()) {
                onAppStateChanged.onAppStateChanged(activity, appState, C9609c.m28357a(activity));
            }
        }
    }

    /* renamed from: a */
    public final void mo59979a(String str, String str2, C9215b bVar) {
        boolean z;
        if (this.f23162c.contains(str)) {
            mo59977a(str);
            bVar.f23166a.countDown();
            return;
        }
        try {
            String[] strArr = {str2};
            int i = 0;
            while (i < 1) {
                try {
                    Class.forName(strArr[i], false, C9409q4.class.getClassLoader());
                    i++;
                } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    z = false;
                }
            }
            z = true;
            if (!z) {
                mo59977a(str);
                bVar.f23166a.countDown();
                com.appodeal.ads.utils.Log.log(new C9623a(String.format("Failed to load classes for network: %s", new Object[]{C9326n5.m27531a(str.split("\\.")[0])})));
                return;
            }
            mo59978a(str, (AdNetworkBuilder) Class.forName(str2).newInstance(), bVar);
        } catch (Exception e) {
            com.appodeal.ads.utils.Log.log(e);
            mo59977a(str);
            bVar.f23166a.countDown();
        }
    }
}
