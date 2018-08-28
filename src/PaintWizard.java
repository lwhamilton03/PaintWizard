import java.util.ArrayList;

	public class PaintWizard{
	
		ArrayList <Paint> paintArray = new ArrayList<Paint>();
		
		public String cheapest()
		{
			//int index = paintArray.size() - 1;
			
			double cheapPrice = paintArray.get(paintArray.size()-1).getPrice() ;
	
			//paintArray[index];
			
			int itr = 0;
			
			for(int i = paintArray.size() -1; i >= 0; i--)
			{
				if (paintArray.get(i).getPrice() < cheapPrice)
				{
					cheapPrice = paintArray.get(i).getPrice();
					itr = i; 
				}
			}
		return "Cheapest Paint is " + paintArray.get(itr).getName() + " at £ " + paintArray.get(itr).getPrice();
		}
		
		public void newPaint()
		{
			
			paintArray.add(new Paint("CheapoMax", 20, 10, 19.99));
			paintArray.add(new Paint("AverageJoes", 15, 11, 17.99));
			paintArray.add(new Paint("DuluxourousPaints", 10, 20, 25));
		}
		
		// I need to calculate this such that it has the coverage. 
		//ACTUALLY MUCH MORE SIMPLE THAN YOU THOUGHT: multiply the coverage by the things per litre 
		
		public String wastePaint(int wallSpace)
		{
			int itr = 0;
			int waste = 0; 
			int cover = wallSpace / paintArray.get(paintArray.size() -1).getCoverage();
			
			for(int i = paintArray.size() - 1; i>= 0; i--)
			{
				if(wallSpace / paintArray.get(i).getCoverage()*paintArray.get(i).getAmount() < cover)
				{
					cover = wallSpace / paintArray.get(i).getCoverage();
					itr = i; 
				
						if (paintArray.get(itr).getAmount() - cover == paintArray.get(itr).getAmount())
							{
								waste = 0;	
							}
						else 
						{
							waste = (paintArray.get(itr).getAmount() - (cover % wallSpace));
						}
					}
				}
			
				return "The paint with the least waste is " + paintArray.get(itr).getName() + ", and there is " + cover + " tins used and " + waste + " litres of a tin wasted"; 
		}
	
		public String totalCheap(int room)
		{
			int itr = 0;
			double cheapRoom = (room / paintArray.get(itr).getCoverage()) / (paintArray.get(itr).getAmount()) * (paintArray.get(itr).getPrice());
			
			for(int i = paintArray.size() - 1; i>= 0; i--)
			{
				
			}
		}
	}
 
	