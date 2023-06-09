package com.criteo.publisher.model;

import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\b\u0018\u0000B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0003R\u0019\u0010\u0005\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0016\u0010\u0003¨\u0006\u0019"}, mo38199d2 = {"Lcom/criteo/publisher/model/AdSize;", "", "component1", "()I", "component2", "width", "height", "copy", "(II)Lcom/criteo/publisher/model/AdSize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "getFormattedSize", "formattedSize", "I", "getHeight", "getWidth", "<init>", "(II)V", "publisher-sdk_release"}, mo38200k = 1, mo38201mv = {1, 1, 15}, mo38202pn = "", mo38203xi = 0, mo38204xs = "")
/* compiled from: AdSize.kt */
public final class AdSize {
    private final int height;
    private final int width;

    public static /* synthetic */ AdSize copy$default(AdSize adSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = adSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = adSize.height;
        }
        return adSize.copy(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final AdSize copy(int i, int i2) {
        return new AdSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.width == adSize.width && this.height == adSize.height;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return "AdSize(width=" + this.width + ", height=" + this.height + ")";
    }

    public AdSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String getFormattedSize() {
        return String.valueOf(this.width) + "x" + this.height;
    }
}
