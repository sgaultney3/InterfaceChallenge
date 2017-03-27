package com.company;

import java.util.List;

/**
 * Created by Sam on 3/26/2017.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
