package shidian.com.reflect;

import shidian.com.reflect.Lib.Reflect;

/**
 * Created by Charlin on 2017/4/19.
 */

public class Student extends Reflect {
    String name;
    int age;

    @Override
    public String toString() {
        return "name="+name+" ,age="+age;
    }
}
