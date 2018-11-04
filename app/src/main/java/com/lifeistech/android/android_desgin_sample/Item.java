package com.lifeistech.android.android_desgin_sample;

public class Item {
    String activityName;
    Class<?> cls;

    public Item(String activityName, Class<?> cls) {
        this.activityName = activityName;
        this.cls = cls;
    }

    public Class<?> getCls() {
        return cls;
    }

    public String getActivityName() {
        return activityName;
    }
}
