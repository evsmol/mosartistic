package com.appodeal.ads.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.C9212h5;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.C9646q;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.utils.q */
public final class C9646q {

    /* renamed from: b */
    public static final /* synthetic */ boolean f24440b = (!C9646q.class.desiredAssertionStatus());

    /* renamed from: a */
    public String f24441a;

    /* renamed from: com.appodeal.ads.utils.q$a */
    public class C9647a implements UnifiedAdCallbackClickTrackListener {

        /* renamed from: a */
        public final /* synthetic */ C9648b f24442a;

        /* renamed from: b */
        public final /* synthetic */ Context f24443b;

        public C9647a(C9648b bVar, Context context) {
            this.f24442a = bVar;
            this.f24443b = context;
        }

        public final void onTrackError() {
            this.f24442a.onHandleError();
        }

        public final void onTrackSuccess(JSONObject jSONObject) {
            String str = "";
            if (jSONObject != null) {
                try {
                    if (jSONObject.getString("status").equals("ok")) {
                        JSONArray jSONArray = null;
                        if (jSONObject.has("urls")) {
                            jSONArray = jSONObject.getJSONArray("urls");
                        }
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        if (jSONObject.has("url")) {
                            jSONArray.put(jSONObject.getString("url"));
                        }
                        if (jSONArray.length() > 0) {
                            C9646q qVar = C9646q.this;
                            Context context = this.f24443b;
                            C9648b bVar = this.f24442a;
                            Objects.requireNonNull(bVar);
                            $$Lambda$4Nhbh_3WLQCcfhI7v2Mb11UQpNg r4 = new Runnable() {
                                public final void run() {
                                    C9646q.C9648b.this.onHandled();
                                }
                            };
                            try {
                                if (jSONArray.length() == 0) {
                                    C9212h5.f23153a.post(r4);
                                } else {
                                    String str2 = str;
                                    boolean z = false;
                                    for (int i = 0; i < jSONArray.length() && !z; i++) {
                                        str2 = jSONArray.getString(i);
                                        z = C9326n5.m27548b(context, str2, r4);
                                    }
                                    str = str2;
                                }
                            } catch (Exception e) {
                                Log.log(e);
                                C9212h5.f23153a.post(r4);
                            }
                            qVar.f24441a = str;
                            return;
                        }
                    }
                } catch (JSONException e2) {
                    Log.log(e2);
                    this.f24442a.onHandleError();
                    return;
                }
            }
            this.f24442a.onHandleError();
        }
    }

    /* renamed from: com.appodeal.ads.utils.q$b */
    public interface C9648b {
        void onHandleError();

        void onHandled();

        void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener);
    }

    /* renamed from: a */
    public final void mo61099a(Context context, String str, String str2, long j, C9648b bVar) {
        $$Lambda$4Nhbh_3WLQCcfhI7v2Mb11UQpNg r6;
        if (TextUtils.isEmpty(str)) {
            bVar.onHandleError();
        } else if (f24440b || str != null) {
            C9562o oVar = C9649r.f24445a;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                if (j == 0) {
                    j = 180;
                }
                C9562o oVar2 = C9649r.f24445a;
                oVar2.mo60817c(str2, System.currentTimeMillis() + (j * 60 * 1000));
                oVar2.f24252a.mo60787b(System.currentTimeMillis());
            }
            if (!str.equals("appodeal://")) {
                this.f24441a = str;
                bVar.processClick((UnifiedAdCallbackClickTrackListener) null);
                r6 = new Runnable() {
                    public final void run() {
                        C9646q.C9648b.this.onHandled();
                    }
                };
            } else if (!TextUtils.isEmpty(this.f24441a)) {
                str = this.f24441a;
                r6 = new Runnable() {
                    public final void run() {
                        C9646q.C9648b.this.onHandled();
                    }
                };
            } else {
                bVar.processClick(new C9647a(bVar, context));
                return;
            }
            C9326n5.m27548b(context, str, r6);
        } else {
            throw new AssertionError();
        }
    }
}
