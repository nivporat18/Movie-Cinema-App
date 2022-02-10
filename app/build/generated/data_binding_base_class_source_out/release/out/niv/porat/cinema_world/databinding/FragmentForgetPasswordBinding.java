// Generated by view binder compiler. Do not edit!
package niv.porat.cinema_world.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import niv.porat.cinema_world.R;

public final class FragmentForgetPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonForgetSend;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  private FragmentForgetPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonForgetSend, @NonNull EditText editTextTextEmailAddress,
      @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.buttonForgetSend = buttonForgetSend;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.imageView2 = imageView2;
    this.textView = textView;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forget__password_, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_forgetSend;
      Button buttonForgetSend = ViewBindings.findChildViewById(rootView, id);
      if (buttonForgetSend == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentForgetPasswordBinding((ConstraintLayout) rootView, buttonForgetSend,
          editTextTextEmailAddress, imageView2, textView, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}