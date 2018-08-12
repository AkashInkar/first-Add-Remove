package com.example.felix_its.bottomnavigationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.felix_its.bottomnavigationdemo.Fragment.DashboradFragment;
import com.example.felix_its.bottomnavigationdemo.Fragment.HomeFragment;
import com.example.felix_its.bottomnavigationdemo.Fragment.NotificationFragment;
import com.example.felix_its.bottomnavigationdemo.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   changeFragment(new HomeFragment());
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(new DashboradFragment());
                    return true;
                case R.id.navigation_notifications:
                    changeFragment(new NotificationFragment());
                    return true;
                case R.id.navigation_Profile:
                    changeFragment(new ProfileFragment());
                    return true;
            }
            return false;
        }
    };

    public void changeFragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.parent,fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
