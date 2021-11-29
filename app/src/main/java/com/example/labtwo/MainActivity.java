package com.example.labtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textViewQuestion;
    private QuestionFragment question = new QuestionFragment();
    private int questionLength = question.questions.length;
    private String answer;
    Button btn_one;
    Button btn_two;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random();
        btn_one = (Button) findViewById(R.id.yes);
//        btn_one.setOnClickListener(this);
        btn_two = (Button) findViewById(R.id.no);
//        btn_two.setOnClickListener(this);
        textViewQuestion = (TextView) findViewById(R.id.question_text);
        NextQuestion(random.nextInt(questionLength));
    }

    private void NextQuestion(int num) {
        textViewQuestion.setText(question.getQuestionFragment(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        answer = question.getCorrectAnswer(num);

    }

//    @Override
//    public void onClick(View v) {
//
//    }
}