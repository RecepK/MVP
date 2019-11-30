package com.kurban.mvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kurban.mvp.R;
import com.kurban.mvp.presenter.Contract;
import com.kurban.mvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private Contract.Presenter presenter;

    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);

        // init UI
        initUI();
    }

    private void initUI() {
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clicked();
            }
        });

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                presenter.longClicked();
                return true;
            }
        });
    }

    private void setText(String value) {
        textView.setText(value);
    }

    @Override
    public void clickHandle(String value) {
        setText(value);
    }

    @Override
    public void longClickHandle(String value) {
        setText(value);
    }
}
