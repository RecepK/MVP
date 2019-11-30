package com.kurban.mvp.presenter;

public interface Contract {

    interface Presenter {
        void clicked();

        void longClicked();
    }

    interface View {
        void clickHandle(String value);

        void longClickHandle(String value);
    }
}
