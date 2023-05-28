package com.appodeal.ads.segments;

import android.content.Context;
import android.os.Build;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.appodeal.ads.C9182f1;
import com.appodeal.ads.C9269l5;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import com.ironsource.mediationsdk.IronSourceSegment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.segments.j */
public final class C9495j {

    /* renamed from: c */
    public static C9495j f24105c;

    /* renamed from: d */
    public static final HashMap f24106d = new HashMap();

    /* renamed from: e */
    public static final ArrayList f24107e = new ArrayList();

    /* renamed from: f */
    public static final C9562o f24108f;

    /* renamed from: g */
    public static HashMap f24109g;

    /* renamed from: a */
    public float f24110a = 0.0f;

    /* renamed from: b */
    public boolean f24111b = false;

    /* renamed from: com.appodeal.ads.segments.j$a */
    public interface C9496a {
        /* renamed from: a */
        void mo60736a();
    }

    /* renamed from: com.appodeal.ads.segments.j$b */
    public interface C9497b {
        /* renamed from: a */
        Object mo60734a(Context context, C9495j jVar);
    }

    /* renamed from: com.appodeal.ads.segments.j$c */
    public static class C9498c implements C9497b {

        /* renamed from: a */
        public Calendar f24112a = Calendar.getInstance();

        /* renamed from: a */
        public final Object mo60734a(Context context, C9495j jVar) {
            return Integer.valueOf(((this.f24112a.get(7) - 1) * 24) + this.f24112a.get(11));
        }
    }

    static {
        C9562o oVar = C9562o.f24251b;
        f24108f = oVar;
        HashMap hashMap = new HashMap();
        f24109g = hashMap;
        hashMap.put("country", $$Lambda$teFxmm5ut6Dn0bw1FrcFLrQTYRI.INSTANCE);
        f24109g.put("app_version", $$Lambda$dRr28XEkxkJkv9iXNa37EyMZfPQ.INSTANCE);
        f24109g.put("app", $$Lambda$HdOrq7HMacDjr1Y_6MuvGdJk9k0.INSTANCE);
        f24109g.put("sdk_version", $$Lambda$gxsfEQbQmT3M_A4nJZoy2NMhg8k.INSTANCE);
        f24109g.put("os_version", $$Lambda$AVe3uvdXbPDvbhyYij3tgUJVsuE.INSTANCE);
        f24109g.put("session_count", $$Lambda$adfkLLoYsv7ZJV09SwTCEUeVsk.INSTANCE);
        f24109g.put("average_session_length", $$Lambda$o279xjjeodbB0fLgP9hcOUWSvc.INSTANCE);
        f24109g.put("connection_type", $$Lambda$2o9Oib_2NLLej5I1itr6taKEjo.INSTANCE);
        f24109g.put("gender", $$Lambda$wXlI76OLFsy1A7c5OgvPxMZLfQY.INSTANCE);
        f24109g.put(IronSourceSegment.AGE, $$Lambda$xQu9gfG1ADwTk0oNeR7v9JVcmIs.INSTANCE);
        f24109g.put("bought_inapps", $$Lambda$zaJGU6z9MLV2vfN3nfoSbaoNYTk.INSTANCE);
        f24109g.put("inapp_amount", $$Lambda$SviSZYT60Lei299EAQ7uo12eg.INSTANCE);
        f24109g.put("device_type", $$Lambda$ZTGzNcQvBsWskrBXU6XAIf2uVfE.INSTANCE);
        f24109g.put("session_time", new C9498c());
        f24109g.put("part_of_audience", new C9489f(oVar));
    }

    /* renamed from: a */
    public static HashMap m28099a() {
        return f24106d;
    }

    /* renamed from: a */
    public static void m28100a(C9496a aVar) {
        f24107e.add(aVar);
    }

    /* renamed from: a */
    public static boolean m28102a(Context context, int i, C9494i[] iVarArr) {
        if (context == null || i == 0 || iVarArr == null) {
            return true;
        }
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                for (C9494i a : iVarArr) {
                    if (!a.mo60749a(context)) {
                        return false;
                    }
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (iVarArr.length == 0) {
                    return true;
                }
                for (C9494i a2 : iVarArr) {
                    if (a2.mo60749a(context)) {
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public static C9494i[] m28103a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("restrictions");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        C9494i[] iVarArr = new C9494i[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                iVarArr[i] = new C9494i(optJSONArray.optJSONObject(i));
            } catch (JSONException e) {
                Log.log(e);
            }
        }
        return iVarArr;
    }

    /* renamed from: b */
    public static C9495j m28104b() {
        if (f24105c == null) {
            f24105c = new C9495j();
        }
        return f24105c;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m28105b(Context context, C9495j jVar) {
        return new Version(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
    }

    /* renamed from: c */
    public static Object m28106c(Context context, C9495j jVar) {
        return Boolean.valueOf(jVar.f24111b);
    }

    /* renamed from: d */
    public static Object m28107d(Context context, C9495j jVar) {
        return Float.valueOf(jVar.f24110a);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m28108e(Context context, C9495j jVar) {
        return C9182f1.m27298r(context) ? "tablet" : "phone";
    }

    /* renamed from: f */
    public static Object m28109f(Context context, C9495j jVar) {
        return f24108f.f24252a.mo60775c();
    }

    /* renamed from: g */
    public static /* synthetic */ Object m28110g(Context context, C9495j jVar) {
        return new Version(Constants.SDK_VERSION);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m28111h(Context context, C9495j jVar) {
        return new Version(Build.VERSION.RELEASE);
    }

    /* renamed from: k */
    public static /* synthetic */ Object m28114k(Context context, C9495j jVar) {
        String type = C9182f1.m27272c(context).getType();
        return type != null ? type.equals("mobile") ? "mobile" : type.equals("wifi") ? "wifi" : "other" : "other";
    }

    /* renamed from: l */
    public static /* synthetic */ Object m28115l(Context context, C9495j jVar) {
        UserSettings.Gender gender = C9326n5.m27550c().getGender();
        return gender == UserSettings.Gender.FEMALE ? AdColonyUserMetadata.USER_FEMALE : gender == UserSettings.Gender.MALE ? AdColonyUserMetadata.USER_MALE : "other";
    }

    /* renamed from: m */
    public static Object m28116m(Context context, C9495j jVar) {
        return C9269l5.m27453a().f23317c;
    }

    /* renamed from: b */
    public final boolean mo60750b(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject == null || !jSONObject.has("inapp_amount")) {
            return false;
        }
        float optDouble = (float) jSONObject.optDouble("inapp_amount", 0.0d);
        this.f24110a = optDouble;
        if (optDouble > 0.0f) {
            z = true;
        }
        this.f24111b = z;
        return true;
    }

    /* renamed from: a */
    public static Object m28098a(Context context, C9495j jVar) {
        return C9269l5.m27453a().f23320f;
    }

    /* renamed from: a */
    public static void m28101a(String str, Object obj) {
        f24106d.put(str, obj);
        Iterator it = f24107e.iterator();
        while (it.hasNext()) {
            ((C9496a) it.next()).mo60736a();
        }
    }
}
