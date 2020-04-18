package tech.iwish.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

import tech.iwish.myapp.R;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.togglebutton);
        Toast.makeText(this, ""+toggleButton.getText(), Toast.LENGTH_SHORT).show();

        
    }

    private void appiconhide() {

//        PackageManager p = getPackageManager();
//        ComponentName componentName = new ComponentName(this, MainActivity.class);
//        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);

    }
}
