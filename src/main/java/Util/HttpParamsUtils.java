package Util;

import com.google.gson.Gson;

import Model.UserModel;

/**
 * Created by Administrator on 2016/7/31.
 */
public class HttpParamsUtils {

    static Gson gson = new Gson();

    public static String GetUserParams(UserModel userModel) {
        String param = gson.toJson(userModel);
        String result = "UserInfo" + param;
        return result;
    }
}
