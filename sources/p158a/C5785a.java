package p158a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a.a */
public class C5785a {

    /* renamed from: a */
    public static final Handler f13050a;

    static {
        HandlerThread handlerThread = new HandlerThread("BMAnalyticHandlerThread");
        handlerThread.start();
        f13050a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static <T> List<List<T>> m14749a(List<T> list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + i;
            arrayList.add(list.subList(i2, Math.min(i3, size)));
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONArray m14750a(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof List) {
                next = m14750a((List<?>) (List) next);
            } else if (next instanceof Map) {
                next = m14751a((Map<?, ?>) (Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m14751a(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                String obj = next.getKey().toString();
                Object value = next.getValue();
                if (!TextUtils.isEmpty(obj)) {
                    if (value != null) {
                        if (value instanceof List) {
                            value = m14750a((List<?>) (List) value);
                        } else if (value instanceof Map) {
                            value = m14751a((Map<?, ?>) (Map) value);
                        }
                        jSONObject.put(obj, value);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m14752a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14753a(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14754a(Runnable runnable) {
        f13050a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m14755a(Runnable runnable, long j) {
        if (j != 0 || !m14756a(f13050a)) {
            f13050a.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m14756a(Handler handler) {
        return Looper.myLooper() == handler.getLooper();
    }

    /* renamed from: b */
    public static void m14757b(Runnable runnable) {
        m14755a(runnable, 0);
    }

    /* renamed from: b */
    public static void m14758b(Runnable runnable, long j) {
        m14754a(runnable);
        m14755a(runnable, j);
    }
}
