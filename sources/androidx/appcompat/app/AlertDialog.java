package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import kotlin.KotlinVersion;

public class AlertDialog extends AppCompatDialog implements DialogInterface {
    final AlertController mAlert = new AlertController(getContext(), this, getWindow());

    protected AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
    }

    static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static class Builder {

        /* renamed from: P */
        private final AlertController.AlertParams f13051P;
        private final int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(Context context, int i) {
            this.f13051P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public Context getContext() {
            return this.f13051P.mContext;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f13051P.mTitle = charSequence;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.f13051P.mCustomTitleView = view;
            return this;
        }

        public Builder setMessage(int i) {
            AlertController.AlertParams alertParams = this.f13051P;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.f13051P.mIcon = drawable;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13051P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.f13051P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13051P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.f13051P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.f13051P.mCancelable = z;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f13051P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f13051P.mAdapter = listAdapter;
            this.f13051P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.f13051P.mAdapter = listAdapter;
            this.f13051P.mOnClickListener = onClickListener;
            this.f13051P.mCheckedItem = i;
            this.f13051P.mIsSingleChoice = true;
            return this;
        }

        public Builder setView(View view) {
            this.f13051P.mView = view;
            this.f13051P.mViewLayoutResId = 0;
            this.f13051P.mViewSpacingSpecified = false;
            return this;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f13051P.mContext, this.mTheme);
            this.f13051P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.f13051P.mCancelable);
            if (this.f13051P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f13051P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.f13051P.mOnDismissListener);
            if (this.f13051P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.f13051P.mOnKeyListener);
            }
            return alertDialog;
        }
    }
}
