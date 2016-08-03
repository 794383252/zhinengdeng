package CallBack;

/**
 * Created by Administrator on 2016/7/31.
 */
public interface HttpCallBack {
    void Response(String response);
    void error(Exception e);
}
