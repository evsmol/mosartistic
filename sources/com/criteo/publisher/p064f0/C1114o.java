package com.criteo.publisher.p064f0;

import android.content.Context;
import android.util.AtomicFile;
import com.criteo.publisher.p074n0.C1300g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.criteo.publisher.f0.o */
/* compiled from: MetricDirectory */
class C1114o {

    /* renamed from: a */
    private final Context f3598a;

    /* renamed from: b */
    private final C1300g f3599b;

    /* renamed from: c */
    private final C1117q f3600c;

    C1114o(Context context, C1300g gVar, C1117q qVar) {
        this.f3598a = context;
        this.f3599b = gVar;
        this.f3600c = qVar;
    }

    /* renamed from: com.criteo.publisher.f0.o$a */
    /* compiled from: MetricDirectory */
    class C1115a implements FilenameFilter {
        C1115a(C1114o oVar) {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".csm");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<File> mo3214b() {
        File[] listFiles = mo3212a().listFiles(new C1115a(this));
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo3213a(String str) {
        return new File(mo3212a(), m5167b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1090d0 mo3211a(File file) {
        return new C1090d0(m5166b(file), new AtomicFile(file), this.f3600c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo3212a() {
        return this.f3598a.getDir(this.f3599b.mo3633e(), 0);
    }

    /* renamed from: b */
    private String m5167b(String str) {
        return str + ".csm";
    }

    /* renamed from: b */
    private String m5166b(File file) {
        String name = file.getName();
        return name.substring(0, name.length() - 4);
    }
}
