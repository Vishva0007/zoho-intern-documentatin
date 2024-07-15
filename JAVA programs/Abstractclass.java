abstract class Animal{
 public abstract void makenoise();
 public void ani(){
  System.out.println("The Animal is lion");
 }
}
class Cat extends Animal{
 public void ca(){
  System.out.println("The Animal is cat");
 }
 public void makenoise(){
  System.out.println("The Cat meows");
 }
}
class Dog extends Cat{
  public void dogi(){
   System.out.println("This is Dog");
  }
}
class Abstractclass{
 public static void main(String[] args){
  Dog c = new Dog();
  c.ca();
  c.makenoise();
  c.dogi();
  c.ani();
 }
}
