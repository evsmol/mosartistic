package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C3398qf;

/* renamed from: com.yandex.metrica.impl.ob.cm */
public class C2875cm extends C2670Vl {

    /* renamed from: c */
    private static final int[] f7620c = {3, 6, 4};

    /* renamed from: d */
    private static final C2875cm f7621d = new C2875cm("");

    public C2875cm(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C2875cm m9327a() {
        return f7621d;
    }

    public String getTag() {
        return "AppMetrica";
    }

    public C2875cm() {
        this("");
    }

    /* renamed from: a */
    public void mo17425a(C3398qf.C3403d dVar, String str) {
        boolean z;
        String str2;
        for (C3398qf.C3403d.C3404a aVar : dVar.f8801c) {
            if (aVar != null) {
                int[] iArr = f7620c;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (aVar.f8805c == iArr[i]) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": ");
                    if (aVar.f8805c == 3 && TextUtils.isEmpty(aVar.f8806d)) {
                        str2 = "Native crash of app";
                    } else if (aVar.f8805c == 4) {
                        StringBuilder sb2 = new StringBuilder(aVar.f8806d);
                        if (aVar.f8807e != null) {
                            String str3 = new String(aVar.f8807e);
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append(" with value ");
                                sb2.append(str3);
                            }
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = aVar.f8806d;
                    }
                    sb.append(str2);
                    mo15273i(sb.toString());
                }
            }
        }
    }
}
