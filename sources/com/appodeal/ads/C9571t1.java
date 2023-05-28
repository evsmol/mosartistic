package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.segments.C9492h;
import com.appodeal.ads.segments.C9495j;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.utils.Log;
import java.util.TreeMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.t1 */
public final class C9571t1 {

    /* renamed from: a */
    public final Context f24263a;

    @DebugMetadata(mo38568c = "com.appodeal.ads.JsonRequestCallbacks$BaseRequestCallback$onSuccess$1", mo38569f = "JsonRequestCallbacks.kt", mo38570l = {35}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.t1$a */
    public static final class C9572a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f24264a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f24265b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9572a(JSONObject jSONObject, Continuation<? super C9572a> continuation) {
            super(2, continuation);
            this.f24265b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9572a(this.f24265b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9572a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24264a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9422r0 r0Var = C9422r0.f23912a;
                JSONObject jSONObject = this.f24265b;
                this.f24264a = 1;
                if (r0Var.mo60637a(jSONObject, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public C9571t1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24263a = context;
    }

    /* renamed from: a */
    public final void mo60828a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.optBoolean("session_drop_store")) {
                C9409q4.m27877m().mo61183b();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new C9572a(jSONObject, (Continuation<? super C9572a>) null), 3, (Object) null);
            C9217i0.m27369a(this.f24263a, jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("user_data");
            C9269l5.m27454a(optJSONObject);
            C9495j.m28104b().mo60750b(optJSONObject);
            if (jSONObject.has("active_segment")) {
                C9503n.m28134a(this.f24263a, jSONObject.optJSONObject("active_segment"));
            } else if (jSONObject.has("segments")) {
                C9503n.m28133a(this.f24263a, jSONObject.optJSONArray("segments"));
            }
            try {
                if (jSONObject.has("placements")) {
                    TreeMap<String, C9490g> treeMap = C9492h.f24097a;
                    C9492h.m28087a(jSONObject.optJSONArray("placements"));
                    C9492h.m28091d();
                }
            } catch (Throwable th) {
                Log.log(th);
            }
        }
    }
}
