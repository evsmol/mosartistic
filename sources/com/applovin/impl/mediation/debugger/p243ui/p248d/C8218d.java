package com.applovin.impl.mediation.debugger.p243ui.p248d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.d */
public abstract class C8218d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    private List<C8214c> f20155a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, Integer> f20156b = CollectionUtils.map();
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public Context f20157c;

    /* renamed from: d */
    private C8220a f20158d;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.d$a */
    public interface C8220a {
        /* renamed from: a */
        void mo55474a(C8212a aVar, C8214c cVar);
    }

    protected C8218d(Context context) {
        this.f20157c = context.getApplicationContext();
    }

    /* renamed from: e */
    private C8212a m24697e(int i) {
        for (int i2 = 0; i2 < mo55488e(); i2++) {
            Integer num = this.f20156b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo55480a(i2)) {
                    return new C8212a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo55480a(int i);

    /* renamed from: a */
    public void mo56498a(C8220a aVar) {
        this.f20158d = aVar;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C8214c mo55483b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C8214c> mo55486c(int i);

    /* renamed from: d */
    public C8214c getItem(int i) {
        return this.f20155a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo55488e();

    public int getCount() {
        return this.f20155a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return getItem(i).mo56476i();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C8213b bVar;
        C8214c d = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(d.mo56477j(), viewGroup, false);
            bVar = new C8213b();
            bVar.f20115a = (TextView) view.findViewById(16908308);
            bVar.f20116b = (TextView) view.findViewById(16908309);
            bVar.f20117c = (ImageView) view.findViewById(C8656R.C8660id.imageView);
            bVar.f20118d = (ImageView) view.findViewById(C8656R.C8660id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (C8213b) view.getTag();
        }
        bVar.mo56473a(i);
        bVar.mo56474a(d);
        view.setEnabled(d.mo55479c());
        return view;
    }

    public int getViewTypeCount() {
        return C8214c.m24666h();
    }

    public boolean isEnabled(int i) {
        return getItem(i).mo55479c();
    }

    /* renamed from: n */
    public void mo56508n() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C8218d.this.notifyDataSetChanged();
            }
        });
    }

    public void notifyDataSetChanged() {
        int i;
        super.notifyDataSetChanged();
        this.f20155a = new ArrayList();
        int e = mo55488e();
        this.f20156b = CollectionUtils.map(e);
        C8214c o = mo56510o();
        if (o != null) {
            this.f20155a.add(o);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < e; i2++) {
            int a = mo55480a(i2);
            if (a != 0) {
                this.f20155a.add(mo55483b(i2));
                this.f20155a.addAll(mo55486c(i2));
                this.f20156b.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += a + 1;
            }
        }
        this.f20155a.add(new C8221e(""));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C8214c mo56510o() {
        return null;
    }

    public void onClick(View view) {
        C8213b bVar = (C8213b) view.getTag();
        C8214c b = bVar.mo56475b();
        C8212a e = m24697e(bVar.mo56472a());
        C8220a aVar = this.f20158d;
        if (aVar != null && e != null) {
            aVar.mo55474a(e, b);
        }
    }
}
