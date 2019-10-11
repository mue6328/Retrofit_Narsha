package com.wedontanything.retrofitexample.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wedontanything.retrofitexample.Model.User.User.User;
import com.wedontanything.retrofitexample.R;
import com.wedontanything.retrofitexample.Response.Response;
import com.wedontanything.retrofitexample.Utils;
import com.wedontanything.retrofitexample.retrofit2.Interface.UserService;

import retrofit2.Call;
import retrofit2.Callback;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signupButton;
    private Button passwordFindButton;

    private EditText id;
    private EditText pw;

    UserService service = Utils.RETROFIT.create(UserService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        loginButton = findViewById(R.id.loginButtonLogin);
        signupButton = findViewById(R.id.loginButtonSignUp);
        passwordFindButton = findViewById(R.id.passwordFind);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        passwordFindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, PasswordFindActivity.class);
                startActivity(intent);
            }
        });
    }

    private void login() {

        id = findViewById(R.id.loginEditId);
        pw = findViewById(R.id.loginEditPassword);

        Call<retrofit2.Response<Response<User>>> postLogin = service.postLogin(id.getText().toString(),
                pw.getText().toString());

        postLogin.enqueue(new Callback<retrofit2.Response<Response<User>>>() {
            @Override
            public void onResponse(Call<retrofit2.Response<Response<User>>> call, retrofit2.Response<retrofit2.Response<Response<User>>> response) {
                //User user = response.body();

                Log.d("성공", "onResponse: " + response.message());
//                if (user != null)
//                {
//                    Log.d("null", "onResponse: null ");
//                }
            }

            @Override
            public void onFailure(Call<retrofit2.Response<Response<User>>> call, Throwable t) {
                Log.d("실패", "onFailure: " + t.toString());
            }
        });


    }
}
