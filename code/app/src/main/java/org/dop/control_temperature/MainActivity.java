package org.dop.control_temperature;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.google.android.material.navigation.NavigationBarView;

import org.dop.control_temperature.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigationview);


        binding.bottomNavigationview.setOnItemSelectedListener(item -> {

            int itemId = item.getItemId();
            if(itemId == R.id.home){
                replaceFragment(new HomeFragment());
            } else if (itemId == R.id.view) {
                replaceFragment(new ViewFragment());
            } else if (itemId == R.id.graph) {
                replaceFragment(new GraphFragment());
            } else if (itemId == R.id.log) {
                replaceFragment(new LogFragment());
            }
            return true;
        });

    }
    private  void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, fragment);
        fragmentTransaction.commit();
    }
}