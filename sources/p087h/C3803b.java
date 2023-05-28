package p087h;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;
import p086g.C3800a;
import p087h.C3801a;
import p163b.C6148a;

/* renamed from: h.b */
public class C3803b implements C3800a {

    /* renamed from: a */
    public final SQLiteOpenHelper f9777a;

    public C3803b(Context context) {
        this.f9777a = new C3801a(context);
    }

    /* renamed from: a */
    public List<C6148a> mo18694a() {
        return C3801a.C3802a.m11218a(this.f9777a, (Integer) null);
    }

    /* renamed from: a */
    public List<C6148a> mo18695a(int i) {
        return C3801a.C3802a.m11218a(this.f9777a, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo18696a(List<C6148a> list) {
        C3801a.C3802a.m11221a(this.f9777a, list);
    }

    /* renamed from: a */
    public boolean mo18697a(C6148a aVar) {
        return C3801a.C3802a.m11223a(this.f9777a, aVar);
    }

    /* renamed from: b */
    public void mo18703b() {
        C3801a.C3802a.m11220a(this.f9777a);
    }

    /* renamed from: b */
    public void mo18698b(List<C6148a> list) {
        C3801a.C3802a.m11226c(this.f9777a, list);
    }

    /* renamed from: c */
    public void mo18699c(List<C6148a> list) {
        C3801a.C3802a.m11225b(this.f9777a, list);
    }
}
