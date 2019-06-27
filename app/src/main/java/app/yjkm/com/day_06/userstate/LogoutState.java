package app.yjkm.com.day_06.userstate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import app.yjkm.com.day_06.LoginActivity;
import app.yjkm.com.day_06.interfac.UserState;

/**
 * 游客模式
 */
public class LogoutState implements UserState{
    @Override
    public void forward(Activity context) {
        Toast.makeText(context,"请登录后再分享", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void saveUserInfo() {

    }
}
