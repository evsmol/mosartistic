package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.appsetid.b */
public final class C10701b implements C10704d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f26787a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<OnCompleteListener<AppSetIdInfo>> f26788b = new ArrayList();

    /* renamed from: com.yandex.metrica.appsetid.b$a */
    public static final class C10702a implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a */
        final /* synthetic */ C10701b f26789a;

        /* renamed from: b */
        final /* synthetic */ C10700a f26790b;

        C10702a(C10701b bVar, C10700a aVar) {
            this.f26789a = bVar;
            this.f26790b = aVar;
        }

        public void onComplete(Task<AppSetIdInfo> task) {
            C10703c cVar;
            synchronized (this.f26789a.f26787a) {
                this.f26789a.f26788b.remove(this);
            }
            if (task.isSuccessful()) {
                C10700a aVar = this.f26790b;
                AppSetIdInfo result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "completedTask.result");
                String id = result.getId();
                C10701b bVar = this.f26789a;
                AppSetIdInfo result2 = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result2, "completedTask.result");
                int scope = result2.getScope();
                bVar.getClass();
                if (scope == 1) {
                    cVar = C10703c.APP;
                } else if (scope != 2) {
                    cVar = C10703c.UNKNOWN;
                } else {
                    cVar = C10703c.DEVELOPER;
                }
                aVar.mo15552a(id, cVar);
                return;
            }
            this.f26790b.mo15553a(task.getException());
        }
    }

    /* renamed from: a */
    public void mo15628a(Context context, C10700a aVar) throws Throwable {
        AppSetIdClient client = AppSet.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "AppSet.getClient(context)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
        C10702a aVar2 = new C10702a(this, aVar);
        synchronized (this.f26787a) {
            this.f26788b.add(aVar2);
        }
        appSetIdInfo.addOnCompleteListener(aVar2);
    }
}
