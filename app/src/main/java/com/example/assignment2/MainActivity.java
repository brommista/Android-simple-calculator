/* Assignment 2 By Jaskaran Arora */

package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    String s1, s2;
    TextView result;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*This method takes the numbers input by users
This method also validates if user has entered integer for both Number 1 and Number 2
 */
    public boolean numberCheck() {
        /*Declaring the EditText and TextView used*/
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        result = (TextView) findViewById(R.id.txtResult);
        s1 = num1.getText().toString();
        s2 = num2.getText().toString();

        if (s1 != null && !s2.equals("")) {
            a=Integer.parseInt(s1); //Converting String to Integer
            b=Integer.parseInt(s2); //Converting String to Integer
            return true;
        }
// This else statement is to generate a warning to user to enter both Number 1 and Number 2
        else {
              result.setText("Please enter the values for both Number 1 and Number 2");
              return false;
        }
    }
//Public method to perform Add operation for calculator
    public void sendAdd(View view) {

        if (numberCheck()) {
            int res = a + b;
            result.setText(Integer.toString(res));
        }
    }
    //Public method to perform Minus operation for calculator
    public void sendMin(View view) {
        if (numberCheck()) {
            int res = a - b;
            result.setText(Integer.toString(res));
        }
    }
    //Public method to perform Multiply operation for calculator
    public void sendMult(View view) {
        if (numberCheck()) {
            int res = a * b;
            result.setText(Integer.toString(res));
        }
    }
    //Public method to perform Divide operation for calculator
    public void sendDiv(View view) {
        if (numberCheck()) {
            //This is to ensure for every divide function, value of Number 2 is not zero
            if (b!=0) {
                int res = a / b;
                result.setText(Integer.toString(res));
            }
            else{
                result.setText("Please enter a non zero value for Number 2");
            }
    }

    }

}