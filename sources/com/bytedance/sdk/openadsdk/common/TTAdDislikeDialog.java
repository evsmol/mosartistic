package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0761c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.ArrayList;

public class TTAdDislikeDialog extends FrameLayout {

    /* renamed from: a */
    private View f677a;

    /* renamed from: b */
    private TTDislikeListView f678b;

    /* renamed from: c */
    private TTDislikeListView f679c;

    /* renamed from: d */
    private RelativeLayout f680d;

    /* renamed from: e */
    private View f681e;

    /* renamed from: f */
    private C0761c.C0768b f682f;

    /* renamed from: g */
    private C0761c.C0768b f683g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0477n f684h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0201a f685i;

    /* renamed from: j */
    private boolean f686j;

    /* renamed from: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a */
    public interface C0201a {
        /* renamed from: a */
        void mo38a(int i, FilterWord filterWord);

        /* renamed from: a */
        void mo39a(View view);

        /* renamed from: b */
        void mo40b(View view);

        /* renamed from: c */
        void mo41c(View view);
    }

    public TTAdDislikeDialog(Context context, C0477n nVar) {
        this(context.getApplicationContext());
        this.f684h = nVar;
        m823c();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f686j = false;
        m817a(context, attributeSet);
    }

    /* renamed from: a */
    private void m817a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.mo521b();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f677a = LayoutInflater.from(context).inflate(C10647t.m31284f(context, "tt_dislike_dialog_layout"), this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = C1002v.m4749e(getContext(), 20.0f);
        layoutParams.rightMargin = C1002v.m4749e(getContext(), 20.0f);
        this.f677a.setLayoutParams(layoutParams);
        this.f677a.setClickable(true);
        m824d();
        m823c();
    }

    /* renamed from: c */
    private void m823c() {
        if (this.f684h != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            C0761c.C0768b bVar = new C0761c.C0768b(from, this.f684h.mo1384ae());
            this.f682f = bVar;
            this.f678b.setAdapter(bVar);
            C0761c.C0768b bVar2 = new C0761c.C0768b(from, new ArrayList());
            this.f683g = bVar2;
            bVar2.mo2540a(false);
            this.f679c.setAdapter(this.f683g);
            this.f678b.setMaterialMeta(this.f684h);
            this.f679c.setMaterialMeta(this.f684h);
        }
    }

    /* renamed from: d */
    private void m824d() {
        this.f680d = (RelativeLayout) this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_dislike_title_content"));
        this.f681e = this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_dislike_header_back"));
        textView.setText(C10647t.m31276a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_dislike_header_tv"))).setText(C10647t.m31276a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.m825e();
                if (TTAdDislikeDialog.this.f685i != null) {
                    TTAdDislikeDialog.this.f685i.mo41c(view);
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_filer_words_lv"));
        this.f678b = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x0027 }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x0027 }
                    boolean r2 = r1.hasSecondOptions()     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0028
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    r2.m818a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f685i     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f685i     // Catch:{ all -> 0x0027 }
                    r2.mo38a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                L_0x0028:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f685i
                    if (r1 == 0) goto L_0x0049
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f685i     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f684h     // Catch:{ all -> 0x0049 }
                    java.util.List r2 = r2.mo1384ae()     // Catch:{ all -> 0x0049 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0049 }
                    r1.mo38a(r3, r2)     // Catch:{ all -> 0x0049 }
                L_0x0049:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo521b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C01993.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.f677a.findViewById(C10647t.m31283e(getContext(), "tt_filer_words_lv_second"));
        this.f679c = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f685i
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f685i     // Catch:{ all -> 0x001b }
                    r2.mo38a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo521b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C02004.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
    }

    /* renamed from: a */
    public void mo520a() {
        if (this.f677a.getParent() == null) {
            addView(this.f677a);
        }
        m825e();
        setVisibility(0);
        this.f686j = true;
        C0201a aVar = this.f685i;
        if (aVar != null) {
            aVar.mo39a(this);
        }
    }

    /* renamed from: b */
    public void mo521b() {
        setVisibility(8);
        this.f686j = false;
        C0201a aVar = this.f685i;
        if (aVar != null) {
            aVar.mo40b(this);
        }
    }

    public void setCallback(C0201a aVar) {
        this.f685i = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m825e() {
        RelativeLayout relativeLayout = this.f680d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f681e;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f678b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C0761c.C0768b bVar = this.f683g;
        if (bVar != null) {
            bVar.mo2538a();
        }
        TTDislikeListView tTDislikeListView2 = this.f679c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m818a(FilterWord filterWord) {
        if (filterWord != null) {
            C0761c.C0768b bVar = this.f683g;
            if (bVar != null) {
                bVar.mo2539a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f680d;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f681e;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f678b;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f679c;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }
}
