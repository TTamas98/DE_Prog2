package com.demo.lesson2.access_modifiers.second;

public class Second {

    public void a() {

    }

    private void b() {
        a();
    }

    protected void c() {
        b();
        d();
    }

    void d() {

    }
}
