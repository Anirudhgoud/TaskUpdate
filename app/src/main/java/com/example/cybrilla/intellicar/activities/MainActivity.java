package com.example.cybrilla.intellicar.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.fragments.BookMarkFragment;
import com.example.cybrilla.intellicar.fragments.ProfileFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.book_list:
                break;

            case R.id.book_feed:
                break;

            case R.id.book_bookmarks:
                addBookmarkFragment();
                break;

            case R.id.profile:
                //TODO
                //   addProfileFragment();
                break;
        }
        return true;
    }


    private void addBookmarkFragment() {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(BookMarkFragment.class.getSimpleName());
        if (fragment == null) {
            fragment = new BookMarkFragment();
        }

        if (!fragment.isAdded()) {
            addFragments(fragment);
        }
    }

    private void addProfileFragment() {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(ProfileFragment.class.getSimpleName());
        if (fragment == null) {
            fragment = new ProfileFragment();
        }

        if (!fragment.isAdded()) {
            addFragments(fragment);
        }
    }


    private void addFragments(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName());
        fragmentTransaction.commit();
    }

}
