class Data{
 private int age;
 private String name;
 public void setAge(int a){
  this.age=a;
 }
 public int getAge(){
   return age;
 }
 public void setName(String n){
   this.name = n;
   }
 public String getName(){
   return name;
 }
}
class Encap{
 public static void main(String[] args){
  Data d = new Data();
  d.setAge(20);
  d.setName("Vishva");
  System.out.println("The Name is ="+d.getName());
  System.out.println("The Age is ="+d.getAge());  
 }
}
