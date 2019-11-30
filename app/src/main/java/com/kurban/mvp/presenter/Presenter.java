package com.kurban.mvp.presenter;

import android.content.Context;

import com.kurban.mvp.model.Model;

public class Presenter implements Contract.Presenter {

    private Contract.View view;

    private Model model;

    public Presenter(Contract.View view) {
        this.view = view;
        model = new Model((Context) view);
    }

    @Override
    public void clicked() {
        view.clickHandle(getData());
    }

    @Override
    public void longClicked() {
        view.longClickHandle(getLongData());
    }

    private String getData() {
        return model.getData();
    }

    private String getLongData() {
        return model.getData().substring(0, model.getData().length() - 1);
    }
}
