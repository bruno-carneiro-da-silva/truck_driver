// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SosActivity_ViewBinding implements Unbinder {
  private SosActivity target;

  @UiThread
  public SosActivity_ViewBinding(SosActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SosActivity_ViewBinding(SosActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.add_phone_layout = Utils.findRequiredViewAsType(source, R.id.add_phone_layout, "field 'add_phone_layout'", CardView.class);
    target.edt_phone_txt = Utils.findRequiredViewAsType(source, R.id.edt_phone_txt, "field 'edt_phone_txt'", EditText.class);
    target.cancel_phone = Utils.findRequiredViewAsType(source, R.id.cancel_phone, "field 'cancel_phone'", TextView.class);
    target.save_phone = Utils.findRequiredViewAsType(source, R.id.save_phone, "field 'save_phone'", TextView.class);
    target.btn_add_phone = Utils.findRequiredViewAsType(source, R.id.btn_add_phone, "field 'btn_add_phone'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SosActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeholder = null;
    target.add_phone_layout = null;
    target.edt_phone_txt = null;
    target.cancel_phone = null;
    target.save_phone = null;
    target.btn_add_phone = null;
  }
}
