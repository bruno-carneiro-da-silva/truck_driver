// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationWebViewActivity_ViewBinding implements Unbinder {
  private NotificationWebViewActivity target;

  @UiThread
  public NotificationWebViewActivity_ViewBinding(NotificationWebViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NotificationWebViewActivity_ViewBinding(NotificationWebViewActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", LinearLayout.class);
    target.webview = Utils.findRequiredViewAsType(source, R.id.webview, "field 'webview'", WebView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progress'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationWebViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.webview = null;
    target.progress = null;
  }
}
