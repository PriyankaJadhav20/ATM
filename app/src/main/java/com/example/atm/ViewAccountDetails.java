package com.example.atm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ViewAccountDetails extends AppCompatActivity {
    TextView Result;
    Button GetDetails;
    EditText Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_account_details);

        Result  = findViewById(R.id.result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.240:8050/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceholderAPI jsonPlaceholderAPI = retrofit.create(JsonPlaceholderAPI.class);

        Call<List<Model>> call = jsonPlaceholderAPI.getData();
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                if(!response.isSuccessful()){
                    Result.setText("code:"+ response.code());
                    return;
                }

                List<Model> models = response.body();

                for(Model model: models){
                    String content = "" ;
                    content += "id is " + model.getId() + "\n";
                    content += "password is " + model.getPassword() + "\n";
                    content += "name is " + model.getName() + "\n";

                    Result.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Result.setText(t.getMessage());
            }
        });

    }
}