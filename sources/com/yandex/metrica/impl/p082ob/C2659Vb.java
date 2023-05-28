package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appnext.base.p264b.C8856i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C3316oc;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Vb */
public class C2659Vb {

    /* renamed from: a */
    private Context f7051a;

    public C2659Vb(Context context) {
        this.f7051a = context;
    }

    /* renamed from: a */
    public String mo16971a(C2091Hc hc) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", hc.f5524a.mo17917a());
            jSONObject.put(C8856i.f22445fC, hc.mo15858c().getLatitude());
            jSONObject.put("lon", hc.mo15858c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(hc.mo15858c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(hc.mo15860e()));
            jSONObject.put("receive_elapsed_realtime_seconds", hc.mo15859d());
            jSONObject.putOpt("precision", hc.mo15858c().hasAccuracy() ? Float.valueOf(hc.mo15858c().getAccuracy()) : null);
            jSONObject.putOpt("direction", hc.mo15858c().hasBearing() ? Float.valueOf(hc.mo15858c().getBearing()) : null);
            jSONObject.putOpt("speed", hc.mo15858c().hasSpeed() ? Float.valueOf(hc.mo15858c().getSpeed()) : null);
            jSONObject.putOpt("altitude", hc.mo15858c().hasAltitude() ? Double.valueOf(hc.mo15858c().getAltitude()) : null);
            jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C2814b.m9062a(hc.mo15858c().getProvider(), (String) null));
            jSONObject.put("charge_type", hc.mo15856a().mo15643a());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C2572Tl.m8528b(this.f7051a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public C2091Hc mo16973b(long j, String str) {
        String str2;
        try {
            str2 = C2572Tl.m8513a(this.f7051a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("receive_timestamp", 0);
                long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0);
                C3316oc.C3317a a = C3316oc.C3317a.m10242a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString(IronSourceConstants.EVENTS_PROVIDER, (String) null));
                location.setLongitude(jSONObject.optDouble("lon", 0.0d));
                location.setLatitude(jSONObject.optDouble(C8856i.f22445fC, 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new C2091Hc(a, optLong, optLong2, location, C1967E.C1969b.C1970a.m7051a(Integer.valueOf(jSONObject.optInt("charge_type", RecyclerView.UNDEFINED_DURATION))), Long.valueOf(j));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public C3155lc mo16970a(long j, String str) {
        String str2;
        try {
            str2 = C2572Tl.m8513a(this.f7051a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            C3155lc lcVar = new C3155lc();
            try {
                lcVar.mo17810a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(str2);
                lcVar.mo17813b(jSONObject.optLong("timestamp", 0));
                lcVar.mo17807a(jSONObject.optLong("elapsed_realtime_seconds", 0));
                lcVar.mo17811a(jSONObject.optJSONArray("cell_info"));
                lcVar.mo17814b(jSONObject.optJSONArray("wifi_info"));
                lcVar.mo17808a(C1967E.C1969b.C1970a.m7051a(Integer.valueOf(jSONObject.optInt("charge_type", RecyclerView.UNDEFINED_DURATION))));
                lcVar.mo17809a(C3316oc.C3317a.m10242a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return lcVar;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo16972a(C3155lc lcVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", lcVar.mo17816d());
            jSONObject.put("elapsed_realtime_seconds", lcVar.mo17815c());
            jSONObject.putOpt("wifi_info", lcVar.mo17819g());
            jSONObject.putOpt("cell_info", lcVar.mo17806a());
            if (lcVar.mo17812b() != null) {
                jSONObject.put("charge_type", lcVar.mo17812b().mo15643a());
            }
            if (lcVar.mo17817e() != null) {
                jSONObject.put("collection_mode", lcVar.mo17817e().mo17917a());
            }
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C2572Tl.m8528b(this.f7051a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
