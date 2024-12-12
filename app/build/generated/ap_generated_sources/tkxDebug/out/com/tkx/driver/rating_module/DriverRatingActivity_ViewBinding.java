// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.rating_module;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DriverRatingActivity_ViewBinding implements Unbinder {
  private DriverRatingActivity target;

  @UiThread
  public DriverRatingActivity_ViewBinding(DriverRatingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DriverRatingActivity_ViewBinding(DriverRatingActivity target, View source) {
    this.target = target;

    target.ll_start_date = Utils.findRequiredViewAsType(source, R.id.ll_start_date, "field 'll_start_date'", LinearLayout.class);
    target.ll_end_date = Utils.findRequiredViewAsType(source, R.id.ll_end_date, "field 'll_end_date'", LinearLayout.class);
    target.start_date_txt = Utils.findRequiredViewAsType(source, R.id.start_date_txt, "field 'start_date_txt'", TextView.class);
    target.end_date_txt = Utils.findRequiredViewAsType(source, R.id.end_date_txt, "field 'end_date_txt'", TextView.class);
    target.btn_daily_rating = Utils.findRequiredViewAsType(source, R.id.btn_daily_rating, "field 'btn_daily_rating'", Button.class);
    target.btn_weekly_rating = Utils.findRequiredViewAsType(source, R.id.btn_weekly_rating, "field 'btn_weekly_rating'", Button.class);
    target.btn_yearly_rating = Utils.findRequiredViewAsType(source, R.id.btn_yearly_rating, "field 'btn_yearly_rating'", Button.class);
    target.driver_name = Utils.findRequiredViewAsType(source, R.id.driver_name_rating, "field 'driver_name'", TextView.class);
    target.driver_image = Utils.findRequiredViewAsType(source, R.id.driver_image_rating, "field 'driver_image'", ImageView.class);
    target.ratingBar = Utils.findRequiredViewAsType(source, R.id.rating_bar_rating, "field 'ratingBar'", RatingBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DriverRatingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_start_date = null;
    target.ll_end_date = null;
    target.start_date_txt = null;
    target.end_date_txt = null;
    target.btn_daily_rating = null;
    target.btn_weekly_rating = null;
    target.btn_yearly_rating = null;
    target.driver_name = null;
    target.driver_image = null;
    target.ratingBar = null;
  }
}
