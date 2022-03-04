public class Tester
  
{
  
  public static void main(String[] args)     //Main method section
    
  {
    Animal animalArray[] = new Animal[6];   //Creation of the animalArray[] array
    
    animalArray[0] = new Domesticated();      // Creates Domesticated object 
    animalArray[1] = new Wild();          // Creates Wild object
    animalArray[2] = new Extinct();       // Creates Extinct object
    animalArray[3] = new Cat();        //Creates Cat object 
    animalArray[4] = new Squirrel();   //Creates Squirrel object 
    animalArray[5] = new Dinosaur();   //Creates Dinosaur object
    
    for (int i = 0; i < 6; i++)    //For loop going through the animalArray[] array
      
    {
      animalArray[i].animalType();   //Invokes animalType() method
    }
    
  }
  
  //End of program
  
}