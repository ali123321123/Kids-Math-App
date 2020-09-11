package ali.example.matteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int valgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart,btnStatistikk,btnPreferanser;
        btnStart = (Button)findViewById(R.id.start);
        btnStatistikk =(Button)findViewById(R.id.statistikk);
        btnPreferanser=(Button)findViewById(R.id.preferanse);
        Bundle extras =getIntent().getExtras();
         valgt =extras.getInt("valgt");


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,StartActivity.class);
                myIntent.putExtra("valgt2",valgt);
                startActivity(myIntent);
            }
        });

        btnStatistikk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,StatistikkActivity.class);

                startActivity(myIntent);
            }
        });

        btnPreferanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,PreferanserActivity.class);
                startActivity(myIntent);
            }
        });








    }
}