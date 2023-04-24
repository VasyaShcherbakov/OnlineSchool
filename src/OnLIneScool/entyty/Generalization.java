package OnLIneScool.entyty;



public class Generalization <T1,T2> {



    private T1[] generalizationarray1;
    private T2[] generalizationarray2;



    private int size;


    public Generalization(int size){
        generalizationarray1=(T1[]) new Object[size];
        generalizationarray2=(T2[]) new Object[size];


    }
      public int getSize(){
        return this.size;
      }
      public boolean isEmpty(){
        return size==0;
      }
    public <E> void get(int index) throws IndexOutOfBoundsException{

            throw new IndexOutOfBoundsException("Index"+index+"is out");
        }



      }
