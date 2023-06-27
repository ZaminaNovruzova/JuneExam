package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueValues {
    @UnicalValues
    List<UniqueValues> uniqueValues;

    public UniqueValues() {
        this.uniqueValues = new ArrayList<>();
    }

    public void add(UniqueValues values) {
        uniqueValues.add(values);
    }

    public void uniqueValues(UniqueValues values) throws IllegalArgumentException {
        if (uniqueValues.contains(values)) {
            throw new IllegalArgumentException("bu deyer artiq movcuddur");
        } else {
            uniqueValues.add(values);
        }

    }
}