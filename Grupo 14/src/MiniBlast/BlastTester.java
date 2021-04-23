package MiniBlast;

import org.junit.Assert;
import org.junit.Test;

public class BlastTester {
        @Test
        public void blast_Test_Sequence_Should_Return_Matches_Percentage(){
            BlastAlgorithm miniBlast = new BlastAlgorithm();
            char[] seqA = {'a','b','c','c','d','e','g','a'};
            char[] seqB = {'a','c','c','f','d','t','a','a'};


            double matchPercentage = (4.0/8.0)*100;
            System.out.println("The sequences have a " + miniBlast.blast(seqA, seqB) + "% match");
            Assert.assertEquals(matchPercentage, miniBlast.blast(seqA, seqB),0);
        }
    }


