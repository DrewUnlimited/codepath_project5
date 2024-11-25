// Generated by view binder compiler. Do not edit!
package com.example.project_05_bitfit_part_01.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project_05_bitfit_part_01.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HabitInformationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText habitNameET;

  @NonNull
  public final EditText habitValueET;

  @NonNull
  public final Button moveInfoBtn;

  private HabitInformationBinding(@NonNull ConstraintLayout rootView, @NonNull EditText habitNameET,
      @NonNull EditText habitValueET, @NonNull Button moveInfoBtn) {
    this.rootView = rootView;
    this.habitNameET = habitNameET;
    this.habitValueET = habitValueET;
    this.moveInfoBtn = moveInfoBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HabitInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HabitInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.habit_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HabitInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.habitNameET;
      EditText habitNameET = ViewBindings.findChildViewById(rootView, id);
      if (habitNameET == null) {
        break missingId;
      }

      id = R.id.habitValueET;
      EditText habitValueET = ViewBindings.findChildViewById(rootView, id);
      if (habitValueET == null) {
        break missingId;
      }

      id = R.id.moveInfoBtn;
      Button moveInfoBtn = ViewBindings.findChildViewById(rootView, id);
      if (moveInfoBtn == null) {
        break missingId;
      }

      return new HabitInformationBinding((ConstraintLayout) rootView, habitNameET, habitValueET,
          moveInfoBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
