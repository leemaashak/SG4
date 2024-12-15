public class Set {
    private int[] group;
    private int actualSize;
    private final int maximum = 10;

    public Set() {
        group = new int[maximum];
        actualSize = 0;
    }


    public boolean isMember(int n) {
        for (int i = 0; i < actualSize; i++) {
            if (n == group[i]) {
                return true;
            }
        }// for

        return false;

    }


    public boolean isFull() {
        return actualSize == maximum;
    }


    public boolean Add(int num) {
        if (isFull() || isMember(num)) {
            //cant add num
            return false; //return doest just return false it also stops the functions
        }
        //adding process
        group[actualSize] = num;
        actualSize++;
        return true;
    }


    public void show(){
        System.out.print("(");
        for (int i = 0; i < actualSize; i++) {
            System.out.print(group[i]  );
            if(i != actualSize -1) {
                System.out.print(",");
            }
        }
        System.out.println(")");


    }


    public boolean isEmpty(){
      return actualSize == 0;
    }


    public void remove(int num){
        if (!isMember(num)){
            return;
        }

        int index = findIndex(num);
        int lastNumber = group[actualSize-1];
        group[index] = lastNumber;
        group[actualSize-1]=0;
        actualSize= actualSize-1;

    }


    public int findIndex(int num){
        for(int i = 0; i < actualSize; i++){
            if (num == group[i]) {
                return i;
            }
        }
        return  -1 ;
    }




} //class
