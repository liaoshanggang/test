package com.gg.dmbook.ex2_4;




public class MediumBuildingFactory extends BuildingFactory {


   public House getHouse()
   {
	   return new MediumHouse("Medium house");

   }
   public Condo getCondo()
   {
	   return new MediumCondo("Medium condo");
   }

} // End of class
