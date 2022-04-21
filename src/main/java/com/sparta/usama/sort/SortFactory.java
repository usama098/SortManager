package com.sparta.usama.sort;

import java.util.Locale;

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
