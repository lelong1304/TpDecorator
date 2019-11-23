package question2;


public class ChocolateTest extends junit.framework.TestCase{
	public Chocolate choco;
	public Decaf decaf;

 //� d�commenter


 	public void setUp(){
 		choco = new Chocolate() {};
 		decaf = new Decaf() {};
 	}
 
 	
 	
 	public void testChocolate(){
 		assertEquals(2.1, choco.cost(), 0.1);
 	}
 	
 
 	public void testChocolateWhip(){
 		question2.Beverage chocoSimpleWhip = new question2.Whip(choco);
 
 		assertEquals(2.2, chocoSimpleWhip.cost(), 0.01);
 	}
 	
 	public void testChocolateWhipWhip(){
 		question2.Beverage chocoDoubleWhip = new question2.Whip(new question2.Whip(choco));
 
 		assertEquals(2.3, chocoDoubleWhip.cost(), 0.01);
 	}
 	
 	public void testChocolateWhipSoyMocha(){
 		question2.Beverage chocoWhipSoyMocha = new question2.Mocha(new question2.Soy(new question2.Whip(choco)));
 		
 		 Beverage b = new BeetSugar(new Whip(new Mocha(new Soy(new HouseBlend())))); 
 		System.out.println(b);
 		assertEquals(2.55, chocoWhipSoyMocha.cost(), 0.01);
 	}
	
 	public void testDecafMilk() {
 		question2.Beverage decafMilk = new question2.Milk(decaf);
 		 
 		assertEquals(1.15, decafMilk.cost(), 0.01);
 	}
	
	

	
}

