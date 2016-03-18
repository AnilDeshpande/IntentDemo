package intentdemo.sample.com.intentdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button buttonNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNextActivity=(Button)findViewById(R.id.buttonNextActivity);
        buttonNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();
                Intent secondActIntent=new Intent(MainActivity.this,ActivitySecond.class);
                secondActIntent.putExtra("sampleKey", "This message is being sent from first activity");

                Person person=new Person();
                person.setFirstName("Ankit");
                person.setLastName("Agarwal");
                person.setQualification("B.E");

               secondActIntent.putExtra("person",person);
                startActivity(secondActIntent);

                /*Intent intent=new Intent();
                intent.setAction("com.sample.intent");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);*/


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
