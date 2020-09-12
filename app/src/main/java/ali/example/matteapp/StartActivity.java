package ali.example.matteapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    Spill spill = new Spill();
    String svar;
    int valgt;
    String[] quizList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Resources res = getResources();


        Bundle extras = getIntent().getExtras();
        valgt = extras.getInt("valgt2");
        if (valgt == 0) {
            valgt = 25;
        }
        spill.antallSp = 0;

        Button enBtn, toBtn, treBtn, fireBtn, femBtn, seksBtn, syvBtn, aatteBtn, niBtn, nullBtn, regnBtn;
        final TextView poengTeller ;
        enBtn = findViewById(R.id.enBtn);
        toBtn = findViewById(R.id.toBtn);
        treBtn = findViewById(R.id.treBtn);
        fireBtn = findViewById(R.id.fireBtn);
        femBtn = findViewById(R.id.femBtn);
        seksBtn = findViewById(R.id.seksBtn);
        syvBtn = findViewById(R.id.syvBtn);
        aatteBtn = findViewById(R.id.aatteBtn);
        niBtn = findViewById(R.id.niBtn);
        nullBtn = findViewById(R.id.nulBtn);
        regnBtn = findViewById(R.id.regnBtn);
        poengTeller=findViewById(R.id.PoengTeller);

        final EditText txtsvar = findViewById(R.id.txtsvar);


        enBtn.setOnClickListener(this);
        toBtn.setOnClickListener(this);
        treBtn.setOnClickListener(this);
        fireBtn.setOnClickListener(this);
        femBtn.setOnClickListener(this);
        seksBtn.setOnClickListener(this);
        syvBtn.setOnClickListener(this);
        aatteBtn.setOnClickListener(this);
        niBtn.setOnClickListener(this);
        nullBtn.setOnClickListener(this);


        quizList = randomizereArray(res.getStringArray(R.array.quiz_array));



        spill.SettArray(quizList);


        final TextView txtquiz = (TextView) findViewById(R.id.txtquiz);


        txtquiz.setText(quizList[spill.antallSp].substring(0, quizList[spill.antallSp].indexOf("=") + 1));


        regnBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                svar = quizList[spill.antallSp].substring(quizList[spill.antallSp].lastIndexOf("=") + 1);

                String innTxtSvar = txtsvar.getText().toString();


                boolean sjekk = spill.sjekkSvar(innTxtSvar, svar);

                if (spill.antallSp != valgt) {
                    if (sjekk) {

                        Toast.makeText(getApplicationContext(), "Du har svart riktig", Toast.LENGTH_SHORT).show();


                        spill.antallSp++;
                        poengTeller.setText(""+spill.riktigTeller*10);
                        txtsvar.setText(null);


                    } else {
                        Toast.makeText(getApplicationContext(), "du har svart feil ", Toast.LENGTH_SHORT).show();

                        spill.antallSp++;

                     //   poengTeller.setText(""+(spill.riktigTeller));
                        txtsvar.setText(null);

                    }


                    txtquiz.setText(quizList[spill.antallSp].substring(0, quizList[spill.antallSp].indexOf("=") + 1));
                } else if (spill.antallSp == valgt) {
                    Toast.makeText(getApplicationContext(), "spillet er ferdig ", Toast.LENGTH_SHORT).show();
                    spill.FerdigSpillet();
                  //  lageDialog();

                }

            }


        });


    }
/*
    private void lageDialog() {

        AlertDialog.Builder builder =  new AlertDialog.Builder(this);
        builder.setTitle("spillet er Ferdig").
                setMessage("Riktige :"+spill.riktigTeller+"\n"+"Gale"+spill.galeTeller).
                setPositiveButton("Spill igjen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Du har kikket yes ", Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                        myIntent.putExtra("riktigerVerdier",spill.riktigTeller);
                        myIntent.putExtra("galeVerdier",spill.galeTeller);

                        startActivity(myIntent);

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
StartActivity.this.finish();
                System.exit(0);
            }
        });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();

    }

 */


    @Override
    public void onClick(View v) {
        EditText txtsvar = (EditText) findViewById(R.id.txtsvar);


        switch (v.getId()) {
            case R.id.enBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("1");
                } else {
                    txtsvar.append("1");
                }
                break;
            case R.id.toBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("2");
                } else {
                    txtsvar.append("2");
                }
                break;
            case R.id.treBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("3");
                } else {
                    txtsvar.append("3");
                }
                break;
            case R.id.fireBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("4");
                } else {
                    txtsvar.append("4");
                }
                break;
            case R.id.femBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("5");
                } else {
                    txtsvar.append("5");
                }
                break;
            case R.id.seksBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("6");
                } else {
                    txtsvar.append("6");
                }
                break;
            case R.id.syvBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("7");
                } else {
                    txtsvar.append("7");
                }
                break;
            case R.id.aatteBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("8");
                } else {
                    txtsvar.append("8");
                }
                break;
            case R.id.niBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("9");
                } else {
                    txtsvar.append("9");
                }
                break;
            case R.id.nulBtn:
                if (txtsvar.equals("")) {
                    txtsvar.setText("0");
                } else {
                    txtsvar.append("0");
                }
                break;


        }


    }


    public  String [] randomizereArray(String [] innArray){

        List<String> quizarray = Arrays.asList(innArray);
        Collections.shuffle(quizarray);
        String utArray[] =quizarray.toArray(innArray);

        return utArray;

    }



}