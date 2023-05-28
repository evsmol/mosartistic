package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C10388c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.p328f.C10615e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d */
/* compiled from: BaseAnimation */
public abstract class C10325d implements C10388c {

    /* renamed from: a */
    public List<ObjectAnimator> f25530a = mo63282a();

    /* renamed from: b */
    C10343a f25531b;

    /* renamed from: c */
    public View f25532c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set<ScheduledFuture<?>> f25533d = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<ObjectAnimator> mo63282a();

    public C10325d(View view, C10343a aVar) {
        this.f25532c = view;
        this.f25531b = aVar;
    }

    /* renamed from: c */
    public void mo63287c() {
        if ("translate".equals(this.f25531b.mo63339h()) || "fade".equals(this.f25531b.mo63339h())) {
            this.f25532c.setVisibility(4);
        }
        List<ObjectAnimator> list = this.f25530a;
        if (list != null) {
            for (final ObjectAnimator next : list) {
                next.start();
                if (this.f25531b.mo63348p() > 0.0d && Build.VERSION.SDK_INT >= 19) {
                    next.addListener(new Animator.AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationEnd(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                            next.pause();
                            C10328a aVar = new C10328a(next);
                            ScheduledFuture<?> schedule = C10615e.m31169d().schedule(aVar, (long) (C10325d.this.f25531b.mo63348p() * 1000.0d), TimeUnit.MILLISECONDS);
                            aVar.mo63293a(schedule);
                            C10325d.this.f25533d.add(schedule);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public void mo63284b() {
        List<ObjectAnimator> list = this.f25530a;
        if (list != null) {
            for (ObjectAnimator next : list) {
                next.cancel();
                next.removeAllUpdateListeners();
            }
            for (ScheduledFuture<?> cancel : this.f25533d) {
                cancel.cancel(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ObjectAnimator mo63286a(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f25531b.mo63345m() * 1000.0d));
        if (this.f25531b.mo63346n() > 0) {
            objectAnimator.setRepeatCount(this.f25531b.mo63346n() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f25531b.mo63347o())) {
            if ("reverse".equals(this.f25531b.mo63347o()) || "alternate".equals(this.f25531b.mo63347o())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f25531b.mo63344l())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f25531b.mo63347o())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f25531b.mo63347o())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    C10325d.this.f25532c.setVisibility(0);
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d$a */
    /* compiled from: BaseAnimation */
    public class C10328a implements Runnable {

        /* renamed from: a */
        ObjectAnimator f25538a;

        /* renamed from: b */
        ScheduledFuture<?> f25539b;

        C10328a(ObjectAnimator objectAnimator) {
            this.f25538a = objectAnimator;
        }

        /* renamed from: a */
        public void mo63293a(ScheduledFuture<?> scheduledFuture) {
            this.f25539b = scheduledFuture;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 19 && C10262a.m29464a().mo63095c() != null) {
                C10262a.m29464a().mo63095c().mo1820c().post(new Runnable() {
                    public void run() {
                        C10328a.this.f25538a.resume();
                    }
                });
                if (this.f25539b != null) {
                    C10325d.this.f25533d.remove(this.f25539b);
                }
            }
        }
    }
}
