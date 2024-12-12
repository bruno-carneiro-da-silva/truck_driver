// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DocumentActivity_ViewBinding implements Unbinder {
  private DocumentActivity target;

  @UiThread
  public DocumentActivity_ViewBinding(DocumentActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DocumentActivity_ViewBinding(DocumentActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", RelativeLayout.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DocumentActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeholder = null;
  }
}
