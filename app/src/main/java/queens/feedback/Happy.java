package queens.feedback;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Happy extends AppCompatActivity {

    Button button2;
    Button button3;
    final Context context = this;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
    }
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button2:
                Intent h = new Intent(Intent.ACTION_SEND);
                h.setType("message/rfc822");
//replace email address and password with your own
                h.putExtra(Intent.EXTRA_EMAIL  , new String[]{"youremailaddress"});
                h.putExtra(Intent.EXTRA_SUBJECT, "I'm happy");
                h.putExtra(Intent.EXTRA_TEXT   , "body of email");
                try {
                    startActivity(Intent.createChooser(h, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Happy.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button3:
                BackgroundMail bm = new BackgroundMail(context);
                bm.setGmailUserName("Yourgmailaccount");
                bm.setGmailPassword ("password");
                bm.setMailTo("Youremailaddress");
                bm.setFormSubject("I'm happy");
                bm.setFormBody("I don't want to leave a comment");
                bm.send();

        }
        ;
    }}