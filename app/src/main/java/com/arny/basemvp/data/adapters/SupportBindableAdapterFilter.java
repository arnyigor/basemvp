package com.arny.basemvp.data.adapters;

public interface SupportBindableAdapterFilter {
    boolean onFilterItem(CharSequence constraint, String item);
}