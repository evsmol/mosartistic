package com.appsgeyser.sdk.configuration.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ConfigPhpSdkModel implements Parcelable {
    public static final Parcelable.Creator<ConfigPhpSdkModel> CREATOR = new Parcelable.Creator<ConfigPhpSdkModel>() {
        public ConfigPhpSdkModel createFromParcel(Parcel parcel) {
            return new ConfigPhpSdkModel(parcel);
        }

        public ConfigPhpSdkModel[] newArray(int i) {
            return new ConfigPhpSdkModel[i];
        }
    };
    private boolean active;
    private boolean activeByDefault;

    /* renamed from: id */
    private String f24836id;
    private String tag;
    private String textOfPolicy;

    public int describeContents() {
        return 0;
    }

    private ConfigPhpSdkModel(Parcel parcel) {
        boolean z = true;
        this.active = parcel.readByte() != 0;
        this.f24836id = parcel.readString();
        this.activeByDefault = parcel.readByte() == 0 ? false : z;
        this.textOfPolicy = parcel.readString();
        this.tag = parcel.readString();
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isActiveByDefault() {
        return this.activeByDefault;
    }

    public String getTextOfPolicy() {
        return this.textOfPolicy;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.active ? (byte) 1 : 0);
        parcel.writeString(this.f24836id);
        parcel.writeByte(this.activeByDefault ? (byte) 1 : 0);
        parcel.writeString(this.textOfPolicy);
        parcel.writeString(this.tag);
    }
}
