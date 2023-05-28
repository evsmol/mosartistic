package com.appsgeyser.sdk.inapp.models;

public class BillingProduct {
    private String description;

    /* renamed from: id */
    private String f24837id;
    private boolean isPurchased;
    private String price;
    private String title;

    public BillingProduct(String str, String str2, String str3, String str4, boolean z) {
        this.price = str;
        this.f24837id = str2;
        this.title = str3;
        this.description = str4;
        this.isPurchased = z;
    }

    public String getPrice() {
        return this.price;
    }

    public String getId() {
        return this.f24837id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isPurchased() {
        return this.isPurchased;
    }

    public String toString() {
        return "BillingProduct{price='" + this.price + '\'' + ", id='" + this.f24837id + '\'' + ", title='" + this.title + '\'' + ", description='" + this.description + '\'' + ", isPurchased=" + this.isPurchased + '}';
    }
}
