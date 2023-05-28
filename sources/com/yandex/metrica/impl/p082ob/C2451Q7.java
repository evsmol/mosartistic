package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.p151io.FilesKt;

/* renamed from: com.yandex.metrica.impl.ob.Q7 */
public final class C2451Q7 implements C2945f8 {

    /* renamed from: a */
    private final Context f6520a;

    /* renamed from: b */
    private final String f6521b;

    /* renamed from: c */
    private final C1877B0 f6522c;

    public C2451Q7(Context context, String str, C1877B0 b0) {
        this.f6520a = context;
        this.f6521b = str;
        this.f6522c = b0;
    }

    /* renamed from: a */
    public void mo16513a(String str) {
        try {
            File a = this.f6522c.mo15519a(this.f6520a, this.f6521b);
            if (a != null) {
                FilesKt.writeText$default(a, str, (Charset) null, 2, (Object) null);
            }
        } catch (FileNotFoundException unused) {
            ((C3264nh) C3322oh.m10248a()).reportEvent("vital_data_provider_write_file_not_found", (Map<String, Object>) MapsKt.mapOf(TuplesKt.m14544to("fileName", this.f6521b)));
        } catch (Throwable th) {
            C2291M0 a2 = C3322oh.m10248a();
            C3264nh nhVar = (C3264nh) a2;
            nhVar.reportEvent("vital_data_provider_write_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.m14544to("fileName", this.f6521b), TuplesKt.m14544to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
            C2291M0 a3 = C3322oh.m10248a();
            ((C3264nh) a3).reportError("Error during writing file with name " + this.f6521b, th);
        }
    }

    /* renamed from: c */
    public String mo16514c() {
        try {
            File a = this.f6522c.mo15519a(this.f6520a, this.f6521b);
            if (a != null) {
                return FilesKt.readText$default(a, (Charset) null, 1, (Object) null);
            }
            return null;
        } catch (FileNotFoundException unused) {
            ((C3264nh) C3322oh.m10248a()).reportEvent("vital_data_provider_read_file_not_found", (Map<String, Object>) MapsKt.mapOf(TuplesKt.m14544to("fileName", this.f6521b)));
            return null;
        } catch (Throwable th) {
            C2291M0 a2 = C3322oh.m10248a();
            C3264nh nhVar = (C3264nh) a2;
            nhVar.reportEvent("vital_data_provider_read_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.m14544to("fileName", this.f6521b), TuplesKt.m14544to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
            C2291M0 a3 = C3322oh.m10248a();
            ((C3264nh) a3).reportError("Error during reading file with name " + this.f6521b, th);
            return null;
        }
    }
}
