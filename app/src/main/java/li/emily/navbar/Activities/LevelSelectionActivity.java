package li.emily.navbar.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import li.emily.navbar.Fragments.QuestionFragment;
import li.emily.navbar.R;

public class LevelSelectionActivity extends AppCompatActivity {

    private ImageView easy;
    private ImageView medium;
    private ImageView hard;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_level_layout);
    }

    public void onEasyClick(View v){
        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        startActivity(intent);
    }

    public void onMediumClick(View v){
        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        startActivity(intent);
    }

    public void onHardClick(View v){
        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        startActivity(intent);
    }

}