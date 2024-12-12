// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.rating_module;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DailyRatingFragment_ViewBinding implements Unbinder {
  private DailyRatingFragment target;

  @UiThread
  public DailyRatingFragment_ViewBinding(DailyRatingFragment target, View source) {
    this.target = target;

    target.placeHolderRating = Utils.findRequiredViewAsType(source, R.id.placeholder_rating, "field 'placeHolderRating'", PlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DailyRatingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolderRating = null;
  }
}
