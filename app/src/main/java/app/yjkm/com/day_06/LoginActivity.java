package app.yjkm.com.day_06;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import app.yjkm.com.day_06.interfac.UserState;
import app.yjkm.com.day_06.userstate.LoginState;
import app.yjkm.com.day_06.userstate.LogoutState;

public class LoginActivity extends AppCompatActivity {

    private UserState logoutState;
    private UserState loginState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logoutState = new LogoutState();
        loginState = new LoginState();

        findViewById(R.id.login_login_btn).setOnClickListener(mClickListener);
        findViewById(R.id.login_logout_btn).setOnClickListener(mClickListener);

    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.login_login_btn:
                    loginState.saveUserInfo();
                    MainActivity.mUserState = loginState;
                    break;
                case R.id.login_logout_btn:
                    MainActivity.mUserState = logoutState;

                    break;
            }
        }
    };
}
