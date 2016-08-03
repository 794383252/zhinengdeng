package Util;

import android.util.Log;

/**
 * Created by Administrator on 2016/8/2.
 */
public class LogUtil {

    private boolean deDug = true;
    private String TAG = "ln";

    public void i(String message) {
        if (deDug)
            Log.i(TAG, message);
    }

    public void d(String message)
    {
        if (deDug)
            Log.d(TAG,message);
    }

    public void e(String message)
    {
        if (deDug)
            Log.e(TAG,message);
    }

    public void v(String message)
    {
        if (deDug)
            Log.v(TAG,message);
    }

    /**
     * 使用自定义的TAG
     */

    public void Custom_i(String Tag,String message) {
        if (deDug)
            Log.i(Tag, message);
    }

    public void Custom_d(String Tag,String message)
    {
        if (deDug)
            Log.d(Tag,message);
    }

    public void Custom_e(String Tag,String message)
    {
        if (deDug)
            Log.e(Tag,message);
    }

    public void Custom_v(String Tag,String message)
    {
        if (deDug)
            Log.v(Tag,message);
    }

}
