package com.alhaj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Var
    double n1, n2;
    String op;
    String result = "";
    Converter con = new Converter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView txt_result = findViewById(R.id.txtv_result);
        //Numbers
        Button number_0 = findViewById(R.id.btn_0);
        Button number_1 = findViewById(R.id.btn_1);
        Button number_2 = findViewById(R.id.btn_2);
        Button number_3 = findViewById(R.id.btn_3);
        Button number_4 = findViewById(R.id.btn_4);
        Button number_5 = findViewById(R.id.btn_5);
        Button number_6 = findViewById(R.id.btn_6);
        Button number_7 = findViewById(R.id.btn_7);
        Button number_8 = findViewById(R.id.btn_8);
        Button number_9 = findViewById(R.id.btn_9);
        Button number_point = findViewById(R.id.btn_point);
        //Operator
        Button operator_add = findViewById(R.id.btn_add);
        Button operator_minus = findViewById(R.id.btn_sub);
        Button operator_multi = findViewById(R.id.btn_multi);
        Button operator_devid = findViewById(R.id.btn_dev);
        //Extra Operator
        Button Extra_persent = findViewById(R.id.btn_persent);
        Button Extra_sqrt = findViewById(R.id.btn_sqrt);
        Button Extra_pow = findViewById(R.id.btn_pow);
        Button Extra_base = findViewById(R.id.btn_base);
        Button Extra_changeop = findViewById(R.id.btn_change);
        //Function
        Button function_C = findViewById(R.id.btn_C);
        Button function_CE = findViewById(R.id.btn_CE);
        Button function_B = findViewById(R.id.btn_back);
        Button function_Equal = findViewById(R.id.btn_equal);
        //Convert
        Button convertToBin = findViewById(R.id.btn_ToBin);
        Button convertToHex = findViewById(R.id.btn_ToHex);
        Button convertToOCT = findViewById(R.id.btn_ToOct);

        //Numbers Clicks
        number_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_result.getText() == "" || txt_result.getText() == "0") {
                    result = "0";
                    txt_result.setText(result);
                } else {
                    result = result + "0";
                    txt_result.setText(result);
                }
            }
        });
        number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "1";
                txt_result.setText(result);

            }
        });
        number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "2";
                txt_result.setText(result);

            }
        });
        number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result += "3";
                txt_result.setText(result);

            }
        });
        number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "4";
                txt_result.setText(result);

            }
        });
        number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "5";
                txt_result.setText(result);

            }
        });
        number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "6";
                txt_result.setText(result);

            }
        });
        number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "7";
                txt_result.setText(result);

            }
        });
        number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "8";
                txt_result.setText(result);

            }
        });
        number_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + "9";
                txt_result.setText(result);

            }
        });
        number_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result + ".";
                txt_result.setText(result);

            }
        });
        //Basic Operator
        operator_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n1 = Double.parseDouble(txt_result.getText().toString());
                    op = "+";
                    result += op;
                    txt_result.setText(result);
                    result = "";
                    txt_result.setText("");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

            }
        });
        operator_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n1 = Double.parseDouble(txt_result.getText().toString());
                    op = "-";
                    result += op;
                    txt_result.setText(result);
                    result = "";
                    txt_result.setText("");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

            }
        });
        operator_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n1 = Double.parseDouble(txt_result.getText().toString());
                    op = "*";
                    result += op;
                    txt_result.setText(result);
                    result = "";

                    txt_result.setText("");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

            }
        });
        operator_devid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n1 = Double.parseDouble(txt_result.getText().toString());
                    op = "/";
                    result += op;
                    txt_result.setText(result);
                    result = "";

                    txt_result.setText("");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

            }
        });

        //Function

        function_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                n1 = 0.0;
                n2 = 0.0;
                op = "";
                result = "";
                txt_result.setText(result);
            }

        });
        function_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 > 0) {
                    n2 = 0.0;
                }
                if (op == "") {
                    op = "";
                }
                txt_result.setText("");
            }
        });
        function_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldS;
                oldS = txt_result.getText().toString();
                if (oldS != null && oldS.length() > 0) {
                    oldS = oldS.substring(0, oldS.length() - 1);
                }
                result = oldS;
                txt_result.setText(result);

            }
        });
        function_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n2 = Double.parseDouble(txt_result.getText().toString());
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

                if (op != null && op.length() > 0) {
                    switch (op) {
                        case "%": {
                            double desult = n1 % n2;
                            txt_result.setText(desult + "");
                            result = "";
                            op = "";
                        }
                        break;


                        case "+": {
                            double desult = n1 + n2;
                            txt_result.setText(desult + "");
                            result = "";
                            op = "";
                        }
                        break;
                        case "-": {
                            double desult = n1 - n2;
                            txt_result.setText(desult + "");
                            result = "";
                            op = "";
                        }
                        break;
                        case "*": {
                            double desult = n1 * n2;
                            txt_result.setText(desult + "");
                            result = "";
                            op = "";
                        }
                        break;
                        case "/": {
                            if (n2 != 0) {
                                double desult = n1 / n2;
                                txt_result.setText(desult + "");
                                result = "";
                                op = "";
                            } else
                                txt_result.setText("Can't divised to zero ");
                        }
                        break;
                    }

                }
            }
        });
        //Extra
        Extra_persent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1 = Double.parseDouble(txt_result.getText().toString());
                    op = "%";
                    result += op;
                    txt_result.setText(result);
                    result = "";

                    txt_result.setText("");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }

            }
        });
        Extra_changeop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double n3, rn3;
                    n3 = Double.parseDouble(txt_result.getText().toString());
                     rn3 = 0-n3;
                     txt_result.setText(rn3+"");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }
            }
        });
        Extra_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dpow;
                try {
                    dpow = Double.parseDouble(txt_result.getText().toString());
                    double desult ;
                    desult = Math.pow(dpow,2);
                    txt_result.setText(desult + "");

                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }
            }
        });
        Extra_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dsqrt;
                try {
                    dsqrt = Double.parseDouble(txt_result.getText().toString());
                    double desult ;
                    desult = Math.sqrt(dsqrt);
                    txt_result.setText(desult + "");
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }
            }
        });
        Extra_base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dbase;
                try {
                    dbase = Double.parseDouble(txt_result.getText().toString());
                    double desult ;
                    if (dbase != 0)
                    {
                        desult = 1/dbase;
                        txt_result.setText(desult + "");
                    }
                    else
                    {
                        txt_result.setText("Can't divised to zero ");
                    }
                } catch (NumberFormatException e) {
                    txt_result.setText("ERROR Isn't a number");
                }
            }
        });
        convertToBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = txt_result.getText().toString();
                try {
                    int dec = Integer.parseInt(value);
                    txt_result.setText(con.decTobin(dec));
                }
                catch (NumberFormatException e)
                {
                    txt_result.setText(e.getMessage()+" "+e.getCause());
                }
            }
        });
        convertToHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = txt_result.getText().toString();
                try {
                    int dec = Integer.parseInt(value);
                    txt_result.setText(con.decTohex(dec));
                }
                catch (NumberFormatException e)
                {
                    txt_result.setText(e.getMessage()+" "+e.getCause());
                }

            }
        });
        convertToOCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = txt_result.getText().toString();
                try {
                    int dec = Integer.parseInt(value);
                    txt_result.setText(con.decToOct(dec));
                }
                catch (NumberFormatException e)
                {
                    txt_result.setText(e.getMessage()+" "+e.getCause());
                }

            }
        });

    }
}
