package com.appodeal.ads.modules.common.internal.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(mo38198d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchAwaitingAsync", "timeout", "", "releaseAwaiter", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface ServiceInitializationAwaiter {
    Object await(Continuation<? super Unit> continuation);

    void launchAwaitingAsync(long j);

    void releaseAwaiter();
}
