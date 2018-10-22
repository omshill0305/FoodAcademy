package com.example.olga.foodacademyv2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private AboutFragment aboutFragment;
    private BookFragment bookFragment;
    private EventsFragment eventsFragment;
    private RouteFragment routeFragment;
    private MoreFragment moreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        aboutFragment = new AboutFragment();
        eventsFragment = new EventsFragment();
        bookFragment = new BookFragment();
        routeFragment = new RouteFragment();
        moreFragment = new MoreFragment();


        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_about:
                        //mMainNav.setItemIconTint(R.color.colorAccent);
                        setFragment(aboutFragment);
                        return true;
                    case R.id.nav_book:
                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(bookFragment);
                        return true;
                    case R.id.nav_events:
                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(eventsFragment);
                        return true;

                    case R.id.nav_route:
                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(routeFragment);
                        return true;

                    case R.id.nav_more:
                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(moreFragment);
                        return true;

                    default:
                        return false;
                }


            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
