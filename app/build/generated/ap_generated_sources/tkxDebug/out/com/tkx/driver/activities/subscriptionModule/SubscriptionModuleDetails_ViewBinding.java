// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.subscriptionModule;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionModuleDetails_ViewBinding implements Unbinder {
  private SubscriptionModuleDetails target;

  private View view7f090102;

  @UiThread
  public SubscriptionModuleDetails_ViewBinding(SubscriptionModuleDetails target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubscriptionModuleDetails_ViewBinding(final SubscriptionModuleDetails target,
      View source) {
    this.target = target;

    View view;
    target.package_name = Utils.findRequiredViewAsType(source, R.id.package_name1, "field 'package_name'", TextView.class);
    target.rides_left = Utils.findRequiredViewAsType(source, R.id.rides_left, "field 'rides_left'", TextView.class);
    target.valid_till = Utils.findRequiredViewAsType(source, R.id.valid_till, "field 'valid_till'", TextView.class);
    target.about_package = Utils.findRequiredViewAsType(source, R.id.about_package, "field 'about_package'", TextView.class);
    target.validity = Utils.findRequiredViewAsType(source, R.id.validity, "field 'validity'", TextView.class);
    target.image_show = Utils.findRequiredViewAsType(source, R.id.image_show1, "field 'image_show'", ImageView.class);
    target.placeHolderViewServices = Utils.findRequiredViewAsType(source, R.id.placeholder_services, "field 'placeHolderViewServices'", PlaceHolderView.class);
    target.llActivatedPackage = Utils.findRequiredViewAsType(source, R.id.llActivatedPackage, "field 'llActivatedPackage'", LinearLayout.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.btnBuyNow, "field 'btnBuyNow' and method 'onBuyNow'");
    target.btnBuyNow = Utils.castView(view, R.id.btnBuyNow, "field 'btnBuyNow'", Button.class);
    view7f090102 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBuyNow(p0);
      }
    });
    target.maximum_rides1 = Utils.findRequiredViewAsType(source, R.id.maximum_rides1, "field 'maximum_rides1'", TextView.class);
    target.tvActivate = Utils.findRequiredViewAsType(source, R.id.tvActivate, "field 'tvActivate'", TextView.class);
    target.llExpiryDate = Utils.findRequiredViewAsType(source, R.id.llExpiryDate, "field 'llExpiryDate'", LinearLayout.class);
    target.expiryDate = Utils.findRequiredViewAsType(source, R.id.expiryDate, "field 'expiryDate'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubscriptionModuleDetails target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.package_name = null;
    target.rides_left = null;
    target.valid_till = null;
    target.about_package = null;
    target.validity = null;
    target.image_show = null;
    target.placeHolderViewServices = null;
    target.llActivatedPackage = null;
    target.progressBar = null;
    target.btnBuyNow = null;
    target.maximum_rides1 = null;
    target.tvActivate = null;
    target.llExpiryDate = null;
    target.expiryDate = null;

    view7f090102.setOnClickListener(null);
    view7f090102 = null;
  }
}
