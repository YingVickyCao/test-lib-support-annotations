package com.github.yingvickycao.test_support_annotations;

import androidx.annotation.NonNull;

public class A {
    @NonNull
    @Override
    public String toString() {
        return A.class.getSimpleName();
    }
}
