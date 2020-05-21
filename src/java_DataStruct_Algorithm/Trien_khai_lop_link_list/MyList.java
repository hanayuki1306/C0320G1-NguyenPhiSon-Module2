package java_DataStruct_Algorithm.Trien_khai_lop_link_list;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private  int capacity = 0;
    Object[] arr_list;

    public int setCapacity(int capacity) {
        this.capacity = capacity;
        return capacity;
    }

    public int capacityUse(){
        if (capacity!=0){
            return capacity;
        }   else return DEFAULT_CAPACITY;
    }

    public  MyList(int capacity) {
        this.capacity = setCapacity(capacity);
        arr_list = new Object[capacityUse()];
    }
    public MyList(){
        arr_list = new Object[DEFAULT_CAPACITY];
    };

    public void add(int index ,E element){
       if (arr_list[index-1] == null ) {
            arr_list[index-1] = element;
       } else {
          for (int i = capacityUse()-1;i> index-1; i--){
              arr_list[i] = arr_list[i-1];
          }
          arr_list[index-1] = element;

       }
        arr_list[size++] = element;

    }
    public void add(E element){
//        for (int j = 0; j< capacityUse(); j++){
//
//        }


        for (int i = capacityUse()-1;i>0;i--){
            if (arr_list[i] == null) {
                arr_list[i] = element;
                break;
            }
        }
    };

    public void printList() {

        for (int i = 0; i < capacityUse(); i++) {
            if (arr_list[i] != null){
                System.out.println(arr_list[i]);
            }
        }
    }
}
