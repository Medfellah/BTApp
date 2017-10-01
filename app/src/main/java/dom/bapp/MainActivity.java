package dom.bapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnActivity1;

    BTservice.ConnectedThread CT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity1 = (Button) findViewById(R.id.idBT);
        CT.run();
        }
    public void btn1(View v) {
        setContentView(R.layout.activity_main);
        CT.write(new byte[1]);}
    public void btn2(View v)
    {
        setContentView(R.layout.activity_main);
        CT.write(new byte[2]);
    }

    public void btn3(View v)
    {
        setContentView(R.layout.activity_main);
        CT.write(new byte[3]);
    }
    public void btn4(View v)
    {
        setContentView(R.layout.activity_main);
        CT.write(new byte[4]);
    }
    public void btnClickAct1(View v){
        Intent i = new Intent(this,BT.class);
        startActivity(i);
    }
    @Override
    protected void onDestroy(){
        CT.cancel();
        super.onDestroy();
    }

}
