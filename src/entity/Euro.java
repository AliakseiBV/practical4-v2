package entity;

public class Euro {
    private int value;


    public Euro(int value){
        this.value = value;
    }

    public Euro(Euro value){
        this.value = value.value;
    }


    public Euro add(Euro euro){
        value += euro.value;
        return this;
    }

    public Euro sub(Euro euro){
        value -= euro.value;
        return this;
    }

    public Euro mul(int numberOfUnits){
        value *= numberOfUnits;
        return this;
    }


    public String toString(){
        return String.format("%d.%02d", value / 100, value % 100);
    }


    public int compareTo(Euro euro){
        return this.value - euro.value;
    }






}
