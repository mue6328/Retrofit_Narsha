package com.wedontanything.retrofitexample.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.wedontanything.retrofitexample.Model.User.User.UpdateEmail;
import com.wedontanything.retrofitexample.Model.User.User.UpdatePassword;
import com.wedontanything.retrofitexample.Model.User.User.UpdatePhoneNumber;
import com.wedontanything.retrofitexample.Model.User.User.UpdateSchoolName;
import com.wedontanything.retrofitexample.Model.User.User.User;
import com.wedontanything.retrofitexample.R;
import com.wedontanything.retrofitexample.Request.UserRequest;
import com.wedontanything.retrofitexample.Utils;
import com.wedontanything.retrofitexample.retrofit2.Interface.UserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

   // ProductService productService = ApiClient.getProductClient();

//    @SuppressLint("StaticFieldLeak")
//    AsyncTask<Call, Void, String> thred = new AsyncTask<Call, Void, String>() {
//
//        @Override
//        protected String doInBackground(Call... calls) {
//
//            UserService userService = ApiClient.getUserClient();
//            UserRequest request = new UserRequest();
//
//            System.out.println("abcdef");
//            userService.postFindId(request).enqueue(new Callback<Response>() {
//                @Override
//                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//                    System.out.println("abcdefg");
//                    Response a = response.body();
//                    Log.i("200", String.valueOf(a.getStatus()));
//                    Log.i("Success", a.getData());
//                }
//
//                @Override
//                public void onFailure(Call<Response> call, Throwable t) {
//                    System.out.println("abcdefgh");
//                    Log.d("def", "error");
//                }
//
//
//
//            });
//            return "abc";
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            Log.d("B", s);
//        }
//    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserService service = Utils.RETROFIT.create(UserService.class);

        UpdatePassword updatePassword = new UpdatePassword();

//        Call<User> signup = service.postSignup("abcd5432", "김현재", "Aa@12345", "dgsw@dgsw.hs.kr"
//                                                , "01055554444", "대구소프트웨어고등학교");

//
//        signup.enqueue(new Callback<retrofit2.Response<Response>>() {
//            @Override
//            public void onResponse(Call<retrofit2.Response<Response>> call, retrofit2.Response<retrofit2.Response<Response>> response) {
//                Log.d("성공", "onResponse: " + response.message() + response.errorBody() + response.isSuccessful());
//            }
//
//            @Override
//            public void onFailure(Call<retrofit2.Response<Response>> call, Throwable t) {
//
//            }
//        });


//        Call<User> postfindId = service.postFindId("김현재");
//
//
//
//        postfindId.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                User user = response.body();
//
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });
//
//        Call<User> postfindPassword = service.postFindPassword("abcd5432", "Aa@12356");
//
//        postfindPassword.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                User user = response.body();
//
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });
//
//        Call<UpdatePassword> putUpdatePassword = service.putUpdatePassword("abcd5432", "Aa@12345", "Aa@123456");
//
//        putUpdatePassword.enqueue(new Callback<UpdatePassword>() {
//            @Override
//            public void onResponse(Call<UpdatePassword> call, Response<UpdatePassword> response) {
//                UpdatePassword updatePassword2 = response.body();
//
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<UpdatePassword> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });

//        Call<UpdateEmail> putUpdateEmail = service.putUpdateEmail("abcd5432", "dgsw@dgsw.hs.kr", "dgsw1@dgsw.hs.kr");
//
//        putUpdateEmail.enqueue(new Callback<UpdateEmail>() {
//            @Override
//            public void onResponse(Call<UpdateEmail> call, Response<UpdateEmail> response) {
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<UpdateEmail> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });

//        Call<UpdatePhoneNumber> putUpdatePhoneNumber = service.putUpdatePhoneNumber("abcd5432", "01055554444", "01044445555");
//
//        putUpdatePhoneNumber.enqueue(new Callback<UpdatePhoneNumber>() {
//            @Override
//            public void onResponse(Call<UpdatePhoneNumber> call, Response<UpdatePhoneNumber> response) {
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<UpdatePhoneNumber> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });

//        Call<UpdateSchoolName> putUpdateSchoolname = service.putUpdateSchool("abcd5432", "경북기계공업고등학교");
//
//        putUpdateSchoolname.enqueue(new Callback<UpdateSchoolName>() {
//            @Override
//            public void onResponse(Call<UpdateSchoolName> call, Response<UpdateSchoolName> response) {
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<UpdateSchoolName> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });

//        Call<User> deleteMember = service.deleteMember("abcd5432");
//
//        deleteMember.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                Log.d("성공", "onResponse: " + response.message());
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//                Log.d("실패", "onFailure: " + t.toString());
//            }
//        });

        Call<User> postLogin = service.postLogin("abcd5432", "Aa@12345");

        postLogin.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d("성공", "onResponse: " + response.message());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d("실패", "onFailure: " + t.toString());
            }
        });
    }
}
