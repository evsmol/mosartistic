package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import com.yandex.metrica.networktasks.impl.C3761b;
import java.util.ArrayList;
import java.util.List;

public class FullUrlFormer {

    /* renamed from: a */
    private List f9659a = new ArrayList();

    /* renamed from: b */
    private int f9660b = -1;

    /* renamed from: c */
    private String f9661c;

    /* renamed from: d */
    private final IParamsAppender f9662d;

    /* renamed from: e */
    private final ConfigProvider f9663e;

    public FullUrlFormer(IParamsAppender iParamsAppender, ConfigProvider configProvider) {
        this.f9662d = iParamsAppender;
        this.f9663e = configProvider;
    }

    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f9659a.get(this.f9660b)).buildUpon();
        this.f9662d.appendParams(buildUpon, this.f9663e.getConfig());
        this.f9661c = buildUpon.build().toString();
    }

    public List getAllHosts() {
        return this.f9659a;
    }

    public String getUrl() {
        return new C3761b(this.f9661c).mo18594a();
    }

    public boolean hasMoreHosts() {
        return this.f9660b + 1 < this.f9659a.size();
    }

    public void incrementAttemptNumber() {
        this.f9660b++;
    }

    public void setHosts(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f9659a = list;
    }
}
