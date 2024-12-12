// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.demo;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DemoActivity_ViewBinding implements Unbinder {
  private DemoActivity target;

  private View view7f090338;

  private View view7f0901ce;

  private View view7f090568;

  @UiThread
  public DemoActivity_ViewBinding(DemoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DemoActivity_ViewBinding(final DemoActivity target, View source) {
    this.target = target;

    View view;
    target.demo_namel = Utils.findRequiredViewAsType(source, R.id.demo_name, "field 'demo_namel'", EditText.class);
    target.demo_email = Utils.findRequiredViewAsType(source, R.id.demo_email, "field 'demo_email'", EditText.class);
    target.demo_phone = Utils.findRequiredViewAsType(source, R.id.demo_phone, "field 'demo_phone'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ll_back_signup, "method 'onClickBack'");
    view7f090338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.demo_ok_btn, "method 'onClickDemoButton'");
    view7f0901ce = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickDemoButton();
      }
    });
    view = Utils.findRequiredView(source, R.id.skip, "method 'onCLickSkipButton'");
    view7f090568 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCLickSkipButton();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DemoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.demo_namel = null;
    target.demo_email = null;
    target.demo_phone = null;

    view7f090338.setOnClickListener(null);
    view7f090338 = null;
    view7f0901ce.setOnClickListener(null);
    view7f0901ce = null;
    view7f090568.setOnClickListener(null);
    view7f090568 = null;
  }
}
