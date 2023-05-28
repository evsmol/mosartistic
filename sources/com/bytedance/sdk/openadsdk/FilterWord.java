package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class FilterWord {

    /* renamed from: a */
    private String f26619a;

    /* renamed from: b */
    private String f26620b;

    /* renamed from: c */
    private boolean f26621c;

    /* renamed from: d */
    private List<FilterWord> f26622d;

    public FilterWord(String str, String str2) {
        this.f26619a = str;
        this.f26620b = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.f26619a;
    }

    public void setId(String str) {
        this.f26619a = str;
    }

    public String getName() {
        return this.f26620b;
    }

    public void setName(String str) {
        this.f26620b = str;
    }

    public boolean getIsSelected() {
        return this.f26621c;
    }

    public void setIsSelected(boolean z) {
        this.f26621c = z;
    }

    public List<FilterWord> getOptions() {
        return this.f26622d;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord != null) {
            if (this.f26622d == null) {
                this.f26622d = new ArrayList();
            }
            this.f26622d.add(filterWord);
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f26619a) && !TextUtils.isEmpty(this.f26620b);
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f26622d;
        return list != null && !list.isEmpty();
    }
}
