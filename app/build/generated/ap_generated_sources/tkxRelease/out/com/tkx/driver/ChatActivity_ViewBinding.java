// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatActivity_ViewBinding implements Unbinder {
  private ChatActivity target;

  @UiThread
  public ChatActivity_ViewBinding(ChatActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChatActivity_ViewBinding(ChatActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.driverImage = Utils.findRequiredViewAsType(source, R.id.driver_image, "field 'driverImage'", CircleImageView.class);
    target.driverNameTxt = Utils.findRequiredViewAsType(source, R.id.driver_name_txt, "field 'driverNameTxt'", TextView.class);
    target.driverRidingStatus = Utils.findRequiredViewAsType(source, R.id.driver_riding_status, "field 'driverRidingStatus'", TextView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.messageEdt = Utils.findRequiredViewAsType(source, R.id.message_edt, "field 'messageEdt'", EditText.class);
    target.sendBtn = Utils.findRequiredViewAsType(source, R.id.send_btn, "field 'sendBtn'", LinearLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.loadingDot = Utils.findRequiredViewAsType(source, R.id.loading_dot, "field 'loadingDot'", TextView.class);
    target.fetchingText = Utils.findRequiredViewAsType(source, R.id.fetching_text, "field 'fetchingText'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.driverImage = null;
    target.driverNameTxt = null;
    target.driverRidingStatus = null;
    target.placeholder = null;
    target.messageEdt = null;
    target.sendBtn = null;
    target.root = null;
    target.loadingDot = null;
    target.fetchingText = null;
  }
}
