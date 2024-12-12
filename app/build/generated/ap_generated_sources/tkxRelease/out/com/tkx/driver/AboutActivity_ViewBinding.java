// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.typeface.TypefaceTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutActivity_ViewBinding implements Unbinder {
  private AboutActivity target;

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target, View source) {
    this.target = target;

    target.llBackAbout = Utils.findRequiredViewAsType(source, R.id.ll_back_about, "field 'llBackAbout'", LinearLayout.class);
    target.tvAbout = Utils.findRequiredViewAsType(source, R.id.tv_about, "field 'tvAbout'", TypefaceTextView.class);
    target.tvVersion = Utils.findRequiredViewAsType(source, R.id.tv_version, "field 'tvVersion'", TypefaceTextView.class);
    target.text_name = Utils.findRequiredViewAsType(source, R.id.text_name, "field 'text_name'", TextView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.llBackAbout = null;
    target.tvAbout = null;
    target.tvVersion = null;
    target.text_name = null;
    target.root = null;
  }
}
