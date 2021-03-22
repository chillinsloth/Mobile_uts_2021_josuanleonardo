package umn.ac.id.musicplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        loginbtn = findViewById(R.id.login_btn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUsername.getText().toString().equals("uasmobile") && edtPassword.getText().toString().equals("uasmobilegenap")) {
                    startActivity(new Intent(LoginActivity.this, MusicActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), R.string.loginfailed, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}