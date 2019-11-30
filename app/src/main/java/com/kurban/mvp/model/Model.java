package com.kurban.mvp.model;

import android.content.Context;

import com.kurban.mvp.R;

public class Model {

    private Context context;

    public Model(Context context) {
        this.context = context;
    }

    public String getData() {
        return context.getString(R.string.app_name);
    }
}
