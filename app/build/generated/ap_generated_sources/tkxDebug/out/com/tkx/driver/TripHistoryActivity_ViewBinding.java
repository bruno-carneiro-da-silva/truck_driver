// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import customviews.typefacesviews.TypeFaceGoogleBold;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TripHistoryActivity_ViewBinding implements Unbinder {
  private TripHistoryActivity target;

  @UiThread
  public TripHistoryActivity_ViewBinding(TripHistoryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TripHistoryActivity_ViewBinding(TripHistoryActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.activityName = Utils.findRequiredViewAsType(source, R.id.activity_name, "field 'activityName'", TypeFaceGoogleBold.class);
    target.rootActionBar = Utils.findRequiredViewAsType(source, R.id.root_action_bar, "field 'rootActionBar'", LinearLayout.class);
    target.viewpagertab = Utils.findRequiredViewAsType(source, R.id.viewpagertab, "field 'viewpagertab'", SmartTabLayout.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", ViewPager.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TripHistoryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.activityName = null;
    target.rootActionBar = null;
    target.viewpagertab = null;
    target.container = null;
    target.root = null;
  }
}
