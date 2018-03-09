package com.brenopolanski.calc;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.brenopolanski.calc.models.Calc;

import java.math.BigDecimal;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalcActivity extends AppCompatActivity {

    @BindView(R.id.input1) EditText input1;
    @BindView(R.id.input2) EditText input2;
    @BindView(R.id.result) TextView result;

    private Calc calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);
        calc = new Calc();
    }

    @OnClick(R.id.calc_sum)
    public void btnSumOnClick() {
        try {
            int result = calc.sum(getNumInput1(), getNumInput2());
            setResult(result);
        } catch (NumberFormatException num) {
            num.printStackTrace();
        }
    }

    private void setResult(Integer result) {
        this.result.setText(String.valueOf(result));
    }

    @NonNull
    private Integer getNumInput1() {
        return Integer.parseInt(input1.getText().toString());
    }

    @NonNull
    private Integer getNumInput2() {
        return Integer.parseInt(input2.getText().toString());
    }
}
