package com.example.turey.sonidoeiluminacionnexo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Main5Activity extends Activity {
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        volver=(Button) findViewById(R.id.button3);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
