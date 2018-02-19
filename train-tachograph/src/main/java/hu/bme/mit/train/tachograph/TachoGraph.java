package hu.bme.mit.train.tachograph;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Date;

public class TachoGraph {
    public Table<Date,Integer, Integer> data = HashBasedTable.create();
}
