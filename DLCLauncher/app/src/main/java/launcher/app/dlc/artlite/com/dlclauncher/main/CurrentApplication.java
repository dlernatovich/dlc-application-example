package launcher.app.dlc.artlite.com.dlclauncher.main;

import android.app.Application;

/**
 * Created by dlernatovich on 10/2/14.
 */
public class CurrentApplication extends Application {
    private static CurrentApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static CurrentApplication getInstance() {
        return instance;
    }
}
