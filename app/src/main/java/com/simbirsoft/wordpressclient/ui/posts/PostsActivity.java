package com.simbirsoft.wordpressclient.ui.posts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.simbirsoft.wordpressclient.R;
import com.simbirsoft.wordpressclient.ui.blogs.Blogs;
import com.simbirsoft.wordpressclient.ui.blogs.BlogsAdapter;
import com.simbirsoft.wordpressclient.ui.blogs.BlogsFragment;

import java.util.List;

public class PostsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PostsAdapter postsAdapter;
    List<Posts> postsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_posts);
        Toolbar toolbar = findViewById(R.id.toolbar_profile);
        setSupportActionBar(toolbar);




        recyclerView = findViewById(R.id.recycler_view_posts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        postsList.add(
                new Posts(R.drawable.profile_avatar, R.drawable.post_label,"Заголовок поста", "Василий Петров", "Сегодня, 13:45"));
        postsList.add(
                new Posts(R.drawable.profile_avatar, R.drawable.post_label,"Заголовок поста", "Иван Иванов", "Вчера, 13:45"));

        postsAdapter = new PostsAdapter(this, postsList);
        recyclerView.setAdapter(postsAdapter);



    }


}
