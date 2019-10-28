package com.github.yingvickycao.test_support_annotations;

import androidx.annotation.Nullable;

class A2 {
    @Nullable
    A getA1() {
        return new A();
    }

    @Nullable
    A getA2() {
        return null;
    }
}
