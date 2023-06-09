package com.onesignal.outcomes.domain;

import com.onesignal.influence.domain.OSInfluenceChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo38199d2 = {"Lcom/onesignal/outcomes/domain/OSCachedUniqueOutcome;", "", "influenceId", "", "channel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "(Ljava/lang/String;Lcom/onesignal/influence/domain/OSInfluenceChannel;)V", "getChannel", "getInfluenceId", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: OSCachedUniqueOutcome.kt */
public class OSCachedUniqueOutcome {
    private final OSInfluenceChannel channel;
    private final String influenceId;

    public OSCachedUniqueOutcome(String str, OSInfluenceChannel oSInfluenceChannel) {
        Intrinsics.checkNotNullParameter(str, "influenceId");
        Intrinsics.checkNotNullParameter(oSInfluenceChannel, "channel");
        this.influenceId = str;
        this.channel = oSInfluenceChannel;
    }

    public String getInfluenceId() {
        return this.influenceId;
    }

    public OSInfluenceChannel getChannel() {
        return this.channel;
    }
}
