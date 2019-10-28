package com.github.yingvickycao.test_support_annotations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nullnessAnnotations();
    }

    private void nullnessAnnotations(){
        System.out.println(new A1().getA1());
        System.out.println(new A1().getA2());

        A2 aCreator2 = new A2();

        A a1 = aCreator2.getA1();
        if (null != a1){
            System.out.println(new A2().getA1());
        }

        A a2 = aCreator2.getA2();
        if (null != a2){
            System.out.println(new A2().getA2());
        }
    }
}