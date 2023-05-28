package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.C4205a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.internal.C4210e;
import com.iab.omid.library.applovin.internal.C4214h;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C4221a;
import com.iab.omid.library.applovin.publisher.C4222b;
import com.iab.omid.library.applovin.utils.C4233g;
import com.iab.omid.library.applovin.weakreference.C4250a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
public class C4197a extends AdSession {

    /* renamed from: l */
    private static final Pattern f10025l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f10026a;

    /* renamed from: b */
    private final AdSessionConfiguration f10027b;

    /* renamed from: c */
    private final List<C4210e> f10028c = new ArrayList();

    /* renamed from: d */
    private C4250a f10029d;

    /* renamed from: e */
    private AdSessionStatePublisher f10030e;

    /* renamed from: f */
    private boolean f10031f = false;

    /* renamed from: g */
    private boolean f10032g = false;

    /* renamed from: h */
    private final String f10033h;

    /* renamed from: i */
    private boolean f10034i;

    /* renamed from: j */
    private boolean f10035j;

    /* renamed from: k */
    private PossibleObstructionListener f10036k;

    C4197a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10027b = adSessionConfiguration;
        this.f10026a = adSessionContext;
        this.f10033h = UUID.randomUUID().toString();
        m11710d((View) null);
        this.f10030e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4221a(adSessionContext.getWebView()) : new C4222b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10030e.mo32621i();
        C4207c.m11754c().mo32545a(this);
        this.f10030e.mo32601a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m11704a() {
        if (this.f10034i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    private static void m11705a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: a */
    private void m11706a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f10025l.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private C4210e m11707b(View view) {
        for (C4210e next : this.f10028c) {
            if (next.mo32565c().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m11708b() {
        if (this.f10035j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m11709c(View view) {
        Collection<C4197a> b = C4207c.m11754c().mo32546b();
        if (b != null && !b.isEmpty()) {
            for (C4197a next : b) {
                if (next != this && next.mo32495c() == view) {
                    next.f10029d.clear();
                }
            }
        }
    }

    /* renamed from: d */
    private void m11710d(View view) {
        this.f10029d = new C4250a(view);
    }

    /* renamed from: a */
    public void mo32493a(List<C4250a> list) {
        if (mo32497e()) {
            ArrayList arrayList = new ArrayList();
            for (C4250a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f10036k.onPossibleObstructionsDetected(this.f10033h, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32494a(JSONObject jSONObject) {
        m11708b();
        getAdSessionStatePublisher().mo32610a(jSONObject);
        this.f10035j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10032g) {
            m11705a(view);
            m11706a(str);
            if (m11707b(view) == null) {
                this.f10028c.add(new C4210e(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: c */
    public View mo32495c() {
        return (View) this.f10029d.get();
    }

    /* renamed from: d */
    public List<C4210e> mo32496d() {
        return this.f10028c;
    }

    /* renamed from: e */
    public boolean mo32497e() {
        return this.f10036k != null;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10032g) {
            C4233g.m11883a((Object) errorType, "Error type is null");
            C4233g.m11885a(str, "Message is null");
            getAdSessionStatePublisher().mo32602a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo32498f() {
        return this.f10031f && !this.f10032g;
    }

    public void finish() {
        if (!this.f10032g) {
            this.f10029d.clear();
            removeAllFriendlyObstructions();
            this.f10032g = true;
            getAdSessionStatePublisher().mo32617f();
            C4207c.m11754c().mo32547b(this);
            getAdSessionStatePublisher().mo32612b();
            this.f10030e = null;
            this.f10036k = null;
        }
    }

    /* renamed from: g */
    public boolean mo32499g() {
        return this.f10032g;
    }

    public String getAdSessionId() {
        return this.f10033h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10030e;
    }

    /* renamed from: h */
    public boolean mo32500h() {
        return this.f10027b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo32501i() {
        return this.f10027b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean mo32502j() {
        return this.f10031f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo32503k() {
        m11704a();
        getAdSessionStatePublisher().mo32618g();
        this.f10034i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo32504l() {
        m11708b();
        getAdSessionStatePublisher().mo32620h();
        this.f10035j = true;
    }

    public void registerAdView(View view) {
        if (!this.f10032g) {
            C4233g.m11883a((Object) view, "AdView is null");
            if (mo32495c() != view) {
                m11710d(view);
                getAdSessionStatePublisher().mo32597a();
                m11709c(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10032g) {
            this.f10028c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10032g) {
            m11705a(view);
            C4210e b = m11707b(view);
            if (b != null) {
                this.f10028c.remove(b);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f10036k = possibleObstructionListener;
    }

    public void start() {
        if (!this.f10031f) {
            this.f10031f = true;
            C4207c.m11754c().mo32548c(this);
            this.f10030e.mo32598a(C4214h.m11798c().mo32588b());
            this.f10030e.mo32609a(C4205a.m11745a().mo32540b());
            this.f10030e.mo32603a(this, this.f10026a);
        }
    }
}
