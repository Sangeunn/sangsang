package com.dev.voltsoft.sampleapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.dev.voltsoft.lib.view.menudrawer.MenuDrawer;
import com.dev.voltsoft.lib.view.menudrawer.Position;

public class PageMain extends AppCompatActivity
{

    MenuDrawer mMenuDrawer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mMenuDrawer = MenuDrawer.attach(this, MenuDrawer.Type.OVERLAY, Position.LEFT, MenuDrawer.MENU_DRAG_WINDOW);
        mMenuDrawer.setContentView(R.layout.page_main);
        mMenuDrawer.setMenuView(R.layout.view_sidebar);

        Button menuButton = findViewById(R.id.menuButton);

        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mMenuDrawer.openMenu();
            }
        });
    }
}
