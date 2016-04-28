# RoundProgress

实现原理，详见：http://blog.csdn.net/anydrew/article/details/51259824

![示例](https://github.com/heshiweij/RoundProgress/blob/master/sample.gif)

## 使用

```java
  <cn.ifavor.roundprogress.view.MyRoundProcess
        android:layout_centerInParent="true"
        android:background="@android:color/white"
        android:id="@+id/my_round_process"

        app:roundColor="@android:color/darker_gray"
        app:roundProgressColor="@android:color/holo_red_dark"
        app:textSize="22sp"
        app:textColor="@android:color/holo_blue_bright"

        android:layout_width="200dip"
        android:layout_height="200dip"/>
```

属性：
textSize 百分数的尺寸
textColor 百分数的尺寸
roundColor 圆环的颜色
roundProgressColor 圆弧的颜色

方法：
setProgress(float progress) 设置显示指定百分比
runAnimate(float targetProgress) 从 0 开始渐进显示到指定百分比
