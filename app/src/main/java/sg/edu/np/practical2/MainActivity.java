package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User u = new User("Darius","MAD Practical 2",1,Boolean.FALSE);
        Button button = findViewById(R.id.button);
        TextView name = findViewById(R.id.textView3);
        TextView description = findViewById(R.id.textView4);
        name.setText(u.getName());
        description.setText(u.getDescription());
        Log.v(TAG, "On Create!");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (u.getFollowed() == Boolean.FALSE) {
                    button.setText("UnFollow");
                    u.setFollowed(Boolean.TRUE);

                }
                else{
                    button.setText("Follow");
                    u.setFollowed(Boolean.FALSE);
                }
            }
        });
    }
}