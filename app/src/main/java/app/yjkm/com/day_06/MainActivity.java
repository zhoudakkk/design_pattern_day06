package app.yjkm.com.day_06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import app.yjkm.com.day_06.interfac.UserState;
import app.yjkm.com.day_06.userstate.LogoutState;

/**
 * 游客模式和登录模式
 * 在进入app后没有登录和登录后是两种状态
 * 故此用状态模式
 * 万一以后在加个什么学生模式或者老师模式 也方便代码的扩展性
 * <p>
 * 但是现在体会到的就是这样的模式虽然方便了扩展性
 * 但是 增加了代码量 减低了代码的可读新
 * 所以 这样的模式应该是用在整个app,模块或者一个复杂的功能上,而不是一个界面
 * 一个小功能上
 */
public class MainActivity extends AppCompatActivity {

    public static UserState mUserState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mUserState == null) {
                    mUserState = new LogoutState();
                }
                mUserState.forward(MainActivity.this);
            }
        });
        findViewById(R.id.main_login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
