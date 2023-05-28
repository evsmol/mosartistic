package com.ironsource.mediationsdk.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.p121b.C4385b;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.C4455H;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C4662p;
import com.ironsource.mediationsdk.sdk.C4675e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p117b.C4364a;
import com.ironsource.p117b.C4365b;
import com.ironsource.p117b.C4366c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.b */
public abstract class C4525b {

    /* renamed from: A */
    private int f11066A = 1024;

    /* renamed from: B */
    private int f11067B = 5;

    /* renamed from: C */
    private String f11068C = "supersonic_sdk.db";

    /* renamed from: D */
    private String f11069D = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: E */
    private String f11070E = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: F */
    private final String f11071F = "abt";

    /* renamed from: G */
    private final String f11072G = "mt";

    /* renamed from: H */
    private C4524a f11073H;

    /* renamed from: I */
    private int f11074I = 5000;

    /* renamed from: J */
    private int[] f11075J;

    /* renamed from: K */
    private Map<String, String> f11076K = new HashMap();

    /* renamed from: L */
    private C4662p f11077L;

    /* renamed from: M */
    private final Object f11078M = new Object();

    /* renamed from: a */
    public boolean f11079a;

    /* renamed from: b */
    boolean f11080b = false;

    /* renamed from: c */
    public boolean f11081c = false;

    /* renamed from: d */
    C4364a f11082d;

    /* renamed from: e */
    ArrayList<C4532c> f11083e;

    /* renamed from: f */
    public boolean f11084f = true;

    /* renamed from: g */
    int f11085g;

    /* renamed from: h */
    String f11086h;

    /* renamed from: i */
    Context f11087i;

    /* renamed from: j */
    int f11088j = 100;

    /* renamed from: k */
    int f11089k = 1;

    /* renamed from: l */
    int[] f11090l;

    /* renamed from: m */
    int[] f11091m;

    /* renamed from: n */
    int[] f11092n;

    /* renamed from: o */
    Map<String, String> f11093o = new HashMap();

    /* renamed from: p */
    public String f11094p = "";

    /* renamed from: q */
    int f11095q;

    /* renamed from: r */
    String f11096r;

    /* renamed from: s */
    String f11097s;

    /* renamed from: t */
    Set<Integer> f11098t;

    /* renamed from: u */
    C4531b f11099u;

    /* renamed from: v */
    public IronSourceSegment f11100v;

    /* renamed from: w */
    private int f11101w = 1;

    /* renamed from: x */
    private int f11102x = 100;

    /* renamed from: y */
    private int f11103y = 5000;

    /* renamed from: z */
    private int f11104z = Constants.VIDEO_MAX_DURATION;

    /* renamed from: com.ironsource.mediationsdk.a.b$a */
    public enum C4530a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f */
        int f11118f;

