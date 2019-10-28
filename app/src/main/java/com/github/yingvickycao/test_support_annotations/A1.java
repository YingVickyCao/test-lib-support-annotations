package com.github.yingvickycao.test_support_annotations;

import androidx.annotation.NonNull;

class A1 {
    @NonNull A getA1(){
        return new A();
    }

    @NonNull A getA2(){
        return null;
    }
}