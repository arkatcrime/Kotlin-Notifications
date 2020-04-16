package com.example.android.eggtimernotifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.eggtimernotifications.ui.EggTimerViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEggTimerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView eggImage;

  @NonNull
  public final Spinner minutesSpinner;

  @NonNull
  public final Switch onOffSwitch;

  @NonNull
  public final TextView textView;

  @Bindable
  protected EggTimerViewModel mEggTimerViewModel;

  protected FragmentEggTimerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView eggImage, Spinner minutesSpinner, Switch onOffSwitch, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.eggImage = eggImage;
    this.minutesSpinner = minutesSpinner;
    this.onOffSwitch = onOffSwitch;
    this.textView = textView;
  }

  public abstract void setEggTimerViewModel(@Nullable EggTimerViewModel eggTimerViewModel);

  @Nullable
  public EggTimerViewModel getEggTimerViewModel() {
    return mEggTimerViewModel;
  }

  @NonNull
  public static FragmentEggTimerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_egg_timer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEggTimerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEggTimerBinding>inflateInternal(inflater, com.example.android.eggtimernotifications.R.layout.fragment_egg_timer, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEggTimerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_egg_timer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEggTimerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEggTimerBinding>inflateInternal(inflater, com.example.android.eggtimernotifications.R.layout.fragment_egg_timer, null, false, component);
  }

  public static FragmentEggTimerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentEggTimerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEggTimerBinding)bind(component, view, com.example.android.eggtimernotifications.R.layout.fragment_egg_timer);
  }
}
