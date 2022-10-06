package com.example.caculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtN1;
    private EditText txtN2;
    private TextView txvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = (EditText) findViewById(R.id.edit_N1);
        txtN2 = (EditText) findViewById(R.id.edit_N2);
        txvResult = (TextView) findViewById(R.id.txv_result);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!txtN1.getText().toString().equals("") && !txtN2.getText().toString().equals(""))
                {
                    int num1 = Integer.parseInt(txtN1.getText().toString());
                    int num2 = Integer.parseInt(txtN2.getText().toString());

                    txvResult.setText(String.valueOf(num1+num2));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        txtN1.addTextChangedListener(textWatcher);
        txtN2.addTextChangedListener(textWatcher);

    }




    public void add(View view)
    {
        String strN1 = txtN1.getText().toString();
        String strN2 = txtN2.getText().toString();

        int n1 = Integer.parseInt(strN1);
        int n2 = Integer.parseInt(strN2);

        int r = n1 + n2;
        txvResult.setText("Result = " + r);
    }
}