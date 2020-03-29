package com.e.multiviews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
NavigationView navigationView;
DrawerLayout drawerLayout;
    BottomNavigationView  bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        navigationView=findViewById (R.id.id2);
        drawerLayout=findViewById (R.id.drawerlayout);
        bottomNavigationView=findViewById (R.id.id1);
        navigationView.setNavigationItemSelectedListener (new NavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               userdefinemethod(menuItem);
                return false;
            }

            private void userdefinemethod(MenuItem menuItem) {
                switch (menuItem.getItemId ())
                {
                    case R.id.nav_friends:
                        Toast.makeText (MainActivity.this, "friend is clicked", Toast.LENGTH_SHORT).show ();
                        break;
                    case R.id.nav_Messages:
                        Toast.makeText (MainActivity.this, "Messages is clicked", Toast.LENGTH_SHORT).show ();
                        break;
                    case R.id.nav_logout:
                        Toast.makeText (MainActivity.this, "logout is clicked", Toast.LENGTH_SHORT).show ();
                        break;
                    case R.id.nav_setting:
                        Toast.makeText (MainActivity.this, "setting us is clicked", Toast.LENGTH_SHORT).show ();
                        break;

                    default:
                        Toast.makeText (MainActivity.this, "Defualt selection", Toast.LENGTH_SHORT).show ();



                }


            }
        });
        bottomNavigationView.setOnNavigationItemReselectedListener (new BottomNavigationView.OnNavigationItemReselectedListener () {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId ())
            {
                case R.id.nav_home:
                    Toast.makeText (MainActivity.this, "Home is clicked", Toast.LENGTH_SHORT).show ();
                    break;

                case R.id.nav_search:
                    Toast.makeText (MainActivity.this, "search is clicked", Toast.LENGTH_SHORT).show ();
                    break;

                case R.id.nav_suscribe:
                    Toast.makeText (MainActivity.this, "Suscribtion is clicked", Toast.LENGTH_SHORT).show ();
                    break;

                case R.id.nav_aboutus:
                    Toast.makeText (MainActivity.this, "About us is clicked", Toast.LENGTH_SHORT).show ();
                    break;
                default:
                    Toast.makeText (MainActivity.this, "Invalid Selection", Toast.LENGTH_SHORT).show ();
            }
            }

        });
    }
}
