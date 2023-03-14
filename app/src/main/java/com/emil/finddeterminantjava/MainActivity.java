package com.emil.finddeterminantjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emil.finddeterminantjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int dimension;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);
    }

    public void ok(View view){
        if(!binding.editTextNumber.equals("")){
            dimension = Integer.parseInt(binding.editTextNumber.getText().toString());
            if(dimension>=2 && dimension<=6){
                Intent intent = new Intent(this,AnswerActivity.class);
                intent.putExtra("Dimension",dimension);
                startActivity(intent);
            }else{
                binding.textView3.setText("Please enter correct dimension");
            }
        }



    }
}