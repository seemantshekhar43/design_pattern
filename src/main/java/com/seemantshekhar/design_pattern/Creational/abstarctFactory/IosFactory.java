package com.seemantshekhar.design_pattern.Creational.abstarctFactory;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.ios.IosButton;
import com.seemantshekhar.design_pattern.Creational.abstarctFactory.ios.IosCheckBox;

public class IosFactory implements PlatformFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IosCheckBox();
    }
}
