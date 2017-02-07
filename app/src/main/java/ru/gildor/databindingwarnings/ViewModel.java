package ru.gildor.databindingwarnings;

import android.databinding.ObservableField;

public class ViewModel {
    public ObservableField<String> text = new ObservableField<>("Initial text");
}
