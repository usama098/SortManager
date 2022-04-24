package com.sparta.usama.sort;

import com.sparta.usama.sort.BubbleSort;
import com.sparta.usama.sort.MergeSort;
import com.sparta.usama.sort.Sorter;

public class SortFactory {

    public static Sorter getSort(String sortType) {

        switch(sortType.toLowerCase()) {
            case "bubble":
                return new BubbleSort();
            case "merge":
                return new MergeSort();
            default:
                return null;
        }

    }
    // add binary tree sort later
}
