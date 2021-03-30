package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//Aarush and Yiming, please leave a verification comment here if you are able to edit this file
//Aarush: Hi. This is epic!
//Yiming: HOWDY THERE CHICOS. LOVE THIS FIRE GROUP <3 WE STAN <3 TALL ENERGY
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This class has access to the two labels, the two edit text boxes, the four buttons, and the answer label

    //Step 1: Get the values from the two text boxes
    //Step 2: Perform the respective mathematical operation (depending on the button pressed)
    //Step 3: Display the answer to the answer label

    private double getFirstNum() {
        //Step 1: Get the values from the two text boxes
        EditText firstNumText = findViewById(R.id.firstNum);
        String firstNumStr = firstNumText.getText().toString();
        if (firstNumStr.isEmpty())
            firstNumStr = "0";
        //Step 2: Perform the respective mathematical operation (depending on the button pressed)
        double fNum = Double.parseDouble(firstNumStr);
        return fNum;
    }

    private double getSecondNum() {
        EditText secondNumText = findViewById(R.id.secondNum);
        String secondNumStr = secondNumText.getText().toString();
        if (secondNumStr.isEmpty())
            secondNumStr = "0";
        //Step 2: Perform the respective mathematical operation (depending on the button pressed)
        double sNum = Double.parseDouble(secondNumStr);
        return sNum;
    }

    private void setAnswer(double ans) {
        TextView answerText = findViewById(R.id.answerLabel);
        String ansStr = Double.toString(ans);
        answerText.setText("Answer: " + ansStr);

        //Step 4:
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", ansStr);
        startActivity(intent);
    }

    public void performAddition(View v) {
        double fNum = getFirstNum();
        double sNum = getSecondNum();
        double ans = fNum + sNum;

        setAnswer(ans);
        Toast toast = Toast.makeText(getApplicationContext(), "Adding values " + fNum + " and " + sNum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performSubtraction(View v) {
        double fNum = getFirstNum();
        double sNum = getSecondNum();
        double ans = fNum - sNum;

        setAnswer(ans);
        Toast toast = Toast.makeText(getApplicationContext(), "Subtracting values " + fNum + " and " + sNum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performMult(View v) {
        double fNum = getFirstNum();
        double sNum = getSecondNum();
        double ans = fNum * sNum;

        setAnswer(ans);
        Toast toast = Toast.makeText(getApplicationContext(), "Multiplying values " + fNum + " and " + sNum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performDiv(View v) {
        double fNum = getFirstNum();
        double sNum = getSecondNum();
        double ans = fNum / sNum;

        setAnswer(ans);
        Toast toast = Toast.makeText(getApplicationContext(), "Dividing values " + fNum + " and " + sNum, Toast.LENGTH_LONG);
        toast.show();
    }
}