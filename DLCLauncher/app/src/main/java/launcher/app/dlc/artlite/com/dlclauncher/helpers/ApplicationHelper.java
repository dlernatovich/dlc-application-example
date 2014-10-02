package launcher.app.dlc.artlite.com.dlclauncher.helpers;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dlernatovich on 10/2/14.
 */
public class ApplicationHelper {
    public static final String TAG = "ApplicationHelper.class";

    public static void showInstalledApplication(Activity activity) {
        List<ApplicationInfo> packages = getApplications(activity);
        for (ApplicationInfo packageInfo : packages) {
            Log.d(TAG, packageInfo.packageName);
        }
    }

    public static List<String> getApplicationList(Activity activity) {
        List<ApplicationInfo> packages = getApplications(activity);
        List<String> result = new ArrayList<String>();
        for (ApplicationInfo info : packages) {
            result.add(info.packageName);
        }
        return result;
    }

    private static List<ApplicationInfo> getApplications(Activity activity) {
        final PackageManager pm = activity.getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        return packages;
    }
}
