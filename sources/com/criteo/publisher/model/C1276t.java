package com.criteo.publisher.model;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.p074n0.C1308l;
import com.criteo.publisher.p074n0.C1310n;
import com.criteo.publisher.p074n0.C1313q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.criteo.publisher.model.t */
/* compiled from: Config */
public class C1276t {

    /* renamed from: a */
    private final C1195g f3973a;

    /* renamed from: b */
    private volatile C1284y f3974b;

    /* renamed from: c */
    private final SharedPreferences f3975c;

    /* renamed from: d */
    private final C1308l f3976d;

    /* renamed from: com.criteo.publisher.model.t$a */
    /* compiled from: Config */
    public static class C1277a {

        /* renamed from: a */
        public static final RemoteLogRecords.RemoteLogLevel f3977a = RemoteLogRecords.RemoteLogLevel.WARNING;
    }

    public C1276t() {
        this.f3973a = C1197h.m5407b(getClass());
        this.f3975c = null;
        this.f3976d = null;
        this.f3974b = C1284y.m5697a();
    }

    public C1276t(SharedPreferences sharedPreferences, C1308l lVar) {
        this.f3973a = C1197h.m5407b(getClass());
        this.f3975c = sharedPreferences;
        this.f3976d = lVar;
        this.f3974b = m5662k();
    }

    /* renamed from: k */
    private C1284y m5662k() {
        ByteArrayInputStream byteArrayInputStream;
        C1284y a = C1284y.m5697a();
        SharedPreferences sharedPreferences = this.f3975c;
        if (!(sharedPreferences == null || this.f3976d == null)) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(new C1313q(sharedPreferences).mo3662a("CriteoCachedConfig", JsonUtils.EMPTY_JSON).getBytes(Charset.forName("UTF-8")));
                C1284y yVar = (C1284y) this.f3976d.mo3659a(C1284y.class, (InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                return m5660a(a, yVar);
            } catch (IOException e) {
                this.f3973a.mo3338a("Couldn't read cached values", (Throwable) e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return a;
        throw th;
    }

    /* renamed from: a */
    private C1284y m5660a(C1284y yVar, C1284y yVar2) {
        return C1284y.m5698a((Boolean) C1310n.m5778a(yVar2.mo3515g(), yVar.mo3515g()), (String) C1310n.m5778a(yVar2.mo3512e(), yVar.mo3512e()), (String) C1310n.m5778a(yVar2.mo3511d(), yVar.mo3511d()), (String) C1310n.m5778a(yVar2.mo3509b(), yVar.mo3509b()), (String) C1310n.m5778a(yVar2.mo3510c(), yVar.mo3510c()), (Boolean) C1310n.m5778a(yVar2.mo3514f(), yVar.mo3514f()), (Boolean) C1310n.m5778a(yVar2.mo3516h(), yVar.mo3516h()), (Integer) C1310n.m5778a(yVar2.mo3518i(), yVar.mo3518i()), (Boolean) C1310n.m5778a(yVar2.mo3519j(), yVar.mo3519j()), (RemoteLogRecords.RemoteLogLevel) C1310n.m5778a(yVar2.mo3520k(), yVar.mo3520k()));
    }

    /* renamed from: b */
    public void mo3593b(C1284y yVar) {
        this.f3974b = m5660a(this.f3974b, yVar);
        m5661a(this.f3974b);
    }

    /* renamed from: a */
    private void m5661a(C1284y yVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.f3975c != null && this.f3976d != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                this.f3976d.mo3660a((Object) yVar, (OutputStream) byteArrayOutputStream);
                String str = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
                byteArrayOutputStream.close();
                SharedPreferences.Editor edit = this.f3975c.edit();
                edit.putString("CriteoCachedConfig", str);
                edit.apply();
                return;
            } catch (Exception e) {
                this.f3973a.mo3338a("Couldn't persist values", (Throwable) e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: h */
    public boolean mo3599h() {
        return ((Boolean) C1310n.m5778a(this.f3974b.mo3515g(), false)).booleanValue();
    }

    /* renamed from: g */
    public boolean mo3598g() {
        return ((Boolean) C1310n.m5778a(this.f3974b.mo3514f(), true)).booleanValue();
    }

    /* renamed from: i */
    public boolean mo3600i() {
        return ((Boolean) C1310n.m5778a(this.f3974b.mo3516h(), false)).booleanValue();
    }

    /* renamed from: e */
    public int mo3596e() {
        return ((Integer) C1310n.m5778a(this.f3974b.mo3518i(), 8000)).intValue();
    }

    /* renamed from: j */
    public boolean mo3601j() {
        return ((Boolean) C1310n.m5778a(this.f3974b.mo3519j(), true)).booleanValue();
    }

    /* renamed from: d */
    public String mo3595d() {
        return (String) C1310n.m5778a(this.f3974b.mo3512e(), "%%displayUrl%%");
    }

    /* renamed from: c */
    public String mo3594c() {
        return (String) C1310n.m5778a(this.f3974b.mo3511d(), "<html><body style='text-align:center; margin:0px; padding:0px; horizontal-align:center;'><script src=\"%%displayUrl%%\"></script></body></html>");
    }

    /* renamed from: a */
    public String mo3591a() {
        return (String) C1310n.m5778a(this.f3974b.mo3509b(), "%%adTagData%%");
    }

    /* renamed from: b */
    public String mo3592b() {
        return (String) C1310n.m5778a(this.f3974b.mo3510c(), "<html><body style='text-align:center; margin:0px; padding:0px; horizontal-align:center;'><script>%%adTagData%%</script></body></html>");
    }

    /* renamed from: f */
    public RemoteLogRecords.RemoteLogLevel mo3597f() {
        return (RemoteLogRecords.RemoteLogLevel) C1310n.m5778a(this.f3974b.mo3520k(), C1277a.f3977a);
    }
}
