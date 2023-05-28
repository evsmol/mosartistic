package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.appodeal.ads.j3 */
public final class C9233j3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23193a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9233j3(C9336b bVar) {
        super(1);
        this.f23193a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("app_key", ((C9336b.C9349e) this.f23193a).mo60496c());
        jsonObjectBuilder.hasValue("sdk", ((C9336b.C9349e) this.f23193a).mo60487E());
        jsonObjectBuilder.hasValue("os", ((C9336b.C9349e) this.f23193a).mo60513r());
        jsonObjectBuilder.hasValue("os_version", ((C9336b.C9349e) this.f23193a).mo60514s());
        jsonObjectBuilder.hasValue("osv", ((C9336b.C9349e) this.f23193a).mo60515t());
        jsonObjectBuilder.hasValue("platform", ((C9336b.C9349e) this.f23193a).mo60519w());
        jsonObjectBuilder.hasValue("android", ((C9336b.C9349e) this.f23193a).mo60494a());
        jsonObjectBuilder.hasValue("android_level", Integer.valueOf(((C9336b.C9349e) this.f23193a).mo60495b()));
        jsonObjectBuilder.hasValue("secure_android_id", ((C9336b.C9349e) this.f23193a).mo60488F());
        jsonObjectBuilder.hasValue("package", ((C9336b.C9349e) this.f23193a).mo60517u());
        jsonObjectBuilder.hasValue("package_version", ((C9336b.C9349e) this.f23193a).mo60518v());
        jsonObjectBuilder.hasValue("install_time", ((C9336b.C9349e) this.f23193a).mo60510o());
        jsonObjectBuilder.hasValue("installer", ((C9336b.C9349e) this.f23193a).mo60511p());
        jsonObjectBuilder.hasValue("framework", ((C9336b.C9349e) this.f23193a).mo60497d());
        jsonObjectBuilder.hasValue("framework_version", ((C9336b.C9349e) this.f23193a).mo60498e());
        jsonObjectBuilder.hasValue("plugins_version", ((C9336b.C9349e) this.f23193a).mo60500f());
        jsonObjectBuilder.hasValue("pxratio", Double.valueOf(((C9336b.C9349e) this.f23193a).mo60485C()));
        jsonObjectBuilder.hasValue("device_type", ((C9336b.C9349e) this.f23193a).mo60507l());
        jsonObjectBuilder.hasValue("http_allowed", Boolean.valueOf(((C9336b.C9349e) this.f23193a).mo60509n()));
        jsonObjectBuilder.hasValue("manufacturer", ((C9336b.C9349e) this.f23193a).mo60512q());
        jsonObjectBuilder.hasValue("model", ((C9336b.C9349e) this.f23193a).mo60506k());
        jsonObjectBuilder.hasValue("rooted", Boolean.valueOf(((C9336b.C9349e) this.f23193a).mo60483A()));
        jsonObjectBuilder.hasValue("webview_version", ((C9336b.C9349e) this.f23193a).mo60493K());
        jsonObjectBuilder.hasValue(IabUtils.KEY_WIDTH, Integer.valueOf(((C9336b.C9349e) this.f23193a).mo60486D()));
        jsonObjectBuilder.hasValue(IabUtils.KEY_HEIGHT, Integer.valueOf(((C9336b.C9349e) this.f23193a).mo60484B()));
        jsonObjectBuilder.hasValue("crr", ((C9336b.C9349e) this.f23193a).mo60505j());
        jsonObjectBuilder.hasValue("battery", Double.valueOf(((C9336b.C9349e) this.f23193a).mo60501g()));
        jsonObjectBuilder.hasValue("storage_size", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60490H()));
        jsonObjectBuilder.hasValue("storage_free", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60489G()));
        jsonObjectBuilder.hasValue("storage_used", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60491I()));
        jsonObjectBuilder.hasValue("ram_size", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60521y()));
        jsonObjectBuilder.hasValue("ram_free", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60520x()));
        jsonObjectBuilder.hasValue("ram_used", Long.valueOf(((C9336b.C9349e) this.f23193a).mo60522z()));
        jsonObjectBuilder.hasValue("cpu_usage", Double.valueOf(((C9336b.C9349e) this.f23193a).mo60504i()));
        jsonObjectBuilder.hasValue("coppa", Boolean.valueOf(((C9336b.C9349e) this.f23193a).mo60502h()));
        jsonObjectBuilder.hasValue("test", ((C9336b.C9349e) this.f23193a).mo60492J());
        jsonObjectBuilder.hasObject("ext", ((C9336b.C9349e) this.f23193a).mo60508m());
        return Unit.INSTANCE;
    }
}
