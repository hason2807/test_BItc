public class Pesron {
     private int id;
     private int age;
     private String name;
   public Pesron( int id,int age, String name )
   {
    this.id= id;
    this.age=age;
    this.name= name;
   }
   public int getId(){
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public int getAge(){
    return age;
   }
   public void setAge (int age) {
    this.age = age;
   }
   public String getName (){
    return name;
   }
   public void setName (int age) {
    this.name = name ;
   }

}
