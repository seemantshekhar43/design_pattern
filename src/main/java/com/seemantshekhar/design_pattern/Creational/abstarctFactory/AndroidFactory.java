package com.seemantshekhar.design_pattern.Creational.abstarctFactory;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.android.AndroidButton;
import com.seemantshekhar.design_pattern.Creational.abstarctFactory.android.AndroidCheckBox;

public class AndroidFactory implements PlatformFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new AndroidCheckBox();
    }
}
