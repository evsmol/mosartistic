package com.appodeal.ads.segments;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.C9577u;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;

/* renamed from: com.appodeal.ads.segments.h */
public final class C9492h {

    /* renamed from: a */
    public static final TreeMap<String, C9490g> f24097a = new TreeMap<>();

    /* renamed from: b */
    public static final TreeMap f24098b = new TreeMap();

    /* renamed from: c */
    public static final C9562o f24099c = C9562o.f24251b;

    /* renamed from: d */
    public static final CopyOnWriteArrayList f24100d = new CopyOnWriteArrayList();

    /* renamed from: com.appodeal.ads.segments.h$a */
    public interface C9493a {
        /* renamed from: a */
        String mo60745a();

        /* renamed from: a */
        void mo60746a(C9490g gVar);

        /* renamed from: b */
        C9490g mo60747b();
    }

    /* renamed from: a */
    public static final C9490g m28084a(String str) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        TreeMap<String, C9490g> treeMap = f24097a;
        if (treeMap.containsKey(str)) {
            C9490g gVar = treeMap.get(str);
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TreeMap treeMap2 = f24098b;
        if (treeMap2.containsKey(str)) {
            Object obj = treeMap2.get(str);
            if (obj != null) {
                return (C9490g) obj;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!Intrinsics.areEqual((Object) str, (Object) RewardedVideo.VIDEO_MODE_DEFAULT)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("'%s' not found, using default placement", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            Log.log("Placement", LogConstants.EVENT_GET, format);
        }
        if (treeMap.containsKey(RewardedVideo.VIDEO_MODE_DEFAULT)) {
            C9490g gVar2 = treeMap.get(RewardedVideo.VIDEO_MODE_DEFAULT);
            if (gVar2 != null) {
                return gVar2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (treeMap2.containsKey(RewardedVideo.VIDEO_MODE_DEFAULT)) {
            Object obj2 = treeMap2.get(RewardedVideo.VIDEO_MODE_DEFAULT);
            if (obj2 != null) {
                return (C9490g) obj2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            C9490g gVar3 = C9490g.f24087h;
            Intrinsics.checkNotNullExpressionValue(gVar3, "DEFAULT");
            return gVar3;
        }
    }

    /* renamed from: a */
    public static void m28085a() {
        Map<String, String> e = f24099c.mo60822e();
        long currentTimeMillis = ((System.currentTimeMillis() / ((long) 1000)) / ((long) 60)) - ((long) 43200);
        for (Map.Entry next : e.entrySet()) {
            String str = (String) next.getKey();
            try {
                JSONArray jSONArray = new JSONArray((String) next.getValue());
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                int length = jSONArray.length();
                while (i < length) {
                    int i2 = i + 1;
                    long j = jSONArray.getLong(i);
                    if (j > currentTimeMillis) {
                        jSONArray2.put(j);
                    }
                    i = i2;
                }
                C9562o oVar = f24099c;
                String jSONArray3 = jSONArray2.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray3, "output.toString()");
                oVar.mo60818c(str, jSONArray3);
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    /* renamed from: a */
    public static final void m28086a(C9577u.C9580c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "callback");
        f24100d.add(cVar);
    }

    /* renamed from: a */
    public static void m28087a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                int i2 = i + 1;
                C9490g a = C9490g.m28074a(jSONArray.getJSONObject(i));
                if (a != null) {
                    TreeMap treeMap = f24098b;
                    C9490g gVar = (C9490g) treeMap.get(a.mo60740b());
                    a.mo60738a(gVar == null ? 0 : gVar.mo60737a());
                    String b = a.mo60740b();
                    Intrinsics.checkNotNullExpressionValue(b, "placement.name");
                    treeMap.put(b, a);
                }
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static boolean m28088a(C9490g gVar) {
        return gVar == null || Intrinsics.areEqual((Object) gVar, (Object) C9490g.f24087h);
    }

    /* renamed from: b */
    public static final C9490g m28089b() {
        return m28084a(RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    /* renamed from: c */
    public static boolean m28090c() {
        if (!f24098b.isEmpty()) {
            if (!(C9503n.m28137c().f24113a == -1)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final void m28091d() {
        Iterator it = f24100d.iterator();
        while (it.hasNext()) {
            C9493a aVar = (C9493a) it.next();
            String a = aVar.mo60745a();
            if (a != null && m28088a(aVar.mo60747b())) {
                aVar.mo60746a(m28084a(a));
            }
        }
    }
}
