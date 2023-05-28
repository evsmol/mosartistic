package com.apm.insight.p173g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C6594a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p166b.C6564g;
import com.apm.insight.p166b.C6581k;
import com.apm.insight.p167c.C6584b;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6689r;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6751k;
import com.apm.insight.runtime.p179a.C6720b;
import com.apm.insight.runtime.p179a.C6723c;
import com.apm.insight.runtime.p179a.C6729f;
import com.appnext.base.p264b.C8849c;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g.d */
public class C6614d implements C6613c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f14202a;

    public C6614d(Context context) {
        this.f14202a = context;
    }

    /* renamed from: a */
    public static int m16289a() {
        return 6;
    }

    /* renamed from: a */
    public void mo52106a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        final String str3 = str;
        final File file2 = new File(C6685o.m16585a(this.f14202a), str3);
        C6608a.m16263a().mo52096a(file2.getName());
        file2.mkdirs();
        C6675i.m16546f(file2);
        final boolean c = C6693v.m16679c(th);
        final Throwable th2 = th;
        final long j2 = j;
        final String str4 = str2;
        final boolean z2 = z;
        final Thread thread2 = thread;
        C6594a a = C6729f.m16893a().mo52279a(CrashType.JAVA, (C6594a) null, new C6723c.C6724a() {

            /* renamed from: a */
            long f14203a = 0;

            /* renamed from: a */
            public C6594a mo52108a(int i, C6594a aVar) {
                String valueOf;
                String str;
                Object b;
                String str2;
                this.f14203a = SystemClock.uptimeMillis();
                if (i != 0) {
                    if (i == 1) {
                        Thread thread = thread2;
                        aVar.mo52052a("crash_thread_name", (Object) thread != null ? thread.getName() : "");
                        aVar.mo52052a("tid", (Object) Integer.valueOf(Process.myTid()));
                        String str3 = "true";
                        aVar.mo52047a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? str3 : "false");
                        if (!NativeImpl.m16718d()) {
                            str3 = "false";
                        }
                        aVar.mo52047a("crash_after_native", str3);
                        C6608a.m16263a().mo52097a(thread2, th2, false, aVar);
                    } else if (i != 2) {
                        if (i == 3) {
                            JSONObject b2 = C6693v.m16674b(Thread.currentThread().getName());
                            if (b2 != null) {
                                aVar.mo52052a("all_thread_stacks", (Object) b2);
                            }
                            b = C6751k.m16959b(C6617h.m16312f());
                            str2 = "logcat";
                        } else if (i != 4) {
                            if (i == 5) {
                                b = str3;
                                str2 = "crash_uuid";
                            }
                        } else if (!c) {
                            C6662a.m16473a(C6614d.this.f14202a, aVar.mo52066h());
                        }
                        aVar.mo52052a(str2, b);
                    } else {
                        if (c) {
                            C6662a.m16473a(C6614d.this.f14202a, aVar.mo52066h());
                        }
                        JSONArray c = C6564g.m16055b().mo52003c();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a = C6564g.m16055b().mo52000a(uptimeMillis).mo52008a();
                        JSONArray a2 = C6581k.m16106a(100, uptimeMillis);
                        aVar.mo52052a("history_message", (Object) c);
                        aVar.mo52052a("current_message", (Object) a);
                        aVar.mo52052a("pending_messages", (Object) a2);
                        aVar.mo52047a("disable_looper_monitor", String.valueOf(C6718a.m16802d()));
                        valueOf = String.valueOf(C6584b.m16115a());
                        str = "npth_force_apm_crash";
                    }
                    return aVar;
                }
                aVar.mo52052a(C8849c.DATA, (Object) C6693v.m16658a(th2));
                aVar.mo52052a("isOOM", (Object) Boolean.valueOf(c));
                aVar.mo52052a("isJava", (Object) 1);
                aVar.mo52052a("crash_time", (Object) Long.valueOf(j2));
                aVar.mo52052a("launch_mode", (Object) Integer.valueOf(C6720b.m16824b()));
                aVar.mo52052a("launch_time", (Object) Long.valueOf(C6720b.m16829c()));
                String str4 = str4;
                if (str4 != null) {
                    aVar.mo52052a("crash_md5", (Object) str4);
                    aVar.mo52047a("crash_md5", str4);
                    boolean z = z2;
                    if (z) {
                        valueOf = String.valueOf(z);
                        str = "has_ignore";
                    }
                }
                return aVar;
                aVar.mo52047a(str, valueOf);
                return aVar;
            }

            /* renamed from: a */
            public C6594a mo52109a(int i, C6594a aVar, boolean z) {
                if (C6689r.m16637a(C6689r.m16638b(i))) {
                    return aVar;
                }
                try {
                    File file = file2;
                    C6675i.m16527a(new File(file, file2.getName() + "." + i), aVar.mo52066h(), false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }

            /* renamed from: a */
            public void mo52110a(Throwable th) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a.mo52047a("crash_type", "normal");
            a.mo52054b("crash_cost", String.valueOf(currentTimeMillis));
            a.mo52047a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th3);
        }
        if (!C6689r.m16637a(4)) {
            boolean a2 = C6689r.m16637a(2048);
        }
    }

    /* renamed from: a */
    public boolean mo52107a(Throwable th) {
        return true;
    }
}
