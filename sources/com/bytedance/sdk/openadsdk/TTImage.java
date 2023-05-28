package com.bytedance.sdk.openadsdk;

public class TTImage {

    /* renamed from: a */
    private int f26698a;

    /* renamed from: b */
    private int f26699b;

    /* renamed from: c */
    private String f26700c;

    /* renamed from: d */
    private double f26701d;

    public TTImage(int i, int i2, String str, double d) {
        this.f26701d = 0.0d;
        this.f26698a = i;
        this.f26699b = i2;
        this.f26700c = str;
        this.f26701d = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }

    public int getHeight() {
        return this.f26698a;
    }

    public int getWidth() {
        return this.f26699b;
    }

    public String getImageUrl() {
        return this.f26700c;
    }

    public double getDuration() {
        return this.f26701d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r1.f26700c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
            r1 = this;
            int r0 = r1.f26698a
            if (r0 <= 0) goto L_0x0014
            int r0 = r1.f26699b
            if (r0 <= 0) goto L_0x0014
            java.lang.String r0 = r1.f26700c
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTImage.isValid():boolean");
    }
}
