package com.shafhaz;

public class CarTelescopic1 {
    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOfLocation;

    public CarTelescopic1(String insurance){
        this.insurance=insurance;
    }

    public CarTelescopic1(String insurance,Boolean etc){
        this(insurance);
        this.etc=etc;
    }

    public CarTelescopic1(String insurance,Boolean etc,String roadAssistance){
        this(insurance,etc);
        this.roadAssistance=roadAssistance;
    }

    public CarTelescopic1(String insurance,Boolean etc,String roadAssistance,String dropOfLocation){
        this(insurance,etc,roadAssistance);
        this.dropOfLocation=dropOfLocation;
    }

    @Override
    public String toString() {
        return "CarTelescopic1{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOfLocation='" + dropOfLocation + '\'' +
                '}';
    }
}
