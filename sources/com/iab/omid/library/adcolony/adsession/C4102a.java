package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.p093b.C4107c;
import com.iab.omid.library.adcolony.p093b.C4111f;
import com.iab.omid.library.adcolony.p095d.C4123e;
import com.iab.omid.library.adcolony.p096e.C4125a;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.C4128a;
import com.iab.omid.library.adcolony.publisher.C4129b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
public class C4102a extends AdSession {

    /* renamed from: a */
    private static final Pattern f9796a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f9797b;

    /* renamed from: c */
    private final AdSessionConfiguration f9798c;

    /* renamed from: d */
    private final List<C4107c> f9799d = new ArrayList();

    /* renamed from: e */
    private C4125a f9800e;

    /* renamed from: f */
    private AdSessionStatePublisher f9801f;

    /* renamed from: g */
    private boolean f9802g = false;

    /* renamed from: h */
    private boolean f9803h = false;

    /* renamed from: i */
    private final String f9804i;

    /* renamed from: j */
    private boolean f9805j;

    /* renamed from: k */
    private boolean f9806k;

    /* renamed from: l */
    private PossibleObstructionListener f9807l;

    C4102a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f9798c = adSessionConfiguration;
        this.f9797b = adSessionContext;
        this.f9804i = UUID.randomUUID().toString();
        m11256c((View) null);
        this.f9801f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4128a(adSessionContext.getWebView()) : new C4129b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f9801f.mo32189a();
        C4104a.m11278a().mo32137a(this);
        this.f9801f.mo32193a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4107c m11253a(View view) {
        for (C4107c next : this.f9799d) {
            if (next.mo32156a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m11254a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f9796a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m11255b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m11256c(View view) {
        this.f9800e = new C4125a(view);
    }

    /* renamed from: d */
    private void m11257d(View view) {
        Collection<C4102a> b = C4104a.m11278a().mo32138b();
        if (b != null && !b.isEmpty()) {
            for (C4102a next : b) {
                if (next != this && next.mo32106e() == view) {
                    next.f9800e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m11258k() {
        if (this.f9805j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m11259l() {
        if (this.f9806k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4107c> mo32100a() {
        return this.f9799d;
    }

    /* renamed from: a */
    public void mo32101a(List<C4125a> list) {
        if (mo32103b()) {
            ArrayList arrayList = new ArrayList();
            for (C4125a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f9807l.onPossibleObstructionsDetected(this.f9804i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32102a(JSONObject jSONObject) {
        m11259l();
        getAdSessionStatePublisher().mo32201a(jSONObject);
        this.f9806k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f9803h) {
            m11255b(view);
            m11254a(str);
            if (m11253a(view) == null) {
                this.f9799d.add(new C4107c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo32103b() {
        return this.f9807l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32104c() {
        m11258k();
        getAdSessionStatePublisher().mo32209g();
        this.f9805j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32105d() {
        m11259l();
        getAdSessionStatePublisher().mo32211h();
        this.f9806k = true;
    }

    /* renamed from: e */
    public View mo32106e() {
        return (View) this.f9800e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f9803h) {
            C4123e.m11372a((Object) errorType, "Error type is null");
            C4123e.m11374a(str, "Message is null");
            getAdSessionStatePublisher().mo32194a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo32107f() {
        return this.f9802g && !this.f9803h;
    }

    public void finish() {
        if (!this.f9803h) {
            this.f9800e.clear();
            removeAllFriendlyObstructions();
            this.f9803h = true;
            getAdSessionStatePublisher().mo32208f();
            C4104a.m11278a().mo32141c(this);
            getAdSessionStatePublisher().mo32203b();
            this.f9801f = null;
            this.f9807l = null;
        }
    }

    /* renamed from: g */
    public boolean mo32108g() {
        return this.f9802g;
    }

    public String getAdSessionId() {
        return this.f9804i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f9801f;
    }

    /* renamed from: h */
    public boolean mo32109h() {
        return this.f9803h;
    }

    /* renamed from: i */
    public boolean mo32110i() {
        return this.f9798c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo32111j() {
        return this.f9798c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f9803h) {
            C4123e.m11372a((Object) view, "AdView is null");
            if (mo32106e() != view) {
                m11256c(view);
                getAdSessionStatePublisher().mo32212i();
                m11257d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f9803h) {
            this.f9799d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f9803h) {
            m11255b(view);
            C4107c a = m11253a(view);
            if (a != null) {
                this.f9799d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f9807l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f9802g) {
            this.f9802g = true;
            C4104a.m11278a().mo32139b(this);
            this.f9801f.mo32190a(C4111f.m11318a().mo32182d());
            this.f9801f.mo32195a(this, this.f9797b);
        }
    }
}
