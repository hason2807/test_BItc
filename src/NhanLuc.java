public class NhanLuc {
    private int age;
     private String name;
    private  String gender ;

   public NhanLuc ( int age, String name, String gender )
   {
   
    this.age=age;
    this.name= name;
    this.gender = gender;
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
   public void setName (String name) {
    this.name = name ;
   }
   public String getGioiTinh(){
    return  gender; 
   }
   public void setGioiTinh (String gender) {
    this.gender = gender;
   }
   public void information()
   {
    System.out.println("age : "+age );
    System.out.println("name: "+ name);
    System.out.println("gender: "+ gender);
   }
   
}
