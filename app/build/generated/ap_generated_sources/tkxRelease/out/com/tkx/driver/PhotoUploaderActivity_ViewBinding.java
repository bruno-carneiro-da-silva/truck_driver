// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import customviews.typefacesviews.TypeFaceGoogle;
import customviews.typefacesviews.TypeFaceGoogleBold;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PhotoUploaderActivity_ViewBinding implements Unbinder {
  private PhotoUploaderActivity target;

  @UiThread
  public PhotoUploaderActivity_ViewBinding(PhotoUploaderActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PhotoUploaderActivity_ViewBinding(PhotoUploaderActivity target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.camera = Utils.findRequiredViewAsType(source, R.id.camera, "field 'camera'", TypeFaceGoogleBold.class);
    target.gallery = Utils.findRequiredViewAsType(source, R.id.gallery, "field 'gallery'", TypeFaceGoogleBold.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TypeFaceGoogle.class);
    target.submit = Utils.findRequiredViewAsType(source, R.id.submit, "field 'submit'", CardView.class);
    target.llExpiryLayout = Utils.findRequiredViewAsType(source, R.id.llExpiryLayout, "field 'llExpiryLayout'", LinearLayout.class);
    target.llDocumentNumber = Utils.findRequiredViewAsType(source, R.id.llDocumentNumber, "field 'llDocumentNumber'", LinearLayout.class);
    target.edDocumnetNumber = Utils.findRequiredViewAsType(source, R.id.edDocumnetNumber, "field 'edDocumnetNumber'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PhotoUploaderActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.camera = null;
    target.gallery = null;
    target.date = null;
    target.submit = null;
    target.llExpiryLayout = null;
    target.llDocumentNumber = null;
    target.edDocumnetNumber = null;
  }
}
