package com.simbirsoft.wordpressclient.ui.posts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.simbirsoft.wordpressclient.R;

import java.util.List;

public class PostsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PostsAdapter postsAdapter;
    List<Posts> postsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_posts);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.rv_posts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        postsList.add(
                new Posts(R.drawable.profile_avatar, R.drawable.post_label, "Заголовок поста", "Василий Петров", "Сегодня, 13:45"));
        postsList.add(
                new Posts(R.drawable.profile_avatar, R.drawable.post_label, "Заголовок поста", "Иван Иванов", "Вчера, 13:45"));

        postsAdapter = new PostsAdapter(this, postsList);
        recyclerView.setAdapter(postsAdapter);
    }

}
