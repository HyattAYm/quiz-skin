package com.example.alessandra.quizshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {

    // Tracks the score of the Quiz
    int scoreQuiz = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ///*** Increase the score of the Quiz by 4 points.

    public void addFourToScore(View v) {
    scoreQuiz = scoreQuiz + 4;
        displayForQuiz(scoreQuiz);
    }

    ///*** Increase the score of the Quiz by 3 points.

    public void addThreeToScore(View v) {
        scoreQuiz = scoreQuiz + 3;
        displayForQuiz(scoreQuiz);
    }

    ///*** Increase the score of the Quiz by 2 points.

    public void addTwoToScore(View v) {
        scoreQuiz = scoreQuiz + 2;
        displayForQuiz(scoreQuiz);
    }

    ///*** Increase the score of the Quiz by 0 points.

    public void addZeroToScore(View v) {
        scoreQuiz = scoreQuiz + 0;
        displayForQuiz(scoreQuiz);
    }




    /**
     * This method is called when the find out button is clicked.
     */
    public void findOut (View view) {

        ///Displaying Toast with Your skin type message
        Toast.makeText(this,"Your skin type is",Toast.LENGTH_SHORT).show();
    }
//** Displays the score of the Quiz **//

    public void displayForQuiz (int scoreQuiz) {
    }

}
