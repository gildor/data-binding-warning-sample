package ru.gildor.databindingwarnings;

import android.databinding.BindingAdapter;
import android.view.View;

public class BindingAdapters {
    @BindingAdapter("custom")
    public static void setCustomProperty(View view, Listener<String> listener) {
        listener.call();
    }

    public interface Listener<T> {
        void call();
    }
}
