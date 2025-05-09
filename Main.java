
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //-------------Fun stuff-----------------------
        // Date dateop = new Date(); <--- 4/5/2025
        // System.out.println(dateop);
        // System.out.println("working");
        //
        //----------------Arrays------------------
        // int[] num = new int[5]; // initialising an array
        // num[0] = 1;
        // num[1] = 100;
        // //Arrays.toString(num) <--- this function gets the the values of a array and converts them to a string to be printed.
        // System.out.println(Arrays.toString(nums));
        // int[] nums = {1, 21, 55}; // with variables
        // System.out.println(nums.length);
        // 
        //---------------------Two Dimensional Arrays-----------------------
        // int[][] nums = new int[2][3]; // two rows and 3 columns for more dimensions add more []
        // nums[0][0] = 1;
        // System.out.println(Arrays.deepToString(nums)); // Arrays.deepToString() for multidimensional arrays
        // int[][] nums = {{1, 2, 3}, {5, 6, 7}};
        // System.out.println(Arrays.deepToString(nums));
        //
        //Constants ----> final <datatype> <variable> = <data>;
        //
        // int a = (int) Math.pow(2, 3);
        // System.out.println(a);
        //
        //--------User Input ---------------
        // Scanner s = new Scanner(System.in); // System.out to print on the terminal
        // System.out.print("Enter something: ");
        // int a = s.nextInt(); // next(); for a single word and etc and nextLine(); for the whole line
        // s.nextLine();
        // System.out.print("Enter something: ");
        // String b = s.nextLine().trim();
        // System.out.println(a + b);
        //
        // ------- Conditional Statements ----------
        /*
        if (condition){
            ------
            --
        }else if(condition){
            -----
            ---        
        }else{
            -----        
        }
         */
        //
        //--------Switch ---------
        /*
        switch(arg){
            case <value of arg>:
                ----;
                break;
            case <value of arg>:
                ----;
                break;
            case <value of arg>:
                ----;
                break;
            default:
                ----;
        }
         */
        //
        //--------------Loops-------------
        /*
        for (int i = 0;i<n;i++){
            ------;
        }
        int i = something;
        while(i bla bla){
            -------;
        }
        

        do{
            -----;
        }while(condition);

        --------for each function-------------
        String[] l = {"helo","hello","world"};
        for(String f: l){
            System.out.println(f);
        }
         */
        //
        /* ---------Sets and lists----------- */
        // sets are faster and more efficient 
        //
        // Set<Integer> t = new HashSet<Integer>(); // same as py contains unique elements. You can add a previously created list in this new HashSet<Integer>(previously created list);
        // t.add(5);
        // t.add(54);
        // t.add(6);
        // t.add(70);
        // t.add(5);
        // t.remove(70); // will remove the element
        // //t.clear();//removes everything
        // //t.isEmpty();
        // //t.size();
        // boolean a = t.contains(54); // very fast 
        // System.out.println(a); // output: [5, 54, 6, 70]
        //
        //--------------Tree Set ---------------
        // Set<Integer> t = new TreeSet<Integer>(); // gives a ordered set
        // t.add(5);
        // t.add(54);
        // t.add(6);
        // t.add(70);
        // t.add(5);
        // t.remove(70); // will remove the element
        // //t.clear();//removes everything
        // //t.isEmpty();
        // //t.size();
        // boolean a = t.contains(54); // very fast 
        // System.out.println(t); // output: [5, 6, 54]
        // // you cannot index this.
        //
        //-----------------Linked Hash set-------------------
        // Set<Integer> t = new LinkedHashSet<Integer>(); // This is faster
        // t.add(5);
        // t.add(54);
        // t.add(6);
        // t.add(70);
        // t.add(5);
        // t.remove(70); // will remove the element
        // //t.clear();//removes everything
        // //t.isEmpty();
        // //t.size();
        // boolean a = t.contains(54); // very fast 
        // System.out.println(t); // output: [5, 6, 54]
        // // you cannot index this.
        //
        //---------------------ArrayLists-------------------------------
        // ArrayList<Integer> t = new ArrayList<Integer>();// exactly same as arrays but slower and can change size. Dynamically sized array
        // t.add(1);
        // t.add(5);
        // //t.get(index); //// gets element by index;
        // //t.set(index, element); ////element should already exist
        // //t.size();
        // //t.subList(fromIndex, toIndex); //// gets things within a index
        //
        //---------------------LinkedLists-------------------------------
        ArrayList<Integer> t = new LinkedList<Integer>();// faster than array list
        t.add(1);
        t.add(5);
        //t.get(index); //// gets element by index;
        //t.set(index, element); ////element should already exist
        //t.size();
        //t.subList(fromIndex, toIndex); //// gets things within a index

    }
}
