package li.emily.navbar.Activities;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import li.emily.navbar.Fragments.QuestionFragment;
import li.emily.navbar.R;

public class QuestionActivity extends FragmentActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);

        QuestionFragment fragment = new QuestionFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.question_fragment, fragment);
        fragmentTransaction.commit();
        System.out.print("abc");
    }
}
