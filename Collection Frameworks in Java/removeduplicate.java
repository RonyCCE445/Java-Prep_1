import java.util.ArrayList;

public class removeduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> org_list= new ArrayList<>();
        ArrayList <Integer> new_List = new ArrayList<>();
        //[1, 2, 2, 3, 4, 4, 5]
        org_list.add(1);
        org_list.add(2);
        org_list.add(2);
        org_list.add(3);
        org_list.add(4);
        org_list.add(4);
        org_list.add(5);

        for(int i =0; i<org_list.size();i++){
            if(new_List.contains(org_list.get(i))){
                continue;
            }

            else{
                new_List.add(org_list.get(i));
            }
        }

        System.out.println("Original List was: "+org_list);
        System.out.println("The new List is : "+new_List);
            

    }    
}
