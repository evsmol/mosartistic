package com.appodeal.consent;

import android.content.Context;
import com.appodeal.consent.internal.C9757d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0019"}, mo38199d2 = {"Lcom/appodeal/consent/ConsentForm;", "Lcom/appodeal/consent/internal/d$a;", "", "load", "show", "onLoaded", "Lcom/appodeal/consent/ConsentManagerError;", "error", "onError", "onOpened", "onClosed", "Lcom/appodeal/consent/IConsentFormListener;", "a", "Lcom/appodeal/consent/IConsentFormListener;", "getListener", "()Lcom/appodeal/consent/IConsentFormListener;", "listener", "", "isLoaded", "()Z", "isShowing", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/appodeal/consent/IConsentFormListener;)V", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class ConsentForm implements C9757d.C9758a {

    /* renamed from: a */
    public final IConsentFormListener f24709a;

    /* renamed from: b */
    public final C9757d f24710b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConsentForm(Context context) {
        this(context, (IConsentFormListener) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public ConsentForm(Context context, IConsentFormListener iConsentFormListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iConsentFormListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24709a = iConsentFormListener;
        this.f24710b = new C9757d(context, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentForm(Context context, IConsentFormListener iConsentFormListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ConsentFormListener() : iConsentFormListener);
    }

    public final IConsentFormListener getListener() {
        return this.f24709a;
    }

    public final boolean isLoaded() {
        return this.f24710b.mo61335d();
    }

    public final boolean isShowing() {
        return this.f24710b.mo61337f();
    }

    public final void load() {
        this.f24710b.mo61338g();
    }

    public void onClosed() {
        this.f24709a.onConsentFormClosed(ConsentManager.getConsent());
    }

    public void onError(ConsentManagerError consentManagerError) {
        Intrinsics.checkNotNullParameter(consentManagerError, "error");
        this.f24709a.onConsentFormError(consentManagerError);
    }

    public void onLoaded() {
        this.f24709a.onConsentFormLoaded(this);
    }

    public void onOpened() {
        this.f24709a.onConsentFormOpened();
    }

    public final void show() {
        this.f24710b.mo61339h();
    }
}
