package com.example.turey.sonidoeiluminacionnexo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Main2Activity extends Activity {
    ImageButton basico,años,premiun,nuestro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        nuestro=(ImageButton) findViewById(R.id.imageButton4);
        nuestro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        premiun=(ImageButton) findViewById(R.id.imageButton3);
        premiun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });
        años=(ImageButton) findViewById(R.id.imageButton2);
        años.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
        basico=(ImageButton) findViewById(R.id.imageButton);
        basico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
