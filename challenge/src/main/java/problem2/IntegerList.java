package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
    private int numElements=0;
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        numElements= list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        int size;
        if(list.length==0){
            size=1;
        }else{
            size= list.length*2;
        }
        int[] tab=new int[size];
        for(int i=0;i< list.length;i++){
            tab[i]=list[i];
        }
        list=tab;
    }
    public void addElement(int newVal){
        if(numElements== list.length){
            increaseSize();
        }
        list[numElements]=newVal;
        numElements++;
    }
    public void removeFirst(int newVal){
        int idx=-1;
        for(int i=0;i<list.length;i++){
            if(list[i]==newVal){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element with value "+ newVal +" is not found");
        }
        list[idx]=0;
        for(int i=idx;i<list.length-1;i++){
            int tmp=list[i];
            list[i]=list[i+1];
            list[i+1]=tmp;
        }
    }
    public void removeAll(int newVal){
        int counter=0;
        for(int i=0;i< list.length;i++){
            if(list[i]==newVal){
                counter++;
            }
        }
        while(counter>0){
            removeFirst(newVal);
            counter--;
        }
    }
}