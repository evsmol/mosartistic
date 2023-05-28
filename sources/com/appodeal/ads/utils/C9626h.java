package com.appodeal.ads.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appodeal.ads.C9718y0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appodeal.ads.utils.h */
public final class C9626h extends ArrayAdapter<C9630k> {

    /* renamed from: d */
    public static final /* synthetic */ boolean f24397d = (!C9626h.class.desiredAssertionStatus());

    /* renamed from: a */
    public final ArrayList f24398a;

    /* renamed from: b */
    public final int f24399b;

    /* renamed from: c */
    public final C9627a f24400c = new C9627a();

    /* renamed from: com.appodeal.ads.utils.h$a */
    public class C9627a extends Filter {
        public C9627a() {
        }

        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(charSequence)) {
                arrayList.addAll(C9626h.this.f24398a);
            } else {
                Iterator it = C9626h.this.f24398a.iterator();
                while (it.hasNext()) {
                    C9630k kVar = (C9630k) it.next();
                    if (kVar.f24403b.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                        arrayList.add(kVar);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C9626h.this.setNotifyOnChange(false);
            C9626h.this.clear();
            C9626h.this.setNotifyOnChange(true);
            C9626h.this.addAll((List) filterResults.values);
        }
    }

    public C9626h(Context context, C9718y0 y0Var) {
        super(context, -1, y0Var);
        this.f24398a = new ArrayList(y0Var);
        this.f24399b = (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
    }

    public final Filter getFilter() {
        return this.f24400c;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C9630k kVar = (C9630k) getItem(i);
        if (f24397d || kVar != null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            int i2 = this.f24399b;
            linearLayout.setPadding(i2, i2, i2, i2);
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setTextSize(22.0f);
            textView.setTextColor(-1);
            textView.setText(kVar.f24403b);
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            TextView textView2 = new TextView(getContext());
            textView2.setLayoutParams(layoutParams);
            textView2.setText(Html.fromHtml("№ <b>" + kVar.f24402a + "</b>"));
            textView2.setTextSize(16.0f);
            textView2.setGravity(5);
            textView2.setTextColor(Color.parseColor("#B3ffffff"));
            textView2.setPadding(0, 0, this.f24399b, 0);
            linearLayout2.addView(textView2);
            TextView textView3 = new TextView(getContext());
            textView3.setLayoutParams(layoutParams);
            textView3.setText(Html.fromHtml("cid: <b>" + kVar.f24405d + "</b>"));
            textView3.setTextSize(16.0f);
            textView3.setTextColor(Color.parseColor("#B3ffffff"));
            textView3.setGravity(5);
            textView3.setPadding(0, 0, this.f24399b, 0);
            linearLayout2.addView(textView3);
            TextView textView4 = new TextView(getContext());
            textView4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView4.setGravity(5);
            textView4.setText(Html.fromHtml("ecpm: <b>" + new DecimalFormat("#.##").format(kVar.f24406e) + "</b>"));
            textView4.setTextSize(16.0f);
            textView4.setTextColor(Color.parseColor("#B3ffffff"));
            linearLayout2.addView(textView4);
            if (kVar.f24407f) {
                TextView textView5 = new TextView(getContext());
                textView5.setText(Html.fromHtml("<b><i>(precache)</i></b>"));
                textView5.setTextSize(16.0f);
                textView5.setGravity(5);
                textView5.setTextColor(Color.parseColor("#B3ffffff"));
                textView5.setLayoutParams(layoutParams);
                linearLayout2.addView(textView5);
                textView4.setPadding(0, 0, this.f24399b, 0);
                linearLayout.setBackgroundColor(Color.parseColor("#1A000000"));
            }
            linearLayout.addView(linearLayout2);
            return linearLayout;
        }
        throw new AssertionError();
    }
}
