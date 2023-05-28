package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.c */
/* compiled from: TTDislikeDialogDefault */
public class C0761c extends TTDislikeDialogAbstract {

    /* renamed from: a */
    private TTDislikeListView f2922a;

    /* renamed from: b */
    private TTDislikeListView f2923b;

    /* renamed from: c */
    private RelativeLayout f2924c;

    /* renamed from: d */
    private View f2925d;

    /* renamed from: e */
    private C0768b f2926e;

    /* renamed from: f */
    private C0768b f2927f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0477n f2928g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0767a f2929h;

    /* renamed from: i */
    private String f2930i;

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$a */
    /* compiled from: TTDislikeDialogDefault */
    public interface C0767a {
        /* renamed from: a */
        void mo2521a();

        /* renamed from: a */
        void mo2522a(int i, FilterWord filterWord);

        /* renamed from: b */
        void mo2523b();

        /* renamed from: c */
        void mo2524c();
    }

    public C0761c(Context context, C0477n nVar) {
        super(context, C10647t.m31285g(context, "tt_dislikeDialog"));
        this.f2928g = nVar;
    }

    /* renamed from: a */
    public void mo2525a(C0477n nVar) {
        C0768b bVar = this.f2926e;
        if (bVar != null && nVar != null) {
            this.f2928g = nVar;
            bVar.mo2539a(nVar.mo1384ae());
            setMaterialMeta(this.f2928g);
        }
    }

    /* renamed from: a */
    public void mo2526a(C0767a aVar) {
        this.f2929h = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        m3863a();
        m3864a(getContext());
        m3867b();
        setMaterialMeta(this.f2928g);
    }

    /* renamed from: a */
    public void mo2527a(String str) {
        this.f2930i = str;
    }

    public int getLayoutId() {
        return C10647t.m31284f(getContext(), "tt_dislike_dialog_layout");
    }

    public int[] getTTDislikeListViewIds() {
        return new int[]{C10647t.m31283e(getContext(), "tt_filer_words_lv"), C10647t.m31283e(getContext(), "tt_filer_words_lv_second")};
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(C1002v.m4740c(getContext()) - 120, -2);
    }

    public void show() {
        super.show();
        m3870c();
    }

    /* renamed from: a */
    private void m3863a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: b */
    private void m3867b() {
        setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (C0761c.this.f2929h != null) {
                    C0761c.this.f2929h.mo2521a();
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                if (C0761c.this.f2929h != null) {
                    C0761c.this.f2929h.mo2523b();
                }
            }
        });
        C0768b bVar = new C0768b(getLayoutInflater(), this.f2928g.mo1384ae());
        this.f2926e = bVar;
        this.f2922a.setAdapter(bVar);
        C0768b bVar2 = new C0768b(getLayoutInflater(), new ArrayList());
        this.f2927f = bVar2;
        bVar2.mo2540a(false);
        this.f2923b.setAdapter(this.f2927f);
    }

    /* renamed from: a */
    private void m3864a(Context context) {
        this.f2924c = (RelativeLayout) findViewById(C10647t.m31283e(getContext(), "tt_dislike_title_content"));
        this.f2925d = findViewById(C10647t.m31283e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) findViewById(C10647t.m31283e(getContext(), "tt_dislike_header_back"));
        textView.setText(C10647t.m31276a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_dislike_header_tv"))).setText(C10647t.m31276a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0761c.this.m3870c();
                if (C0761c.this.f2929h != null) {
                    C0761c.this.f2929h.mo2524c();
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(C10647t.m31283e(getContext(), "tt_filer_words_lv"));
        this.f2922a = tTDislikeListView;
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
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x0027 }
                    r2.m3865a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f2929h     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f2929h     // Catch:{ all -> 0x0027 }
                    r2.mo2522a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                L_0x0028:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C0761c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f2929h
                    if (r1 == 0) goto L_0x0049
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f2929h     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f2928g     // Catch:{ all -> 0x0049 }
                    java.util.List r2 = r2.mo1384ae()     // Catch:{ all -> 0x0049 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0049 }
                    r1.mo2522a(r3, r2)     // Catch:{ all -> 0x0049 }
                L_0x0049:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C0761c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C0761c.C07654.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f2922a.setClosedListenerKey(this.f2930i);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(C10647t.m31283e(getContext(), "tt_filer_words_lv_second"));
        this.f2923b = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f2929h
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C0761c.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f2929h     // Catch:{ all -> 0x001b }
                    r2.mo2522a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C0761c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C0761c.C07665.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f2923b.setClosedListenerKey(this.f2930i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3870c() {
        RelativeLayout relativeLayout = this.f2924c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f2925d;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f2922a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C0768b bVar = this.f2927f;
        if (bVar != null) {
            bVar.mo2538a();
        }
        TTDislikeListView tTDislikeListView2 = this.f2923b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3865a(FilterWord filterWord) {
        if (filterWord != null) {
            C0768b bVar = this.f2927f;
            if (bVar != null) {
                bVar.mo2539a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f2924c;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f2925d;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f2922a;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f2923b;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b */
    /* compiled from: TTDislikeDialogDefault */
    public static class C0768b extends BaseAdapter {

        /* renamed from: a */
        private boolean f2936a = true;

        /* renamed from: b */
        private final List<FilterWord> f2937b;

        /* renamed from: c */
        private final LayoutInflater f2938c;

        public long getItemId(int i) {
            return (long) i;
        }

        public C0768b(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.f2937b = list;
            this.f2938c = layoutInflater;
        }

        /* renamed from: a */
        public void mo2540a(boolean z) {
            this.f2936a = z;
        }

        public int getCount() {
            List<FilterWord> list = this.f2937b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f2937b.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C0769a aVar;
            if (view == null) {
                aVar = new C0769a();
                LayoutInflater layoutInflater = this.f2938c;
                view2 = layoutInflater.inflate(C10647t.m31284f(layoutInflater.getContext(), "tt_dialog_listview_item"), viewGroup, false);
                aVar.f2939a = (TextView) view2.findViewById(C10647t.m31283e(this.f2938c.getContext(), "tt_item_tv"));
                aVar.f2940b = (ImageView) view2.findViewById(C10647t.m31283e(this.f2938c.getContext(), "tt_item_arrow"));
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C0769a) view.getTag();
            }
            FilterWord filterWord = this.f2937b.get(i);
            aVar.f2939a.setText(filterWord.getName());
            if (i != this.f2937b.size() - 1) {
                aVar.f2939a.setBackgroundResource(C10647t.m31282d(this.f2938c.getContext(), "tt_dislike_middle_seletor"));
            } else {
                aVar.f2939a.setBackgroundResource(C10647t.m31282d(this.f2938c.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.f2936a && i == 0) {
                aVar.f2939a.setBackgroundResource(C10647t.m31282d(this.f2938c.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                aVar.f2940b.setVisibility(0);
            } else {
                aVar.f2940b.setVisibility(8);
            }
            return view2;
        }

        /* renamed from: a */
        public void mo2539a(List<FilterWord> list) {
            if (list != null && !list.isEmpty()) {
                this.f2937b.clear();
                this.f2937b.addAll(list);
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo2538a() {
            this.f2937b.clear();
            notifyDataSetChanged();
        }

        /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b$a */
        /* compiled from: TTDislikeDialogDefault */
        private static class C0769a {

            /* renamed from: a */
            TextView f2939a;

            /* renamed from: b */
            ImageView f2940b;

            private C0769a() {
            }
        }
    }
}
