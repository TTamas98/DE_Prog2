package com.demo.lesson2.access_modifiers.first;

import com.demo.lesson2.access_modifiers.second.Second;

public class Fifth {

    Second second = new Second();

    public void h() {
        second.a();
        //second.b();
        //second.c();
        //second.d();
    }
}
