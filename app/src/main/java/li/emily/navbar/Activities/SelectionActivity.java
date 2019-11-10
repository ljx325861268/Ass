package li.emily.navbar.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import li.emily.navbar.R;
import li.emily.navbar.Adapters.TopicAdapter;
import li.emily.navbar.Model.TopicDB;

public class SelectionActivity extends AppCompatActivity implements TopicAdapter.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_geo_topic);

        RecyclerView rv = findViewById(R.id.selection_rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        TopicAdapter topicAdapter = new TopicAdapter(TopicDB.getTopicMap(), this);
        rv.setAdapter(topicAdapter);
    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(getApplicationContext(), LevelSelectionActivity.class);
        startActivity(intent);
    }
}
