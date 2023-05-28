package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.p080io.FileUtils;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n7 */
public class C3250n7 implements C2915e7<File> {

    /* renamed from: a */
    private final Context f8418a;

    /* renamed from: b */
    private final File f8419b;

    /* renamed from: c */
    private final C2861c9 f8420c;

    /* renamed from: d */
    private final C1877B0 f8421d;

    /* renamed from: e */
    private final C3052i7 f8422e;

    /* renamed from: f */
    private final C2944f7<String> f8423f;

    /* renamed from: g */
    private final ICommonExecutor f8424g;

    /* renamed from: com.yandex.metrica.impl.ob.n7$a */
    static class C3251a implements C3240mm<File> {
        C3251a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            ((File) obj).delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$b */
    static class C3252b implements C3240mm<String> {

        /* renamed from: a */
        private final C2944f7<String> f8425a;

        C3252b(C2944f7<String> f7Var) {
            this.f8425a = f7Var;
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f8425a.mo17576b(str);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$c */
    static class C3253c implements C3240mm<String> {

        /* renamed from: a */
        private final C2944f7<String> f8426a;

        C3253c(C2944f7<String> f7Var) {
            this.f8426a = f7Var;
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f8426a.mo17575a(str);
            }
        }
    }

    public C3250n7(Context context, C1877B0 b0, C3052i7 i7Var, C2944f7<String> f7Var, ICommonExecutor iCommonExecutor, C2861c9 c9Var) {
        this.f8418a = context;
        this.f8421d = b0;
        this.f8419b = b0.mo15521b(context);
        this.f8422e = i7Var;
        this.f8423f = f7Var;
        this.f8424g = iCommonExecutor;
        this.f8420c = c9Var;
    }

    /* renamed from: a */
    public void mo17498a(Object obj) {
        this.f8424g.execute(new C3496t6((File) obj, this.f8422e, new C3251a(), new C3252b(this.f8423f)));
    }

    /* renamed from: a */
    public synchronized void mo17497a() {
        File b;
        if (FileUtils.needToUseNoBackup() && (b = this.f8421d.mo15522b(this.f8418a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (!this.f8420c.mo17404o()) {
                m10128a(b);
                this.f8420c.mo17405p();
            } else if (b.exists()) {
                try {
                    b.delete();
                } catch (Throwable unused) {
                }
            }
        }
        m10128a(this.f8419b);
    }

    /* renamed from: a */
    private void m10128a(File file) {
        File[] fileArr;
        if (file == null || !file.exists()) {
            fileArr = new File[0];
        } else {
            fileArr = file.listFiles(new C3203m7(this));
            if (fileArr == null) {
                fileArr = new File[0];
            }
        }
        for (File t6Var : fileArr) {
            this.f8424g.execute(new C3496t6(t6Var, this.f8422e, new C3251a(), new C3253c(this.f8423f)));
        }
    }
}
