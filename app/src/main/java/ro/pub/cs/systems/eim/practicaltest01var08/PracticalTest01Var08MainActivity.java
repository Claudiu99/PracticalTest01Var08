package ro.pub.cs.systems.eim.practicaltest01var08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var08MainActivity extends AppCompatActivity {

    private EditText RiddleText;
    private EditText AnswerText;
    private Button Play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_main);

        RiddleText = (EditText)findViewById(R.id.edittext1);
        AnswerText = (EditText)findViewById(R.id.edittext2);
        Play = (Button)findViewById(R.id.playbutton);

        RiddleText.setText(String.valueOf("Riddle"));
        AnswerText.setText(String.valueOf("Answer"));
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Riddle = RiddleText.getText().toString();
                String Answer = AnswerText.getText().toString();
                if (Riddle != null && Answer != null) {
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var02PlayActivity.class);
                    intent.putExtra("Riddle", Riddle);
                    intent.putExtra("Answer", Answer);
                    startActivityForResult(intent, 1);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Riddle", RiddleText.getText().toString());
        outState.putString("Answer", AnswerText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.containsKey("Riddle")) {
            RiddleText.setText(savedInstanceState.getString("Riddle"));
        }
        if (savedInstanceState.containsKey("Answer")) {
            AnswerText.setText(savedInstanceState.getString("Answer"));
        }
    }

}