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
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewRequestActivity_ViewBinding implements Unbinder {
  private NewRequestActivity target;

  @UiThread
  public NewRequestActivity_ViewBinding(NewRequestActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewRequestActivity_ViewBinding(NewRequestActivity target, View source) {
    this.target = target;

    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.viewpagertab = Utils.findRequiredViewAsType(source, R.id.viewpagertab, "field 'viewpagertab'", SmartTabLayout.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", ViewPager.class);
    target.llViewPager = Utils.findRequiredViewAsType(source, R.id.llViewPager, "field 'llViewPager'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewRequestActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.root = null;
    target.back = null;
    target.viewpagertab = null;
    target.container = null;
    target.llViewPager = null;
  }
}
