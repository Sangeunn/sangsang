package com.dev.voltsoft.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.dev.voltsoft.lib.view.insert.InsertForm;

public class PageRegistration extends Activity
{
    InsertForm mIdForm;
    InsertForm mPwForm;
    InsertForm mNickNameForm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.page_registration);

        mIdForm = findViewById(R.id.insertFormId);
        mPwForm = findViewById(R.id.insertFormPassword1);
        mNickNameForm = findViewById(R.id.insertFormNickName);

        Button confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String strId = mIdForm.getInsertedText();
                String strPw = mPwForm.getInsertedText();
                String strNickName = mNickNameForm.getInsertedText();

                Member member = new Member();
                member.Id = strId;
                member.Password = strPw;
                member.NickName = strNickName;


            }
        });
    }
}
