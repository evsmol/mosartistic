package com.appodeal.ads;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.appodeal.ads.p0 */
public final class C9393p0 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public static final C9393p0 f23817a = new C9393p0();

    public C9393p0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        C9234j4 j4Var = C9234j4.f23194a;
        jsonObjectBuilder.hasValue("device_id", j4Var.getIfa());
        jsonObjectBuilder.hasValue("os", APSAnalytics.OS_NAME);
        jsonObjectBuilder.hasValue("sdk_version", Constants.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        jsonObjectBuilder.hasValue("os_version", str);
        jsonObjectBuilder.hasValue("osv", str);
        Context applicationContext = C9148b.f22956b.getApplicationContext();
        jsonObjectBuilder.hasValue("package_name", applicationContext.getPackageName());
        jsonObjectBuilder.hasValue("device_type", C9182f1.m27298r(applicationContext) ? "tablet" : "phone");
        jsonObjectBuilder.hasValue("connection_type", j4Var.getConnectionData(applicationContext).getType());
        jsonObjectBuilder.hasValue("user_agent", j4Var.getHttpAgent(applicationContext));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        jsonObjectBuilder.hasValue("model", format);
        return Unit.INSTANCE;
    }
}
