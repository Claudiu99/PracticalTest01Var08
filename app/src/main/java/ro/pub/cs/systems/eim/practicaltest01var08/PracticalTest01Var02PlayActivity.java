package ro.pub.cs.systems.eim.practicaltest01var08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var02PlayActivity extends AppCompatActivity {

    private EditText checkRiddle;
    private EditText EditTextPlay;
    private Button checkButton;
    private Button backButton;

    private IntentFilter intentFilter = new IntentFilter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_play);
        checkRiddle = (EditText)findViewById(R.id.check_riddle);
        EditTextPlay = (EditText)findViewById(R.id.edittextplay);
        checkButton = (Button)findViewById(R.id.checkbutton);
        backButton = (Button)findViewById(R.id.backbutton);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String riddle = extras.getString("Riddle");
                checkRiddle.setText(riddle);
            }
        }
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (savedInstanceState == null) {
                    Bundle extras = getIntent().getExtras();
                    String answer = extras.getString("Answer");
                    String myAnswer = EditTextPlay.getText().toString();
                    if (myAnswer.equals(answer)) {
                        Toast.makeText(getApplicationContext(), "Answer correct", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Answer incorrect!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}