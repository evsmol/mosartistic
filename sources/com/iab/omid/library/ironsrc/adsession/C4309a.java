package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p111b.C4311a;
import com.iab.omid.library.ironsrc.p111b.C4314c;
import com.iab.omid.library.ironsrc.p111b.C4318f;
import com.iab.omid.library.ironsrc.p113d.C4330e;
import com.iab.omid.library.ironsrc.p114e.C4332a;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C4335a;
import com.iab.omid.library.ironsrc.publisher.C4336b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
public class C4309a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10268a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10269b;

    /* renamed from: c */
    private final AdSessionConfiguration f10270c;

    /* renamed from: d */
    private final List<C4314c> f10271d = new ArrayList();

    /* renamed from: e */
    private C4332a f10272e;

    /* renamed from: f */
    private AdSessionStatePublisher f10273f;

    /* renamed from: g */
    private boolean f10274g = false;

    /* renamed from: h */
    private boolean f10275h = false;

    /* renamed from: i */
    private String f10276i;

    /* renamed from: j */
    private boolean f10277j;

    /* renamed from: k */
    private boolean f10278k;

    C4309a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10270c = adSessionConfiguration;
        this.f10269b = adSessionContext;
        this.f10276i = UUID.randomUUID().toString();
        m12193c((View) null);
        this.f10273f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4335a(adSessionContext.getWebView()) : new C4336b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10273f.mo32981a();
        C4311a.m12213a().mo32937a(this);
        this.f10273f.mo32985a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4314c m12190a(View view) {
        for (C4314c next : this.f10271d) {
            if (next.mo32948a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m12191a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10268a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m12192b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m12193c(View view) {
        this.f10272e = new C4332a(view);
    }

    /* renamed from: d */
    private void m12194d(View view) {
        Collection<C4309a> b = C4311a.m12213a().mo32938b();
        if (b != null && b.size() > 0) {
            for (C4309a next : b) {
                if (next != this && next.mo32906d() == view) {
                    next.f10272e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m12195j() {
        if (this.f10277j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m12196k() {
        if (this.f10278k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4314c> mo32902a() {
        return this.f10271d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32903a(JSONObject jSONObject) {
        m12196k();
        getAdSessionStatePublisher().mo32993a(jSONObject);
        this.f10278k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10275h) {
            m12192b(view);
            m12191a(str);
            if (m12190a(view) == null) {
                this.f10271d.add(new C4314c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32904b() {
        m12195j();
        getAdSessionStatePublisher().mo33001g();
        this.f10277j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32905c() {
        m12196k();
        getAdSessionStatePublisher().mo33003h();
        this.f10278k = true;
    }

    /* renamed from: d */
    public View mo32906d() {
        return (View) this.f10272e.get();
    }

    /* renamed from: e */
    public boolean mo32907e() {
        return this.f10274g && !this.f10275h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10275h) {
            C4330e.m12302a((Object) errorType, "Error type is null");
            C4330e.m12304a(str, "Message is null");
            getAdSessionStatePublisher().mo32986a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo32908f() {
        return this.f10274g;
    }

    public void finish() {
        if (!this.f10275h) {
            this.f10272e.clear();
            removeAllFriendlyObstructions();
            this.f10275h = true;
            getAdSessionStatePublisher().mo33000f();
            C4311a.m12213a().mo32941c(this);
            getAdSessionStatePublisher().mo32995b();
            this.f10273f = null;
        }
    }

    /* renamed from: g */
    public boolean mo32909g() {
        return this.f10275h;
    }

    public String getAdSessionId() {
        return this.f10276i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10273f;
    }

    /* renamed from: h */
    public boolean mo32910h() {
        return this.f10270c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo32911i() {
        return this.f10270c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10275h) {
            C4330e.m12302a((Object) view, "AdView is null");
            if (mo32906d() != view) {
                m12193c(view);
                getAdSessionStatePublisher().mo33004i();
                m12194d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10275h) {
            this.f10271d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10275h) {
            m12192b(view);
            C4314c a = m12190a(view);
            if (a != null) {
                this.f10271d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10274g) {
            this.f10274g = true;
            C4311a.m12213a().mo32939b(this);
            this.f10273f.mo32982a(C4318f.m12251a().mo32974d());
            this.f10273f.mo32987a(this, this.f10269b);
        }
    }
}
