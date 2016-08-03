package Util;


import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import CallBack.HttpCallBack;

/**
 * Created by Administrator on 2016/7/31.
 */
public class HttpUtil {

    public void HttpPost(final String path, final HttpCallBack callBack, final String param) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                PrintWriter out = null;
                String result = "";
                StringBuffer sb = null;
                HttpURLConnection conn = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL(path);
                    conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setUseCaches(false);
                    conn.setDoInput(true);
                    conn.setDoOutput(true);
                    conn.setConnectTimeout(5 * 1000);
                    if (!TextUtils.isEmpty(param)) {
                        out = new PrintWriter(conn.getOutputStream());
                        out.print(param);
                        out.flush();
                    }
                    sb = new StringBuffer();
                    reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String str;
                    while ((str = reader.readLine()) != null) {
                        sb.append(str);
                    }
                    if (callBack != null) {
                        callBack.Response(sb.toString());
                    }
                } catch (Exception e) {
                    if (callBack != null) {
                        callBack.error(e);
                    }
                } finally {
                    if (conn != null) {
                        conn.disconnect();
                    }
                    if (out != null) {
                        out.close();
                    }
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}