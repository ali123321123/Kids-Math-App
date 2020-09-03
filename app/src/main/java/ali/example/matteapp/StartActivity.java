package ali.example.matteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Resources res = getResources();
        String[] quizList = res.getStringArray(R.array.quiz_array);

        TextView txtquiz =(TextView)findViewById(R.id.txtquiz);

       txtquiz.setText(quizList[0].substring(0,quizList[0].indexOf("=")+1));



    }
}