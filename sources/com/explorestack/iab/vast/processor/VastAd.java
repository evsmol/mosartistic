package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.tags.AdVerificationsExtensionTag;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new C1464a();

    /* renamed from: a */
    public VastRequest f4532a;

    /* renamed from: b */
    public final LinearCreativeTag f4533b;

    /* renamed from: c */
    public final MediaFileTag f4534c;

    /* renamed from: d */
    public ArrayList<CompanionTag> f4535d;

    /* renamed from: e */
    public ArrayList<String> f4536e;

    /* renamed from: f */
    public ArrayList<String> f4537f;

    /* renamed from: g */
    public ArrayList<String> f4538g;

    /* renamed from: h */
    public ArrayList<String> f4539h;

    /* renamed from: i */
    public EnumMap<TrackingEvent, List<String>> f4540i;

    /* renamed from: j */
    public AppodealExtensionTag f4541j;

    /* renamed from: k */
    public List<AdVerificationsExtensionTag> f4542k = new ArrayList();

    /* renamed from: com.explorestack.iab.vast.processor.VastAd$a */
    public class C1464a implements Parcelable.Creator<VastAd> {
        /* renamed from: a */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        /* renamed from: a */
        public VastAd[] newArray(int i) {
            return new VastAd[i];
        }
    }

    public VastAd(Parcel parcel) {
        this.f4533b = (LinearCreativeTag) parcel.readSerializable();
        this.f4534c = (MediaFileTag) parcel.readSerializable();
        this.f4535d = (ArrayList) parcel.readSerializable();
        this.f4536e = parcel.createStringArrayList();
        this.f4537f = parcel.createStringArrayList();
        this.f4538g = parcel.createStringArrayList();
        this.f4539h = parcel.createStringArrayList();
        this.f4540i = (EnumMap) parcel.readSerializable();
        this.f4541j = (AppodealExtensionTag) parcel.readSerializable();
        parcel.readList(this.f4542k, AdVerificationsExtensionTag.class.getClassLoader());
    }

    public VastAd(LinearCreativeTag linearCreativeTag, MediaFileTag mediaFileTag) {
        this.f4533b = linearCreativeTag;
        this.f4534c = mediaFileTag;
    }

    /* renamed from: a */
    public void mo4397a(int i) {
        VastRequest vastRequest = this.f4532a;
        if (vastRequest != null) {
            vastRequest.sendError(i);
        }
    }

    /* renamed from: a */
    public void mo4398a(AppodealExtensionTag appodealExtensionTag) {
        this.f4541j = appodealExtensionTag;
    }

    /* renamed from: a */
    public void mo4399a(ArrayList<String> arrayList) {
        this.f4538g = arrayList;
    }

    /* renamed from: a */
    public void mo4400a(EnumMap<TrackingEvent, List<String>> enumMap) {
        this.f4540i = enumMap;
    }

    /* renamed from: b */
    public void mo4401b(ArrayList<CompanionTag> arrayList) {
        this.f4535d = arrayList;
    }

    /* renamed from: c */
    public void mo4402c(ArrayList<String> arrayList) {
        this.f4537f = arrayList;
    }

    /* renamed from: d */
    public void mo4403d(ArrayList<String> arrayList) {
        this.f4536e = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public List<AdVerificationsExtensionTag> getAdVerificationsExtensionList() {
        return this.f4542k;
    }

    public AppodealExtensionTag getAppodealExtension() {
        return this.f4541j;
    }

    public CompanionTag getBanner(Context context) {
        ArrayList<CompanionTag> arrayList = this.f4535d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<CompanionTag> it = this.f4535d.iterator();
            while (it.hasNext()) {
                CompanionTag next = it.next();
                int width = next.getWidth();
                int height = next.getHeight();
                if (width > -1 && height > -1) {
                    if (Utils.isTablet(context) && width == 728 && height == 90) {
                        return next;
                    }
                    if (!Utils.isTablet(context) && width == 320 && height == 50) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public String getClickThroughUrl() {
        if (this.f4533b.getVideoClicksTag() != null) {
            return this.f4533b.getVideoClicksTag().getClickThroughUrl();
        }
        return null;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f4538g;
    }

    public CompanionTag getCompanion(int i, int i2) {
        ArrayList<CompanionTag> arrayList = this.f4535d;
        if (arrayList == null || arrayList.isEmpty()) {
            mo4397a(600);
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<CompanionTag> it = this.f4535d.iterator();
        while (it.hasNext()) {
            CompanionTag next = it.next();
            int width = next.getWidth();
            int height = next.getHeight();
            if (width > -1 && height > -1) {
                float max = ((float) Math.max(width, height)) / ((float) Math.min(width, height));
                if (Math.min(width, height) >= 250 && ((double) max) <= 2.5d && next.hasCreative()) {
                    hashMap.put(Float.valueOf(((float) width) / ((float) height)), next);
                }
            }
        }
        if (!hashMap.isEmpty()) {
            float f = ((float) i) / ((float) i2);
            Set<Float> keySet = hashMap.keySet();
            float floatValue = ((Float) keySet.iterator().next()).floatValue();
            for (Float floatValue2 : keySet) {
                float floatValue3 = floatValue2.floatValue();
                if (Math.abs(floatValue - f) > Math.abs(floatValue3 - f)) {
                    floatValue = floatValue3;
                }
            }
            return (CompanionTag) hashMap.get(Float.valueOf(floatValue));
        }
        mo4397a(600);
        return null;
    }

    public List<String> getErrorUrlList() {
        return this.f4537f;
    }

    public List<String> getImpressionUrlList() {
        return this.f4536e;
    }

    public MediaFileTag getPickedMediaFileTag() {
        return this.f4534c;
    }

    public int getSkipOffsetSec() {
        return this.f4533b.getSkipOffsetSec();
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f4540i;
    }

    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.f4539h;
    }

    public void setAdVerificationsExtensionList(List<AdVerificationsExtensionTag> list) {
        this.f4542k = list;
    }

    public void setVastRequest(VastRequest vastRequest) {
        this.f4532a = vastRequest;
    }

    public void setWrapperCompanionClickTrackingUrlList(ArrayList<String> arrayList) {
        this.f4539h = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f4533b);
        parcel.writeSerializable(this.f4534c);
        parcel.writeSerializable(this.f4535d);
        parcel.writeStringList(this.f4536e);
        parcel.writeStringList(this.f4537f);
        parcel.writeStringList(this.f4538g);
        parcel.writeStringList(this.f4539h);
        parcel.writeSerializable(this.f4540i);
        parcel.writeSerializable(this.f4541j);
        parcel.writeList(this.f4542k);
    }
}
