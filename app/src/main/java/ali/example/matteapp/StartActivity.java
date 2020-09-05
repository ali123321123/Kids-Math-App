package ali.example.matteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    Spill spill = new Spill();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Resources res = getResources();

        Button enBtn,toBtn,treBtn,fireBtn,femBtn,seksBtn,syvBtn,aatteBtn,niBtn,nullBtn,regnBtn;
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
        regnBtn=findViewById(R.id.regnBtn);
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
        final String[] quizList = res.getStringArray(R.array.quiz_array);

        final TextView txtquiz =(TextView)findViewById(R.id.txtquiz);


        txtquiz.setText(quizList[0].substring(0,quizList[0].indexOf("=")+1));



       //  txtsvar.setText(   quizList[0].substring(quizList[0].lastIndexOf("=") + 1));
       regnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String svar =quizList[0].substring(quizList[0].lastIndexOf("=") + 1);
               String  innTxtSvar = txtsvar.getText().toString();
           boolean sjekk  = spill.sjekkSvar(innTxtSvar,svar);
           if(sjekk){
               Toast.makeText(getApplicationContext(),"جاوبت صح يا غبي", Toast.LENGTH_SHORT).show();
           }
           else{
               Toast.makeText(getApplicationContext(),"جاوبت غلط يا عبي ", Toast.LENGTH_SHORT).show();
           }








            }
        });

    }

    @Override
    public void onClick(View v) {
        EditText  txtsvar =(EditText) findViewById(R.id.txtsvar);


        switch (v.getId()){
            case R.id.enBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("1");
                }
                else {
                    txtsvar.append("1");
                }
                break;
            case R.id.toBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("2");
                }
                else {
                    txtsvar.append("2");
                }
                break;
            case R.id.treBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("3");
                }
                else {
                    txtsvar.append("3");
                }
                break;
            case R.id.fireBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("4");
                }
                else {
                    txtsvar.append("4");
                }
                break;
            case R.id.femBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("5");
                }
                else {
                    txtsvar.append("5");
                }
                break;
            case R.id.seksBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("6");
                }
                else {
                    txtsvar.append("6");
                }
                break;
            case R.id.syvBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("7");
                }
                else {
                    txtsvar.append("7");
                }
                break;
            case R.id.aatteBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("8");
                }
                else {
                    txtsvar.append("8");
                }
                break;
            case R.id.niBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("9");
                }
                else {
                    txtsvar.append("9");
                }
                break;
            case R.id.nulBtn:
                if(txtsvar.equals("")) {
                    txtsvar.setText("0");
                }
                else {
                    txtsvar.append("0");
                }
                break;


        }





    }
}