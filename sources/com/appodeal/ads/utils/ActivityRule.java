package com.appodeal.ads.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityRule {

    /* renamed from: b */
    public static final Companion f24334b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f24335a;

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo38199d2 = {"Lcom/appodeal/ads/utils/ActivityRule$Builder;", "", "Lcom/appodeal/ads/utils/ActivityRule;", "build", "", "activityClassName", "<init>", "(Ljava/lang/String;)V", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a */
        public final String f24336a;

        public Builder(String str) {
            Intrinsics.checkNotNullParameter(str, "activityClassName");
            this.f24336a = str;
        }

        public final ActivityRule build() {
            return new ActivityRule(this.f24336a);
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo38199d2 = {"Lcom/appodeal/ads/utils/ActivityRule$Companion;", "", "", "Lcom/appodeal/ads/utils/ActivityRule;", "activityRuleArray", "", "", "getActivityClassNameArray", "([Lcom/appodeal/ads/utils/ActivityRule;)Ljava/util/List;", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getActivityClassNameArray(ActivityRule[] activityRuleArr) {
            Intrinsics.checkNotNullParameter(activityRuleArr, "activityRuleArray");
            ArrayList arrayList = new ArrayList(activityRuleArr.length);
            int length = activityRuleArr.length;
            int i = 0;
            while (i < length) {
                ActivityRule activityRule = activityRuleArr[i];
                i++;
                arrayList.add(activityRule.mo61016a());
            }
            return arrayList;
        }
    }

    public ActivityRule(String str) {
        this.f24335a = str;
    }

    /* renamed from: a */
    public final String mo61016a() {
        return this.f24335a;
    }
}
