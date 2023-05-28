package com.ironsource.sdk.p144g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.g.b */
public final class C4933b implements Parcelable {
    public static final Parcelable.Creator<C4933b> CREATOR = new Parcelable.Creator<C4933b>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4933b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C4933b[i];
        }
    };

    /* renamed from: a */
    public String f12622a;

    /* renamed from: b */
    public String f12623b;

    /* renamed from: c */
    public String f12624c;

    /* renamed from: d */
    public boolean f12625d;

    /* renamed from: e */
    public int f12626e;

    /* renamed from: f */
    public String f12627f;

    /* renamed from: g */
    public String f12628g;

    /* renamed from: h */
    public boolean f12629h;

    /* renamed from: i */
    public boolean f12630i;

    /* renamed from: j */
    public Map<String, String> f12631j;

    /* renamed from: k */
    private ArrayList<String> f12632k;

    /* renamed from: l */
    private ArrayList<String> f12633l;

    /* renamed from: m */
    private ArrayList<String> f12634m;

    /* renamed from: n */
    private ArrayList<String> f12635n;

    /* renamed from: o */
    private Map<String, String> f12636o;

    public C4933b() {
        m14386a();
    }

    private C4933b(Parcel parcel) {
        m14386a();
        try {
            boolean z = true;
            this.f12625d = parcel.readByte() != 0;
            this.f12626e = parcel.readInt();
            this.f12622a = parcel.readString();
            this.f12623b = parcel.readString();
            this.f12624c = parcel.readString();
            this.f12627f = parcel.readString();
            this.f12628g = parcel.readString();
            this.f12636o = m14385a(parcel.readString());
            this.f12630i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f12629h = z;
            this.f12631j = m14385a(parcel.readString());
        } catch (Throwable unused) {
            m14386a();
        }
    }

    /* synthetic */ C4933b(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    private static Map<String, String> m14385a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m14386a() {
        this.f12625d = false;
        this.f12626e = -1;
        this.f12632k = new ArrayList<>();
        this.f12633l = new ArrayList<>();
        this.f12634m = new ArrayList<>();
        this.f12635n = new ArrayList<>();
        this.f12629h = true;
        this.f12630i = false;
        this.f12628g = "";
        this.f12627f = "";
        this.f12636o = new HashMap();
        this.f12631j = new HashMap();
    }

    /* renamed from: a */
    public final void mo34658a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.f12634m.indexOf(str) == -1) {
            this.f12634m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f12625d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f12626e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f12632k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f12633l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f12627f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f12628g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f12636o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f12629h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f12630i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.f12631j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.f12625d ? 1 : 0));
            parcel.writeInt(this.f12626e);
            parcel.writeString(this.f12622a);
            parcel.writeString(this.f12623b);
            parcel.writeString(this.f12624c);
            parcel.writeString(this.f12627f);
            parcel.writeString(this.f12628g);
            parcel.writeString(new JSONObject(this.f12636o).toString());
            parcel.writeByte((byte) (this.f12630i ? 1 : 0));
            if (!this.f12629h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.f12631j).toString());
        } catch (Throwable unused) {
        }
    }
}
