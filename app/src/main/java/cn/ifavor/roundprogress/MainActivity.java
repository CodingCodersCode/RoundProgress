package cn.ifavor.roundprogress;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.ifavor.roundprogress.view.MyRoundProcess;

public class MainActivity extends AppCompatActivity{

    private MyRoundProcess mRoundProcess;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化组件
        initViews();
    }

    /**
     * 初始化组件
     * init views
     */
    private void initViews() {
        mRoundProcess = (MyRoundProcess) findViewById(R.id.my_round_process);
        // 开启动画
        mRoundProcess.runAnimate(90);
    }

    /**
     * Activity 销毁时，取消动画
     * (cancel animation when activity destoryed)
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mRoundProcess != null){
            mRoundProcess.cancelAnimate();
        }
    }
}
