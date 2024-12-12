// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hbb20.CountryCodePicker;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ManualUserDetailActivity_ViewBinding implements Unbinder {
  private ManualUserDetailActivity target;

  @UiThread
  public ManualUserDetailActivity_ViewBinding(ManualUserDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ManualUserDetailActivity_ViewBinding(ManualUserDetailActivity target, View source) {
    this.target = target;

    target.ll_back_rides = Utils.findRequiredViewAsType(source, R.id.ll_back_rides, "field 'll_back_rides'", LinearLayout.class);
    target.textView_dropPoint = Utils.findRequiredViewAsType(source, R.id.textView_dropPoint, "field 'textView_dropPoint'", TextView.class);
    target.ll_dropLocation = Utils.findRequiredViewAsType(source, R.id.ll_dropLocation, "field 'll_dropLocation'", LinearLayout.class);
    target.textView_pickUp = Utils.findRequiredViewAsType(source, R.id.textView_pickUp, "field 'textView_pickUp'", TextView.class);
    target.ll_pickUpLocation = Utils.findRequiredViewAsType(source, R.id.ll_pickUpLocation, "field 'll_pickUpLocation'", LinearLayout.class);
    target.edt_cus_number = Utils.findRequiredViewAsType(source, R.id.edt_cus_number, "field 'edt_cus_number'", EditText.class);
    target.edt_cus_name = Utils.findRequiredViewAsType(source, R.id.edt_cus_name, "field 'edt_cus_name'", EditText.class);
    target.estCard = Utils.findRequiredViewAsType(source, R.id.est_card, "field 'estCard'", CardView.class);
    target.estPriceTV = Utils.findRequiredViewAsType(source, R.id.est_price_tv, "field 'estPriceTV'", TextView.class);
    target.estTimeTV = Utils.findRequiredViewAsType(source, R.id.est_time_tv, "field 'estTimeTV'", TextView.class);
    target.phone_code = Utils.findRequiredViewAsType(source, R.id.phone_code, "field 'phone_code'", TextView.class);
    target.country_code = Utils.findRequiredViewAsType(source, R.id.country_code1, "field 'country_code'", CountryCodePicker.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ManualUserDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_back_rides = null;
    target.textView_dropPoint = null;
    target.ll_dropLocation = null;
    target.textView_pickUp = null;
    target.ll_pickUpLocation = null;
    target.edt_cus_number = null;
    target.edt_cus_name = null;
    target.estCard = null;
    target.estPriceTV = null;
    target.estTimeTV = null;
    target.phone_code = null;
    target.country_code = null;
  }
}
