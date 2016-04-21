package intentdemo.sample.com.intentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by anildeshpande on 18/02/16.
 */
public class ActivitySecond extends Activity {

    private TextView textViewMessage,textViewPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoyt_activity_second);


        textViewMessage=(TextView)findViewById(R.id.textViewMessage);
        textViewPerson=(TextView)findViewById(R.id.textViewPerson);

        String message=getIntent().getStringExtra("sampleKey");
        textViewMessage.setText(message);

        Person person=(Person)getIntent().getSerializableExtra("person");

        textViewPerson.setText(person.getFirstName()+", "+person.getLastName()+", "+person.getQualification());


    }
}
