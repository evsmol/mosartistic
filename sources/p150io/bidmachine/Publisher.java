package p150io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.bidmachine.Publisher */
public class Publisher {
    private final List<String> categories;
    private final String domain;

    /* renamed from: id */
    private final String f12781id;
    private final String name;

    private Publisher(String str, String str2, String str3, List<String> list) {
        this.f12781id = str;
        this.name = str2;
        this.domain = str3;
        this.categories = list;
    }

    /* access modifiers changed from: package-private */
    public void build(Context.App.Builder builder) {
        Context.App.Publisher.Builder newBuilder = Context.App.Publisher.newBuilder();
        String str = this.f12781id;
        if (str != null) {
            newBuilder.setId(str);
        }
        String str2 = this.name;
        if (str2 != null) {
            newBuilder.setName(str2);
        }
        String str3 = this.domain;
        if (str3 != null) {
            newBuilder.setDomain(str3);
        }
        List<String> list = this.categories;
        if (list != null) {
            newBuilder.addAllCat(list);
        }
        builder.setPub(newBuilder.build());
    }

    /* renamed from: io.bidmachine.Publisher$Builder */
    public static final class Builder {
        private List<String> categories;
        private String domain;

        /* renamed from: id */
        private String f12782id;
        private String name;

        public Builder setId(String str) {
            this.f12782id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder addCategory(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (this.categories == null) {
                this.categories = new ArrayList();
            }
            this.categories.add(str);
            return this;
        }

        public Builder addCategories(List<String> list) {
            if (list != null && !list.isEmpty()) {
                for (String addCategory : list) {
                    addCategory(addCategory);
                }
            }
            return this;
        }

        public Publisher build() {
            return new Publisher(this.f12782id, this.name, this.domain, this.categories);
        }
    }
}
