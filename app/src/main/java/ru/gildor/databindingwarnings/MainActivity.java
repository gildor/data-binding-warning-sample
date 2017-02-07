package ru.gildor.databindingwarnings;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.util.Arrays;

import ru.gildor.databindingwarnings.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setList(Arrays.asList(1, 2, 2));
        ViewModel model = new ViewModel();
        binding.setModel(model);
        binding.setPresenter(new Presenter());
    }
}
