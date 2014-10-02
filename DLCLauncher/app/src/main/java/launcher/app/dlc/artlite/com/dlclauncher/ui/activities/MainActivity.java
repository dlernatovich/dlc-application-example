package launcher.app.dlc.artlite.com.dlclauncher.ui.activities;

import android.os.Bundle;

import java.util.List;

import launcher.app.dlc.artlite.com.dlclauncher.R;
import launcher.app.dlc.artlite.com.dlclauncher.helpers.ApplicationHelper;
import launcher.app.dlc.artlite.com.dlclauncher.ui.activities.abs.BaseActivity;


public class MainActivity extends BaseActivity {

    private List<String> applicationPackages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applicationPackages = ApplicationHelper.getApplicationList(this);
    }
}
