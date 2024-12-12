// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.ExpiryModule;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExpiryDocumentActivity_ViewBinding implements Unbinder {
  private ExpiryDocumentActivity target;

  @UiThread
  public ExpiryDocumentActivity_ViewBinding(ExpiryDocumentActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ExpiryDocumentActivity_ViewBinding(ExpiryDocumentActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExpiryDocumentActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeholder = null;
    target.swiperefreshLayout = null;
    target.root = null;
  }
}
