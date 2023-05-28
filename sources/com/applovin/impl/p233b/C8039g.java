package com.applovin.impl.p233b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8622s;
import java.util.HashSet;
import java.util.Set;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.b.g */
public class C8039g {

    /* renamed from: a */
    public final Set<C8044k> f19461a = new HashSet();

    /* renamed from: b */
    public final Set<C8044k> f19462b = new HashSet();

    /* renamed from: c */
    private Uri f19463c;

    /* renamed from: d */
    private Uri f19464d;

    /* renamed from: e */
    private int f19465e;

    /* renamed from: f */
    private int f19466f;

    /* renamed from: a */
    public static C8039g m23924a(C8622s sVar, C8490n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            C8622s b = sVar.mo57796b("StaticResource");
            if (b == null || !URLUtil.isValidUrl(b.mo57799c())) {
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57822e("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
                return null;
            }
            C8039g gVar = new C8039g();
            gVar.f19463c = Uri.parse(b.mo57799c());
            C8622s c = sVar.mo57798c("IconClickThrough");
            if (c != null && URLUtil.isValidUrl(c.mo57799c())) {
                gVar.f19464d = Uri.parse(c.mo57799c());
            }
            String str = sVar.mo57797b().get(IabUtils.KEY_WIDTH);
            int i = 0;
            int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
            String str2 = sVar.mo57797b().get(IabUtils.KEY_HEIGHT);
            if (str2 != null && Integer.parseInt(str2) > 0) {
                i = Integer.parseInt(str2);
            }
            int intValue = ((Integer) nVar.mo57342a(C8380b.f20958ey)).intValue();
            if (parseInt <= 0 || i <= 0) {
                gVar.f19466f = intValue;
            } else {
                double d = (double) (((float) parseInt) / ((float) i));
                int min = Math.min(Math.max(parseInt, i), intValue);
                if (parseInt >= i) {
                    gVar.f19465e = min;
                    gVar.f19466f = (int) (((double) min) / d);
                    return gVar;
                }
                gVar.f19466f = min;
                intValue = (int) (((double) min) * d);
            }
            gVar.f19465e = intValue;
            return gVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo55903a() {
        return this.f19463c;
    }

    /* renamed from: b */
    public Uri mo55904b() {
        return this.f19464d;
    }

    /* renamed from: c */
    public int mo55905c() {
        return this.f19465e;
    }

    /* renamed from: d */
    public int mo55906d() {
        return this.f19466f;
    }

    /* renamed from: e */
    public Set<C8044k> mo55907e() {
        return this.f19461a;
    }

    /* renamed from: f */
    public Set<C8044k> mo55908f() {
        return this.f19462b;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + mo55903a() + "', clickUri='" + mo55904b() + "', width=" + mo55905c() + ", height=" + mo55906d() + "}";
    }
}
