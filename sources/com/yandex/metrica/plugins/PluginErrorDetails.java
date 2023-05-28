package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.p082ob.C1848A2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginErrorDetails {

    /* renamed from: a */
    private final String f9715a;

    /* renamed from: b */
    private final String f9716b;

    /* renamed from: c */
    private final List<StackTraceItem> f9717c;

    /* renamed from: d */
    private final String f9718d;

    /* renamed from: e */
    private final String f9719e;

    /* renamed from: f */
    private final Map<String, String> f9720f;

    public static class Builder {

        /* renamed from: a */
        private String f9721a;

        /* renamed from: b */
        private String f9722b;

        /* renamed from: c */
        private List<StackTraceItem> f9723c;

        /* renamed from: d */
        private String f9724d;

        /* renamed from: e */
        private String f9725e;

        /* renamed from: f */
        private Map<String, String> f9726f;

        public PluginErrorDetails build() {
            String str = this.f9721a;
            String str2 = this.f9722b;
            List<StackTraceItem> list = this.f9723c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f9724d;
            String str4 = this.f9725e;
            Map<String, String> map = this.f9726f;
            Map<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, hashMap);
        }

        public Builder withExceptionClass(String str) {
            this.f9721a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f9722b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f9724d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f9726f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f9723c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f9725e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public String getExceptionClass() {
        return this.f9715a;
    }

    public String getMessage() {
        return this.f9716b;
    }

    public String getPlatform() {
        return this.f9718d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f9720f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f9717c;
    }

    public String getVirtualMachineVersion() {
        return this.f9719e;
    }

    private PluginErrorDetails(String str, String str2, List<StackTraceItem> list, String str3, String str4, Map<String, String> map) {
        this.f9715a = str;
        this.f9716b = str2;
        this.f9717c = new ArrayList(list);
        this.f9718d = str3;
        this.f9719e = str4;
        this.f9720f = C1848A2.m6803a(C1848A2.m6801a(map));
    }
}
