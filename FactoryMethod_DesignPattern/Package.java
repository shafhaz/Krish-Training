package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<Decoration> decorations=new ArrayList<>();

    public Package(){
        createPackage();
    }

    protected abstract void createPackage();

    public String toString() {
        return "Package{" +
                "decorations=" + decorations +
                '}';
    }

}
