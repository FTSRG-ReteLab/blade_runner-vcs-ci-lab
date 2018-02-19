import hu.bme.mit.train.tachograph.TachoGraph;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TestTachoGraph {

    @Test
    public void testTachoGraphIsNotEmpty(){
        TachoGraph tachoGraph = new TachoGraph();
        tachoGraph.data.put(new Date(), 3 ,4);
        Assert.assertFalse(tachoGraph.data.isEmpty());
    }
}
