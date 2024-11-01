public class Cup {
    int size;
    int content;
    

     
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
    
        return "size is: " + size + " content is " + content;
    }

    
}