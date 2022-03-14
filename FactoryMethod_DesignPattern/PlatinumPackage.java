package com.company;

public class PlatinumPackage extends Package{
    @Override
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
        decorations.add(new FlowerGirlDeco());
        decorations.add(new ParentDeco());
    }
}
