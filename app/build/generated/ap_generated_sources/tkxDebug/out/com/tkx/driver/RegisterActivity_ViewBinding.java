// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hbb20.CountryCodePicker;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target, View source) {
    this.target = target;

    target.ll_back_signup = Utils.findRequiredViewAsType(source, R.id.ll_back_signup, "field 'll_back_signup'", LinearLayout.class);
    target.ll_register = Utils.findRequiredViewAsType(source, R.id.ll_register, "field 'll_register'", CardView.class);
    target.driver_image = Utils.findRequiredViewAsType(source, R.id.driver_image, "field 'driver_image'", CircleImageView.class);
    target.edt_username_signup = Utils.findRequiredViewAsType(source, R.id.edt_username_signup, "field 'edt_username_signup'", EditText.class);
    target.edt_lastname_signup = Utils.findRequiredViewAsType(source, R.id.edt_lastname_signup, "field 'edt_lastname_signup'", EditText.class);
    target.edt_email_signup = Utils.findRequiredViewAsType(source, R.id.edt_email_signup, "field 'edt_email_signup'", EditText.class);
    target.txt_phone_signup = Utils.findRequiredViewAsType(source, R.id.txt_phone_signup, "field 'txt_phone_signup'", TextView.class);
    target.edt_phone = Utils.findRequiredViewAsType(source, R.id.edt_phone, "field 'edt_phone'", EditText.class);
    target.edt_pass_signup = Utils.findRequiredViewAsType(source, R.id.edt_pass_signup, "field 'edt_pass_signup'", EditText.class);
    target.edt__confpass_signup = Utils.findRequiredViewAsType(source, R.id.edt__confpass_signup, "field 'edt__confpass_signup'", EditText.class);
    target.area = Utils.findRequiredViewAsType(source, R.id.area, "field 'area'", TextView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radio_group, "field 'radioGroup'", RadioGroup.class);
    target.genderLayout = Utils.findRequiredViewAsType(source, R.id.genderLayout, "field 'genderLayout'", LinearLayout.class);
    target.pink_smoke = Utils.findRequiredViewAsType(source, R.id.pink_smoke, "field 'pink_smoke'", LinearLayout.class);
    target.llShowSmokerLayout = Utils.findRequiredViewAsType(source, R.id.llShowSmokerLayout, "field 'llShowSmokerLayout'", LinearLayout.class);
    target.smoker_radio_group = Utils.findRequiredViewAsType(source, R.id.smoker_radio_group, "field 'smoker_radio_group'", RadioGroup.class);
    target.smk_radio = Utils.findRequiredViewAsType(source, R.id.smk_radio, "field 'smk_radio'", RadioButton.class);
    target.nonsmk_radio = Utils.findRequiredViewAsType(source, R.id.nonsmk_radio, "field 'nonsmk_radio'", RadioButton.class);
    target.checkbox = Utils.findRequiredViewAsType(source, R.id.checkbox, "field 'checkbox'", CheckBox.class);
    target.terms_and_conition_checkbox = Utils.findRequiredViewAsType(source, R.id.terms_and_conditions_checkbox, "field 'terms_and_conition_checkbox'", CheckBox.class);
    target.terms_and_condition_arrow = Utils.findRequiredViewAsType(source, R.id.terms_and_conditions_arrow, "field 'terms_and_condition_arrow'", FrameLayout.class);
    target.terms_and_condition_txt = Utils.findRequiredViewAsType(source, R.id.terms_and_conditions_txt, "field 'terms_and_condition_txt'", TextView.class);
    target.terms_and_condition_layout = Utils.findRequiredViewAsType(source, R.id.terms_and_conditions_layout, "field 'terms_and_condition_layout'", LinearLayout.class);
    target.phone_ediiting = Utils.findRequiredViewAsType(source, R.id.phone_layout, "field 'phone_ediiting'", LinearLayout.class);
    target.phone_code = Utils.findRequiredViewAsType(source, R.id.phone_code, "field 'phone_code'", TextView.class);
    target.edtCpfNumber = Utils.findRequiredViewAsType(source, R.id.edtCpfNumber, "field 'edtCpfNumber'", EditText.class);
    target.llCpfNumber = Utils.findRequiredViewAsType(source, R.id.llCpfNumber, "field 'llCpfNumber'", LinearLayout.class);
    target.viewGender = Utils.findRequiredView(source, R.id.viewGender, "field 'viewGender'");
    target.llEmail = Utils.findRequiredViewAsType(source, R.id.llEmail, "field 'llEmail'", LinearLayout.class);
    target.address = Utils.findRequiredViewAsType(source, R.id.address, "field 'address'", LinearLayout.class);
    target.houseNo = Utils.findRequiredViewAsType(source, R.id.House_no, "field 'houseNo'", EditText.class);
    target.street_number = Utils.findRequiredViewAsType(source, R.id.street_number, "field 'street_number'", EditText.class);
    target.city_name = Utils.findRequiredViewAsType(source, R.id.city_name, "field 'city_name'", EditText.class);
    target.statecode = Utils.findRequiredViewAsType(source, R.id.statecode, "field 'statecode'", EditText.class);
    target.postalcode = Utils.findRequiredViewAsType(source, R.id.postalcode, "field 'postalcode'", EditText.class);
    target.rd_subscreption_plan = Utils.findRequiredViewAsType(source, R.id.subscription_plan, "field 'rd_subscreption_plan'", TextView.class);
    target.country_code = Utils.findRequiredViewAsType(source, R.id.country_code1, "field 'country_code'", CountryCodePicker.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_back_signup = null;
    target.ll_register = null;
    target.driver_image = null;
    target.edt_username_signup = null;
    target.edt_lastname_signup = null;
    target.edt_email_signup = null;
    target.txt_phone_signup = null;
    target.edt_phone = null;
    target.edt_pass_signup = null;
    target.edt__confpass_signup = null;
    target.area = null;
    target.root = null;
    target.radioGroup = null;
    target.genderLayout = null;
    target.pink_smoke = null;
    target.llShowSmokerLayout = null;
    target.smoker_radio_group = null;
    target.smk_radio = null;
    target.nonsmk_radio = null;
    target.checkbox = null;
    target.terms_and_conition_checkbox = null;
    target.terms_and_condition_arrow = null;
    target.terms_and_condition_txt = null;
    target.terms_and_condition_layout = null;
    target.phone_ediiting = null;
    target.phone_code = null;
    target.edtCpfNumber = null;
    target.llCpfNumber = null;
    target.viewGender = null;
    target.llEmail = null;
    target.address = null;
    target.houseNo = null;
    target.street_number = null;
    target.city_name = null;
    target.statecode = null;
    target.postalcode = null;
    target.rd_subscreption_plan = null;
    target.country_code = null;
  }
}
