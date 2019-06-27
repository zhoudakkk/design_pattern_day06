package app.yjkm.com.day_06.interfac;

import android.app.Activity;

/**
 * 用户状态
 */
public interface UserState {

    void forward(Activity context);

    void saveUserInfo();
}
