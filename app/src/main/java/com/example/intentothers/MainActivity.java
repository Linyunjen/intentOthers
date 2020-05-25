package com.example.intentothers;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void btnOK(View view){
    Intent intent = new Intent(Intent.ACTION_VIEW );

    switch (view.getId()){
        case R.id.btnEmail:
            intent.setData(Uri.parse("Mail to :shely171817@yahoo.com.tw"));
            intent.putExtra(Intent.EXTRA_SUBJECT,"好久不見");
            intent.putExtra(Intent.EXTRA_TEXT,"你好嗎?美女!");

            break;
        case R.id .btnWeb :
            intent .setData(Uri.parse("http://www.csim.hk.edu.tw/main.php"));

            break;
        case R.id .btnMap :
            intent .setData(Uri.parse("https://reurl.cc/nzp92l"));

            break;
        case R.id .btnWebSearch  :
            intent .setAction(intent.ACTION_WEB_SEARCH );
            intent.putExtra(SearchManager.QUERY,"弘光科技大學");

            break;
    }
    startActivity(intent);
}
}
