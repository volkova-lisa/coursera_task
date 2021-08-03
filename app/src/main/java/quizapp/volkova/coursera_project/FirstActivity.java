package quizapp.volkova.coursera_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText loginField;
    private EditText passField;
    private Button button;
    private Button regButton;

    private View.OnClickListener logButtonClick = v -> {
        //does: text toast + open second page

        //print text in toast
        showToast(loginField.getText().toString());

        Intent startSecondActivityIntent = new Intent(FirstActivity.this, SecondActivity.class);
        startSecondActivityIntent.putExtra(SecondFragment.USER_KEY, loginField.getText().toString());
        startActivity(startSecondActivityIntent);

    };


    private boolean isEmptyText() {
       return TextUtils.isEmpty(loginField.getText());

    }
    private boolean isPassValid() {
        return !TextUtils.isEmpty(passField.getText());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_fragment);

        loginField = findViewById(R.id.etLogin);
        button = findViewById(R.id.button_page1);

        button.setOnClickListener(logButtonClick);
    }


}