package app.yjkm.com.day_06.userstate;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import app.yjkm.com.day_06.interfac.UserState;

/**
 * 登录模式
 */
public class LoginState implements UserState{
    @Override
    public void forward(Activity context) {
        Toast.makeText(context,"登录后的分享",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void saveUserInfo() {
        //数据库或者xml数据保存
    }
}
