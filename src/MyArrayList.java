import java.util.Arrays;

public class MyArrayList {
    int[]main=new int[0];

    public void add(int value){
        int[]extended=new int[main.length+1];
        for(int i=0; i<extended.length; i++){
            if(i<(extended.length-1)){
                extended[i]=main[i];
            }
            else{
                extended[i]=value;
            }
        }
        main=extended;
    }

    public void add(int value,int index){
        int[]extended=new int[main.length+1];
        for(int i=0;i<extended.length;i++){
            if(i==index){
                extended[i]=value;
                for(int j=i+1;j<extended.length;j++){
                    extended[j]=main[i++];
                }
            }
            else {
                extended[i]=main[i];
            }
        }
        main=extended;

    }

    public void remove(int index){
        int []shortened=new int[main.length-1];

        for(int i=0;i<main.length;i++){
            if(i==index){
                shortened[i]=main[++i];
                for(int j=i;j<shortened.length;j++){
                    shortened[j]=main[++i];
                }
                main=shortened;
                break;
            }
            else{
                shortened[i]=main[i];
            }
        }

    }

    public void set(int value, int index){
        main[index]=value;
    }

    public int getLength(){
        return main.length;
    }

    public int get(int index){
        return main[index];
    }

    public String toString(){
        return Arrays.toString(main);
    }
}
