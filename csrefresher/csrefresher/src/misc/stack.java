String s = "Hi My name is";

int pos = s.indexOf("name");
//-1 if not found

.charAt()
.substring(0,pos)
.equalsIgnoreCase
replace(old,new)


 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int pd = 0;
    int sd = 0;
    int x=0, counter=-1;
    for(List<Integer> list: arr){
        int y=0;
        for(int i: list){
           if(x==y) {
                pd+=i;
                }
            if(counter==list.size()-1)
                {
                    sd+=i;
                    counter=0;
                }
            y++;
            counter++;
        }
    x++;
    }
    
    return Math.abs(pd-sd);
   
    }

}



    public static void ModOne() {
        System.out.println("ModOne");

        int[] primes = { 2, 3, 5, 7 };
        for (int x : primes) {
            System.out.println(x);
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("This pad is running Java " + Runtime.version().feature());
        for (String string : list) {
            System.out.println(string);
        }

        Stack<Integer> temp = new Stack<Integer>();
        temp.push(2);
    }
