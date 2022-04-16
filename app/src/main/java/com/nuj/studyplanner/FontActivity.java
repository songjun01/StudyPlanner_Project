package com.nuj.studyplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FontActivity extends AppCompatActivity {
    String fontName;
    boolean selectFont=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);
    }
    public void onReturnClicked(View v) {
        if(selectFont) {
            Intent intent = new Intent();
            intent.putExtra("fontName", fontName);
            setResult(RESULT_OK, intent);
        }
        finish();
    }
    public void onDongdongApplyClicked(View v){
        fontName="font/cafe24dongdong.ttf";
        Toast.makeText(this,"<카페24 동동>을 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onOhsquareApplyClicked(View v){
        fontName="font/cafe24ohsquare.ttf";
        Toast.makeText(this,"<카페24 아네모네>를 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onShiningStarApplyClicked(View v){
        fontName="font/cafe24shiningstar.ttf";
        Toast.makeText(this,"<카페24 빛나는 별>을 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onSsukssukApplyClicked(View v){
        fontName="font/cafe24ssukssuk.ttf";
        Toast.makeText(this,"<카페24 쑥쑥>을 적용하였습니다.",Toast.LENGTH_SHORT).show();

        selectFont=true;}
    public void onSsurroundApplyClicked(View v){
        fontName="font/cafe24ssurround.ttf";
        Toast.makeText(this,"<카페24 써라운드>를 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onSyongsyongApplyClicked(View v){
        fontName="font/cafe24syongsyong.ttf";
        Toast.makeText(this,"<카페24 숑숑>을 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onOnemobilepopApplyClicked(View v){
        fontName="font/onemobilepop.ttf";
        Toast.makeText(this,"<원모바일 POP>를 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onRixyeoljeongdoApplyClicked(View v){
        fontName="font/rixyeoljeongdo_regular.ttf";
        Toast.makeText(this,"<Rix 열정도체>를 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
    public void onWemakepriceApplyClicked(View v){
        fontName="font/wemakeprice_regular.ttf";
        Toast.makeText(this,"<위메프체>를 적용하였습니다.",Toast.LENGTH_SHORT).show();
        selectFont=true;
    }
}