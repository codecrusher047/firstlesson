/**
* The Idea of this class was born in a Café in St. Ursanne, Switzerland 
*/  
public class Cup {
    int size;
    int content;
    String owner;
    

     
    public Cup(String owner) {
        this.owner = owner;
    }

    public void fill (int amount){

        // if the amount and content is more

        if(content + amount > size) {
             content = size;}

         // 
        else
        content = content + amount;


        }

    @Override
    public String toString() {
    
        return "owner is " + owner + " size is: " + size + " content is " + content;
    }

    public void empty() {

    content = 0;
    }

    
}
