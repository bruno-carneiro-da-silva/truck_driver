// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SplashActivity_ViewBinding implements Unbinder {
  private SplashActivity target;

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target, View source) {
    this.target = target;

    target.registerBtn = Utils.findRequiredViewAsType(source, R.id.register_btn, "field 'registerBtn'", LinearLayout.class);
    target.loginBtn = Utils.findRequiredViewAsType(source, R.id.login_btn, "field 'loginBtn'", LinearLayout.class);
    target.collectionOrderBtn = Utils.findRequiredViewAsType(source, R.id.collection_order_btn, "field 'collectionOrderBtn'", LinearLayout.class);
    target.LoginBox = Utils.findRequiredViewAsType(source, R.id.LoginBox, "field 'LoginBox'", LinearLayout.class);
    target.demoLogin = Utils.findRequiredViewAsType(source, R.id.demo_login, "field 'demoLogin'", CardView.class);
    target.tvGettingYourLocation = Utils.findRequiredViewAsType(source, R.id.tvGettingYourLocation, "field 'tvGettingYourLocation'", TextView.class);
    target.llChooseLanguage = Utils.findRequiredViewAsType(source, R.id.llChooseLanguage, "field 'llChooseLanguage'", LinearLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", CoordinatorLayout.class);
    target.splash_screen = Utils.findRequiredViewAsType(source, R.id.splash_screen, "field 'splash_screen'", ImageView.class);
    target.gifImageView = Utils.findRequiredViewAsType(source, R.id.GifImageView, "field 'gifImageView'", GifImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.registerBtn = null;
    target.loginBtn = null;
    target.collectionOrderBtn = null;
    target.LoginBox = null;
    target.demoLogin = null;
    target.tvGettingYourLocation = null;
    target.llChooseLanguage = null;
    target.root = null;
    target.splash_screen = null;
    target.gifImageView = null;
  }
}
