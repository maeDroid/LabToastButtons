package a00077546.comp3717.bcit.ca.labtoastbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void popupToast(View view) {

        String s = (String) view.getTag();
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
/*
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "a", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, "bc", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(this, "def", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, "ghij", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                Toast.makeText(this, "klm", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn6:
                Toast.makeText(this, "no", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn7:
                Toast.makeText(this, "p", Toast.LENGTH_LONG).show();
                break;
        }
        */
    }

}
