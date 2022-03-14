package com.shafhaz;

public class CarTelescopic2 {

    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOfLocation;

    public CarTelescopic2(String insurance,Boolean etc,String roadAssistance,String dropOfLocation){
        this.insurance=insurance;
        this.etc=etc;
        this.roadAssistance=roadAssistance;
        this.dropOfLocation=dropOfLocation;
    }

    public CarTelescopic2(String insurance,Boolean etc,String roadAssistance){
        this(insurance,etc,roadAssistance,null);
    }

    public CarTelescopic2(String insurance,Boolean etc){
        this(insurance,etc,null);
    }

    public CarTelescopic2(String insurance){
        this(insurance,null);
    }

    @Override
    public String toString() {
        return "CarTelescopic2{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOfLocation='" + dropOfLocation + '\'' +
                '}';
    }
}
