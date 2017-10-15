package com.example.di.dagger2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.example.di.dagger2.di.AppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    WeatherFacade facade;

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getApplicationComponent().inject(this);

        editText = (EditText) findViewById(R.id.edittextId);
        button = (Button) findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                facade.fetchWeather(editText.getText().toString());
            }
        });
    }

    private AppComponent getApplicationComponent() {
        return ((AppApplication) getApplication()).getApplicationComponent();
    }
}
