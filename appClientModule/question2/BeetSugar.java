package question2;

/**
 * extrait de http://www.oreilly.com/catalog/hfdesignpat/
 */
public  class BeetSugar extends CondimentDecorator  { // � rendre concrete
	public BeetSugar(Beverage b) {
		super(b);
	}
	public String getDescription() {
		return super.getDescription() + ", Beet Sugar";
	}
	public double cost() {
		return 0.1 + super.cost();
	}
	
}