package com.applovin.exoplayer2.p186e;

import android.net.Uri;
import com.applovin.exoplayer2.p186e.p187a.C7189a;
import com.applovin.exoplayer2.p186e.p188b.C7194b;
import com.applovin.exoplayer2.p186e.p189c.C7197b;
import com.applovin.exoplayer2.p186e.p190d.C7203a;
import com.applovin.exoplayer2.p186e.p191e.C7216d;
import com.applovin.exoplayer2.p186e.p192f.C7227d;
import com.applovin.exoplayer2.p186e.p193g.C7247e;
import com.applovin.exoplayer2.p186e.p193g.C7251g;
import com.applovin.exoplayer2.p186e.p194h.C7268c;
import com.applovin.exoplayer2.p186e.p195i.C7280a;
import com.applovin.exoplayer2.p186e.p195i.C7284ac;
import com.applovin.exoplayer2.p186e.p195i.C7295c;
import com.applovin.exoplayer2.p186e.p195i.C7297e;
import com.applovin.exoplayer2.p186e.p195i.C7324w;
import com.applovin.exoplayer2.p186e.p196j.C7331a;
import com.applovin.exoplayer2.p221l.C7743l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.e.f */
public final class C7223f implements C7340l {

    /* renamed from: b */
    private static final int[] f16045b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c */
    private static final Constructor<? extends C7262h> f16046c;

    /* renamed from: d */
    private boolean f16047d;

    /* renamed from: e */
    private boolean f16048e;

    /* renamed from: f */
    private int f16049f;

    /* renamed from: g */
    private int f16050g;

    /* renamed from: h */
    private int f16051h;

    /* renamed from: i */
    private int f16052i;

    /* renamed from: j */
    private int f16053j;

    /* renamed from: k */
    private int f16054k;

    /* renamed from: l */
    private int f16055l;

    /* renamed from: m */
    private int f16056m = 1;

    /* renamed from: n */
    private int f16057n;

    /* renamed from: o */
    private int f16058o = 112800;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(C7262h.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f16046c = constructor;
    }

    /* renamed from: a */
    private void m19552a(int i, List<C7262h> list) {
        Object obj;
        int i2 = 2;
        switch (i) {
            case 0:
                obj = new C7280a();
                break;
            case 1:
                obj = new C7295c();
                break;
            case 2:
                boolean z = this.f16049f | this.f16047d;
                if (!this.f16048e) {
                    i2 = 0;
                }
                obj = new C7297e(i2 | z ? 1 : 0);
                break;
            case 3:
                boolean z2 = this.f16050g | this.f16047d;
                if (!this.f16048e) {
                    i2 = 0;
                }
                obj = new C7189a(i2 | z2 ? 1 : 0);
                break;
            case 4:
                Constructor<? extends C7262h> constructor = f16046c;
                if (constructor == null) {
                    obj = new C7194b(this.f16051h);
                    break;
                } else {
                    try {
                        list.add((C7262h) constructor.newInstance(new Object[]{Integer.valueOf(this.f16051h)}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
            case 5:
                obj = new C7197b();
                break;
            case 6:
                obj = new C7216d(this.f16052i);
                break;
            case 7:
                boolean z3 = this.f16055l | this.f16047d;
                if (!this.f16048e) {
                    i2 = 0;
                }
                obj = new C7227d(i2 | z3 ? 1 : 0);
                break;
            case 8:
                list.add(new C7247e(this.f16054k));
                obj = new C7251g(this.f16053j);
                break;
            case 9:
                obj = new C7268c();
                break;
            case 10:
                obj = new C7324w();
                break;
            case 11:
                obj = new C7284ac(this.f16056m, this.f16057n, this.f16058o);
                break;
            case 12:
                obj = new C7331a();
                break;
            case 14:
                obj = new C7203a();
                break;
            default:
                return;
        }
        list.add(obj);
    }

    /* renamed from: a */
    public synchronized C7262h[] mo53858a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int a = C7743l.m22312a(map);
        if (a != -1) {
            m19552a(a, (List<C7262h>) arrayList);
        }
        int a2 = C7743l.m22310a(uri);
        if (!(a2 == -1 || a2 == a)) {
            m19552a(a2, (List<C7262h>) arrayList);
        }
        for (int i : f16045b) {
            if (!(i == a || i == a2)) {
                m19552a(i, (List<C7262h>) arrayList);
            }
        }
        return (C7262h[]) arrayList.toArray(new C7262h[arrayList.size()]);
    }

    public synchronized C7262h[] createExtractors() {
        return mo53858a(Uri.EMPTY, (Map<String, List<String>>) new HashMap());
    }
}
