package p150io.bidmachine.displays;

import android.graphics.Point;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.displays.ISizableDisplayPlacement */
interface ISizableDisplayPlacement<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    Point getSize(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype);
}
