package ro.pub.cs.systems.eim.practicaltest01var08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var08MainActivity extends AppCompatActivity {

    private EditText Riddle;
    private EditText Answer;
    private Button Play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_main);

        Riddle = (EditText)findViewById(R.id.edittext1);
        Answer = (EditText)findViewById(R.id.edittext2);

        Play = (Button)findViewById(R.id.playbutton);


        Riddle.setText(String.valueOf("Riddle"));
        Answer.setText(String.valueOf("Answer"));
    }
}