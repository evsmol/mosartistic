package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.C8010o;
import com.applovin.impl.adview.activity.p232b.C7905a;
import com.applovin.impl.sdk.C8490n;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a */
    private final C8490n f14570a;

    /* renamed from: b */
    private final AtomicBoolean f14571b = new AtomicBoolean(true);

    /* renamed from: c */
    private C7905a f14572c;

    /* renamed from: d */
    private C8010o f14573d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, C8010o oVar, C8490n nVar) {
        this.f14573d = oVar;
        this.f14570a = nVar;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C8010o oVar = this.f14573d;
        if (oVar != null) {
            oVar.mo55767a();
            this.f14573d = null;
        }
        C7905a aVar = this.f14572c;
        if (aVar != null) {
            aVar.mo55555h();
            this.f14572c.mo55558k();
            this.f14572c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C7905a aVar = this.f14572c;
        if (aVar != null) {
            aVar.mo55554g();
            this.f14572c.mo55552e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C7905a aVar;
        if (!this.f14571b.getAndSet(false) && (aVar = this.f14572c) != null) {
            aVar.mo55553f();
            this.f14572c.mo55538a(0);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C7905a aVar = this.f14572c;
        if (aVar != null) {
            aVar.mo55557j();
        }
    }

    public void setPresenter(C7905a aVar) {
        this.f14572c = aVar;
    }
}
