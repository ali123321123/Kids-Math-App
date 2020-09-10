package ali.example.matteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PreferanserActivity extends AppCompatActivity {
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferanser);
        RadioGroup radioGroup = findViewById(R.id.radiogroupID);
     radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(RadioGroup group, int checkedId) {
             radioButton = findViewById(checkedId);
             switch (radioButton.getId()){
                 case R.id.femValg:{
                     Toast.makeText(getApplicationContext(), "Du har valgt fem", Toast.LENGTH_SHORT).show();
                     break;

                 }
                 case R.id.tiValg:{
                     Toast.makeText(getApplicationContext(), "Du har valgt ti", Toast.LENGTH_SHORT).show();
                     break;

                 }
                 case R.id.tujefemValg:{
                     Toast.makeText(getApplicationContext(), "Du har valgt tujefem", Toast.LENGTH_SHORT).show();
                     break;

                 }
             }
         }
     });



    }
}