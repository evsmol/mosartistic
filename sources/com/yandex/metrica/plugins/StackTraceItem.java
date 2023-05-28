package com.yandex.metrica.plugins;

public class StackTraceItem {

    /* renamed from: a */
    private final String f9727a;

    /* renamed from: b */
    private final String f9728b;

    /* renamed from: c */
    private final Integer f9729c;

    /* renamed from: d */
    private final Integer f9730d;

    /* renamed from: e */
    private final String f9731e;

    public static class Builder {

        /* renamed from: a */
        private String f9732a;

        /* renamed from: b */
        private String f9733b;

        /* renamed from: c */
        private Integer f9734c;

        /* renamed from: d */
        private Integer f9735d;

        /* renamed from: e */
        private String f9736e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f9732a, this.f9733b, this.f9734c, this.f9735d, this.f9736e);
        }

        public Builder withClassName(String str) {
            this.f9732a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f9735d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f9733b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f9734c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f9736e = str;
            return this;
        }
    }

    public String getClassName() {
        return this.f9727a;
    }

    public Integer getColumn() {
        return this.f9730d;
    }

    public String getFileName() {
        return this.f9728b;
    }

    public Integer getLine() {
        return this.f9729c;
    }

    public String getMethodName() {
        return this.f9731e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f9727a = str;
        this.f9728b = str2;
        this.f9729c = num;
        this.f9730d = num2;
        this.f9731e = str3;
    }
}
