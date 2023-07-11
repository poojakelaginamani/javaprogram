public class HondaCar {
     static final String drivingPosition = "Right Side";
     static final String founderBy = "Soichiro Honda";
    
     

    public enum Type {
        SEDAN,
        SPORTS
    }
    
   public enum Fuel {
        GASOLINE,
        ELECTRIC
    }
  

    class School{
      static final String chairMan="Amit K";
      static final String schoolName = "M.S.dhoni";
     

     public enum Level{
        Elementary,
        Middle,
        High 
      }
     public enum Type1{
        Pass, 
        Fail

      }
     class Indian{
        static final long aadharNumber=13241321141l;
        static final String peopleDetails="xyz";
      
     public enum Gender{
        Female, 
        Male
      }
      public enum Language{
          Kannada,
          English,
          Hindi
       }

         


    public static void main(String[] args) {
        System.out.println(drivingPosition);
        System.out.println(founderBy);
        System.out.println(Type.SEDAN);
        System.out.println(Fuel.GASOLINE);
        System.out.println(chairMan);
        System.out.println(schoolName);
        System.out.println(Level.High);
        System.out.println(Type1.Pass);
        System.out.println(aadharNumber);
        System.out.println(peopleDetails);
        System.out.println(Gender.Female);
        System.out.println(Language.Kannada); 
}
    }
}
}
