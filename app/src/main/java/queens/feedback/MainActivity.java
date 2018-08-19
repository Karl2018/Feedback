package queens.feedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    ImageButton button;
    ImageButton button01;
    final Context context = this;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){

        switch(v.getId()){
            case R.id.button:
                Intent intent = new Intent(context, Happy.class);
                startActivity(intent);
                break;
            case R.id.button01:
                Intent intent01 = new Intent(context, Sad.class);
                startActivity(intent01);
                break;
        };
    }
}





