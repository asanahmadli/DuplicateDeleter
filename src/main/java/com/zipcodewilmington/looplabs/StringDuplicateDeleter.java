package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public String[] array;

    public StringDuplicateDeleter(String[] array) {
        super(array);
        this.array = array;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j=0;j<array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if (count>=maxNumberOfDuplications){
                len++;
            }

        }

        String[] arr = new String[array.length-len];
        int index = 0;
        for (int i = 0; i < array.length;i++){
            int count = 0;
            for(int j=0;j<array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if (count<maxNumberOfDuplications){
                arr[index]  = array[i];
                index++;
            }
        }

        return arr;

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j=0;j<array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if (count==exactNumberOfDuplications){
                len++;
            }

        }

        String[] arr = new String[array.length-len];
        int index = 0;
        for (int i = 0; i < array.length;i++){
            int count = 0;
            for(int j=0;j<array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if (count!=exactNumberOfDuplications){
                arr[index]  = array[i];
                index++;
            }
        }

        return arr;
    }
}
