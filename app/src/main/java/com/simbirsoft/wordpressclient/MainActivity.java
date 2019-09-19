package com.simbirsoft.wordpressclient;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.simbirsoft.wordpressclient.ui.blogs.BlogsFragment;
import com.simbirsoft.wordpressclient.ui.bookmarks.BookmarksFragment;
import com.simbirsoft.wordpressclient.ui.categories.CategoriesFragment;
import com.simbirsoft.wordpressclient.ui.favorites.FavoritesFragment;
import com.simbirsoft.wordpressclient.ui.labels.LabelsFragment;
import com.simbirsoft.wordpressclient.ui.posts.PostsActivity;
import com.simbirsoft.wordpressclient.ui.profile.ProfileActivity;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private AppBarConfiguration mAppBarConfiguration;
    BlogsFragment blogsFragment;
    CategoriesFragment categoriesFragment;
    LabelsFragment labelsFragment;
    FavoritesFragment favoritesFragment;
    BookmarksFragment bookmarksFragment;
    DrawerLayout drawer;
    private ActionBarDrawerToggle drawerToggle;
    ImageButton imageButton;
    Intent intent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_menu);
        Toolbar toolbar = findViewById(R.id.toolbar_profile);
        setSupportActionBar(toolbar);


        /* FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        drawer = findViewById(R.id.drawer_layout);


        NavigationView navigationView = findViewById(R.id.nav_view);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_blogs, R.id.nav_categories, R.id.nav_labels,
                R.id.nav_favorites, R.id.nav_bookmarks, R.id.nav_exit)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        navigationView.setNavigationItemSelectedListener(this);



    }

public void openProfile(View view)
{
    Intent intent = new Intent(this, ProfileActivity.class);
     startActivity(intent);
}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;


        switch (item.getItemId())
        {
            case R.id.nav_blogs:
            fragment = new BlogsFragment();
            break;

            case R.id.nav_categories:
            fragment = new CategoriesFragment();
            break;


            case R.id.nav_labels:
            fragment = new LabelsFragment();
            break;


            case R.id.nav_favorites:
         fragment = new FavoritesFragment();
         break;


            case R.id.nav_bookmarks:
          fragment = new BookmarksFragment();
          break;



          default:  fragment = new BlogsFragment();
              break;

        }






        // Вставляем фрагмент, заменяя текущий фрагмент
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.constraintContainer, fragment).commit();


        // Выделяем выбранный пункт меню в шторке
        item.setChecked(true);
        // Выводим выбранный пункт в заголовке
        setTitle(item.getTitle());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
