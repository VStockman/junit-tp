package test;

import static org.junit.Assert.assertEquals;


import java.util.Vector;

import src.VecteurUnion;

public class VecteurTest {
    

	@org.junit.Test
    public void TestMergeVectors(){
        Vector<Object> firstTest = new Vector<Object>() {
            private static final long serialVersionUID = 1L;

            {
                add(1);
                add("1");
            }
        };
        
        Vector<Object> secondTest = new Vector<Object>() {
            private static final long serialVersionUID = 1L;

            {
                add(1.00);
            }
        };

        Vector<Object> thirdTest = VecteurUnion.UnionSet(firstTest, secondTest);
        assertEquals(1, thirdTest.size());
    }
}