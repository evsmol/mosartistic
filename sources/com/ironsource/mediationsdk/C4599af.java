package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C4417a;
import com.ironsource.lifecycle.C4431g;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4536g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo38199d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager;", "", "()V", "calculator", "Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "init", "", "SessionCalcEventTask", "mediationsdk_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.af */
public final class C4599af {

    /* renamed from: a */
    C4417a f11352a;

    @Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo38199d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager$SessionCalcEventTask;", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/mediationsdk/SessionCalculationManager;)V", "run", "", "mediationsdk_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
    /* renamed from: com.ironsource.mediationsdk.af$a */
    final class C4600a extends C4431g {
        public C4600a() {
        }

        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, this.f10550a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C4536g.f11131w.mo33649b(new C4532c(44, mediationAdditionalData));
        }
    }
}
