package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox answerQuestionOneA = (CheckBox) findViewById(R.id.answer_r_OneA);
        final CheckBox answerQuestionOneB = (CheckBox) findViewById(R.id.answer_r_OneB);
        final CheckBox answerQuestionOneC = (CheckBox) findViewById(R.id.answer_r_OneC);
        final CheckBox answerQuestionOneD = (CheckBox) findViewById(R.id.answer_r_OneD);
        final RadioButton answerQuestionTwo = (RadioButton) findViewById(R.id.answer_r_two);
        final RadioButton answerQuestionThree = (RadioButton) findViewById(R.id.answer_r_three);
        final RadioButton answerQuestionFour = (RadioButton) findViewById(R.id.answer_r_four);
        final RadioButton answerQuestionFive = (RadioButton) findViewById(R.id.answer_r_five);
        final RadioButton answerQuestionSix = (RadioButton) findViewById(R.id.answer_r_six);


        Button checkAnswers = (Button) findViewById(R.id.conferir_respostas);

        checkAnswers.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                int resultado = 0;
                EditText respostaSobj = (EditText) findViewById(R.id.resp_sete);
                String resposta = respostaSobj.getText().toString();
                int respostaSete = Integer.parseInt(resposta);

                //reposta todas as alternativas estao corretas

                if (answerQuestionOneA.isChecked()&&answerQuestionOneB.isChecked()&&answerQuestionOneC.isChecked()&&answerQuestionOneD.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 15
                if (answerQuestionTwo.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 20
                if (answerQuestionThree.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 10,5
                if (answerQuestionFour.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 1250
                if (answerQuestionFive.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 2
                if (answerQuestionSix.isChecked()) {
                    resultado = resultado + 1;
                }
                //resposta correta é 4
                if (respostaSete == 4) {
                    resultado = resultado + 1;
                }

                Toast.makeText(getApplicationContext(), "Você acertou " + resultado + " de 7" + "\n Parabens!!!", Toast.LENGTH_LONG).show();


            }

        });


    }


}
