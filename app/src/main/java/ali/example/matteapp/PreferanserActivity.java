package ali.example.matteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PreferanserActivity extends AppCompatActivity {
    private RadioButton radioButton;
    int valgt ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferanser);
        RadioGroup radioGroup = findViewById(R.id.radiogroupID);
       Button velgButton = findViewById(R.id.velgButton);
     radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(RadioGroup group, int checkedId) {
             radioButton = findViewById(checkedId);
             switch (radioButton.getId()){
                 case R.id.femValg:{

                     Toast.makeText(getApplicationContext(), "Du har valgt fem", Toast.LENGTH_SHORT).show();
                     valgt=5;
                     break;

                 }
                 case R.id.tiValg:{
                     Toast.makeText(getApplicationContext(), "Du har valgt ti", Toast.LENGTH_SHORT).show();
                     valgt=10;
                     break;

                 }
                 case R.id.tujefemValg:{
                     Toast.makeText(getApplicationContext(), "Du har valgt tujefem", Toast.LENGTH_SHORT).show();
                     valgt=25;
                     break;

                 }
             }
         }
     });
        velgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreferanserActivity.this,MainActivity.class);
                intent.putExtra("valgt",valgt);
                startActivity(intent);


            }
        });




    }
}