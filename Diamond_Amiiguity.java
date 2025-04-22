package Inhertance;

interface i1
{
    public void display();

}
class demo implements i1{

    public void display(){
        System.out.println("Interface Method");
    }
}

class Diamond_Amiiguity {

    public static void main(String[]args){
        System.out.println("Helllo");
        demo d = new demo();
        d.display();
    }
}


    

