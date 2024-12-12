// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReferAndEarnActivity_ViewBinding implements Unbinder {
  private ReferAndEarnActivity target;

  @UiThread
  public ReferAndEarnActivity_ViewBinding(ReferAndEarnActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReferAndEarnActivity_ViewBinding(ReferAndEarnActivity target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_refresh_layout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.shareButton = Utils.findRequiredViewAsType(source, R.id.share_button, "field 'shareButton'", Button.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.referImage = Utils.findRequiredViewAsType(source, R.id.refer_image, "field 'referImage'", ImageView.class);
    target.referHeadline = Utils.findRequiredViewAsType(source, R.id.refer_headline, "field 'referHeadline'", TextView.class);
    target.referDescription = Utils.findRequiredViewAsType(source, R.id.refer_description, "field 'referDescription'", TextView.class);
    target.startDate = Utils.findRequiredViewAsType(source, R.id.start_date, "field 'startDate'", TextView.class);
    target.endDte = Utils.findRequiredViewAsType(source, R.id.end_dte, "field 'endDte'", TextView.class);
    target.referCode = Utils.findRequiredViewAsType(source, R.id.refer_code, "field 'referCode'", TextView.class);
    target.mainLayout = Utils.findRequiredViewAsType(source, R.id.main_layout, "field 'mainLayout'", LinearLayout.class);
    target.llReferData = Utils.findRequiredViewAsType(source, R.id.llReferData, "field 'llReferData'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReferAndEarnActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.root = null;
    target.shareButton = null;
    target.back = null;
    target.referImage = null;
    target.referHeadline = null;
    target.referDescription = null;
    target.startDate = null;
    target.endDte = null;
    target.referCode = null;
    target.mainLayout = null;
    target.llReferData = null;
  }
}
