package com.example.homepage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mine.Mine;
import com.example.release.Release;

/**
 * Created by tanyang on 2016/8/9.
 */
public class HomepageActivity extends Activity{
    LinearLayout linearLayout_1;
    LinearLayout linearLayout_2;
    LinearLayout linearLayout_3;
    public void view(){
        linearLayout_1 =(LinearLayout)findViewById(R.id.util_layoutbutton_1);
        linearLayout_2 =(LinearLayout)findViewById(R.id.util_layoutbutton_2);
        linearLayout_3 =(LinearLayout)findViewById(R.id.util_layoutbutton_3);
        linearLayout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        linearLayout_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(HomepageActivity.this, Release.class);
                startActivity(a);
            }
        });
        linearLayout_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(HomepageActivity.this, Mine.class);
                startActivity(a);
            }
        });
    }
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.homepagelayout);
    }
}
