package cn.elevendev.test;

import android.content.Context;
import android.widget.Toast;

public class Test {
    public static void toast(Context context) {
        Toast.makeText(context, "测试", Toast.LENGTH_SHORT).show();
    }
}
