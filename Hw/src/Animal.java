
public class Animal {
     private String name ,age , height, gender , hair ;
 
     public Animal(){
     }
     public Animal (String name1, String gender1){
         name = name1;
         gender = gender1;
         
     }
     public void setName(String name2){
    	 name = name2;
     }
     public void setAge(String  age1){
    	 age = age1;
     }
     public void setHeight(String height1){
    	 height = height1;
     }
     public void setGender(String gender1){
    	 gender = gender1;
     }
     public void setHair(String  hair1){
    	 hair = hair1;
     }
     public String getName(){return name;}
     public String  getAge(){return age;}
     public String  getHeight(){return height;}
     public String getGender(){return gender;}
     public String getHair(){return hair;}
     public void showAll(){
     System.out.println("name: "+this.getName());
     System.out.println("age: "+this.getAge()+"·³");
     System.out.println("height: "+this.getHeight()+"cm");
     System.out.println("gender: "+this.getGender());
     System.out.println("hair1: "+this.getHair());
 
     }
}
