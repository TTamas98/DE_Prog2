package com.demo.lesson2.access_modifiers.first;

import com.demo.lesson2.access_modifiers.second.Second;

public class First extends Second {

    public void g() {
        a();
        //b();
        c();
        //d();
    }
}
