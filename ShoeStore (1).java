//Aziz Osman || Dr. Ali

/* an application that prompts customer the display 
 * of an online Shoe Store, that allows them to have the option
 * of buying as many shoes they want along with the different shoe brands 
 * displayed.
 */

import java.util.Scanner;
public class ShoeStore 
{

	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		//Instantiates 'amount' from the server class "Totals"
		Totals amount = new Totals();
		 
		//Displays welcome message to Shoe Store
		System.out.println("Welcome to Aziz's Shoe Store");
		
		//String variable  
		String boughtShoes="";
		
		double subTotal = 0;
		int num = 0;
		int quantity = 0;
		
		//counter variables that add to quantity 
		//these counter variables are the shoe quantity for each one
		int c1  = 0;      	
		int c2  = 0;      	
		int c3  = 0; 	  	
		int c4  = 0;		
		int c5  = 0;
		int c6  = 0;
		int c7  = 0;
		int c8  = 0;
		int c9  = 0;
		int c10 = 0;
		int c11 = 0;
		int c12 = 0;
		int c13 = 0;
		int c14 = 0;
		int c15 = 0;
		int c16 = 0;
		int c17 = 0;
		int c18 = 0;
		int c19 = 0;
		int c20 = 0;
		int c21 = 0;
		int c22 = 0;
		int c23 = 0;
		int c24 = 0;		
		
		
		//constant variables 
		final int AIR_MAX90 = 80; 
		final int PAUL_GEORGE_III = 130; 
		final int AIR_MAX_720 = 200;
		final int React_Infinity_Run = 80;
		final int AIR_FORCE = 120;
		final int ZOOM_FREAK = 140;
		final int HURRACHE_RUN = 160;
		final int ROSHE_RUN = 60;
		final int WHY_NOT = 200;
		final int RETRO_11S = 225;
		final int AIR_JORDAN_1 = 390;
		final int RETRO_13 = 365;
		final int AEROSPACE_720 = 180;
		final int JORDAN_1 = 200;
		final int JORDAN_4_OREOS = 465;
		final int LEGEND_BLUE = 330;
		final int YEEZY_BOOST_350 = 300;
		final int YEEZY_BOOST_700 = 450;
		final int YEEZY_500 = 280;
		final int YEEZY_BOOST_750 = 580;
		final int ADDIDAS_NMD = 600;
		final int ALPHABOOST = 120;
		final int DAME_6_INERTIA = 200;
		final int SUPASTAR_ETERNITY = 650;
		
		
		//Displays list of three different shoe brands up to 24 shoes and allows customer to pick shoes they want
		System.out.println("\nNike                             Jordan                      Addidas                 ");
		System.out.println("1.Air Max 90          $80     9.  Why Not         $200     17. Yeezy Boost 350   $300  ");
		System.out.println("2.Paul George III     $130    10. Retro 11s       $225     18. Yeezy Boost 700   $450  ");
		System.out.println("3.Air Max 720         $200    11. Air Jordan 1    $390     19. Yeezy 500         $280  ");
		System.out.println("4. React Infinity Run $80     12. Retro 13        $365     20. Yeezy Boost 750   $580  ");
		System.out.println("5. Air Force          $120    13. Aerospace 720   $180     21. Addidas NMD       $600  ");
		System.out.println("6. Zoom Freak         $140    14. Jordan 1        $200     22. Alphaboost        $120  ");
		System.out.println("7. Hurrache Run       $160    15. Jordan 4 Oreos  $465     23. Dame 6 Inertia    $200  ");
		System.out.println("8. Roshe Run          $60     16. Legend Blue     $330     24. SUPASTAR Eternity $650  ");
		System.out.print(" Please pick a shoe : "  );
		num = reader.nextInt();
		
		
		//Sentinel that allows customer to check out if they hit 25, else they can choose shoes from 1-24.
		while(num != 25)
		{
			if(num == 1)
			{
				
				//this displays the shoe cost and name for each if/else statement on the receipt
				boughtShoes = boughtShoes + "\n Air Maxes $" + AIR_MAX90   + " ";
				
				//asks user how  many pairs of shoes do they want
				System.out.print("Quantity: "  );
				quantity = reader.nextInt();
				
				//counter adds and equals to quantity, for all if/else statements;
				c1 += quantity;
				
				//displays customer the shoe they bought with the quantity, for all if/else statements.
				System.out.print(" You have Selected:  Nike Air Max, ");
				System.out.print( "Quantity: " + quantity);
				
				//updates subTotal for all if/else statements, and calls it from the method in server class
				amount.updatesubTotal(AIR_MAX90 * quantity);
				
				//prints amount
				System.out.println("\n " + amount);
				
				//if 25 is entered, your receipt will be shown
				System.out.println("\n25 to checkout? ");
	
			  
			}
			else if(num == 2)
			{
				boughtShoes= boughtShoes + "\n Paul George III $" + PAUL_GEORGE_III + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c2 += quantity;
				
				System.out.print("You have Selected:  Paul George III, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(PAUL_GEORGE_III * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 3)
			{
				boughtShoes= boughtShoes + "\n Air Max 720 $" + AIR_MAX_720 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c3 += quantity;
				
				System.out.print("You have Selected: Air Max 720, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(AIR_MAX_720 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 4)
			{
				boughtShoes= boughtShoes + "\n React Infinity Run $" + React_Infinity_Run +", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c4 += quantity;
				
				System.out.print("You have Selected:  React Infinit Run, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(React_Infinity_Run  * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 5)
			{
				boughtShoes= boughtShoes + "\n Air Force $" + AIR_FORCE + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c5 += quantity;
				
				System.out.print("You have Selected:  Air Force, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(AIR_FORCE  * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 6)
			{
				boughtShoes= boughtShoes + "\n Zoom Freak $" + ZOOM_FREAK + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c6 += quantity;
				
				System.out.print("You have Selected:  Zoom Freak, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(ZOOM_FREAK * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 7)
			{
				boughtShoes= boughtShoes + "\n Hurrache Run $" + HURRACHE_RUN + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c7 += quantity;
				
				System.out.print("You have Selected: Hurrache Run, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(HURRACHE_RUN * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 8)
			{
				boughtShoes= boughtShoes + "\n Roshe Run $" + ROSHE_RUN + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c8 += quantity;
				
				System.out.print("You have Selected: Roshe Run, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(ROSHE_RUN * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 9)
			{
				boughtShoes= boughtShoes + "\n Why Not $" + WHY_NOT + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c9 += quantity;
				
				System.out.print("You have Selected: Why Not, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(WHY_NOT * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 10)
			{
				boughtShoes= boughtShoes + "\n Retro 11s $" + RETRO_11S + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c10 += quantity;
				
				System.out.print("You have Selected:  Retro 11s, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(RETRO_11S * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 11)
			{
				boughtShoes= boughtShoes + "\n Air Jordan 1 $" + AIR_JORDAN_1 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c11 += quantity;
				
				System.out.print("You have Selected:  Air Jordan 1, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(AIR_JORDAN_1 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 12)
			{
				boughtShoes= boughtShoes + "\n Air Max 720 $" + RETRO_13 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c12 += quantity;
				
				System.out.print("You have Selected:  Retro 13, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(RETRO_13 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 13)
			{
				boughtShoes= boughtShoes + "\n Aerospace 720 $" + AEROSPACE_720 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c13 += quantity;
				
				System.out.print("You have Selected:  Aerospace 720, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(AEROSPACE_720 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 14)
			{
				boughtShoes= boughtShoes + "\n Jordan 1 $" + JORDAN_1 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c14 += quantity;
				
				System.out.print("You have Selected:  Jordan 1, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(JORDAN_1 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 15)
			{
				boughtShoes= boughtShoes + "\n Jordan 4 Oreos $" + JORDAN_4_OREOS + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c15 += quantity;
				
				System.out.print("You have Selected:  Jordan 4 Oreos, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(JORDAN_4_OREOS * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 16)
			{
				boughtShoes= boughtShoes + "\n Legend Blue $" + LEGEND_BLUE + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c16 += quantity;
				
				System.out.print("You have Selected:  Legend Blue,  ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(LEGEND_BLUE * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 17)
			{
				boughtShoes= boughtShoes + "\n Yeezy Boost 350 $" + YEEZY_BOOST_350 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c17 += quantity;
				
				System.out.print("You have Selected:  Yeezy Boost 350, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(YEEZY_BOOST_350 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 18)
			{
				boughtShoes= boughtShoes + "\n Yeezy Boost 700 $" + YEEZY_BOOST_700 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c18 += quantity;
				
				System.out.print("You have Selected: Yeezy Boost 700,  ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(YEEZY_BOOST_700 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 19)
			{
				boughtShoes= boughtShoes + "\n Yeezy 500 $ " + YEEZY_500 +", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c19 += quantity;
				
				System.out.print("You have Selected: Yeezy 500, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(YEEZY_500 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 20)
			{
				boughtShoes= boughtShoes + "\n Yeezy Boost 750 $" + YEEZY_BOOST_750 + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c20 += quantity;
				
				System.out.print("You have Selected: Yeezy Boost 750, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(YEEZY_BOOST_750 * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 21)
			{
				boughtShoes= boughtShoes + "\n Addidas NMD $" + ADDIDAS_NMD + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c21 += quantity;
				
				System.out.print("You have Selected: Addidas NMD, ");
				System.out.print( "Quantity: " + quantity);				
				
				amount.updatesubTotal(ADDIDAS_NMD * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 22)
			{
				boughtShoes= boughtShoes + "\n Alphaboost $" + ALPHABOOST + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c22 += quantity;
				
				System.out.print("You have Selected: Alphaboost, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(ALPHABOOST * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 23)
			{
				boughtShoes= boughtShoes + "\n Dame 6 Inertia $" + DAME_6_INERTIA + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c23 += quantity;
				
				System.out.print("You have Selected: Dame 6 Inertia,  ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(DAME_6_INERTIA * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			else if(num == 24) 
			{
				boughtShoes= boughtShoes + "\n SUPASTAR Eternity $ " + SUPASTAR_ETERNITY + ", ";
				
				System.out.println(" Quantity: " );
				quantity = reader.nextInt();
				
				c24 += quantity;
				
				System.out.print("You have Selected:  SUPASTAR Eternity, ");
				System.out.print( "Quantity: " + quantity);
				
				amount.updatesubTotal(SUPASTAR_ETERNITY * quantity);
				System.out.println("\n " + amount);
				
				System.out.println("\n25 to checkout? ");
		
			}
			
			//displays checkout and prints final total
			else if (num == 25)
			{
		
				System.out.println(" Your Total is: " + subTotal );
				
		
			}
			
			//if a number < 1 and > 25 is entered, an error message will display
			else 
			{
				System.out.println("Please enter a valid number  ");
			} 
			
			//displays menu again if customer wants to get different pairs of shoes
			System.out.println("\nNike                             Jordan                      Addidas                 ");
			System.out.println("1.Air Max 90          $80     9.  Why Not         $200     17. Yeezy Boost 350   $300  ");
			System.out.println("2.Paul George III     $130    10. Retro 11s       $225     18. Yeezy Boost 700   $450  ");
			System.out.println("3.Air Max 720         $200    11. Air Jordan 1    $390     19. Yeezy 500         $280  ");
			System.out.println("4. React Infinity Run $80     12. Retro 13        $365     20. Yeezy Boost 750   $580  ");
			System.out.println("5. Air Force          $120    13. Aerospace 720   $180     21. Addidas NMD       $600  ");
			System.out.println("6. Zoom Freak         $140    14. Jordan 1        $200     22. Alphaboost        $120  ");
			System.out.println("7. Hurrache Run       $160    15. Jordan 4 Oreos  $465     23. Dame 6 Inertia    $200  ");
			System.out.println("8. Roshe Run          $60     16. Legend Blue     $330     24. SUPASTAR Eternity $650  ");
			System.out.print(" Please pick a shoe : "  );
			num = reader.nextInt(); 
			
		} 

		//displays Thank you message along receipt
		System.out.println("Thank You for Shopping at Aziz's Shoe Store!! ");
		System.out.println("\n RECEIPT ");
		
		//all if statements that take in the quantity and displays it with final receipt
		if(c1 >= 1)
		{
			System.out.println("\n Air Max 90  $80 " + "\nQuantity: " + c1);
		}
		
		if (c2 >= 1 )
		{
			System.out.println("\n Paul George III  $130 " + "\nQuantity: " + c2);
			
		}
		
		if (c3 >= 1 )
		{
			System.out.println("\n Air Max 720  $200 " + "\nQuantity: " + c3);
			
		}

		if (c4 >= 1 )
		{
			System.out.println("\n React Infinity Run  $80 " + "\nQuantity: " + c4);
			
		}

		if (c5 >= 1 )
		{
			System.out.println("\n Air Force  $120 " + "\nQuantity: " + c5);
			
		}

		if (c6 >= 1 )
		{
			System.out.println("\n Zoom Freak  $200 " + "\nQuantity: " + c6);
			
		}

		if (c7 >= 1 )
		{
			System.out.println("\n Hurrache Run  $160 " + "\nQuantity: " + c7);
			
		}

		if (c8 >= 1 )
		{
			System.out.println("\n Roshe Run  $60 " + "\nQuantity: " + c8);
			
		}

		if (c9 >= 1 )
		{
			System.out.println("\n  Why Not  $200 " + "\nQuantity: " + c9);
			
		}

		if (c10 >= 1 )
		{
			System.out.println("\n Retro 11s  $225 " + "\nQuantity: " + c10);
			
		}

		if (c11 >= 1 )
		{
			System.out.println("\n Air Jordan 1  $390 " + "\nQuantity: " + c11);
			
		}

		if (c12 >= 1 )
		{
			System.out.println("\n Retro 13  $365 " + "\nQuantity: " + c12);
			
		}

		if (c13 >= 1 )
		{
			System.out.println("\n Aerospace 720  $180 " + "\nQuantity: " + c13);
			
		}

		if (c14 >= 1 )
		{
			System.out.println("\n Jordan 1  $200 " + "\nQuantity: " + c14);
			
		}

		if (c15 >= 1 )
		{
			System.out.println("\n Jordan 4 Oreos  $465 " + "\nQuantity: " + c15);
			
		}

		if (c16 >= 1 )
		{
			System.out.println("\n Legend Blue     $330 " + "\nQuantity: " + c16);
			
		}

		if (c17 >= 1 )
		{
			System.out.println("\n Yeezy Boost 350   $300 " + "\nQuantity: " + c17);
			
		}

		if (c18 >= 1 )
		{
			System.out.println("\n Yeezy Boost 700   $450 " + "\nQuantity: " + c18);
			
		}

		if (c19 >= 1 )
		{
			System.out.println("\n Yeezy 500   $280 " + "\nQuantity: " + c19);
			
		}

		if (c20 >= 1 )
		{
			System.out.println("\n Yeezy Boost 750   $580 " + "\nQuantity: " + c20);
			
		}

		if (c21 >= 1 )
		{
			System.out.println("\n Addidas NMD  $600 " + "\nQuantity: " + c21);
			
		}

		if (c22 >= 1 )
		{
			System.out.println("\n Alphaboost  $120 " + "\nQuantity: " + c22);
			
		}

		if (c23 >= 1 )
		{
			System.out.println("\n Dame 6 Inertia $200 " + "\nQuantity: " + c23);
			
		}

		if (c24 > 0 )
		{
			System.out.println("\n SUPASTAR Eternity $650 " + "\nQuantity:\n " + c24);
			
		}
		
		//calls "calcTotal" method and prints final total 
		System.out.println("\n Your total with tax is: $" + amount.calcTotal());

		System.out.println("\n Come Back Next Time! ");
		 
		
	}

	
}
