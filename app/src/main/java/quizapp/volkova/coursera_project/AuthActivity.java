package quizapp.volkova.coursera_project;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthActivity extends AppCompatActivity {

    private EditText loginField;
    private EditText passField;
    private Button loginButton;
    private Button regButton;

    private View.OnClickListener logButtonClick = v -> {
        //todo log in
        if (!isEmptyText()) {
            //print text in toast
            showToast(loginField.getText().toString());
        }
        else {}
    };

    private View.OnClickListener regButtonClick = v -> {
        //todo register
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
        setContentView(R.layout.ac_auth);

        loginField = findViewById(R.id.etLogin);
        loginButton= findViewById(R.id.logButton);

        loginButton.setOnClickListener(logButtonClick);
    }


}