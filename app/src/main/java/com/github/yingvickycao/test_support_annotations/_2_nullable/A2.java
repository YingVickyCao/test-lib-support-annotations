package com.github.yingvickycao.test_support_annotations._2_nullable;

import androidx.annotation.Nullable;

import com.github.yingvickycao.test_support_annotations.A;

public class A2 {
    @Nullable
    public A getA1() {
        return new A();
    }

    @Nullable
    public A getA2() {
        return null;
    }
}
