package com.emil.finddeterminantjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.emil.finddeterminantjava.databinding.ActivityAnswerBinding;

import java.util.ArrayList;

public class AnswerActivity extends AppCompatActivity {
    long answer;
    long matrix[][];
    ArrayList <Long> matrixArrayList;

    int dimension;
    private ActivityAnswerBinding binding;

    EditText[] editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAnswerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        editText = new EditText[]{binding.editTextNumber1, binding.editTextNumber2, binding.editTextNumber3, binding.editTextNumber4, binding.editTextNumber5, binding.editTextNumber6
                , binding.editTextNumber7, binding.editTextNumber8, binding.editTextNumber9, binding.editTextNumber10, binding.editTextNumber11, binding.editTextNumber12
                , binding.editTextNumber13, binding.editTextNumber14, binding.editTextNumber15, binding.editTextNumber16, binding.editTextNumber17, binding.editTextNumber18
                , binding.editTextNumber19, binding.editTextNumber20, binding.editTextNumber21,binding.editTextNumber22, binding.editTextNumber23, binding.editTextNumber24
                , binding.editTextNumber25, binding.editTextNumber26, binding.editTextNumber27, binding.editTextNumber28, binding.editTextNumber29, binding.editTextNumber30
                , binding.editTextNumber31, binding.editTextNumber32, binding.editTextNumber33, binding.editTextNumber34, binding.editTextNumber35, binding.editTextNumber36};

        Intent intent = getIntent();
        dimension = intent.getIntExtra("Dimension",0);
//        binding.editTextNumber1.setVisibility(View.INVISIBLE);
        getMatrix();
        binding.textView4.setText("Dimension: "+Integer.toString(dimension));

    }
    public void calculate(View view){

        switch (dimension){
            case 2:
                //visible 15,16,21,22
                matrix = new long[2][2];
                matrixArrayList=new ArrayList<>();
                for(int i = 0;i<editText.length;i++){
                    if(i!=14&&i!=15&&i!=20&&i!=21){
                        editText[i].setVisibility(View.INVISIBLE);
                    }else{
                        matrixArrayList.add(Long.parseLong(editText[i].getText().toString()));
                    }
                }
                for(int i =0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        matrix[i][j]=matrixArrayList.get(matrix.length*i+j);
                    }
                }
                answer = Determinant.determinant(matrix);
                binding.answerText.setText("Answer: "+Long.toString(answer));
                break;
            case 3:
                //visible 9,10,11,15,16,17,21,22,23
                matrix = new long[3][3];
                matrixArrayList=new ArrayList<>();

                for(int i = 0;i<editText.length;i++){
                    if(i!=8&&i!=9&&i!=10&&i!=14&&i!=15&&i!=16&&i!=20&&i!=21&&i!=22){
                        editText[i].setVisibility(View.INVISIBLE);
                    }else{
                        matrixArrayList.add(Long.parseLong(editText[i].getText().toString()));
                    }
                }
                for(int i =0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        matrix[i][j]=matrixArrayList.get(matrix.length*i+j);
                    }
                }
                answer = Determinant.determinant(matrix);
                binding.answerText.setText("Answer: "+Long.toString(answer));
                break;
            case 4:
                //visible 8,9,10,11,14,15,16,17,20,21,22,23,26,27,28,29
                matrix = new long[4][4];
                matrixArrayList=new ArrayList<>();
                for(int i = 0;i<editText.length;i++){
                    if(i!=7&&i!=8&&i!=9&&i!=10&&i!=13&&i!=14&&i!=15&&i!=16&&i!=19&&i!=20&&i!=21&&i!=22&&i!=25&&i!=26&&i!=27&&i!=28){
                        editText[i].setVisibility(View.INVISIBLE);
                    }else{
                        matrixArrayList.add(Long.parseLong(editText[i].getText().toString()));
                    }
                }
                for(int i =0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        matrix[i][j]=matrixArrayList.get(matrix.length*i+j);
                    }
                }
                answer = Determinant.determinant(matrix);
                binding.answerText.setText("Answer: "+Long.toString(answer));
                break;
            case 5:
                //invisible 1,7,13,19,25,31,32,33,34,35,36
                matrix = new long[5][5];
                matrixArrayList=new ArrayList<>();
                for(int i = 0;i<editText.length;i++){
                    if(i==0 || i==6 || i==12 || i==18 || i==24 || i==30 || i==31 || i==32 || i==33 || i==34 || i==35){
                        editText[i].setVisibility(View.INVISIBLE);
                    }else{
                        matrixArrayList.add(Long.parseLong(editText[i].getText().toString()));
                    }
                }
                for(int i =0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        matrix[i][j]=matrixArrayList.get(matrix.length*i+j);
                    }
                }
                answer = Determinant.determinant(matrix);
                binding.answerText.setText("Answer: "+Long.toString(answer));
                break;
            case 6:
                matrix = new long[6][6];
                matrixArrayList=new ArrayList<>();
                for (EditText text : editText) {
                    matrixArrayList.add(Long.parseLong(text.getText().toString()));
                }
                for(int i =0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        matrix[i][j]=matrixArrayList.get(matrix.length*i+j);
                    }
                }
                answer = Determinant.determinant(matrix);
                binding.answerText.setText("Answer: "+Long.toString(answer));
                break;
            default:

        }


    }

    public void getMatrix(){

        switch (dimension){
            case 2:
                //visible 15,16,21,22
                for(int i = 0;i<editText.length;i++) {
                    if (i != 14 && i != 15 && i != 20 && i != 21) {
                        editText[i].setVisibility(View.INVISIBLE);
                    }
                }
                break;
            case 3:
                //visible 9,10,11,15,16,17,21,22,23
                for(int i = 0;i<editText.length;i++) {
                    if (i != 8 && i != 9 && i != 10 && i != 14 && i != 15 && i != 16 && i != 20 && i != 21 && i != 22) {
                        editText[i].setVisibility(View.INVISIBLE);
                    }
                }
                break;
            case 4:
                //visible 8,9,10,11,14,15,16,17,20,21,22,23,26,27,28,29
                for(int i = 0;i<editText.length;i++){
                    if(i!=7&&i!=8&&i!=9&&i!=10&&i!=13&&i!=14&&i!=15&&i!=16&&i!=19&&i!=20&&i!=21&&i!=22&&i!=25&&i!=26&&i!=27&&i!=28){
                        editText[i].setVisibility(View.INVISIBLE);
                    }
                }
                break;
            case 5:
                //invisible 1,7,13,19,25,31,32,33,34,35,36
                for(int i = 0;i<editText.length;i++) {
                    if (i == 0 || i == 6 || i == 12 || i == 18 || i == 24 || i == 30 || i == 31 || i == 32 || i == 33 || i == 34 || i == 35) {
                        editText[i].setVisibility(View.INVISIBLE);
                    }
                }
                break;
            case 6:

                break;
            default:

        }

    }

}