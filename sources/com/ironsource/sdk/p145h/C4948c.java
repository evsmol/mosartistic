package com.ironsource.sdk.p145h;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.c */
public final class C4948c extends File {
    public C4948c(String str) {
        super(str);
    }

    public C4948c(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public final JSONObject mo34689a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    public final String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }
}
