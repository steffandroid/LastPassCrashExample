package uk.co.steffandroid.linkifycrashexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.forgot_password);
        Linkify.addLinks(textView, Pattern.compile("^*.*$"), "https://my.vanmoof.com/password/email/", null, (matcher, s) -> "");
    }
}
