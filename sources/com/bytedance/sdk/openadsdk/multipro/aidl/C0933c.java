package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.c */
/* compiled from: MapCursor */
public class C0933c implements Cursor {

    /* renamed from: a */
    Map<String, List<String>> f3241a;

    /* renamed from: b */
    String[] f3242b;

    /* renamed from: c */
    int f3243c = 0;

    public void close() {
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public void deactivate() {
    }

    public byte[] getBlob(int i) {
        return new byte[0];
    }

    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    public Bundle getExtras() {
        return null;
    }

    public Uri getNotificationUri() {
        return null;
    }

    public int getType(int i) {
        return 0;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public boolean isAfterLast() {
        return false;
    }

    public boolean isBeforeFirst() {
        return false;
    }

    public boolean isClosed() {
        return false;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public boolean requery() {
        return false;
    }

    public Bundle respond(Bundle bundle) {
        return null;
    }

    public void setExtras(Bundle bundle) {
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public C0933c(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.f3241a = new HashMap();
            return;
        }
        this.f3241a = map;
        try {
            this.f3242b = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    public int getCount() {
        String[] strArr = this.f3242b;
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        return this.f3241a.get(strArr[0]).size();
    }

    public int getPosition() {
        return this.f3243c;
    }

    public boolean move(int i) {
        if (this.f3243c + i >= getCount()) {
            return false;
        }
        this.f3243c += i;
        return true;
    }

    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.f3243c = i;
        return true;
    }

    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.f3243c = 0;
        return true;
    }

    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.f3243c = this.f3241a.get(this.f3242b[0]).size() - 1;
        return true;
    }

    public boolean moveToNext() {
        if (this.f3243c + 1 >= getCount()) {
            return false;
        }
        this.f3243c++;
        return true;
    }

    public boolean moveToPrevious() {
        int i = this.f3243c;
        if (i - 1 < 0) {
            return false;
        }
        this.f3243c = i - 1;
        return true;
    }

    public boolean isFirst() {
        return this.f3243c == 0;
    }

    public boolean isLast() {
        return this.f3243c == getCount() - 1;
    }

    public int getColumnIndex(String str) {
        String[] strArr = this.f3242b;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr2 = this.f3242b;
            if (i >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i])) {
                return i;
            }
            i++;
        }
    }

    public String getColumnName(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.f3242b;
        return i < strArr.length ? strArr[i] : "";
    }

    public String[] getColumnNames() {
        return this.f3242b;
    }

    public int getColumnCount() {
        String[] strArr = this.f3242b;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public String getString(int i) {
        return (i < 0 || i >= getColumnCount()) ? "" : (String) this.f3241a.get(this.f3242b[i]).get(getPosition());
    }

    public short getShort(int i) {
        try {
            return Short.parseShort(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getInt(int i) {
        try {
            return Integer.parseInt(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    public long getLong(int i) {
        try {
            return Long.parseLong(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    public float getFloat(int i) {
        try {
            return Float.parseFloat(getString(i));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public double getDouble(int i) {
        try {
            return Double.parseDouble(getString(i));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public boolean isNull(int i) {
        return getString(i) == null;
    }
}
