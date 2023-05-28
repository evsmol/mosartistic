package com.appodeal.ads;

import com.appnext.base.p264b.C8849c;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.f4 */
public final class C9190f4 {
    /* renamed from: a */
    public static final void m27300a(JSONObject jSONObject, C9336b bVar) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(bVar, C8849c.DATA);
        if (bVar instanceof C9336b.C9337a) {
            function1 = new C9254k3(bVar);
        } else if (bVar instanceof C9336b.C9354j) {
            function1 = new C9324n3(bVar);
        } else if (bVar instanceof C9336b.C9347c) {
            function1 = new C9427r3(bVar);
        } else if (bVar instanceof C9336b.C9348d) {
            function1 = new C9481s3(bVar);
        } else if (bVar instanceof C9336b.C9350f) {
            function1 = new C9574t3(bVar);
        } else if (bVar instanceof C9336b.C9352h) {
            function1 = new C9589u3(bVar);
        } else if (bVar instanceof C9336b.C9358n) {
            function1 = new C9679v3(bVar);
        } else if (bVar instanceof C9336b.C9353i) {
            function1 = new C9689w3(bVar);
        } else if (bVar instanceof C9336b.C9355k) {
            function1 = new C9177e4(bVar);
        } else if (bVar instanceof C9336b.C9356l) {
            function1 = new C9176e3(bVar);
        } else if (bVar instanceof C9336b.C9357m) {
            function1 = new C9189f3(bVar);
        } else if (bVar instanceof C9336b.C9345b) {
            function1 = new C9210h3(bVar);
        } else if (bVar instanceof C9336b.C9351g) {
            function1 = new C9220i3(bVar);
        } else if (bVar instanceof C9336b.C9349e) {
            function1 = new C9233j3(bVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JsonObjectBuilderKt.jsonObject(jSONObject, function1);
    }
}
