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

public class RatingActivity_ViewBinding implements Unbinder {
  private RatingActivity target;

  @UiThread
  public RatingActivity_ViewBinding(RatingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RatingActivity_ViewBinding(RatingActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back_rating, "field 'back'", ImageView.class);
    target.activityName = Utils.findRequiredViewAsType(source, R.id.activity_name_rating, "field 'activityName'", TypeFaceGoogleBold.class);
    target.rootActionBar = Utils.findRequiredViewAsType(source, R.id.root_action_bar_rating, "field 'rootActionBar'", LinearLayout.class);
    target.viewpagertab = Utils.findRequiredViewAsType(source, R.id.viewpagertab_rating, "field 'viewpagertab'", SmartTabLayout.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.container_rating, "field 'container'", ViewPager.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root_rating, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RatingActivity target = this.target;
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
