package com.example.addevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button hbutton,qbutton,ebutton, cbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hbutton=(Button)findViewById(R.id.homeworkbutton);
        hbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeworkPage();
            }
        });
        qbutton=(Button)findViewById(R.id.quizbutton);
        qbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuizPage();
            }
        });
        ebutton=(Button)findViewById(R.id.exambutton);
        ebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExamPage();
            }
        });
        cbutton=(Button)findViewById(R.id.custombuttom);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomPage();
            }
        });
    }

    public void openAddEventPage(){
        Intent intent=new Intent(this,CustomPage.class);
        startActivity(intent);
    }

    public void openHomeworkPage(){
        Intent intent=new Intent(this,HomeworkPage.class);
        startActivity(intent);
    }

    public void openQuizPage(){
        Intent intent=new Intent(this,QuizPage.class);
        startActivity(intent);
    }

    public void openExamPage(){
        Intent intent=new Intent(this,ExamPage.class);
        startActivity(intent);
    }

    public void openCustomPage(){
        Intent intent=new Intent(this,CustomPage.class);
        startActivity(intent);
    }
}