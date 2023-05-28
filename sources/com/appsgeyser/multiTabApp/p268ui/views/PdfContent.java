package com.appsgeyser.multiTabApp.p268ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.appsgeyser.multiTabApp.pdfreader.PdfLoader;
import com.github.barteksc.pdfviewer.PDFView;
import com.wMoskovskoeiskusstvo_17147852.R;

/* renamed from: com.appsgeyser.multiTabApp.ui.views.PdfContent */
public class PdfContent extends TabContent {
    public PdfContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PdfContent(Context context) {
        super(context);
    }

    public void init(String str, PdfLoader.PdfEventListener pdfEventListener, String str2) {
        new PdfLoader((PDFView) findViewById(R.id.pdfView), str, pdfEventListener, str2).loadPdfFile();
    }
}
