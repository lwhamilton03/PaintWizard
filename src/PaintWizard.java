import java.util.ArrayList;

	public class PaintWizard{
	
		ArrayList <Paint> paintArray = new ArrayList<Paint>();
		
		public String cheapest()
		{
			//int index = paintArray.size() - 1;
			
			int cheapPrice = 20000000;
	
			//paintArray[index];
			
			for(int i = paintArray.size(); i >= 0; i--)
			{
				if (paintArray.getPrice(i) < cheapPrice)
				{
					paintArray.remove(i)
					int cheapPrice = painArray.getPrice(i);
				}
			}
		return "Cheapest Paint is" + paintArray.getName + "at £ " + this.price;
		}
	}
 
	