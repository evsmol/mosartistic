package com.appodeal.ads;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.appodeal.ads.utils.C9625g;
import com.appodeal.ads.utils.C9626h;

/* renamed from: com.appodeal.ads.b1 */
public final class C9129b1 implements AdapterView.OnItemLongClickListener {
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C9626h hVar = (C9626h) adapterView.getAdapter();
        hVar.getClass();
        ArrayAdapter arrayAdapter = new ArrayAdapter(hVar.getContext(), 17367057);
        arrayAdapter.add("Waterfall order");
        arrayAdapter.add("Alphabetical order");
        AlertDialog.Builder builder = new AlertDialog.Builder(hVar.getContext());
        builder.setAdapter(arrayAdapter, new C9625g(hVar)).setTitle("Sort items");
        builder.create().show();
        return true;
    }
}
