package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public Integer[] intArray;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray = intArray;

    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int len = 0;
        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for(int j=0;j<intArray.length;j++){
                if(intArray[i].equals(intArray[j])){
                    count++;
                }
            }
            if (count>=maxNumberOfDuplications){
                len++;
            }

        }

        Integer[] arr = new Integer[intArray.length-len];
        int index = 0;
        for (int i = 0; i < intArray.length;i++){
            int count = 0;
            for(int j=0;j<intArray.length;j++){
                if(intArray[i].equals(intArray[j])){
                    count++;
                }
            }
            if (count<maxNumberOfDuplications){
                arr[index]  = intArray[i];
                index++;
            }
        }

        return arr;

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {


        int len = 0;
        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for(int j=0;j<intArray.length;j++){
                if(intArray[i].equals(intArray[j])){
                    count++;
                }
            }
            if (count==exactNumberOfDuplications){
                len++;
            }

        }

        Integer[] arr = new Integer[intArray.length-len];
        int index = 0;
        for (int i = 0; i < intArray.length;i++){
            int count = 0;
            for(int j=0;j<intArray.length;j++){
                if(intArray[i].equals(intArray[j])){
                    count++;
                }
            }
            if (count!=exactNumberOfDuplications){
                arr[index]  = intArray[i];
                index++;
            }
        }

        return arr;
    }
}