        private C4530a(int i) {
            this.f11118f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b */
    class C4531b extends HandlerThread {

        /* renamed from: a */
        Handler f11119a;

        C4531b(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo33667a(Runnable runnable) {
            this.f11119a.post(runnable);
        }
    }

    /* renamed from: a */
    private ArrayList<C4532c> m13127a(ArrayList<C4532c> arrayList, ArrayList<C4532c> arrayList2, int i) {
        ArrayList<C4532c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<C4532c>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C4532c) obj).mo33671b() >= ((C4532c) obj2).mo33671b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.f11082d.mo33146a(arrayList4.subList(i, arrayList4.size()), this.f11097s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    /* renamed from: a */
    static /* synthetic */ void m13129a(C4525b bVar, C4532c cVar, String str) {
        JSONObject d = cVar.mo33673d();
        if (d != null && d.has(str)) {
            try {
                String optString = d.optString(str, (String) null);
                if (optString != null) {
                    cVar.mo33670a(str, (Object) optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m13130a(String str) {
        C4524a aVar = this.f11073H;
        if (aVar == null || !aVar.mo33635c().equals(str)) {
            this.f11073H = C4532c.m13166a(str, this.f11095q);
        }
    }

    /* renamed from: a */
    public static void m13131a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    /* renamed from: a */
    static boolean m13133a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* renamed from: e */
    protected static int m13134e(int i) {
        C4530a aVar;
        int i2 = C4530a.NOT_SUPPORTED.f11118f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = C4530a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = C4530a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = C4530a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = C4530a.BANNER;
        }
        return aVar.f11118f;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m13135e() {
        ArrayList<C4532c> a;
        this.f11080b = false;
        synchronized (this.f11078M) {
            a = m13127a(this.f11083e, this.f11082d.mo33145a(this.f11097s), this.f11074I);
            if (a.size() > 0) {
                this.f11083e.clear();
                this.f11082d.mo33147b(this.f11097s);
            }
        }
        if (a.size() > 0) {
            this.f11085g = 0;
            JSONObject b = C4675e.m13718a().mo34130b();
            try {
                if (this.f11100v != null) {
                    if (this.f11100v.getAge() > 0) {
                        b.put(IronSourceSegment.AGE, this.f11100v.getAge());
                    }
                    if (!TextUtils.isEmpty(this.f11100v.getGender())) {
                        b.put(IronSourceSegment.GENDER, this.f11100v.getGender());
                    }
                    if (this.f11100v.getLevel() > 0) {
                        b.put(IronSourceSegment.LEVEL, this.f11100v.getLevel());
                    }
                    if (this.f11100v.getIsPaying() != null) {
                        b.put(IronSourceSegment.PAYING, this.f11100v.getIsPaying().get());
                    }
                    if (this.f11100v.getIapt() > 0.0d) {
                        b.put(IronSourceSegment.IAPT, this.f11100v.getIapt());
                    }
                    if (this.f11100v.getUcd() > 0) {
                        b.put(IronSourceSegment.USER_CREATION_DATE, this.f11100v.getUcd());
                    }
                }
                if (this.f11077L != null) {
                    String str = this.f11077L.f11670b;
                    if (!TextUtils.isEmpty(str)) {
                        b.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.f11077L.f11671c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                try {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f11094p;
            if (!TextUtils.isEmpty(str2)) {
                b.put("abt", str2);
            }
            String str3 = C4455H.m12683a().f10657o;
            if (!TextUtils.isEmpty(str3)) {
                b.put("mt", str3);
            }
            Map<String, String> map = this.f11076K;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b.has((String) next2.getKey())) {
                        b.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            C4385b bVar = new C4385b();
            JSONObject a2 = bVar.f10461b.mo33970a(bVar.f10460a);
            Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
            Iterator<String> keys2 = a2.keys();
            while (keys2.hasNext()) {
                String next3 = keys2.next();
                b.put(next3, a2.get(next3));
            }
            String a3 = this.f11073H.mo33632a(a, b);
            if (TextUtils.isEmpty(a3)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                mo33642a(a);
                return;
            }
            if (this.f11081c) {
                try {
                    a3 = Base64.encodeToString(C4377a.C43781.m12461b(a3), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            C4401c.f10496a.mo33211c(new C4365b(new C4366c() {
                /* renamed from: a */
                public final synchronized void mo33151a(final ArrayList<C4532c> arrayList, final boolean z) {
                    C4525b.this.f11099u.mo33667a(new Runnable() {
                        public final void run() {
                            if (z) {
                                ArrayList<C4532c> a = C4525b.this.f11082d.mo33145a(C4525b.this.f11097s);
                                C4525b.this.f11085g = a.size() + C4525b.this.f11083e.size();
                                return;
                            }
                            IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                            C4525b.this.mo33642a((ArrayList<C4532c>) arrayList);
                        }
                    });
                }
            }, a3, this.f11073H.mo33631a(), a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo33636a(C4532c cVar) {
        return cVar.mo33668a() + Constants.VIDEO_MAX_DURATION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33637a() {
        this.f11083e = new ArrayList<>();
        this.f11085g = 0;
        this.f11073H = C4532c.m13166a(this.f11096r, this.f11095q);
        C4531b bVar = new C4531b(this.f11097s + "EventThread");
        this.f11099u = bVar;
        bVar.start();
        C4531b bVar2 = this.f11099u;
        bVar2.f11119a = new Handler(bVar2.getLooper());
        this.f11086h = IronSourceUtils.getSessionId();
        this.f11098t = new HashSet();
        mo33647b();
    }

    /* renamed from: a */
    public final void mo33638a(int i) {
        if (i > 0) {
            this.f11089k = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo33639a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f11097s, this.f11096r);
        this.f11096r = defaultEventsFormatterType;
        m13130a(defaultEventsFormatterType);
        this.f11073H.f11060c = IronSourceUtils.getDefaultEventsURL(context, this.f11097s, (String) null);
        this.f11082d = C4364a.m12408a(context, "supersonic_sdk.db", 5);
        mo33653c();
        this.f11090l = IronSourceUtils.getDefaultOptOutEvents(context, this.f11097s);
        this.f11091m = IronSourceUtils.getDefaultOptInEvents(context, this.f11097s);
        this.f11092n = IronSourceUtils.getDefaultTriggerEvents(context, this.f11097s);
        this.f11075J = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f11097s);
        this.f11100v = ironSourceSegment;
        this.f11087i = context;
    }

    /* renamed from: a */
    public final synchronized void mo33640a(C4662p pVar) {
        this.f11077L = pVar;
    }

    /* renamed from: a */
    public final void mo33641a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C4524a aVar = this.f11073H;
            if (aVar != null) {
                aVar.f11060c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f11097s, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33642a(ArrayList<C4532c> arrayList) {
        if (arrayList != null) {
            synchronized (this.f11078M) {
                this.f11082d.mo33146a(arrayList, this.f11097s);
                this.f11085g = this.f11082d.mo33145a(this.f11097s).size() + this.f11083e.size();
            }
        }
    }

    /* renamed from: a */
    public final void mo33643a(Map<String, String> map) {
        this.f11076K.putAll(map);
    }

    /* renamed from: a */
    public final void mo33644a(int[] iArr, Context context) {
        this.f11090l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f11097s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo33645a(int i, int[] iArr) {
        if (!m13133a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return m13133a(r1.f11075J) ? mo33645a(r3.mo33668a(), r1.f11075J) : r1.f11098t.contains(java.lang.Integer.valueOf(r3.mo33668a()));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo33646a(java.lang.String r2, com.ironsource.mediationsdk.p126a.C4532c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.f11075J     // Catch:{ all -> 0x002f }
            boolean r2 = m13133a((int[]) r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.mo33668a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.f11075J     // Catch:{ all -> 0x002f }
            boolean r2 = r1.mo33645a((int) r2, (int[]) r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.f11098t     // Catch:{ all -> 0x002f }
            int r3 = r3.mo33668a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p126a.C4525b.mo33646a(java.lang.String, com.ironsource.mediationsdk.a.c):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33647b() {
    }

    /* renamed from: b */
    public final void mo33648b(int i) {
        if (i > 0) {
            this.f11088j = i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo33649b(final C4532c cVar) {
        this.f11099u.mo33667a(new Runnable() {
            public final void run() {
                if (cVar != null && C4525b.this.f11084f) {
                    cVar.mo33670a("eventSessionId", (Object) C4525b.this.f11086h);
                    String connectionType = IronSourceUtils.getConnectionType(C4525b.this.f11087i);
                    if (C4525b.this.mo33663g(cVar)) {
                        cVar.mo33670a("connectionType", (Object) connectionType);
                    }
                    if (C4525b.this.mo33646a(connectionType, cVar)) {
                        C4532c cVar = cVar;
                        cVar.mo33669a(C4525b.this.mo33636a(cVar));
                    }
                    int e = C4525b.m13134e(cVar.mo33668a());
                    if (e != C4530a.NOT_SUPPORTED.f11118f) {
                        cVar.mo33670a("adUnit", (Object) Integer.valueOf(e));
                    }
                    C4525b.m13129a(C4525b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                    C4525b.m13129a(C4525b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                    if (!C4525b.this.f11093o.isEmpty()) {
                        for (Map.Entry next : C4525b.this.f11093o.entrySet()) {
                            if (!(cVar.mo33673d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                cVar.mo33670a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    C4525b bVar = C4525b.this;
                    C4532c cVar2 = cVar;
                    boolean z = false;
                    if (cVar2 != null ? C4525b.m13133a(bVar.f11090l) ? !bVar.mo33645a(cVar2.mo33668a(), bVar.f11090l) : C4525b.m13133a(bVar.f11091m) ? bVar.mo33645a(cVar2.mo33668a(), bVar.f11091m) : true : false) {
                        if (C4525b.this.mo33662f(cVar)) {
                            JSONObject d = cVar.mo33673d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                cVar.mo33670a(IronSourceConstants.KEY_SESSION_DEPTH, (Object) Integer.valueOf(C4525b.this.mo33661e(cVar)));
                            }
                        }
                        if (!TextUtils.isEmpty(C4525b.this.mo33657d(cVar.mo33668a())) && C4525b.this.mo33656c(cVar)) {
                            C4532c cVar3 = cVar;
                            cVar3.mo33670a(IronSourceConstants.EVENTS_PLACEMENT_NAME, (Object) C4525b.this.mo33657d(cVar3.mo33668a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(C4525b.this.f11087i);
                        if (firstSessionTimestamp != -1) {
                            cVar.mo33670a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, (Object) Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + cVar.mo33668a() + ",\"timestamp\":" + cVar.mo33671b() + "," + cVar.mo33672c().substring(1)).replace(",", "\n"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C4525b.this.f11083e.add(cVar);
                        C4525b.this.f11085g++;
                    }
                    boolean a = C4525b.m13133a(C4525b.this.f11092n) ? C4525b.this.mo33645a(cVar.mo33668a(), C4525b.this.f11092n) : C4525b.this.mo33660d(cVar);
                    if (!C4525b.this.f11080b && a) {
                        C4525b.this.f11080b = true;
                    }
                    if (C4525b.this.f11082d != null) {
                        C4525b bVar2 = C4525b.this;
                        if ((bVar2.f11085g >= bVar2.f11088j || bVar2.f11080b) && bVar2.f11079a) {
                            C4525b.this.m13135e();
                            return;
                        }
                        C4525b bVar3 = C4525b.this;
                        ArrayList<C4532c> arrayList = bVar3.f11083e;
                        if (arrayList != null && arrayList.size() >= bVar3.f11089k) {
                            z = true;
                        }
                        if (z || a) {
                            C4525b.this.mo33653c();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo33650b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f11096r = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f11097s, str);
            m13130a(str);
        }
    }

    /* renamed from: b */
    public final void mo33651b(Map<String, String> map) {
        this.f11093o.putAll(map);
    }

    /* renamed from: b */
    public final void mo33652b(int[] iArr, Context context) {
        this.f11091m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f11097s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33653c() {
        synchronized (this.f11078M) {
            this.f11082d.mo33146a(this.f11083e, this.f11097s);
            this.f11083e.clear();
        }
    }

    /* renamed from: c */
    public final void mo33654c(int i) {
        if (i > 0) {
            this.f11074I = i;
        }
    }

    /* renamed from: c */
    public final void mo33655c(int[] iArr, Context context) {
        this.f11092n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f11097s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo33656c(C4532c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo33657d(int i);

    /* renamed from: d */
    public final void mo33658d() {
        m13135e();
    }

    /* renamed from: d */
    public final void mo33659d(int[] iArr, Context context) {
        this.f11075J = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f11097s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo33660d(C4532c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo33661e(C4532c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo33662f(C4532c cVar) {
        return (cVar.mo33668a() == 14 || cVar.mo33668a() == 114 || cVar.mo33668a() == 514 || cVar.mo33668a() == 140 || cVar.mo33668a() == 40 || cVar.mo33668a() == 41 || cVar.mo33668a() == 50 || cVar.mo33668a() == 51 || cVar.mo33668a() == 52) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo33663g(C4532c cVar) {
        return (cVar.mo33668a() == 40 || cVar.mo33668a() == 41 || cVar.mo33668a() == 50 || cVar.mo33668a() == 51 || cVar.mo33668a() == 52) ? false : true;
    }
}
