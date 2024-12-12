// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.typeface.TypefaceTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TermsAndCondition_ViewBinding implements Unbinder {
  private TermsAndCondition target;

  @UiThread
  public TermsAndCondition_ViewBinding(TermsAndCondition target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TermsAndCondition_ViewBinding(TermsAndCondition target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.tc = Utils.findRequiredViewAsType(source, R.id.tc, "field 'tc'", TypefaceTextView.class);
    target.accept_t_and_c = Utils.findRequiredViewAsType(source, R.id.accept_t_and_c, "field 'accept_t_and_c'", Button.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TermsAndCondition target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.tc = null;
    target.accept_t_and_c = null;
    target.root = null;
  }
}
