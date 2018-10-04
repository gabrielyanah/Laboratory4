package ph.edu.iicsust.hernandez.allianagabriel.laboratory4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "TOAST!";
                int duration = Toast.LENGTH_LONG;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar message";
                int duration = Snackbar.LENGTH_LONG;
                showSnackbar(view, message, duration);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar message with actions";
                int duration = Snackbar.LENGTH_LONG;

                showSnackbaract(view, message, duration);
            }
        });
    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }

    public void showSnackbaract (View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener(){
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }
}