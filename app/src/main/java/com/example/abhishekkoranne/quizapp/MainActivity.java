package com.example.abhishekkoranne.quizapp;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    int Points = 0;
    @BindView(R.id.q1)
    TextView q1;
    @BindView(R.id.q2)
    TextView q2;
    @BindView(R.id.q3)
    TextView q3;
    @BindView(R.id.q4)
    TextView q4;
    @BindView(R.id.q5)
    TextView q5;
    @BindView(R.id.q6)
    TextView q6;
    @BindView(R.id.q7)
    TextView q7;
    @BindView(R.id.q8)
    TextView q8;
    @BindView(R.id.q9)
    TextView q9;
    @BindView(R.id.q10)
    TextView q10;

    @BindView(R.id.q3rg)
    RadioGroup q3rg;
    @BindView(R.id.q4rg)
    RadioGroup q4rg;
    @BindView(R.id.q5rg)
    RadioGroup q5rg;
    @BindView(R.id.q6rg)
    RadioGroup q6rg;
    @BindView(R.id.q8rg)
    RadioGroup q8rg;

    @BindView(R.id.eta1)
    EditText eta1;
    @BindView(R.id.eta9)
    EditText eta9;
    @BindView(R.id.eta10)
    EditText eta10;

    @BindView(R.id.q2cb1)
    CheckBox q2cb1;
    @BindView(R.id.q2cb2)
    CheckBox q2cb2;
    @BindView(R.id.q2cb3)
    CheckBox q2cb3;
    @BindView(R.id.q2cb4)
    CheckBox q2cb4;
    @BindView(R.id.q7cb1)
    CheckBox q7cb1;
    @BindView(R.id.q7cb2)
    CheckBox q7cb2;
    @BindView(R.id.q7cb3)
    CheckBox q7cb3;
    @BindView(R.id.q7cb4)
    CheckBox q7cb4;

    @BindView(R.id.q3rb1)
    RadioButton q3rb1;
    @BindView(R.id.q3rb2)
    RadioButton q3rb2;
    @BindView(R.id.q3rb3)
    RadioButton q3rb3;
    @BindView(R.id.q3rb4)
    RadioButton q3rb4;
    @BindView(R.id.q4rb1)
    RadioButton q4rb1;
    @BindView(R.id.q4rb2)
    RadioButton q4rb2;
    @BindView(R.id.q4rb3)
    RadioButton q4rb3;
    @BindView(R.id.q4rb4)
    RadioButton q4rb4;
    @BindView(R.id.q5rb1)
    RadioButton q5rb1;
    @BindView(R.id.q5rb2)
    RadioButton q5rb2;
    @BindView(R.id.q5rb3)
    RadioButton q5rb3;
    @BindView(R.id.q5rb4)
    RadioButton q5rb4;
    @BindView(R.id.q6rb1)
    RadioButton q6rb1;
    @BindView(R.id.q6rb2)
    RadioButton q6rb2;
    @BindView(R.id.q6rb3)
    RadioButton q6rb3;
    @BindView(R.id.q6rb4)
    RadioButton q6rb4;
    @BindView(R.id.q8rb1)
    RadioButton q8rb1;
    @BindView(R.id.q8rb2)
    RadioButton q8rb2;
    @BindView(R.id.q8rb3)
    RadioButton q8rb3;
    @BindView(R.id.q8rb4)
    RadioButton q8rb4;

    @BindView(R.id.q1Points)
    TextView q1Points;
    @BindView(R.id.q2Points)
    TextView q2Points;
    @BindView(R.id.q3Points)
    TextView q3Points;
    @BindView(R.id.q4Points)
    TextView q4Points;
    @BindView(R.id.q5Points)
    TextView q5Points;
    @BindView(R.id.q6Points)
    TextView q6Points;
    @BindView(R.id.q7Points)
    TextView q7Points;
    @BindView(R.id.q8Points)
    TextView q8Points;
    @BindView(R.id.q9Points)
    TextView q9Points;
    @BindView(R.id.q10Points)
    TextView q10Points;

    @BindView(R.id.submit)
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        q1.setText(getString(R.string.q1));
        q2.setText(getString(R.string.q2));
        q3.setText(getString(R.string.q3));
        q4.setText(getString(R.string.q4));
        q5.setText(getString(R.string.q5));
        q6.setText(getString(R.string.q6));
        q7.setText(getString(R.string.q7));
        q8.setText(getString(R.string.q8));
        q9.setText(getString(R.string.q9));
        q10.setText(getString(R.string.q10));

        q2cb1.setText(getString(R.string.q2cb1));
        q2cb2.setText(getString(R.string.q2cb2));
        q2cb3.setText(getString(R.string.q2cb3));
        q2cb4.setText(getString(R.string.q2cb4));

        q3rb1.setText(getString(R.string.q3rb1));
        q3rb2.setText(getString(R.string.q3rb2));
        q3rb3.setText(getString(R.string.q3rb3));
        q3rb4.setText(getString(R.string.q3rb4));

        q4rb1.setText(getString(R.string.q4rb1));
        q4rb2.setText(getString(R.string.q4rb2));
        q4rb3.setText(getString(R.string.q4rb3));
        q4rb4.setText(getString(R.string.q4rb4));

        q5rb1.setText(getString(R.string.q5rb1));
        q5rb2.setText(getString(R.string.q5rb2));
        q5rb3.setText(getString(R.string.q5rb3));
        q5rb4.setText(getString(R.string.q5rb4));

        q6rb1.setText(getString(R.string.q6rb1));
        q6rb2.setText(getString(R.string.q6rb2));
        q6rb3.setText(getString(R.string.q6rb3));
        q6rb4.setText(getString(R.string.q6rb4));

        q7cb1.setText(getString(R.string.q7cb1));
        q7cb2.setText(getString(R.string.q7cb2));
        q7cb3.setText(getString(R.string.q7cb3));
        q7cb4.setText(getString(R.string.q7cb4));

        q8rb1.setText(getString(R.string.q8rb1));
        q8rb2.setText(getString(R.string.q8rb2));
        q8rb3.setText(getString(R.string.q8rb3));
        q8rb4.setText(getString(R.string.q8rb4));

        eta9.getText().toString();
        eta10.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Points = 0;
                correct();
                Toast.makeText(MainActivity.this, "Score: " + Points, Toast.LENGTH_SHORT).show();
            }
        });
    }

    void correct() {
        if (eta1.getText().toString().equals(getString(R.string.q1ans))) {
            Points++;
            q1Points.setText(getString(R.string.correct));
            eta1.setBackgroundColor(getResources().getColor(R.color.correct));
        } else {
            q1Points.setText(getString(R.string.incorrect));
            eta1.setBackgroundColor(getResources().getColor(R.color.wrong));
        }

        if (q2cb1.isChecked() && q2cb3.isChecked() && q2cb4.isChecked() && !q2cb2.isChecked()) {
            Points++;
            q2Points.setText(getString(R.string.correct));
            q2cb1.setBackgroundColor(getResources().getColor(R.color.correct));
            q2cb3.setBackgroundColor(getResources().getColor(R.color.correct));
            q2cb4.setBackgroundColor(getResources().getColor(R.color.correct));
        } else {
            if (q2cb2.isChecked()) {
                q2cb2.setChecked(false);
                q2cb2.setBackgroundColor(getResources().getColor(R.color.wrong));
                q2Points.setText(getString(R.string.incorrect));
                q2cb1.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb1.setChecked(true);
                q2cb3.setChecked(true);
                q2cb4.setChecked(true);

            } else if (!q2cb1.isChecked()) {
                q2cb1.setTextColor(getResources().getColor(R.color.wrong));
                q2Points.setText(getString(R.string.incorrect));
                q2cb1.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb1.setChecked(true);
                q2cb3.setChecked(true);
                q2cb4.setChecked(true);

            } else if (!q2cb3.isChecked()) {
                q2cb3.setTextColor(getResources().getColor(R.color.wrong));
                q2Points.setText(getString(R.string.incorrect));
                q2cb1.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb1.setChecked(true);
                q2cb3.setChecked(true);
                q2cb4.setChecked(true);

            } else if (!q2cb4.isChecked()) {
                q2cb4.setTextColor(getResources().getColor(R.color.wrong));
                q2Points.setText(getString(R.string.incorrect));
                q2cb1.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q2cb1.setChecked(true);
                q2cb3.setChecked(true);
                q2cb4.setChecked(true);

            }
        }

        if (q3rb4.isChecked()) {
            Points++;
            q3rb4.setBackgroundColor(getResources().getColor(R.color.correct));
            q3Points.setText(getString(R.string.correct));
        } else {
            if (q3rb1.isChecked()) {
                q3rb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q3Points.setText(getString(R.string.incorrect));
                q3rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q3rb4.setChecked(true);
            } else if (q3rb2.isChecked()) {
                q3rb2.setBackgroundColor(getResources().getColor(R.color.wrong));
                q3Points.setText(getString(R.string.incorrect));
                q3rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q3rb4.setChecked(true);
            } else if (q3rb3.isChecked()) {
                q3rb3.setBackgroundColor(getResources().getColor(R.color.wrong));
                q3Points.setText(getString(R.string.incorrect));
                q3rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q3rb4.setChecked(true);
            }
        }

        if (q4rb2.isChecked()) {
            Points++;
            q4rb2.setBackgroundColor(getResources().getColor(R.color.correct));
            q4Points.setText(getString(R.string.correct));
        } else {
            if (q4rb1.isChecked()) {
                q4rb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q4rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q4rb2.setChecked(true);
                q4Points.setText(getString(R.string.incorrect));
            } else if (q4rb3.isChecked()) {
                q4rb3.setBackgroundColor(getResources().getColor(R.color.wrong));
                q4rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q4rb2.setChecked(true);
                q4Points.setText(getString(R.string.incorrect));
            } else if (q4rb4.isChecked()) {
                q4rb4.setBackgroundColor(getResources().getColor(R.color.wrong));
                q4rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q4rb2.setChecked(true);
                q4Points.setText(getString(R.string.incorrect));
            }
        }

        if (q5rb2.isChecked()) {
            Points++;
            q5rb2.setBackgroundColor(getResources().getColor(R.color.correct));
            q5Points.setText(getString(R.string.correct));
        } else {
            if (q5rb1.isChecked()) {
                q5rb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q5rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q5rb2.setChecked(true);
                q5Points.setText(getString(R.string.incorrect));
            } else if (q4rb3.isChecked()) {
                q5rb3.setBackgroundColor(getResources().getColor(R.color.wrong));
                q5rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q5rb2.setChecked(true);
                q5Points.setText(getString(R.string.incorrect));
            } else if (q4rb4.isChecked()) {
                q5rb4.setBackgroundColor(getResources().getColor(R.color.wrong));
                q5rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q5rb2.setChecked(true);
                q5Points.setText(getString(R.string.incorrect));

            }
        }

        if (q6rb4.isChecked()) {
            Points++;
            q6rb4.setBackgroundColor(getResources().getColor(R.color.correct));
            q6Points.setText(getString(R.string.correct));
        } else {
            if (q6rb1.isChecked()) {
                q6rb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q6rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q6rb4.setChecked(true);
                q6Points.setText(getString(R.string.incorrect));
            } else if (q6rb2.isChecked()) {
                q6rb2.setBackgroundColor(getResources().getColor(R.color.wrong));
                q6rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q6rb4.setChecked(true);
                q6Points.setText(getString(R.string.incorrect));
            } else if (q6rb3.isChecked()) {
                q6rb3.setBackgroundColor(getResources().getColor(R.color.wrong));
                q6rb4.setBackgroundColor(getResources().getColor(R.color.correct));
                q6rb4.setChecked(true);
                q6Points.setText(getString(R.string.incorrect));
            }
        }

        if (q7cb2.isChecked() && q7cb3.isChecked() && !q7cb1.isChecked() && !q7cb4.isChecked()) {
            Points++;
            q7Points.setText(getString(R.string.correct));
            q7cb2.setBackgroundColor(getResources().getColor(R.color.correct));
            q7cb3.setBackgroundColor(getResources().getColor(R.color.correct));
        } else {
            if (q7cb1.isChecked()) {
                q7cb1.setChecked(false);
                q7cb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q7Points.setText(getString(R.string.incorrect));
                q7cb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb2.setChecked(true);
                q7cb3.setChecked(true);
            } else if (q7cb4.isChecked()) {
                q7cb4.setChecked(false);
                q7cb4.setBackgroundColor(getResources().getColor(R.color.wrong));
                q7Points.setText(getString(R.string.incorrect));
                q7cb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb2.setChecked(true);
                q7cb3.setChecked(true);
            } else if (!q7cb2.isChecked()) {
                q7cb2.setTextColor(getResources().getColor(R.color.wrong));
                q7Points.setText(getString(R.string.incorrect));
                q7cb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb2.setChecked(true);
                q7cb3.setChecked(true);
            } else if (!q7cb3.isChecked()) {
                q7cb3.setTextColor(getResources().getColor(R.color.wrong));
                q7Points.setText(getString(R.string.incorrect));
                q7cb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb3.setBackgroundColor(getResources().getColor(R.color.correct));
                q7cb2.setChecked(true);
                q7cb3.setChecked(true);
            }
        }

        if (q8rb2.isChecked()) {
            Points++;
            q8rb2.setBackgroundColor(getResources().getColor(R.color.correct));
            q8Points.setText(getString(R.string.correct));
        } else {
            if (q8rb1.isChecked()) {
                q8rb1.setBackgroundColor(getResources().getColor(R.color.wrong));
                q8rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q8rb2.setChecked(true);
                q8Points.setText(getString(R.string.incorrect));
            } else if (q4rb3.isChecked()) {
                q8rb3.setBackgroundColor(getResources().getColor(R.color.wrong));
                q8rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q8rb2.setChecked(true);
                q8Points.setText(getString(R.string.incorrect));
            } else if (q4rb4.isChecked()) {
                q8rb4.setBackgroundColor(getResources().getColor(R.color.wrong));
                q8rb2.setBackgroundColor(getResources().getColor(R.color.correct));
                q8rb2.setChecked(true);
                q8Points.setText(getString(R.string.incorrect));
            }
        }

        if (eta9.getText().toString().equalsIgnoreCase(getString(R.string.q9ans))) {
            Points++;
            q9Points.setText(getString(R.string.correct));
            eta9.setBackgroundColor(getResources().getColor(R.color.correct));
        } else {
            q9Points.setText(getString(R.string.incorrect));
            eta9.setBackgroundColor(getResources().getColor(R.color.wrong));
        }

        if (eta10.getText().toString().equalsIgnoreCase(getString(R.string.q10ans))) {
            Points++;
            q10Points.setText(getString(R.string.correct));
            eta10.setBackgroundColor(getResources().getColor(R.color.correct));
        } else {
            q10Points.setText(getString(R.string.incorrect));
            eta10.setBackgroundColor(getResources().getColor(R.color.wrong));
        }
    }
}