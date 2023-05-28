package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    private Context f10428a;

    /* renamed from: b */
    private C4402f f10429b;

    /* renamed from: c */
    private String f10430c;

    /* renamed from: d */
    private UriMatcher f10431d = new UriMatcher(-1);

    /* renamed from: e */
    private Uri f10432e;

    /* renamed from: f */
    private int f10433f = 1;

    /* renamed from: g */
    private int f10434g = 2;

    /* renamed from: h */
    private String f10435h;

    /* renamed from: i */
    private String f10436i;

    /* renamed from: j */
    private String f10437j = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f10431d.match(uri);
        if (match == 1) {
            return this.f10435h;
        }
        if (match == 2) {
            return this.f10436i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f10428a = getContext();
        this.f10429b = new C4402f(this.f10428a);
        this.f10430c = this.f10428a.getPackageName();
        this.f10432e = Uri.parse("content://" + this.f10430c + "/REPORTS");
        this.f10435h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f10436i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f10431d.match(uri);
        if (match == 1) {
            return C4402f.m12524b();
        }
        if (match == 2) {
            return C4402f.m12521a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
