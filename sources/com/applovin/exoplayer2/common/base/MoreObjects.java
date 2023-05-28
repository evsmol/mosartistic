package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final C7097a holderHead;
        private C7097a holderTail;
        private boolean omitNullValues;

        /* renamed from: com.applovin.exoplayer2.common.base.MoreObjects$ToStringHelper$a */
        private static final class C7097a {
            @NullableDecl

            /* renamed from: a */
            String f15602a;
            @NullableDecl

            /* renamed from: b */
            Object f15603b;
            @NullableDecl

            /* renamed from: c */
            C7097a f15604c;

            private C7097a() {
            }
        }

        private ToStringHelper(String str) {
            C7097a aVar = new C7097a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private C7097a addHolder() {
            C7097a aVar = new C7097a();
            this.holderTail.f15604c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f15603b = obj;
            return this;
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            C7097a addHolder = addHolder();
            addHolder.f15603b = obj;
            addHolder.f15602a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, char c) {
            return addHolder(str, String.valueOf(c));
        }

        public ToStringHelper add(String str, double d) {
            return addHolder(str, String.valueOf(d));
        }

        public ToStringHelper add(String str, float f) {
            return addHolder(str, String.valueOf(f));
        }

        public ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        public ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }

        public ToStringHelper addValue(char c) {
            return addHolder(String.valueOf(c));
        }

        public ToStringHelper addValue(double d) {
            return addHolder(String.valueOf(d));
        }

        public ToStringHelper addValue(float f) {
            return addHolder(String.valueOf(f));
        }

        public ToStringHelper addValue(int i) {
            return addHolder(String.valueOf(i));
        }

        public ToStringHelper addValue(long j) {
            return addHolder(String.valueOf(j));
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (C7097a aVar = this.holderHead.f15604c; aVar != null; aVar = aVar.f15604c) {
                Object obj = aVar.f15603b;
                if (!z || obj != null) {
                    sb.append(str);
                    if (aVar.f15602a != null) {
                        sb.append(aVar.f15602a);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
