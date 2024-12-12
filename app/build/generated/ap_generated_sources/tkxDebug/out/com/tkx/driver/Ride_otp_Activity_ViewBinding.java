// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Ride_otp_Activity_ViewBinding implements Unbinder {
  private Ride_otp_Activity target;

  private View view7f0900dc;

  @UiThread
  public Ride_otp_Activity_ViewBinding(Ride_otp_Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Ride_otp_Activity_ViewBinding(final Ride_otp_Activity target, View source) {
    this.target = target;

    View view;
    target.editText1 = Utils.findRequiredViewAsType(source, R.id.edit1, "field 'editText1'", EditText.class);
    target.editText2 = Utils.findRequiredViewAsType(source, R.id.edit2, "field 'editText2'", EditText.class);
    target.editText3 = Utils.findRequiredViewAsType(source, R.id.edit3, "field 'editText3'", EditText.class);
    target.editText4 = Utils.findRequiredViewAsType(source, R.id.edit4, "field 'editText4'", EditText.class);
    target.start_trip = Utils.findRequiredViewAsType(source, R.id.start_trip, "field 'start_trip'", Button.class);
    view = Utils.findRequiredView(source, R.id.backbutton, "method 'onBackButton'");
    view7f0900dc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBackButton();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Ride_otp_Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText1 = null;
    target.editText2 = null;
    target.editText3 = null;
    target.editText4 = null;
    target.start_trip = null;

    view7f0900dc.setOnClickListener(null);
    view7f0900dc = null;
  }
}
