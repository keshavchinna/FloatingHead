package com.daya.floatinghead.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.daya.floatinghead.R;
import com.daya.floatinghead.Service.FloatingHeadService;

public class MainActivity extends AppCompatActivity {

  private Button startService;
  private Button stopService;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    startService = (Button) findViewById(R.id.startService);
    stopService = (Button) findViewById(R.id.stopService);
    startService.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        startService(new Intent(getApplication(), FloatingHeadService.class));

      }
    });
    stopService.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        stopService(new Intent(getApplication(), FloatingHeadService.class));

      }
    });

  }
}
