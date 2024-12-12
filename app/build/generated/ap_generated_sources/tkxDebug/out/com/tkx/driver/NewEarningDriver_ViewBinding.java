// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewEarningDriver_ViewBinding implements Unbinder {
  private NewEarningDriver target;

  @UiThread
  public NewEarningDriver_ViewBinding(NewEarningDriver target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewEarningDriver_ViewBinding(NewEarningDriver target, View source) {
    this.target = target;

    target.placeHoder = Utils.findRequiredViewAsType(source, R.id.placeHoder, "field 'placeHoder'", PlaceHolderView.class);
    target.rightClick = Utils.findRequiredViewAsType(source, R.id.rightClick, "field 'rightClick'", LinearLayout.class);
    target.leftClick = Utils.findRequiredViewAsType(source, R.id.leftClick, "field 'leftClick'", LinearLayout.class);
    target.selectedDate = Utils.findRequiredViewAsType(source, R.id.selectedDate, "field 'selectedDate'", TextView.class);
    target.tvTotalEarnings = Utils.findRequiredViewAsType(source, R.id.tvTotalEarnings, "field 'tvTotalEarnings'", TextView.class);
    target.tvTotalEarnings_text = Utils.findRequiredViewAsType(source, R.id.tvTotalEarnings_text, "field 'tvTotalEarnings_text'", TextView.class);
    target.highlighted_text1 = Utils.findRequiredViewAsType(source, R.id.highlighted_text1, "field 'highlighted_text1'", TextView.class);
    target.value_text1 = Utils.findRequiredViewAsType(source, R.id.value_text1, "field 'value_text1'", TextView.class);
    target.trip_history = Utils.findRequiredViewAsType(source, R.id.trip_history, "field 'trip_history'", TextView.class);
    target.walletAmount = Utils.findRequiredViewAsType(source, R.id.walletAmount, "field 'walletAmount'", TextView.class);
    target.wallet = Utils.findRequiredViewAsType(source, R.id.wallet, "field 'wallet'", TextView.class);
    target.cash = Utils.findRequiredViewAsType(source, R.id.cash, "field 'cash'", TextView.class);
    target.cash_value = Utils.findRequiredViewAsType(source, R.id.cash_value, "field 'cash_value'", TextView.class);
    target.l_triphistory = Utils.findRequiredViewAsType(source, R.id.l_triphistory, "field 'l_triphistory'", LinearLayout.class);
    target.l1_trip = Utils.findRequiredViewAsType(source, R.id.l1_trip, "field 'l1_trip'", LinearLayout.class);
    target.l1_wallet = Utils.findRequiredViewAsType(source, R.id.l1_wallet, "field 'l1_wallet'", LinearLayout.class);
    target.l1_cash = Utils.findRequiredViewAsType(source, R.id.l1_cash, "field 'l1_cash'", LinearLayout.class);
    target.l1_wallet_balance = Utils.findRequiredViewAsType(source, R.id.l1_wallet_balance, "field 'l1_wallet_balance'", LinearLayout.class);
    target.l1_w_amnt = Utils.findRequiredViewAsType(source, R.id.l1_w_amnt, "field 'l1_w_amnt'", LinearLayout.class);
    target.curent_wall_amt = Utils.findRequiredViewAsType(source, R.id.curent_wall_amt, "field 'curent_wall_amt'", TextView.class);
    target.current_wallet_balance = Utils.findRequiredViewAsType(source, R.id.current_wallet_balance, "field 'current_wallet_balance'", TextView.class);
    target.wallet_amount = Utils.findRequiredViewAsType(source, R.id.wallet_amount, "field 'wallet_amount'", TextView.class);
    target.cashout = Utils.findRequiredViewAsType(source, R.id.cashout, "field 'cashout'", TextView.class);
    target.trip_details = Utils.findRequiredViewAsType(source, R.id.trip_details, "field 'trip_details'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewEarningDriver target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHoder = null;
    target.rightClick = null;
    target.leftClick = null;
    target.selectedDate = null;
    target.tvTotalEarnings = null;
    target.tvTotalEarnings_text = null;
    target.highlighted_text1 = null;
    target.value_text1 = null;
    target.trip_history = null;
    target.walletAmount = null;
    target.wallet = null;
    target.cash = null;
    target.cash_value = null;
    target.l_triphistory = null;
    target.l1_trip = null;
    target.l1_wallet = null;
    target.l1_cash = null;
    target.l1_wallet_balance = null;
    target.l1_w_amnt = null;
    target.curent_wall_amt = null;
    target.current_wallet_balance = null;
    target.wallet_amount = null;
    target.cashout = null;
    target.trip_details = null;
  }
}
