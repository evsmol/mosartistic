package com.appodeal.ads;

import android.content.Context;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.segments.C9492h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class Native {

    /* renamed from: a */
    public static int f22731a = 1;

    /* renamed from: b */
    public static NativeAdType f22732b = NativeAdType.Auto;

    /* renamed from: c */
    public static MediaAssetType f22733c = MediaAssetType.ALL;

    /* renamed from: d */
    public static String f22734d;

    /* renamed from: e */
    public static boolean f22735e = false;

    /* renamed from: f */
    public static C9323n2 f22736f;

    /* renamed from: g */
    public static C8989b f22737g;

    /* renamed from: h */
    public static C8988a f22738h;

    public enum MediaAssetType {
        ICON,
        IMAGE,
        ALL
    }

    public enum NativeAdType {
        Auto("auto"),
        NoVideo("static"),
        Video("video");
        
        public final String name;

        private NativeAdType(String str) {
            this.name = str;
        }
    }

    /* renamed from: com.appodeal.ads.Native$b */
    public static class C8989b extends C9128b0<C9478s2, C9573t2, C9263l2> {
        public C8989b() {
            super(Native.m27080c());
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo59250a(C9420r rVar, C9258l lVar) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            return false;
        }

        /* renamed from: a */
        public final boolean mo59251a(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9478s2 s2Var = (C9478s2) lVar;
            return ((C9573t2) rVar).f24268L.contains(Integer.valueOf(l2Var.mo60110a()));
        }

        /* renamed from: b */
        public final boolean mo59253b(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9478s2 s2Var = (C9478s2) lVar;
            return ((C9573t2) rVar).f24269M.contains(Integer.valueOf(l2Var.mo60110a()));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo59254b(C9420r rVar, C9258l lVar, boolean z) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            return true;
        }

        /* renamed from: c */
        public final boolean mo59255c(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9478s2 s2Var = (C9478s2) lVar;
            return ((C9573t2) rVar).f24267K.contains(Integer.valueOf(l2Var.mo60110a()));
        }

        /* renamed from: e */
        public final C9490g mo59256e(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            C9490g gVar = l2Var.f23306u;
            return gVar == null ? C9492h.m28084a(RewardedVideo.VIDEO_MODE_DEFAULT) : gVar;
        }

        /* renamed from: f */
        public final void mo59257f(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.f24268L.add(Integer.valueOf(l2Var.mo60110a()));
            }
        }

        /* renamed from: g */
        public final void mo59258g(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.f24269M.add(Integer.valueOf(l2Var.mo60110a()));
            }
        }

        /* renamed from: h */
        public final void mo59259h(C9420r rVar, C9258l lVar) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (s2Var != null) {
                Native.m27080c().f23584d.removeAll(s2Var.mo60723o());
            }
            if (this.f22929a.mo60582k()) {
                Native.m27080c().mo60339c();
            }
        }

        /* renamed from: k */
        public final boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9478s2 s2Var = (C9478s2) lVar;
            return !((C9573t2) rVar).f24269M.contains(Integer.valueOf(l2Var.mo60110a())) && this.f22929a.f24299q > 0;
        }

        /* renamed from: l */
        public final void mo59262l(C9420r rVar, C9258l lVar) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            t2Var.f23905t = s2Var.f23269c.getEcpm();
            ArrayList arrayList = s2Var.f24068s;
            t2Var.f24266J = arrayList != null ? arrayList.size() : 0;
        }

        /* renamed from: p */
        public final boolean mo59264p(C9420r rVar, C9258l lVar) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (!s2Var.f23269c.isPrecache()) {
                this.f22929a.getClass();
                return C9577u.m28268b((C9420r) t2Var, (C9258l) s2Var);
            }
        }

        /* renamed from: a */
        public final void mo59249a(C9420r rVar) {
            HashSet hashSet = new HashSet();
            for (C9420r rVar2 = (C9573t2) rVar; rVar2 != null; rVar2 = rVar2.f23884H) {
                hashSet.addAll(rVar2.f23891f);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C9478s2) it.next()).mo60106j();
            }
        }

        /* renamed from: b */
        public final boolean mo59252b(C9420r rVar, C9258l lVar) {
            C9478s2 s2Var = (C9478s2) lVar;
            return ((C9573t2) rVar).f23906u;
        }

        /* renamed from: h */
        public final void mo59260h(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.f24267K.add(Integer.valueOf(l2Var.mo60110a()));
            }
        }

        /* renamed from: l */
        public final boolean mo59263l(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9478s2 s2Var = (C9478s2) lVar;
            return !((C9573t2) rVar).f24267K.contains(Integer.valueOf(l2Var.mo60110a()));
        }
    }

    /* renamed from: com.appodeal.ads.Native$c */
    public static class C8990c extends C9464s<C8990c> {
        public C8990c() {
            super("native", Constants.DEBUG_NATIVE);
        }
    }

    /* renamed from: a */
    public static C8988a m27078a() {
        C8988a aVar = f22738h;
        if (aVar == null) {
            synchronized (C9577u.class) {
                aVar = f22738h;
                if (aVar == null) {
                    aVar = new C8988a(m27079b());
                    f22738h = aVar;
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static C8989b m27079b() {
        if (f22737g == null) {
            f22737g = new C8989b();
        }
        return f22737g;
    }

    /* renamed from: c */
    public static C9323n2 m27080c() {
        if (f22736f == null) {
            f22736f = new C9323n2();
        }
        return f22736f;
    }

    /* renamed from: com.appodeal.ads.Native$a */
    public static class C8988a extends C9577u<C9478s2, C9573t2, C8990c> {
        public C8988a(C8989b bVar) {
            super(bVar, AdType.Native, (C9490g) null);
        }

        /* renamed from: a */
        public final void mo59242a(JSONObject jSONObject) {
            if (jSONObject.has("video_native_autostart")) {
                Native.f22735e = jSONObject.optBoolean("video_native_autostart", false);
            }
            if (jSONObject.has("diu")) {
                Native.f22734d = jSONObject.optString("diu");
            }
        }

        /* renamed from: a */
        public final boolean mo59243a(C9420r rVar) {
            if (!(!((C9573t2) rVar).f23887b.isEmpty()) || Native.m27080c().mo60338b()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo59244a(C9420r rVar, C9258l lVar) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            return true;
        }

        /* renamed from: b */
        public final void mo59245b() {
            int i = 0;
            while (i < this.f24289g.size() - 3) {
                C9573t2 t2Var = (C9573t2) ((this.f24289g.size() <= i || i == -1) ? null : (C9420r) this.f24289g.get(i));
                if (t2Var != null && !t2Var.f23881E) {
                    t2Var.mo60611c();
                }
                i++;
            }
        }

        /* renamed from: b */
        public final void mo59246b(Context context) {
            mo60839b(context, new C8990c());
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "native_disabled";
        }

        /* renamed from: s */
        public final void mo59248s() {
            Native.m27080c().mo60339c();
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9478s2((C9573t2) rVar, adNetwork, d0Var);
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9573t2((C8990c) sVar);
        }

        /* renamed from: a */
        public final int mo59239a(C9420r rVar, C9258l lVar, boolean z) {
            C9573t2 t2Var = (C9573t2) rVar;
            C9478s2 s2Var = (C9478s2) lVar;
            if (z) {
                return 1;
            }
            return Native.f22731a;
        }
    }
}
