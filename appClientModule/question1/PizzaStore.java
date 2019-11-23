package question1;

 


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PizzaStore extends JApplet{
	
	public void init(){
		JRootPane rootPane = this.getRootPane();	
		rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
		add(new IHMPizza());
	}



	private class IHMPizza extends JPanel{
    private JLabel         afficheur = new JLabel(" please, first choose your pizza, then the constituents but once clams...");
   
    private JButton        boutonSolo = new JButton("");
    private JButton        boutonClassic = new JButton("");
    private JButton        boutonCrust = new JButton("");
  
    private Checkbox       parmesan = new Checkbox("parmesan", null, true);
    private Checkbox       mozarella = new Checkbox("mozarella", null, false);
    private Checkbox       ham = new Checkbox("ham", null, false);
    private Checkbox       tomato = new Checkbox("tomato", null, false);
    private Checkbox       mushrooms = new Checkbox("mushrooms", null, false);
    private Checkbox       clams = new Checkbox("clams", null, false);

    private DecimalFormat  df = new DecimalFormat("##.##");  
    private JButton        boutonMake = new JButton("");
  
    private Pizza          pizza;
  
    
    public IHMPizza(){
      JPanel panelGlobal = new JPanel();
      JPanel panelBoutons = new JPanel();
      JPanel panelDecorations = new JPanel();
      JPanel panelMake = new JPanel();
      
  		panelGlobal.setLayout(new GridLayout(3,1));
  		afficheur.setEnabled(false);
      panelGlobal.add(afficheur);
      
      panelBoutons.setLayout(new FlowLayout(FlowLayout.CENTER));
      panelBoutons.add(boutonSolo);panelBoutons.add(boutonClassic);panelBoutons.add(boutonCrust);
      
      panelDecorations.setLayout(new GridLayout(1,6));
  		panelDecorations.add(parmesan);panelDecorations.add(mozarella);
  		panelDecorations.add(ham);panelDecorations.add(tomato);
  		panelDecorations.add(mushrooms);panelDecorations.add(clams);
  
      panelGlobal.add(panelBoutons);  
      panelGlobal.add(panelDecorations);  

  	  setLayout(new BorderLayout());  
      add(panelGlobal,"North");
      
      panelMake.setLayout(new FlowLayout(FlowLayout.CENTER));
      panelMake.add(boutonMake);
      add(panelMake,"Center");
      
     
      
  		boutonSolo.addActionListener(
  		  new ActionListener(){
  		    public void actionPerformed(ActionEvent ae){
  		      // à compléter
  		    	pizza = new PizzaSolo();
  		      validerLesDecorations();
  		    }
  		  });
  		
      boutonClassic.addActionListener(
      	new ActionListener(){
  		    public void actionPerformed(ActionEvent ae){
  		      // à compléter
  		    	pizza = new Classic();
  		      validerLesDecorations();
  		    }
  		  });
  		  
      boutonCrust.addActionListener(		  
        new ActionListener(){
  		    public void actionPerformed(ActionEvent ae){
  		      // à compléter
  		    	pizza = new GenerousCrust();
  		      validerLesDecorations();
  		    }
  		  });
      
  		  
      parmesan.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          if(ie.getStateChange()==ItemEvent.SELECTED){
            // à compléter
        	  pizza = new Parmesan(pizza);
          }
          afficherLaPizzaEtSonCost();
      }}); 
      
      mozarella.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          if(ie.getStateChange()==ItemEvent.SELECTED){
            // à compléter
        	  pizza = new FreshMozarella(pizza);
        	 
          }
          afficherLaPizzaEtSonCost();
      }});
      
      ham.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          if(ie.getStateChange()==ItemEvent.SELECTED){
            // à compléter
        	  pizza = new Ham(pizza);
          }
          afficherLaPizzaEtSonCost();
      }}); 
      
      tomato.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          // à compléter
        	pizza = new Tomato(pizza);
          afficherLaPizzaEtSonCost();
      }});
      
      mushrooms.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          if(ie.getStateChange()==ItemEvent.SELECTED){
            // à compléter
        	  pizza = new Mushrooms(pizza);
          }
          afficherLaPizzaEtSonCost();
      }}); 
      
      clams.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie){
          if(ie.getStateChange()==ItemEvent.SELECTED){
            // à compléter
        	  pizza = new Clams(pizza);
          }
          else clams.setState(true);
          afficherLaPizzaEtSonCost();
      }});
   
      
      boutonMake.addActionListener(
        new ActionListener(){
          public void actionPerformed(ActionEvent ae){
            invaliderLesDecorations();
            afficheur.setText("<html><FONT Color=red size=5>MAKING of the " + afficheur.getText() + "</html>");
          }
        });
        
      invaliderLesDecorations();
    }
    
    private void afficherLaPizzaEtSonCost(){
      afficheur.setText("<html><FONT Color=blue size=4>"+ pizza.getDescription()+ "</FONT><FONT Color=red size=4> cost: " + df.format(pizza.cost()) + " &#8364;</Font></html>");
    }
    
    
    private void invaliderLesDecorations(){
      boutonMake.setEnabled(false);boutonMake.setText("<html><font size=3 color=green>compose your pizza ...</font></html>");
      boutonSolo.setEnabled(true);boutonSolo.setText("<html><font size=3 color=red>solo</font></html>");
      boutonClassic.setEnabled(true);boutonClassic.setText("<html><font size=3 color=red>classic</font></html>");
      boutonCrust.setEnabled(true);boutonCrust.setText("<html><font size=3 color=red>crust</font></html>");     
      parmesan.setState(false);mozarella.setState(false);ham.setState(false);tomato.setState(false);mushrooms.setState(false);clams.setState(false);
      parmesan.setEnabled(false);mozarella.setEnabled(false); ham.setEnabled(false);tomato.setEnabled(false);mushrooms.setEnabled(false);clams.setEnabled(false);
    }
    
    private void validerLesDecorations(){
      boutonMake.setEnabled(true);boutonMake.setText("<html><font size=3 color=red>make the pizza !</font></html>");
      boutonSolo.setEnabled(false);boutonSolo.setText("<html><font size=3 color=green>solo</font></html>");
      boutonClassic.setEnabled(false);boutonClassic.setText("<html><font size=3 color=green>classic</font></html>");
      boutonCrust.setEnabled(false);boutonCrust.setText("<html><font size=3 color=green>crust</font></html>");
      parmesan.setEnabled(true);mozarella.setEnabled(true);ham.setEnabled(true);tomato.setEnabled(true);mushrooms.setEnabled(true);clams.setEnabled(true);
      afficherLaPizzaEtSonCost();
    }
    
  }
}
