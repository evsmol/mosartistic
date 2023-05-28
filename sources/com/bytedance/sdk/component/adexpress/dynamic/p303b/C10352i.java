package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.i */
/* compiled from: DynamicPoint */
public class C10352i {

    /* renamed from: a */
    public float f25687a;

    /* renamed from: b */
    public float f25688b;

    public C10352i(float f, float f2) {
        this.f25687a = f;
        this.f25688b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10352i iVar = (C10352i) obj;
        if (Float.compare(iVar.f25687a, this.f25687a) == 0 && Float.compare(iVar.f25688b, this.f25688b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25687a), Float.valueOf(this.f25688b)});
    }
}
