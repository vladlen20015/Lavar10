public abstract class Animal implements IAnimal {
    String name;
    double valuer;
    double values;
    double valuej;

    Animal(String name, double valuer, double values, double valuej){
        this.name=name;
        this.valuer=valuer;
        this.values=values;
        this.valuej=valuej;
    }
    @Override
    public void info(){
        System.out.println(name);
    }
    public boolean run(double intValueRun){
        return (this.valuer>=intValueRun);
    }
    @Override
    public boolean jump(double inValueJump){
        return (this.values>=inValueJump);
    }
    @Override
    public boolean swim(double intValueSwim){
        return (this.valuej>=intValueSwim);
    }
}


