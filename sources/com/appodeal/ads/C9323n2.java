package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.C9640o;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.appodeal.ads.n2 */
public final class C9323n2 extends C9192g<C9573t2, C9478s2, C9263l2> {

    /* renamed from: e */
    public static NativeCallbacks f23580e;

    /* renamed from: a */
    public int f23581a = 2;

    /* renamed from: b */
    public boolean f23582b = false;

    /* renamed from: c */
    public boolean f23583c = false;

    /* renamed from: d */
    public final ArrayList f23584d = new ArrayList();

    /* renamed from: a */
    public final void mo59950e(C9573t2 t2Var, C9478s2 s2Var) {
        ArrayList o = s2Var.mo60723o();
        synchronized (this.f23584d) {
            this.f23584d.addAll(o);
            Collections.sort(this.f23584d, $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4.INSTANCE);
        }
        if (!this.f23582b) {
            this.f23582b = true;
            Log.log("NativeAdBox", LogConstants.EVENT_NOTIFY_LOADED, String.format(Locale.ENGLISH, "available count of Native Ads: %d", new Object[]{Integer.valueOf(this.f23584d.size())}));
            NativeCallbacks nativeCallbacks = f23580e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeLoaded();
            }
        }
        if (!t2Var.mo60626q()) {
            mo60335a(false);
        }
    }

    /* renamed from: a */
    public final void mo60335a(boolean z) {
        int i;
        synchronized (this.f23584d) {
            Native.C8988a a = Native.m27078a();
            if (z || a.mo60582k()) {
                int i2 = C9217i0.f23175e;
                if (i2 > 0 && i2 != this.f23581a) {
                    this.f23581a = i2;
                }
                int i3 = this.f23581a;
                int size = this.f23584d.size();
                synchronized (this.f23584d) {
                    i = 0;
                    Iterator it = this.f23584d.iterator();
                    while (it.hasNext()) {
                        if (((NativeAd) it.next()).isPrecache()) {
                            i++;
                        }
                    }
                }
                int i4 = i3 - (size - i);
                if (i4 > 0) {
                    Native.f22731a = i4;
                    C9573t2 t2Var = (C9573t2) a.mo60846f();
                    if (t2Var == null || !t2Var.mo60630u()) {
                        Native.m27078a().mo60842c(C9148b.f22956b.getApplicationContext());
                    }
                } else if (!this.f23582b) {
                    this.f23582b = true;
                    NativeCallbacks nativeCallbacks = f23580e;
                    if (nativeCallbacks != null) {
                        nativeCallbacks.onNativeLoaded();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo60337b(int i) {
        if (i > 5) {
            i = 5;
        }
        if (i < 2) {
            i = 2;
        }
        this.f23581a = i;
    }

    /* renamed from: b */
    public final void mo59945b(C9420r rVar, C9258l lVar) {
        C9573t2 t2Var = (C9573t2) rVar;
        C9478s2 s2Var = (C9478s2) lVar;
        if (this.f23584d.size() == 0) {
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
            NativeCallbacks nativeCallbacks = f23580e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeExpired();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo60338b() {
        boolean z;
        synchronized (this.f23584d) {
            z = !this.f23584d.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public final void mo60339c() {
        mo60336a(false, false, false);
    }

    /* renamed from: c */
    public final void mo59948c(C9420r rVar, C9258l lVar, Object obj) {
        C9573t2 t2Var = (C9573t2) rVar;
        C9478s2 s2Var = (C9478s2) lVar;
        C9263l2 l2Var = (C9263l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f23580e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShown(l2Var);
        }
    }

    /* renamed from: d */
    public final void mo59949d(C9420r rVar, C9258l lVar) {
        C9573t2 t2Var = (C9573t2) rVar;
        C9478s2 s2Var = (C9478s2) lVar;
        if (!this.f23582b && !this.f23583c) {
            this.f23583c = true;
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
            NativeCallbacks nativeCallbacks = f23580e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeFailedToLoad();
            }
        }
    }

    /* renamed from: b */
    public final void mo59946b(C9420r rVar, C9258l lVar, Object obj) {
        C9573t2 t2Var = (C9573t2) rVar;
        C9478s2 s2Var = (C9478s2) lVar;
        C9263l2 l2Var = (C9263l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f23580e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShowFailed(l2Var);
        }
    }

    /* renamed from: a */
    public final HashSet mo60333a() {
        HashSet hashSet;
        synchronized (this.f23584d) {
            hashSet = new HashSet();
            Iterator it = this.f23584d.iterator();
            while (it.hasNext()) {
                hashSet.add(((C9263l2) ((NativeAd) it.next())).f23286a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final ArrayList mo60332a(int i) {
        ArrayList<NativeAd> arrayList;
        synchronized (this.f23584d) {
            if (i >= this.f23584d.size()) {
                arrayList = new ArrayList<>(this.f23584d);
            } else {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add((NativeAd) this.f23584d.get(i2));
                }
                arrayList = arrayList2;
            }
            for (NativeAd nativeAd : arrayList) {
                C9640o.m28398b(((C9263l2) nativeAd).f23286a);
            }
            this.f23584d.removeAll(arrayList);
            if (this.f23584d.size() == 0) {
                this.f23582b = false;
                this.f23583c = false;
            }
            Log.log("NativeAdBox", LogConstants.EVENT_GET_ADS, String.format(Locale.ENGLISH, "available count of Native Ads: %d", new Object[]{Integer.valueOf(this.f23584d.size())}));
            mo60335a(false);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo60336a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f23584d) {
            if (this.f23584d.size() == 0) {
                this.f23582b = false;
                this.f23583c = false;
            }
            if (z) {
                this.f23584d.clear();
                Native.C8988a a = Native.m27078a();
                Context applicationContext = C9148b.f22956b.f22957a.getApplicationContext();
                Native.C8990c cVar = new Native.C8990c();
                cVar.f24026a = true;
                cVar.f24027b = z2;
                cVar.f24028c = z3;
                a.mo60839b(applicationContext, cVar);
            } else {
                mo60335a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo59944a(C9420r rVar, C9258l lVar, Object obj) {
        C9573t2 t2Var = (C9573t2) rVar;
        C9478s2 s2Var = (C9478s2) lVar;
        C9263l2 l2Var = (C9263l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f23580e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeClicked(l2Var);
        }
    }
}
