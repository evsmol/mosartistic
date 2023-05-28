package com.bytedance.sdk.openadsdk.core.p026j;

import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c */
/* compiled from: VastResource */
public class C0536c {

    /* renamed from: a */
    protected int f2004a;

    /* renamed from: b */
    protected int f2005b;

    /* renamed from: c */
    protected C0538a.C0541a f2006c;

    /* renamed from: d */
    protected C0538a.C0542b f2007d;

    /* renamed from: e */
    protected String f2008e;

    /* renamed from: f */
    protected List<C0532c> f2009f = new ArrayList();

    /* renamed from: g */
    protected List<C0532c> f2010g = new ArrayList();

    /* renamed from: h */
    protected String f2011h;

    /* renamed from: i */
    private String f2012i;

    public C0536c(int i, int i2, C0538a.C0541a aVar, C0538a.C0542b bVar, String str, List<C0532c> list, List<C0532c> list2, String str2) {
        this.f2004a = i;
        this.f2005b = i2;
        this.f2006c = aVar;
        this.f2007d = bVar;
        this.f2008e = str;
        this.f2009f = list;
        this.f2010g = list2;
        this.f2011h = str2;
    }

    /* renamed from: b */
    public int mo1774b() {
        return this.f2004a;
    }

    /* renamed from: c */
    public int mo1776c() {
        return this.f2005b;
    }

    /* renamed from: a */
    public void mo1772a(long j) {
        C0532c.m2549b(this.f2009f, (C0519a) null, j, this.f2012i);
    }

    /* renamed from: b */
    public void mo1775b(long j) {
        C0532c.m2549b(this.f2010g, (C0519a) null, j, this.f2012i);
    }

    /* renamed from: a */
    public static float m2559a(int i, int i2, int i3, int i4, C0538a.C0542b bVar, C0538a.C0541a aVar) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = (float) i;
        float f2 = (float) i3;
        return m2560a(bVar, aVar) / ((Math.abs((f / ((float) i2)) - (f2 / ((float) i4))) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c$1 */
    /* compiled from: VastResource */
    static /* synthetic */ class C05371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2013a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.j.c.a$b[] r0 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2013a = r0
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.STATIC_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.HTML_RESOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.IFRAME_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p026j.C0536c.C05371.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static float m2560a(C0538a.C0542b bVar, C0538a.C0541a aVar) {
        int i = C05371.f2013a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (C0538a.C0541a.JAVASCRIPT.equals(aVar)) {
            return 1.0f;
        } else {
            if (C0538a.C0541a.IMAGE.equals(aVar)) {
                return 0.8f;
            }
            return 0.0f;
        }
    }

    /* renamed from: d */
    public String mo1777d() {
        int i = C05371.f2013a[this.f2007d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f2008e;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f2004a + "\" height=\"" + this.f2005b + "\" src=\"" + this.f2008e + "\"></iframe>";
        } else if (this.f2006c == C0538a.C0541a.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f2008e + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (this.f2006c != C0538a.C0541a.JAVASCRIPT) {
            return null;
        } else {
            return "<script src=\"" + this.f2008e + "\"></script>";
        }
    }

    /* renamed from: e */
    public String mo1778e() {
        if (this.f2007d == C0538a.C0542b.STATIC_RESOURCE && this.f2006c == C0538a.C0541a.IMAGE) {
            return this.f2008e;
        }
        return null;
    }

    /* renamed from: a */
    public void mo1773a(String str) {
        this.f2012i = str;
    }

    /* renamed from: b */
    public static C0536c m2561b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(IabUtils.KEY_WIDTH);
        int optInt2 = jSONObject.optInt(IabUtils.KEY_HEIGHT);
        String optString = jSONObject.optString("creativeType", C0538a.C0541a.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", C0538a.C0542b.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new C0532c.C0534a(optJSONArray.optString(i)).mo1771a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new C0532c.C0534a(optJSONArray2.optString(i2)).mo1771a());
        }
        return new C0536c(optInt, optInt2, C0538a.C0541a.valueOf(optString), C0538a.C0542b.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    /* renamed from: a */
    public JSONObject mo1755a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IabUtils.KEY_WIDTH, this.f2004a);
        jSONObject.put(IabUtils.KEY_HEIGHT, this.f2005b);
        jSONObject.put("creativeType", this.f2006c.toString());
        jSONObject.put("resourceType", this.f2007d.toString());
        jSONObject.put("contentUrl", this.f2008e);
        jSONObject.put("clickThroughUri", this.f2011h);
        jSONObject.put("clickTrackers", C0532c.m2548b(this.f2009f));
        jSONObject.put("creativeViewTrackers", C0532c.m2548b(this.f2010g));
        return jSONObject;
    }
}
