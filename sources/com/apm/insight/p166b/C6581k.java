package com.apm.insight.p166b;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.k */
public class C6581k {

    /* renamed from: a */
    private static MessageQueue f14126a;

    /* renamed from: b */
    private static Field f14127b;

    /* renamed from: c */
    private static Field f14128c;

    /* renamed from: a */
    protected static Message m16103a(Message message) {
        Field field = f14128c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f14128c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f14128c.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Message m16104a(MessageQueue messageQueue) {
        Field field = f14127b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f14127b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f14127b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static MessageQueue m16105a() {
        MessageQueue queue;
        if (f14126a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                queue = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                queue = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f14126a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            f14126a = queue;
        }
        return f14126a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m16106a(int r7, long r8) {
        /*
            android.os.MessageQueue r0 = m16105a()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            android.os.Message r2 = m16104a((android.os.MessageQueue) r0)     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r1
        L_0x0015:
            r3 = 0
            r4 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x0030
            if (r3 >= r7) goto L_0x0030
            int r3 = r3 + 1
            int r4 = r4 + 1
            org.json.JSONObject r5 = m16107a((android.os.Message) r2, (long) r8)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = "id"
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x0028 }
        L_0x0028:
            r1.put(r5)     // Catch:{ all -> 0x0032 }
            android.os.Message r2 = m16103a((android.os.Message) r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0017
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r1
        L_0x0032:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r7     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r7 = move-exception
            com.apm.insight.c r8 = com.apm.insight.C6553b.m16004a()
            java.lang.String r9 = "NPTH_CATCH"
            r8.mo52019a((java.lang.String) r9, (java.lang.Throwable) r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p166b.C6581k.m16106a(int, long):org.json.JSONArray");
    }

    /* renamed from: a */
    private static JSONObject m16107a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
