package com.github.yingvickycao.test_support_annotations;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.yingvickycao.test_support_annotations._2_nullable.A2;

public class MainActivity extends AppCompatActivity {
    private TextView mTv1;
    private TextView mTv2;
    private ImageView mPageIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv1 = findViewById(R.id.tv1);
        mTv2 = findViewById(R.id.tv2);
        mPageIcon = findViewById(R.id.pageIcon);

        check_NonNull();
        check_Nullable();

        // @StringRes
        setPageTitle(R.string.app_name);

        // @DrawableRes
        setPageIcon(R.drawable.ic_launcher_background);

        // @DimenRes
        setPageIconSize(R.dimen.size_30);
//        setTextColor1(R.color.text_color_1);

        // @ColorRes
        setTextColor1(R.color.text_color_2);
        setTextColor2("#ff0000");
    }


    private void check_NonNull() {
        System.out.println(new A1().getA1());
        System.out.println(new A1().getA2());
    }

    private void check_Nullable() {
        A2 aCreator2 = new A2();

        A a1 = aCreator2.getA1();
        if (null != a1) {
            System.out.println(a1.toString());
        }

        A a2 = aCreator2.getA2();
        if (null != a2) {
            System.out.println(a2.toString());
        }
    }

    void setPageTitle(@StringRes int resId) {
        mTv1.setText(resId);
    }

    void setPageIcon(@DrawableRes int resId) {
        mPageIcon.setImageResource(resId);
    }

    void setPageIconSize(@DimenRes int resId) {
        int size = getResources().getDimensionPixelSize(resId);
        mPageIcon.setLayoutParams(new LinearLayout.LayoutParams(size, size));
    }

    void setTextColor1(@ColorRes int resId) {
        mTv1.setTextColor(getResources().getColor(resId));
    }

    void setTextColor2(String resId) {
        mTv2.setTextColor(Color.parseColor(resId));
    }
}