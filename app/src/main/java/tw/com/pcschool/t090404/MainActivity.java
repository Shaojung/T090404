package tw.com.pcschool.t090404;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Scroller;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String result = MyUtils.getRawData(MainActivity.this, R.raw.gowest);
        tv = (TextView)findViewById(R.id.textView);
        tv.setText(result);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

}
