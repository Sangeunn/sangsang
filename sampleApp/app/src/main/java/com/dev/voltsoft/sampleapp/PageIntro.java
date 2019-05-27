package com.dev.voltsoft.sampleapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.dev.voltsoft.lib.view.insert.InsertForm;

public class PageIntro extends AppCompatActivity
{
    InsertForm mIdForm; // 멤버변수
    InsertForm mPwForm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.page_login);

        mIdForm = findViewById(R.id.insertedId);
        mPwForm = findViewById(R.id.insertedPw);

        Button button01 = findViewById(R.id.introButton01); // 지역변수
        Button button02 = findViewById(R.id.introButton02);

        button01.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String id = mIdForm.getInsertedText();
                String pw = mPwForm.getInsertedText();

                Context context = PageIntro.this;

                String text = " 아이디 = " + id + " 패스워드 = " + pw;

                // int duration = 3000;
                int duration = Toast.LENGTH_LONG;

                Toast popupToast = Toast.makeText(context, text, duration);

                popupToast.show();

                Intent intent = new Intent(PageIntro.this, PageMain.class);

                startActivity(intent);

                finish();
            }
        });

        button02.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(PageIntro.this, PageRegistration.class);

                startActivity(intent);
            }
        });
    }
}
