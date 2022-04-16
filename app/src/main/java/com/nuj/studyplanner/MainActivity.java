package com.nuj.studyplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainActivity extends AppCompatActivity {
    boolean setting = false;
    Button font, ok;
    TextView monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    EditText monOne,tuesOne,wednesOne,thursOne,friOne,saturOne,sunOne;
    EditText monTwo,tuesTwo,wednesTwo,thursTwo,friTwo,saturTwo,sunTwo;
    EditText monThree,tuesThree,wednesThree,thursThree,friThree,saturThree,sunThree;
    EditText monFour,tuesFour,wednesFour,thursFour,friFour,saturFour,sunFour;
    EditText monFive,tuesFive,wednesFive,thursFive,friFive,saturFive,sunFive;
    EditText monSix,tuesSix,wednesSix,thursSix,friSix,saturSix,sunSix;
    EditText monSeven,tuesSeven,wednesSeven,thursSeven,friSeven,saturSeven,sunSeven;
    EditText monEight,tuesEight,wednesEight,thursEight,friEight,saturEight,sunEight;
    EditText monNine,tuesNine,wednesNine,thursNine,friNine,saturNine,sunNine;
    EditText monTen,tuesTen,wednesTen,thursTen,friTen,saturTen,sunTen;
    final int REQUEST_CHANGE = 1001;
    public static String filename = "planner";
    String appFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        font = findViewById(R.id.idFont);
        ok = findViewById(R.id.idOK);

        {
            // Day /////////////////////////////////////////////
            monday = findViewById(R.id.Monday);
            tuesday = findViewById(R.id.Tuesday);
            wednesday = findViewById(R.id.Wednesday);
            thursday = findViewById(R.id.Thursday);
            friday = findViewById(R.id.Friday);
            saturday = findViewById(R.id.Saturday);
            sunday = findViewById(R.id.Sunday);
            // One /////////////////////////////////////////////
            monOne = findViewById(R.id.MondayOne);
            tuesOne = findViewById(R.id.TuesdayOne);
            wednesOne = findViewById(R.id.WednesdayOne);
            thursOne = findViewById(R.id.ThursdayOne);
            friOne = findViewById(R.id.FridayOne);
            saturOne = findViewById(R.id.SaturdayOne);
            sunOne = findViewById(R.id.SundayOne);
            // Two /////////////////////////////////////////////
            monTwo = findViewById(R.id.MondayTwo);
            tuesTwo = findViewById(R.id.TuesdayTwo);
            wednesTwo = findViewById(R.id.WednesdayTwo);
            thursTwo = findViewById(R.id.ThursdayTwo);
            friTwo = findViewById(R.id.FridayTwo);
            saturTwo = findViewById(R.id.SaturdayTwo);
            sunTwo = findViewById(R.id.SundayTwo);
            // Three /////////////////////////////////////////////
            monThree = findViewById(R.id.MondayThree);
            tuesThree = findViewById(R.id.TuesdayThree);
            wednesThree = findViewById(R.id.WednesdayThree);
            thursThree = findViewById(R.id.ThursdayThree);
            friThree = findViewById(R.id.FridayThree);
            saturThree = findViewById(R.id.SaturdayThree);
            sunThree = findViewById(R.id.SundayThree);
            // Four /////////////////////////////////////////////
            monFour = findViewById(R.id.MondayFour);
            tuesFour = findViewById(R.id.TuesdayFour);
            wednesFour = findViewById(R.id.WednesdayFour);
            thursFour = findViewById(R.id.ThursdayFour);
            friFour = findViewById(R.id.FridayFour);
            saturFour = findViewById(R.id.SaturdayFour);
            sunFour = findViewById(R.id.SundayFour);
            // Five /////////////////////////////////////////////
            monFive = findViewById(R.id.MondayFive);
            tuesFive = findViewById(R.id.TuesdayFive);
            wednesFive = findViewById(R.id.WednesdayFive);
            thursFive = findViewById(R.id.ThursdayFive);
            friFive = findViewById(R.id.FridayFive);
            saturFive = findViewById(R.id.SaturdayFive);
            sunFive = findViewById(R.id.SundayFive);
            // Six /////////////////////////////////////////////
            monSix = findViewById(R.id.MondaySix);
            tuesSix = findViewById(R.id.TuesdaySix);
            wednesSix = findViewById(R.id.WednesdaySix);
            thursSix = findViewById(R.id.ThursdaySix);
            friSix = findViewById(R.id.FridaySix);
            saturSix = findViewById(R.id.SaturdaySix);
            sunSix = findViewById(R.id.SundaySix);
            // Seven /////////////////////////////////////////////
            monSeven = findViewById(R.id.MondaySeven);
            tuesSeven = findViewById(R.id.TuesdaySeven);
            wednesSeven = findViewById(R.id.WednesdaySeven);
            thursSeven = findViewById(R.id.ThursdaySeven);
            friSeven = findViewById(R.id.FridaySeven);
            saturSeven = findViewById(R.id.SaturdaySeven);
            sunSeven = findViewById(R.id.SundaySeven);
            // Eight /////////////////////////////////////////////
            monEight = findViewById(R.id.MondayEight);
            tuesEight = findViewById(R.id.TuesdayEight);
            wednesEight = findViewById(R.id.WednesdayEight);
            thursEight = findViewById(R.id.ThursdayEight);
            friEight = findViewById(R.id.FridayEight);
            saturEight = findViewById(R.id.SaturdayEight);
            sunEight = findViewById(R.id.SundayEight);
            // Nine /////////////////////////////////////////////
            monNine = findViewById(R.id.MondayNine);
            tuesNine = findViewById(R.id.TuesdayNine);
            wednesNine = findViewById(R.id.WednesdayNine);
            thursNine = findViewById(R.id.ThursdayNine);
            friNine = findViewById(R.id.FridayNine);
            saturNine = findViewById(R.id.SaturdayNine);
            sunNine = findViewById(R.id.SundayNine);
            // Ten /////////////////////////////////////////////
            monTen = findViewById(R.id.MondayTen);
            tuesTen = findViewById(R.id.TuesdayTen);
            wednesTen = findViewById(R.id.WednesdayTen);
            thursTen = findViewById(R.id.ThursdayTen);
            friTen = findViewById(R.id.FridayTen);
            saturTen = findViewById(R.id.SaturdayTen);
            sunTen = findViewById(R.id.SundayTen);

        }

        isClose();
        loadFromFile();

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CHANGE) {
            if (resultCode != RESULT_OK) {
                return;
            }
            appFont = data.getExtras().getString("fontName");
            resetFont();
        }
    }
    public void onSettingClicked(View v) {
        if (!setting) {
            setting = true;
            ok.setVisibility(View.VISIBLE);
            font.setVisibility(View.VISIBLE);
            Toast.makeText(this,"과목을 설정하세요",Toast.LENGTH_SHORT).show();
            isOpen();
        }
    }
    public void onOkClicked(View v) {
        if(setting) {
            setting = false;
            ok.setVisibility(View.INVISIBLE);
            font.setVisibility(View.INVISIBLE);
            Toast.makeText(this,"저장을 완료했어요",Toast.LENGTH_SHORT).show();
            isClose();
            saveToFile();
        }
    }
    public void onFontClicked(View v) {
        Intent intent = new Intent(this, FontActivity.class);
        startActivityForResult(intent, REQUEST_CHANGE);
    }
    public void resetFont() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), appFont);
        Toast.makeText(this, appFont, Toast.LENGTH_SHORT).show();
        //font 설정
        {
            // Day /////////////////////////////////////////////
            monday.setTypeface(typeface);
            tuesday.setTypeface(typeface);
            wednesday.setTypeface(typeface);
            thursday.setTypeface(typeface);
            friday.setTypeface(typeface);
            saturday.setTypeface(typeface);
            sunday.setTypeface(typeface);
            // One /////////////////////////////////////////////
            monOne.setTypeface(typeface);
            tuesOne.setTypeface(typeface);
            wednesOne.setTypeface(typeface);
            thursOne.setTypeface(typeface);
            friOne.setTypeface(typeface);
            saturOne.setTypeface(typeface);
            sunOne.setTypeface(typeface);
            // Two /////////////////////////////////////////////
            monTwo.setTypeface(typeface);
            tuesTwo.setTypeface(typeface);
            wednesTwo.setTypeface(typeface);
            thursTwo.setTypeface(typeface);
            friTwo.setTypeface(typeface);
            saturTwo.setTypeface(typeface);
            sunTwo.setTypeface(typeface);
            // Three /////////////////////////////////////////////
            monThree.setTypeface(typeface);
            tuesThree.setTypeface(typeface);
            wednesThree.setTypeface(typeface);
            thursThree.setTypeface(typeface);
            friThree.setTypeface(typeface);
            saturThree.setTypeface(typeface);
            sunThree.setTypeface(typeface);
            // Four /////////////////////////////////////////////
            monFour.setTypeface(typeface);
            tuesFour.setTypeface(typeface);
            wednesFour.setTypeface(typeface);
            thursFour.setTypeface(typeface);
            friFour.setTypeface(typeface);
            saturFour.setTypeface(typeface);
            sunFour.setTypeface(typeface);
            // Five /////////////////////////////////////////////
            monFive.setTypeface(typeface);
            tuesFive.setTypeface(typeface);
            wednesFive.setTypeface(typeface);
            thursFive.setTypeface(typeface);
            friFive.setTypeface(typeface);
            saturFive.setTypeface(typeface);
            sunFive.setTypeface(typeface);
            // Six /////////////////////////////////////////////
            monSix.setTypeface(typeface);
            tuesSix.setTypeface(typeface);
            wednesSix.setTypeface(typeface);
            thursSix.setTypeface(typeface);
            friSix.setTypeface(typeface);
            saturSix.setTypeface(typeface);
            sunSix.setTypeface(typeface);
            // Seven /////////////////////////////////////////////
            monSeven.setTypeface(typeface);
            tuesSeven.setTypeface(typeface);
            wednesSeven.setTypeface(typeface);
            thursSeven.setTypeface(typeface);
            friSeven.setTypeface(typeface);
            saturSeven.setTypeface(typeface);
            sunSeven.setTypeface(typeface);
            // Eight /////////////////////////////////////////////
            monEight.setTypeface(typeface);
            tuesEight.setTypeface(typeface);
            wednesEight.setTypeface(typeface);
            thursEight.setTypeface(typeface);
            friEight.setTypeface(typeface);
            saturEight.setTypeface(typeface);
            sunEight.setTypeface(typeface);
            // Nine /////////////////////////////////////////////
            monNine.setTypeface(typeface);
            tuesNine.setTypeface(typeface);
            wednesNine.setTypeface(typeface);
            thursNine.setTypeface(typeface);
            friNine.setTypeface(typeface);
            saturNine.setTypeface(typeface);
            sunNine.setTypeface(typeface);
            // Ten /////////////////////////////////////////////
            monTen.setTypeface(typeface);
            tuesTen.setTypeface(typeface);
            wednesTen.setTypeface(typeface);
            thursTen.setTypeface(typeface);
            friTen.setTypeface(typeface);
            saturTen.setTypeface(typeface);
            sunTen.setTypeface(typeface);
        }
    }

    private void saveToFile() {
        File file = new File(getFilesDir(), filename);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            //내용 저장
            {
                // One /////////////////////////////////////////////
                bw.write(monOne.getText().toString() + "\n");
                bw.write(tuesOne.getText().toString() + "\n");
                bw.write(wednesOne.getText().toString() + "\n");
                bw.write(thursOne.getText().toString() + "\n");
                bw.write(friOne.getText().toString() + "\n");
                bw.write(saturOne.getText().toString() + "\n");
                bw.write(sunOne.getText().toString() + "\n");
                // Two /////////////////////////////////////////////
                bw.write(monTwo.getText().toString() + "\n");
                bw.write(tuesTwo.getText().toString() + "\n");
                bw.write(wednesTwo.getText().toString() + "\n");
                bw.write(thursTwo.getText().toString() + "\n");
                bw.write(friTwo.getText().toString() + "\n");
                bw.write(saturTwo.getText().toString() + "\n");
                bw.write(sunTwo.getText().toString() + "\n");
                // Three /////////////////////////////////////////////
                bw.write(monThree.getText().toString() + "\n");
                bw.write(tuesThree.getText().toString() + "\n");
                bw.write(wednesThree.getText().toString() + "\n");
                bw.write(thursThree.getText().toString() + "\n");
                bw.write(friThree.getText().toString() + "\n");
                bw.write(saturThree.getText().toString() + "\n");
                bw.write(sunThree.getText().toString() + "\n");
                // Four /////////////////////////////////////////////
                bw.write(monFour.getText().toString() + "\n");
                bw.write(tuesFour.getText().toString() + "\n");
                bw.write(wednesFour.getText().toString() + "\n");
                bw.write(thursFour.getText().toString() + "\n");
                bw.write(friFour.getText().toString() + "\n");
                bw.write(saturFour.getText().toString() + "\n");
                bw.write(sunFour.getText().toString() + "\n");
                // Five /////////////////////////////////////////////
                bw.write(monFive.getText().toString() + "\n");
                bw.write(tuesFive.getText().toString() + "\n");
                bw.write(wednesFive.getText().toString() + "\n");
                bw.write(thursFive.getText().toString() + "\n");
                bw.write(friFive.getText().toString() + "\n");
                bw.write(saturFive.getText().toString() + "\n");
                bw.write(sunFive.getText().toString() + "\n");
                // Six /////////////////////////////////////////////
                bw.write(monSix.getText().toString() + "\n");
                bw.write(tuesSix.getText().toString() + "\n");
                bw.write(wednesSix.getText().toString() + "\n");
                bw.write(thursSix.getText().toString() + "\n");
                bw.write(friSix.getText().toString() + "\n");
                bw.write(saturSix.getText().toString() + "\n");
                bw.write(sunSix.getText().toString() + "\n");
                // Seven /////////////////////////////////////////////
                bw.write(monSeven.getText().toString() + "\n");
                bw.write(tuesSeven.getText().toString() + "\n");
                bw.write(wednesSeven.getText().toString() + "\n");
                bw.write(thursSeven.getText().toString() + "\n");
                bw.write(friSeven.getText().toString() + "\n");
                bw.write(saturSeven.getText().toString() + "\n");
                bw.write(sunSeven.getText().toString() + "\n");
                // Eight /////////////////////////////////////////////
                bw.write(monEight.getText().toString() + "\n");
                bw.write(tuesEight.getText().toString() + "\n");
                bw.write(wednesEight.getText().toString() + "\n");
                bw.write(thursEight.getText().toString() + "\n");
                bw.write(friEight.getText().toString() + "\n");
                bw.write(saturEight.getText().toString() + "\n");
                bw.write(sunEight.getText().toString() + "\n");
                // Nine /////////////////////////////////////////////
                bw.write(monNine.getText().toString() + "\n");
                bw.write(tuesNine.getText().toString() + "\n");
                bw.write(wednesNine.getText().toString() + "\n");
                bw.write(thursNine.getText().toString() + "\n");
                bw.write(friNine.getText().toString() + "\n");
                bw.write(saturNine.getText().toString() + "\n");
                bw.write(sunNine.getText().toString() + "\n");
                // Ten /////////////////////////////////////////////
                bw.write(monTen.getText().toString() + "\n");
                bw.write(tuesTen.getText().toString() + "\n");
                bw.write(wednesTen.getText().toString() + "\n");
                bw.write(thursTen.getText().toString() + "\n");
                bw.write(friTen.getText().toString() + "\n");
                bw.write(saturTen.getText().toString() + "\n");
                bw.write(sunTen.getText().toString() + "\n");
            }
            bw.write(appFont + "\n");

            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (bw != null) {
                bw.close();
            }
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void loadFromFile() {
        File file = new File(getFilesDir(), filename);
        FileReader fr = null;
        BufferedReader br = null;
        if (file.exists()) {
            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                //내용 불러오기
                {
                    // One /////////////////////////////////////////////
                    monOne.setText(br.readLine());
                    tuesOne.setText(br.readLine());
                    wednesOne.setText(br.readLine());
                    thursOne.setText(br.readLine());
                    friOne.setText(br.readLine());
                    saturOne.setText(br.readLine());
                    sunOne.setText(br.readLine());
                    // Two /////////////////////////////////////////////
                    monTwo.setText(br.readLine());
                    tuesTwo.setText(br.readLine());
                    wednesTwo.setText(br.readLine());
                    thursTwo.setText(br.readLine());
                    friTwo.setText(br.readLine());
                    saturTwo.setText(br.readLine());
                    sunTwo.setText(br.readLine());
                    // Three /////////////////////////////////////////////
                    monThree.setText(br.readLine());
                    tuesThree.setText(br.readLine());
                    wednesThree.setText(br.readLine());
                    thursThree.setText(br.readLine());
                    friThree.setText(br.readLine());
                    saturThree.setText(br.readLine());
                    sunThree.setText(br.readLine());
                    // Four /////////////////////////////////////////////
                    monFour.setText(br.readLine());
                    tuesFour.setText(br.readLine());
                    wednesFour.setText(br.readLine());
                    thursFour.setText(br.readLine());
                    friFour.setText(br.readLine());
                    saturFour.setText(br.readLine());
                    sunFour.setText(br.readLine());
                    // Five /////////////////////////////////////////////
                    monFive.setText(br.readLine());
                    tuesFive.setText(br.readLine());
                    wednesFive.setText(br.readLine());
                    thursFive.setText(br.readLine());
                    friFive.setText(br.readLine());
                    saturFive.setText(br.readLine());
                    sunFive.setText(br.readLine());
                    // Six /////////////////////////////////////////////
                    monSix.setText(br.readLine());
                    tuesSix.setText(br.readLine());
                    wednesSix.setText(br.readLine());
                    thursSix.setText(br.readLine());
                    friSix.setText(br.readLine());
                    saturSix.setText(br.readLine());
                    sunSix.setText(br.readLine());
                    // Seven /////////////////////////////////////////////
                    monSeven.setText(br.readLine());
                    tuesSeven.setText(br.readLine());
                    wednesSeven.setText(br.readLine());
                    thursSeven.setText(br.readLine());
                    friSeven.setText(br.readLine());
                    saturSeven.setText(br.readLine());
                    sunSeven.setText(br.readLine());
                    // Eight /////////////////////////////////////////////
                    monEight.setText(br.readLine());
                    tuesEight.setText(br.readLine());
                    wednesEight.setText(br.readLine());
                    thursEight.setText(br.readLine());
                    friEight.setText(br.readLine());
                    saturEight.setText(br.readLine());
                    sunEight.setText(br.readLine());
                    // Nine /////////////////////////////////////////////
                    monNine.setText(br.readLine());
                    tuesNine.setText(br.readLine());
                    wednesNine.setText(br.readLine());
                    thursNine.setText(br.readLine());
                    friNine.setText(br.readLine());
                    saturNine.setText(br.readLine());
                    sunNine.setText(br.readLine());
                    // Ten /////////////////////////////////////////////
                    monTen.setText(br.readLine());
                    tuesTen.setText(br.readLine());
                    wednesTen.setText(br.readLine());
                    thursTen.setText(br.readLine());
                    friTen.setText(br.readLine());
                    saturTen.setText(br.readLine());
                    sunTen.setText(br.readLine());
                }
                appFont = br.readLine();
                resetFont();

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //모든 EditText 글씨사용 가능하게
    public void isOpen() {
        // One /////////////////////////////////////////////
        monOne.setFocusableInTouchMode(true);
        tuesOne.setFocusableInTouchMode(true);
        wednesOne.setFocusableInTouchMode(true);
        thursOne.setFocusableInTouchMode(true);
        friOne.setFocusableInTouchMode(true);
        saturOne.setFocusableInTouchMode(true);
        sunOne.setFocusableInTouchMode(true);
        // Two /////////////////////////////////////////////
        monTwo.setFocusableInTouchMode(true);
        tuesTwo.setFocusableInTouchMode(true);
        wednesTwo.setFocusableInTouchMode(true);
        thursTwo.setFocusableInTouchMode(true);
        friTwo.setFocusableInTouchMode(true);
        saturTwo.setFocusableInTouchMode(true);
        sunTwo.setFocusableInTouchMode(true);
        // Three /////////////////////////////////////////////
        monThree.setFocusableInTouchMode(true);
        tuesThree.setFocusableInTouchMode(true);
        wednesThree.setFocusableInTouchMode(true);
        thursThree.setFocusableInTouchMode(true);
        friThree.setFocusableInTouchMode(true);
        saturThree.setFocusableInTouchMode(true);
        sunThree.setFocusableInTouchMode(true);
        // Four /////////////////////////////////////////////
        monFour.setFocusableInTouchMode(true);
        tuesFour.setFocusableInTouchMode(true);
        wednesFour.setFocusableInTouchMode(true);
        thursFour.setFocusableInTouchMode(true);
        friFour.setFocusableInTouchMode(true);
        saturFour.setFocusableInTouchMode(true);
        sunFour.setFocusableInTouchMode(true);
        // Five /////////////////////////////////////////////
        monFive.setFocusableInTouchMode(true);
        tuesFive.setFocusableInTouchMode(true);
        wednesFive.setFocusableInTouchMode(true);
        thursFive.setFocusableInTouchMode(true);
        friFive.setFocusableInTouchMode(true);
        saturFive.setFocusableInTouchMode(true);
        sunFive.setFocusableInTouchMode(true);
        // Six /////////////////////////////////////////////
        monSix.setFocusableInTouchMode(true);
        tuesSix.setFocusableInTouchMode(true);
        wednesSix.setFocusableInTouchMode(true);
        thursSix.setFocusableInTouchMode(true);
        friSix.setFocusableInTouchMode(true);
        saturSix.setFocusableInTouchMode(true);
        sunSix.setFocusableInTouchMode(true);
        // Seven /////////////////////////////////////////////
        monSeven.setFocusableInTouchMode(true);
        tuesSeven.setFocusableInTouchMode(true);
        wednesSeven.setFocusableInTouchMode(true);
        thursSeven.setFocusableInTouchMode(true);
        friSeven.setFocusableInTouchMode(true);
        saturSeven.setFocusableInTouchMode(true);
        sunSeven.setFocusableInTouchMode(true);
        // Eight /////////////////////////////////////////////
        monEight.setFocusableInTouchMode(true);
        tuesEight.setFocusableInTouchMode(true);
        wednesEight.setFocusableInTouchMode(true);
        thursEight.setFocusableInTouchMode(true);
        friEight.setFocusableInTouchMode(true);
        saturEight.setFocusableInTouchMode(true);
        sunEight.setFocusableInTouchMode(true);
        // Nine /////////////////////////////////////////////
        monNine.setFocusableInTouchMode(true);
        tuesNine.setFocusableInTouchMode(true);
        wednesNine.setFocusableInTouchMode(true);
        thursNine.setFocusableInTouchMode(true);
        friNine.setFocusableInTouchMode(true);
        saturNine.setFocusableInTouchMode(true);
        sunNine.setFocusableInTouchMode(true);
        // Ten /////////////////////////////////////////////
        monTen.setFocusableInTouchMode(true);
        tuesTen.setFocusableInTouchMode(true);
        wednesTen.setFocusableInTouchMode(true);
        thursTen.setFocusableInTouchMode(true);
        friTen.setFocusableInTouchMode(true);
        saturTen.setFocusableInTouchMode(true);
        sunTen.setFocusableInTouchMode(true);
    }

    //모든 EditText 글씨사용 불가능하게
    public void isClose() {
        // One /////////////////////////////////////////////
        monOne.setFocusableInTouchMode(false);
        tuesOne.setFocusableInTouchMode(false);
        wednesOne.setFocusableInTouchMode(false);
        thursOne.setFocusableInTouchMode(false);
        friOne.setFocusableInTouchMode(false);
        saturOne.setFocusableInTouchMode(false);
        sunOne.setFocusableInTouchMode(false);
        // Two /////////////////////////////////////////////
        monTwo.setFocusableInTouchMode(false);
        tuesTwo.setFocusableInTouchMode(false);
        wednesTwo.setFocusableInTouchMode(false);
        thursTwo.setFocusableInTouchMode(false);
        friTwo.setFocusableInTouchMode(false);
        saturTwo.setFocusableInTouchMode(false);
        sunTwo.setFocusableInTouchMode(false);
        // Three /////////////////////////////////////////////
        monThree.setFocusableInTouchMode(false);
        tuesThree.setFocusableInTouchMode(false);
        wednesThree.setFocusableInTouchMode(false);
        thursThree.setFocusableInTouchMode(false);
        friThree.setFocusableInTouchMode(false);
        saturThree.setFocusableInTouchMode(false);
        sunThree.setFocusableInTouchMode(false);
        // Four /////////////////////////////////////////////
        monFour.setFocusableInTouchMode(false);
        tuesFour.setFocusableInTouchMode(false);
        wednesFour.setFocusableInTouchMode(false);
        thursFour.setFocusableInTouchMode(false);
        friFour.setFocusableInTouchMode(false);
        saturFour.setFocusableInTouchMode(false);
        sunFour.setFocusableInTouchMode(false);
        // Five /////////////////////////////////////////////
        monFive.setFocusableInTouchMode(false);
        tuesFive.setFocusableInTouchMode(false);
        wednesFive.setFocusableInTouchMode(false);
        thursFive.setFocusableInTouchMode(false);
        friFive.setFocusableInTouchMode(false);
        saturFive.setFocusableInTouchMode(false);
        sunFive.setFocusableInTouchMode(false);
        // Six /////////////////////////////////////////////
        monSix.setFocusableInTouchMode(false);
        tuesSix.setFocusableInTouchMode(false);
        wednesSix.setFocusableInTouchMode(false);
        thursSix.setFocusableInTouchMode(false);
        friSix.setFocusableInTouchMode(false);
        saturSix.setFocusableInTouchMode(false);
        sunSix.setFocusableInTouchMode(false);
        // Seven /////////////////////////////////////////////
        monSeven.setFocusableInTouchMode(false);
        tuesSeven.setFocusableInTouchMode(false);
        wednesSeven.setFocusableInTouchMode(false);
        thursSeven.setFocusableInTouchMode(false);
        friSeven.setFocusableInTouchMode(false);
        saturSeven.setFocusableInTouchMode(false);
        sunSeven.setFocusableInTouchMode(false);
        // Eight /////////////////////////////////////////////
        monEight.setFocusableInTouchMode(false);
        tuesEight.setFocusableInTouchMode(false);
        wednesEight.setFocusableInTouchMode(false);
        thursEight.setFocusableInTouchMode(false);
        friEight.setFocusableInTouchMode(false);
        saturEight.setFocusableInTouchMode(false);
        sunEight.setFocusableInTouchMode(false);
        // Nine /////////////////////////////////////////////
        monNine.setFocusableInTouchMode(false);
        tuesNine.setFocusableInTouchMode(false);
        wednesNine.setFocusableInTouchMode(false);
        thursNine.setFocusableInTouchMode(false);
        friNine.setFocusableInTouchMode(false);
        saturNine.setFocusableInTouchMode(false);
        sunNine.setFocusableInTouchMode(false);
        // Ten /////////////////////////////////////////////
        monTen.setFocusableInTouchMode(false);
        tuesTen.setFocusableInTouchMode(false);
        wednesTen.setFocusableInTouchMode(false);
        thursTen.setFocusableInTouchMode(false);
        friTen.setFocusableInTouchMode(false);
        saturTen.setFocusableInTouchMode(false);
        sunTen.setFocusableInTouchMode(false);
    }
}
