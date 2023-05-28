package com.appodeal.consent.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appodeal.consent.internal.C9757d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/consent/view/ConsentActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class ConsentActivity extends Activity {

    /* renamed from: b */
    public static Function1<? super Activity, Unit> f24807b;

    /* renamed from: c */
    public static Function1<? super Activity, Unit> f24808c;

    /* renamed from: d */
    public static boolean f24809d;

    /* renamed from: e */
    public static C9784b f24810e;

    /* renamed from: a */
    public RelativeLayout f24811a;

    /* renamed from: com.appodeal.consent.view.ConsentActivity$a */
    public static final class C9782a {
        /* renamed from: a */
        public static boolean m28617a() {
            return ConsentActivity.f24809d;
        }

        /* renamed from: b */
        public static void m28618b() {
            ConsentActivity.f24809d = false;
        }

        /* renamed from: a */
        public static void m28615a(C9757d.C9763f.C9765b bVar) {
            ConsentActivity.f24808c = bVar;
        }

        /* renamed from: a */
        public static void m28614a(C9757d.C9763f.C9764a aVar) {
            ConsentActivity.f24807b = aVar;
        }

        /* renamed from: a */
        public static void m28616a(C9784b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "consentWebView");
            ConsentActivity.f24810e = bVar;
            Context applicationContext = bVar.getContext().getApplicationContext();
            if (!ConsentActivity.f24809d) {
                ConsentActivity.f24809d = true;
                Intent intent = new Intent(applicationContext, ConsentActivity.class);
                intent.addFlags(276824064);
                applicationContext.startActivity(intent);
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        C9784b bVar = f24810e;
        if (bVar == null) {
            Function1<? super Activity, Unit> function1 = f24808c;
            if (function1 != null) {
                function1.invoke(this);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(bVar);
        relativeLayout.addView(bVar.getCloseButton());
        this.f24811a = relativeLayout;
        setContentView(relativeLayout, layoutParams);
        getWindow().setLayout(-1, -1);
        Function1<? super Activity, Unit> function12 = f24807b;
        if (function12 != null) {
            function12.invoke(this);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f24809d = false;
        RelativeLayout relativeLayout = this.f24811a;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        Function1<? super Activity, Unit> function1 = f24808c;
        if (function1 != null) {
            function1.invoke(this);
        }
    }
}
