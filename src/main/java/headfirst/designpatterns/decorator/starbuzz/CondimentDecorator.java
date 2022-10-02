package headfirst.designpatterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    public CondimentDecorator() {
        super();
    }

    //申明了父类变量，但未引用
    Beverage beverage;

    //继承并抽象了getDescription方法
    public abstract String getDescription();

    //没有实现public abstract double cost();
    //因为它本身是一个抽象类所以可以不去实现父类的抽象方法
    //所以让CondimentDecorator的子类去实现吧
}
