package com.example.muzi.mycalculator;
        import android.app.Activity;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.text.DecimalFormat;
public class MainActivity extends Activity implements View.OnClickListener {
    private  Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_plus,b_minus,b_multipy,b_div,b_clear,b_point,b_delete,b_equal; //加减乘除 清空 小数点 删除一个字符 求余  等号
    private EditText editText;           //编辑框
    private String operator;            //操作符：记录 + - * / 符号
    private double n1 , n2 ,Result;     //操作数：操作符两端的数字，n1为左操作数，n2为右操作数。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到按钮
        b0=(Button) findViewById(R.id.btn_0);
        b1=(Button) findViewById(R.id.btn_1);
        b2=(Button) findViewById(R.id.btn_2);
        b3=(Button) findViewById(R.id.btn_3);
        b4=(Button) findViewById(R.id.btn_4);
        b5=(Button) findViewById(R.id.btn_5);
        b6=(Button) findViewById(R.id.btn_6);
        b7=(Button) findViewById(R.id.btn_7);
        b8=(Button) findViewById(R.id.btn_8);
        b9=(Button) findViewById(R.id.btn_9);

        b_clear=(Button) findViewById(R.id.btn_clear);
        b_delete=(Button) findViewById(R.id.btn_del);
        b_div=(Button) findViewById(R.id.btn_divide);
        b_multipy=(Button) findViewById(R.id.btn_multipy);

        b_minus=(Button) findViewById(R.id.btn_minus);
        b_plus=(Button) findViewById(R.id.btn_plus);
        b_equal=(Button) findViewById(R.id.btn_equal);
        b_point=(Button) findViewById(R.id.btn_point);
      //添加监听器
        editText=(EditText)findViewById(R.id.et_input);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b_clear.setOnClickListener(this);
        b_delete.setOnClickListener(this);
        b_div.setOnClickListener(this);
        b_multipy.setOnClickListener(this);

        b_minus.setOnClickListener(this);
        b_plus.setOnClickListener(this);
        b_equal.setOnClickListener(this);
        b_point.setOnClickListener(this);
    }
    public void onClick(View view) {//点击事件
        editText = (EditText)findViewById(R.id.et_input);//与XML中定义好的EditText控件绑定
        editText.setCursorVisible(false);//隐藏输入框光标
        String str,s ;
        int d1,d2;
        Button button = (Button)view;   //把点击获得的id信息传递给button
        DecimalFormat MyFormat = new DecimalFormat("###.##");//控制Double转为String的格式

        try{
            switch(button.getId())//获取点击按钮的ID，通过ID选择对应的选项执行
            {
                case R.id.btn_1://如果点击了按钮：“1”
                {
                    editText.setText(editText.getText().toString() + 1);//输入框末尾，添加一个“1”
                    break;
                }
                case R.id.btn_2://2
                {
                    editText.setText(editText.getText().toString() + 2);
                    break;
                }
                case R.id.btn_3://3
                {
                    editText.setText(editText.getText().toString() + 3);
                    break;
                }
                case R.id.btn_4://4
                {
                    editText.setText(editText.getText().toString() + + 4);
                    break;
                }
                case R.id.btn_5://5
                {
                    editText.setText(editText.getText().toString() + 5);
                    break;
                }
                case R.id.btn_6://6
                {
                    editText.setText(editText.getText().toString() +  6);
                    break;
                }
                case R.id.btn_7://7
                {
                    editText.setText(editText.getText().toString() +  7);
                    break;
                }
                case R.id.btn_8://8
                {
                    editText.setText(editText.getText().toString() +   8);
                    break;
                }
                case R.id.btn_9://9
                {
                    editText.setText(editText.getText().toString() +  9);
                    break;
                }
                case R.id.btn_0://0
                {
                    str = editText.getText().toString();
                    editText.setText(str + 0);
                    break;
                }
                case R.id.btn_clear://Clear
                {
                    editText.setText("");
                    str="";
                    s="";
                    operator="";
                    Result = 0;
                    break;
                }
                case R.id.btn_del://一次删除一个
                {
                    str=editText.getText().toString();
                        d1=str.length();
                        str=str.substring(0,d1-1);
                    editText.setText(str);
                    break;
                }
                case R.id.btn_point://.
                {
                    str = editText.getText().toString();
                    if(str.indexOf(".") != -1) //判断字符串中是否已包含小数点，如果有，就什么也不做
                    {}
                    else //如果没有小数点
                    {
                        if(str.equals("0"))//如果开始为0
                            editText.setText(("0" + ".").toString());
                        else if(str.equals(""))//如果初时显示为空，就什么也不做
                        {}
                        else
                            editText.setText(str + ".");
                    }
                    break;
                }
                case R.id.btn_plus://操作符+
                {
                    str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    operator = "+";
                    editText.setText(editText.getText().toString() + operator);
                    break;
                }
                case R.id.btn_minus://操作符-
                {
                    str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    operator = "-";
                    editText.setText(editText.getText().toString() + operator);
                    break;
                }
                case R.id.btn_multipy://操作符*
                {
                    str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    operator = "x";
                    editText.setText(editText.getText().toString() + operator);
                   // str1=editText.getText().toString();
                    break;
                }
                case R.id.btn_divide://操作符 /
                {
                    str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    operator = "/";
                    editText.setText(editText.getText().toString() +  operator);
                    break;
                }
                case R.id.btn_equal://操作符=
                {   editText.setText(editText.getText().toString() +  "=");
                    str=editText.getText().toString();
                    if(operator == "+")
                    {
                         d1=str.indexOf("+");
                         d2=str.indexOf("=");
                       s=str.substring(d1+1,d2);//////////d1要加1，因为要从操作符下一个位置才截取数字  一定要记住   这个bug改了好久//
                         n2 = Double.parseDouble(s);
                        Result = n1 + n2;
                        editText.setText(str+Result);
                    }
                    else if(operator == "-")
                    {
                         d1=str.indexOf("-");
                        d2=str.indexOf("=");
                        s=str.substring(d1+1,d2);
                        n2 = Double.parseDouble(s);
                        Result = n1 - n2;
                        editText.setText(str+Result);
                    }
                    else if(operator == "x")
                    {
                        d1=str.indexOf("x");
                        d2=str.indexOf("=");
                        s=str.substring(d1+1,d2);
                        n2 = Double.parseDouble(s);
                        Result = n1 * n2;
                        editText.setText(str+Result);
                    }
                    else if(operator == "/")
                    {
                         d1=str.indexOf("/");
                         d2=str.indexOf("=");
                        s=str.substring(d1+1,d2);
                        n2 = Double.parseDouble(s);
                        if(n2 == 0)
                        {
                            editText.setText("");
                            break;
                        }
                        else
                        {
                            Result = n1 / n2;
                            editText.setText(str+Result);
                        }
                    }
                    break;
                }
                default:
                    break;
            }
        }catch(Exception e){}
    }
}