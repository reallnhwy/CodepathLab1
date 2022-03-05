package com.example.ybanhsflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answer1 = findViewById(R.id.answer1);
        TextView answer2 = findViewById(R.id.answer2);
        TextView CorrectAnswer = findViewById(R.id.answer3);
        TextView answer4 = findViewById(R.id.answer4);
        final boolean[] isShowingAnswer = {true};
        ImageView ToggleAnswer = findViewById(R.id.toggle_choices_visibility);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1.setTextColor(getResources().getColor(R.color.darkred));
                CorrectAnswer.setTextColor(getResources().getColor(R.color.green));
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer2.setTextColor(getResources().getColor(R.color.darkred));
                CorrectAnswer.setTextColor(getResources().getColor(R.color.green));
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer4.setTextColor(getResources().getColor(R.color.darkred));
                CorrectAnswer.setTextColor(getResources().getColor(R.color.green));
            }
        });

        CorrectAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CorrectAnswer.setTextColor(getResources().getColor(R.color.green));
            }
        });

        ToggleAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isShowingAnswer[0]) {
                    ToggleAnswer.setImageResource(R.drawable.ic_eye_crossed);
                    answer1.setVisibility(View.INVISIBLE);
                    answer2.setVisibility(View.INVISIBLE);
                    answer4.setVisibility(View.INVISIBLE);
                    CorrectAnswer.setVisibility(View.INVISIBLE);
                    isShowingAnswer[0] = false;
                } else {
                    ToggleAnswer.setImageResource(R.drawable.ic_eye);
                    answer1.setVisibility(View.VISIBLE);
                    answer2.setVisibility(View.VISIBLE);
                    answer4.setVisibility(View.VISIBLE);
                    CorrectAnswer.setVisibility(View.VISIBLE);
                    isShowingAnswer[0] = true;
                }
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1.setTextColor(getResources().getColor(R.color.darkblue));
                answer2.setTextColor(getResources().getColor(R.color.darkblue));
                answer4.setTextColor(getResources().getColor(R.color.darkblue));
                CorrectAnswer.setTextColor(getResources().getColor(R.color.darkblue));
            }
        });



//        // Tap the question to see the flashcard answer
//        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Show the answer and hide the question
//                ((TextView) findViewById((R.id.flashcard_question))).setVisibility(View.INVISIBLE);
//                ((TextView) findViewById((R.id.flashcard_answer))).setVisibility(View.VISIBLE);
//                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.beige));
//            }
//        });
//
//        // Tap to toggle the view
//        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Show the question again and hide the answer
//                ((TextView) findViewById((R.id.flashcard_question))).setVisibility(View.VISIBLE);
//                ((TextView) findViewById((R.id.flashcard_answer))).setVisibility(View.INVISIBLE);
//                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.darkred));
//            }
//        });

    }


}