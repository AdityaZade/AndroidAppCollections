package android.example.scorekeeper;
import android.example.scorekeeper.R;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a= 0;
    int score_b= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void point_3_a(View view){
        score_a= score_a + 3;
        display_a(score_a);
    }

    public void point_2_a(View view){
        score_a= score_a + 2;
        display_a(score_a);
    }
    public void point_1_a(View view){
        score_a= score_a + 1;
        display_a(score_a);
    }
    public void point_3_b(View view){
        score_b= score_b + 3;
        display_b(score_b);
    }
    public void point_2_b(View view){
        score_b= score_b + 2;
        display_b(score_b);
    }
    public void point_1_b(View view){
        score_b= score_b + 1;
        display_b(score_b);
    }

    public void reset(View view){
        score_a= 0;
        score_b= 0;
        display_a(0);
        display_b(0);
    }
    public void point_6_a(View view){
        score_a= score_a + 6;
        display_a(score_a);
    }

    public void point_5_a(View view){
        score_a= score_a + 5;
        display_a(score_a);
    }
    public void point_4_a(View view){
        score_a= score_a + 4;
        display_a(score_a);
    }
    public void point_6_b(View view){
        score_b= score_b + 6;
        display_b(score_b);
    }
    public void point_5_b(View view){
        score_b= score_b + 5;
        display_b(score_b);
    }
    public void point_4_b(View view){
        score_b= score_b + 4;
        display_b(score_b);
    }

    private void display_a(int number_a){
        TextView quantityTextView_a= findViewById(R.id.score_team_a);
        quantityTextView_a.setText("" + number_a);

    }
    private void display_b(int number_b){
        TextView quantityTextView_b= findViewById(R.id.score_team_b);
        quantityTextView_b.setText("" + number_b);

    }
}