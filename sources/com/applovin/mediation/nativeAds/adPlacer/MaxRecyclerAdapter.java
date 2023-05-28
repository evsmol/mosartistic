package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.nativeAds.p250a.C8292c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import java.util.Collection;

public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MaxAdPlacer f21909a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RecyclerView.Adapter f21910b;

    /* renamed from: c */
    private final C8653a f21911c = new C8653a();

    /* renamed from: d */
    private RecyclerView f21912d;

    /* renamed from: e */
    private C8292c f21913e;

    /* renamed from: f */
    private MaxAdPlacer.Listener f21914f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f21915g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AdPositionBehavior f21916h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ViewGroup f21919a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f21919a = (ViewGroup) view.findViewById(C8656R.C8660id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f21919a;
        }
    }

    /* renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$a */
    private class C8653a extends RecyclerView.AdapterDataObserver {
        private C8653a() {
        }

        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f21909a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f21909a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        public void onItemRangeInserted(int i, int i2) {
            int i3 = 0;
            boolean z = i + i2 >= MaxRecyclerAdapter.this.f21910b.getItemCount();
            if (MaxRecyclerAdapter.this.f21916h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f21916h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f21909a.getAdjustedPosition(i);
            while (true) {
                MaxRecyclerAdapter maxRecyclerAdapter = MaxRecyclerAdapter.this;
                if (i3 < i2) {
                    maxRecyclerAdapter.f21909a.insertItem(adjustedPosition);
                    i3++;
                } else {
                    maxRecyclerAdapter.notifyItemRangeInserted(adjustedPosition, i2);
                    return;
                }
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.this.f21910b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.this.f21916h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f21916h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f21909a.getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.this.f21909a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f21909a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f21909a.getAdjustedCount(itemCount);
            int i4 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f21909a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i4 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i4 - i2), i4);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f21909a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f21910b = adapter;
        adapter.registerAdapterDataObserver(this.f21911c);
    }

    /* renamed from: a */
    private int m26329a(int i) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f21912d.getContext(), this.f21912d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.f21912d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.getSpanCount()) * gridLayoutManager.getSpanSizeLookup().getSpanSize(i);
    }

    public void destroy() {
        try {
            this.f21910b.unregisterAdapterDataObserver(this.f21911c);
        } catch (Exception unused) {
        }
        this.f21909a.destroy();
        C8292c cVar = this.f21913e;
        if (cVar != null) {
            cVar.mo56708a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f21909a;
    }

    public int getAdjustedPosition(int i) {
        return this.f21909a.getAdjustedPosition(i);
    }

    public int getItemCount() {
        return this.f21909a.getAdjustedCount(this.f21910b.getItemCount());
    }

    public long getItemId(int i) {
        if (!this.f21910b.hasStableIds()) {
            return -1;
        }
        return this.f21909a.isFilledPosition(i) ? this.f21909a.getAdItemId(i) : this.f21910b.getItemId(this.f21909a.getOriginalPosition(i));
    }

    public int getItemViewType(int i) {
        if (this.f21909a.isAdPosition(i)) {
            return -42;
        }
        return this.f21910b.getItemViewType(this.f21909a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f21909a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f21909a.loadAds();
    }

    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f21914f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f21914f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f21914f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f21914f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f21912d = recyclerView;
        C8292c cVar = new C8292c(recyclerView);
        this.f21913e = cVar;
        cVar.mo56711a((C8292c.C8295a) new C8292c.C8295a() {
            /* renamed from: a */
            public void mo56714a(int i, int i2) {
                MaxRecyclerAdapter.this.f21909a.updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.this.f21915g, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f21913e.mo56710a(viewHolder.itemView, i);
        if (this.f21909a.isAdPosition(i)) {
            AppLovinSdkUtils.Size adSize = this.f21909a.getAdSize(i, m26329a(i));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                containerView.setLayoutParams(layoutParams);
                this.f21909a.renderAd(i, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f21910b.onBindViewHolder(viewHolder, this.f21909a.getOriginalPosition(i));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f21910b.onCreateViewHolder(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C8656R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f21912d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f21912d = null;
        C8292c cVar = this.f21913e;
        if (cVar != null) {
            cVar.mo56708a();
            this.f21913e = null;
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f21910b.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f21910b.onViewAttachedToWindow(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f21910b.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C8292c cVar = this.f21913e;
        if (cVar != null) {
            cVar.mo56709a(viewHolder.itemView);
        }
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            if (this.f21909a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
            }
            super.onViewRecycled(viewHolder);
            return;
        }
        this.f21910b.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f21916h = adPositionBehavior;
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f21910b.unregisterAdapterDataObserver(this.f21911c);
        this.f21910b.setHasStableIds(z);
        this.f21910b.registerAdapterDataObserver(this.f21911c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f21914f = listener;
    }

    public void setLookAhead(int i) {
        this.f21915g = i;
    }
}
