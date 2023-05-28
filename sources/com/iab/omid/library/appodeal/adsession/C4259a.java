package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import com.iab.omid.library.appodeal.p105b.C4261a;
import com.iab.omid.library.appodeal.p105b.C4264c;
import com.iab.omid.library.appodeal.p105b.C4268f;
import com.iab.omid.library.appodeal.p107d.C4280e;
import com.iab.omid.library.appodeal.p108e.C4282a;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.C4285a;
import com.iab.omid.library.appodeal.publisher.C4286b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.adsession.a */
public class C4259a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10155a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10156b;

    /* renamed from: c */
    private final AdSessionConfiguration f10157c;

    /* renamed from: d */
    private final List<C4264c> f10158d = new ArrayList();

    /* renamed from: e */
    private C4282a f10159e;

    /* renamed from: f */
    private AdSessionStatePublisher f10160f;

    /* renamed from: g */
    private boolean f10161g = false;

    /* renamed from: h */
    private boolean f10162h = false;

    /* renamed from: i */
    private final String f10163i;

    /* renamed from: j */
    private boolean f10164j;

    /* renamed from: k */
    private boolean f10165k;

    C4259a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10157c = adSessionConfiguration;
        this.f10156b = adSessionContext;
        this.f10163i = UUID.randomUUID().toString();
        m11969c((View) null);
        this.f10160f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4285a(adSessionContext.getWebView()) : new C4286b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10160f.mo32795a();
        C4261a.m11989a().mo32743a(this);
        this.f10160f.mo32799a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4264c m11966a(View view) {
        for (C4264c next : this.f10158d) {
            if (next.mo32762a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m11967a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10155a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m11968b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m11969c(View view) {
        this.f10159e = new C4282a(view);
    }

    /* renamed from: d */
    private void m11970d(View view) {
        Collection<C4259a> b = C4261a.m11989a().mo32744b();
        if (b != null && !b.isEmpty()) {
            for (C4259a next : b) {
                if (next != this && next.mo32712d() == view) {
                    next.f10159e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m11971j() {
        if (this.f10164j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m11972k() {
        if (this.f10165k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4264c> mo32708a() {
        return this.f10158d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32709a(JSONObject jSONObject) {
        m11972k();
        getAdSessionStatePublisher().mo32807a(jSONObject);
        this.f10165k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10162h) {
            m11968b(view);
            m11967a(str);
            if (m11966a(view) == null) {
                this.f10158d.add(new C4264c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32710b() {
        m11971j();
        getAdSessionStatePublisher().mo32815g();
        this.f10164j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32711c() {
        m11972k();
        getAdSessionStatePublisher().mo32817h();
        this.f10165k = true;
    }

    /* renamed from: d */
    public View mo32712d() {
        return (View) this.f10159e.get();
    }

    /* renamed from: e */
    public boolean mo32713e() {
        return this.f10161g && !this.f10162h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10162h) {
            C4280e.m12081a((Object) errorType, "Error type is null");
            C4280e.m12083a(str, "Message is null");
            getAdSessionStatePublisher().mo32800a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo32714f() {
        return this.f10161g;
    }

    public void finish() {
        if (!this.f10162h) {
            this.f10159e.clear();
            removeAllFriendlyObstructions();
            this.f10162h = true;
            getAdSessionStatePublisher().mo32814f();
            C4261a.m11989a().mo32747c(this);
            getAdSessionStatePublisher().mo32809b();
            this.f10160f = null;
        }
    }

    /* renamed from: g */
    public boolean mo32715g() {
        return this.f10162h;
    }

    public String getAdSessionId() {
        return this.f10163i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10160f;
    }

    /* renamed from: h */
    public boolean mo32716h() {
        return this.f10157c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo32717i() {
        return this.f10157c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10162h) {
            C4280e.m12081a((Object) view, "AdView is null");
            if (mo32712d() != view) {
                m11969c(view);
                getAdSessionStatePublisher().mo32818i();
                m11970d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10162h) {
            this.f10158d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10162h) {
            m11968b(view);
            C4264c a = m11966a(view);
            if (a != null) {
                this.f10158d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10161g) {
            this.f10161g = true;
            C4261a.m11989a().mo32745b(this);
            this.f10160f.mo32796a(C4268f.m12029a().mo32788d());
            this.f10160f.mo32801a(this, this.f10156b);
        }
    }
}
