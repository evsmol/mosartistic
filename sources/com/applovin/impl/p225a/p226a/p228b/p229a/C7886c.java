package com.applovin.impl.p225a.p226a.p228b.p229a;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.p225a.p226a.p227a.C7878a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8612l;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.a.a.b.a.c */
public class C7886c extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7878a f19019a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8490n f19020b;

    /* renamed from: c */
    private TextView f19021c;

    /* renamed from: d */
    private Button f19022d;

    /* renamed from: a */
    private void m23359a() {
        C8612l lVar = new C8612l();
        lVar.mo57747a(this.f19020b.mo57373an().mo55450a(this.f19019a));
        String b = this.f19020b.mo57373an().mo55454b(this.f19019a.mo55468c());
        if (b != null) {
            lVar.mo57747a("\nBid Response Preview:\n");
            lVar.mo57747a(b);
        }
        TextView textView = (TextView) findViewById(C8656R.C8660id.email_report_tv);
        this.f19021c = textView;
        textView.setText(lVar.toString());
        this.f19021c.setTextColor(-16777216);
    }

    /* renamed from: a */
    public void mo55491a(C7878a aVar, C8490n nVar) {
        this.f19019a = aVar;
        this.f19020b = nVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.f19019a.mo55466a() + " - " + this.f19019a.mo55467b());
        setContentView(C8656R.layout.creative_debugger_displayed_ad_detail_activity);
        m23359a();
        Button button = (Button) findViewById(C8656R.C8660id.report_ad_button);
        this.f19022d = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C7886c.this.f19020b.mo57373an().mo55452a(C7886c.this.f19019a, C7886c.this, true);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C8656R.C8662menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C8656R.C8660id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f19020b.mo57373an().mo55452a(this.f19019a, this, false);
        return true;
    }
}
