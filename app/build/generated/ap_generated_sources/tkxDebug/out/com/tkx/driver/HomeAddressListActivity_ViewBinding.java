// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeAddressListActivity_ViewBinding implements Unbinder {
  private HomeAddressListActivity target;

  @UiThread
  public HomeAddressListActivity_ViewBinding(HomeAddressListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeAddressListActivity_ViewBinding(HomeAddressListActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.addNew = Utils.findRequiredViewAsType(source, R.id.add_new, "field 'addNew'", TextView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.hint_txt = Utils.findRequiredViewAsType(source, R.id.hint_txt, "field 'hint_txt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeAddressListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeholder = null;
    target.swiperefreshLayout = null;
    target.addNew = null;
    target.root = null;
    target.hint_txt = null;
  }
}
