// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
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

public class CardListActivity_ViewBinding implements Unbinder {
  private CardListActivity target;

  @UiThread
  public CardListActivity_ViewBinding(CardListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CardListActivity_ViewBinding(CardListActivity target, View source) {
    this.target = target;

    target.llBackCard = Utils.findRequiredViewAsType(source, R.id.ll_back_card, "field 'llBackCard'", LinearLayout.class);
    target.addNew = Utils.findRequiredViewAsType(source, R.id.add_new, "field 'addNew'", TextView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CardListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.llBackCard = null;
    target.addNew = null;
    target.placeholder = null;
    target.swiperefreshLayout = null;
    target.root = null;
  }
}
