package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import com.appnext.base.p264b.C8850d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C3316oc;

/* renamed from: com.yandex.metrica.impl.ob.qe */
public class C3397qe {

    /* renamed from: A */
    public final byte[] f8738A;

    /* renamed from: a */
    public final String f8739a;

    /* renamed from: b */
    public String f8740b;

    /* renamed from: c */
    public final Integer f8741c;

    /* renamed from: d */
    public final Integer f8742d;

    /* renamed from: e */
    public final Integer f8743e;

    /* renamed from: f */
    public final Long f8744f;

    /* renamed from: g */
    public final String f8745g;

    /* renamed from: h */
    public final String f8746h;

    /* renamed from: i */
    public final String f8747i;

    /* renamed from: j */
    public final C2788a1 f8748j;

    /* renamed from: k */
    public final Integer f8749k;

    /* renamed from: l */
    public final String f8750l;

    /* renamed from: m */
    public final String f8751m;

    /* renamed from: n */
    public final Integer f8752n;

    /* renamed from: o */
    public final Integer f8753o;

    /* renamed from: p */
    public final String f8754p;

    /* renamed from: q */
    public final String f8755q;

    /* renamed from: r */
    public final C2004Em f8756r;

    /* renamed from: s */
    public final C1936D0 f8757s;

    /* renamed from: t */
    public final C1967E.C1969b.C1970a f8758t;

    /* renamed from: u */
    public final C3316oc.C3317a f8759u;

    /* renamed from: v */
    public final Integer f8760v;

    /* renamed from: w */
    public final Integer f8761w;

    /* renamed from: x */
    public final C3679y0 f8762x;

    /* renamed from: y */
    public final Boolean f8763y;

    /* renamed from: z */
    public final Integer f8764z;

    public C3397qe(ContentValues contentValues) {
        C2788a1 a1Var;
        Integer asInteger = contentValues.getAsInteger("type");
        C3679y0 y0Var = null;
        if (asInteger == null) {
            a1Var = null;
        } else {
            a1Var = C2788a1.m8989a(asInteger.intValue());
        }
        this.f8748j = a1Var;
        this.f8749k = contentValues.getAsInteger("custom_type");
        this.f8739a = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f8740b = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f8744f = contentValues.getAsLong(C8850d.f22432fl);
        this.f8741c = contentValues.getAsInteger("number");
        this.f8742d = contentValues.getAsInteger("global_number");
        this.f8743e = contentValues.getAsInteger("number_of_type");
        this.f8746h = contentValues.getAsString("cell_info");
        this.f8745g = contentValues.getAsString("location_info");
        this.f8747i = contentValues.getAsString("wifi_network_info");
        this.f8750l = contentValues.getAsString("error_environment");
        this.f8751m = contentValues.getAsString("user_info");
        this.f8752n = contentValues.getAsInteger("truncated");
        this.f8753o = contentValues.getAsInteger("connection_type");
        this.f8754p = contentValues.getAsString("cellular_connection_type");
        this.f8755q = contentValues.getAsString("profile_id");
        this.f8756r = C2004Em.m7149a(contentValues.getAsInteger("encrypting_mode"));
        this.f8757s = C1936D0.m6984a(contentValues.getAsInteger("first_occurrence_status"));
        this.f8758t = C1967E.C1969b.C1970a.m7051a(contentValues.getAsInteger("battery_charge_type"));
        this.f8759u = C3316oc.C3317a.m10242a(contentValues.getAsString("collection_mode"));
        this.f8760v = contentValues.getAsInteger("has_omitted_data");
        this.f8761w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.f8762x = asInteger2 != null ? C3679y0.m11052a(asInteger2.intValue()) : y0Var;
        this.f8763y = contentValues.getAsBoolean("attribution_id_changed");
        this.f8764z = contentValues.getAsInteger("open_id");
        this.f8738A = contentValues.getAsByteArray("extras");
    }
}
