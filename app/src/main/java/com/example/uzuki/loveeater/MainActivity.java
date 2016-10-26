package com.example.uzuki.loveeater;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout layout = (RelativeLayout)findViewById(R.id.activity_main);

        // ボタン
        ImageButton ibtn_all = (ImageButton)findViewById(R.id.ibtn_all);
        ImageButton ibtn_smile = (ImageButton)findViewById(R.id.ibtn_smile);
        ImageButton ibtn_pure = (ImageButton)findViewById(R.id.ibtn_pure);
        ImageButton ibtn_cool = (ImageButton)findViewById(R.id.ibtn_cool);
        ImageButton ibtn_menu = (ImageButton)findViewById(R.id.ibtn_menu);

        // カスタムビュー設定
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
        final View layout_menu = inflater.inflate(R.layout.activity_menu, null, true);

        // allボタン_クリックイベント
        ibtn_all.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundResource(R.drawable.nomal);
            }
        });

        // smileボタン_クリックイベント
        ibtn_smile.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundResource(R.drawable.smile);
            }
        });

        // pureボタン_クリックイベント
        ibtn_pure.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundResource(R.drawable.pure);
            }
        });

        // coolボタン_クリックイベント
        ibtn_cool.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundResource(R.drawable.cool);
            }
        });

        // Menuボタン_クリックイベント
        ibtn_menu.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setView(layout_menu)
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create().show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
