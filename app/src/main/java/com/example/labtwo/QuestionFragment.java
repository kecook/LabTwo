package com.example.labtwo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionFragment extends Fragment {
    public String questions[] = {
            "Canada has nine provinces",
            "The official language in Canada is English",
            "Does Canada have a queen?",
            "The official animal of Canada is a moose?",
            "Canada was founded in 1867?",
            "Has Canada ever had a female President?"
    };
    public String choices[][] = {
            {"Yes","No"},
            {"Yes", "No"},
            {"Yes", "No"}
    };

    public String correctAnswer[] = {
            "No",
            "No",
            "Yes",
            "No",
            "Yes",
            "No"
    };

    public String getQuestionFragment(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }




    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }


    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }


    public interface AnswerClickListener{
        void answerClikcListenerYes();
        void answerClickListenerNo();
    }

    public AnswerClickListener listener;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String question;
    public QuestionFragment() {
        // Required empty public constructor
    }



    public static QuestionFragment newInstance(String question) {
        QuestionFragment fragment = new QuestionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, question);

        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            question = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_question, container, false);
        TextView textView = v.findViewById(R.id.question_text);
        textView.setText(question);

        TextView questFragText = v.findViewById(R.id.text_in_dialog);

        Button btn_1 = v.findViewById(R.id.yes);
//        yes.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(QuestionFragment.this,"yes clicked",Toast.LENGTH_LONG).show();
//
//            }
//        });
        return v;

    }

}