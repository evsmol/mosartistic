package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C6288e0;

/* renamed from: com.adcolony.sdk.r */
class C6415r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6312h0 f13773a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f13774b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f13775c;

    /* renamed from: com.adcolony.sdk.r$a */
    class C6416a implements C6327j0 {
        C6416a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (!C6185a.m14889c() || !(C6185a.m14880a() instanceof Activity)) {
                new C6288e0.C6289a().mo50644a("Missing Activity reference, can't build AlertDialog.").mo50645a(C6288e0.f13498i);
            } else if (C6235c0.m15076b(h0Var.mo50732a(), "on_resume")) {
                C6312h0 unused = C6415r.this.f13773a = h0Var;
            } else {
                C6415r.this.m15690a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C6417b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6312h0 f13777a;

        C6417b(C6312h0 h0Var) {
            this.f13777a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C6415r.this.f13774b = null;
            dialogInterface.dismiss();
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15079b(b, "positive", true);
            boolean unused2 = C6415r.this.f13775c = false;
            this.f13777a.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C6418c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6312h0 f13779a;

        C6418c(C6312h0 h0Var) {
            this.f13779a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C6415r.this.f13774b = null;
            dialogInterface.dismiss();
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15079b(b, "positive", false);
            boolean unused2 = C6415r.this.f13775c = false;
            this.f13779a.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$d */
    class C6419d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C6312h0 f13781a;

        C6419d(C6312h0 h0Var) {
            this.f13781a = h0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C6415r.this.f13774b = null;
            boolean unused2 = C6415r.this.f13775c = false;
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15079b(b, "positive", false);
            this.f13781a.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$e */
    class C6420e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f13783a;

        C6420e(AlertDialog.Builder builder) {
            this.f13783a = builder;
        }

        public void run() {
            boolean unused = C6415r.this.f13775c = true;
            AlertDialog unused2 = C6415r.this.f13774b = this.f13783a.show();
        }
    }

    C6415r() {
        C6185a.m14886a("Alert.show", (C6327j0) new C6416a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50979c() {
        C6312h0 h0Var = this.f13773a;
        if (h0Var != null) {
            m15690a(h0Var);
            this.f13773a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50978b() {
        return this.f13775c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15690a(C6312h0 h0Var) {
        AlertDialog.Builder builder;
        Context a = C6185a.m14880a();
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder = new AlertDialog.Builder(a, 16974374);
            } else {
                builder = new AlertDialog.Builder(a, 16974126);
            }
            C6294f1 a2 = h0Var.mo50732a();
            String h = C6235c0.m15087h(a2, "message");
            String h2 = C6235c0.m15087h(a2, "title");
            String h3 = C6235c0.m15087h(a2, "positive");
            String h4 = C6235c0.m15087h(a2, "negative");
            builder.setMessage(h);
            builder.setTitle(h2);
            builder.setPositiveButton(h3, new C6417b(h0Var));
            if (!h4.equals("")) {
                builder.setNegativeButton(h4, new C6418c(h0Var));
            }
            builder.setOnCancelListener(new C6419d(h0Var));
            C6509z0.m15953b((Runnable) new C6420e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo50976a() {
        return this.f13774b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50977a(AlertDialog alertDialog) {
        this.f13774b = alertDialog;
    }
}
