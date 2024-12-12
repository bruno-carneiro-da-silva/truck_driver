// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.placepicker;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewPlacePickerActivity_ViewBinding implements Unbinder {
  private NewPlacePickerActivity target;

  @UiThread
  public NewPlacePickerActivity_ViewBinding(NewPlacePickerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewPlacePickerActivity_ViewBinding(NewPlacePickerActivity target, View source) {
    this.target = target;

    target.progressbar = Utils.findRequiredViewAsType(source, R.id.progressbar, "field 'progressbar'", ProgressBar.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.edittext = Utils.findRequiredViewAsType(source, R.id.edittext, "field 'edittext'", TextView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewPlacePickerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressbar = null;
    target.root = null;
    target.back = null;
    target.edittext = null;
    target.placeholder = null;
  }
}
