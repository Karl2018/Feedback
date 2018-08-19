package queens.feedback;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sad extends AppCompatActivity {

    Button button2;
    Button button3;
    final Context context = this;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);
    }
    public void onClick (View v) {

        switch (v.getId()) {
            case R.id.button2:
                Intent h = new Intent(Intent.ACTION_SEND);
                h.setType("message/rfc822");
                h.putExtra(Intent.EXTRA_EMAIL  , new String[]{"emailaddress"});
                h.putExtra(Intent.EXTRA_SUBJECT, "Something bothers me");
                h.putExtra(Intent.EXTRA_TEXT   , "body of email");
                try {
                    startActivity(Intent.createChooser(h, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Sad.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button3:

                BackgroundMail bm = new BackgroundMail(context);
                bm.setGmailUserName("emailaddress");
                bm.setGmailPassword ("Password");
                bm.setMailTo("emailaddress");
                bm.setFormSubject("Something bothers me");
                bm.setFormBody("I don't want to leave a comment");
                bm.send();
        }
        ;
    }}
