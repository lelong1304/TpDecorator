package question2;

/**
 * extrait de http://www.oreilly.com/catalog/hfdesignpat/
 */
public abstract class Chocolate extends Beverage { // � rendre concr�te
	public Chocolate() {
		description = "Chocolate";
	}
  
	public double cost() {
		return 2.10;
	}

}

