# PercentLayout
【android】通过父容器大小，子控件百分比布局
 导入项目添加依赖，可以直接复制源码进项目；
 
 1、在自己布局文件中，最外层容器添加引用
```
xmlns:badboy="http://schemas.android.com/apk/res-auto"
```
badboy自己随意写


2、使用自定义布局
//线型布局
```
   <com.hao.percentlayout.layout.PercentLinearLayout
        android:layout_width="match_parent"
        android:layout_height="200dip"
        android:background="@color/backColor">

    </com.hao.percentlayout.layout.PercentLinearLayout>
```
    
    
//相对布局
```
  <com.hao.percentlayout.layout.PercentRelativeLayout
        android:layout_width="match_parent"
        android:layout_height="200dip"
        android:background="@color/aqua">

    </com.hao.percentlayout.layout.PercentRelativeLayout>
```
 3、在容器中控件使用自定义属性
 ```
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/teal"
            android:text="宽40%高30%"
            badboy:layout_percentheight="0.3"
            badboy:layout_percentwidth="0.4" />
```
    
 
 
