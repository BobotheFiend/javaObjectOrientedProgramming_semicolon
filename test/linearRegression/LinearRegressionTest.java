package linearRegression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinearRegressionTest {

    LinearRegression predict;
    @BeforeEach
    public void setUp(){
        //Given
        predict = new LinearRegression();
        predict.setAxisXValues(new double[]{1,2,3,4,5,});
        predict.setAxisYValues(new double[]{2,4,5,4,5});
    }

    @Test
    public void myXaxisAndYaxis_collect5Elements_axisXIsNotEmptyTest(){

        //CheckThat
        assertFalse(predict.isAxisEmpty());
    }

    @Test
    public void myXaxisAndYaxis_collect0Elements_axisXIsEmptyTest(){

        //When
        predict.setAxisXValues(new double[]{});
        predict.setAxisYValues(new double[]{});

        //CheckThat
        assertTrue(predict.isAxisEmpty());
    }

    @Test
    public void checkThatXElementsAndYElemntsAreDeclared_findTheMean_meanIs3And4Test(){
        //When
        predict.calculateMeanX();
        predict.calculateMeanY();

        //Check that
        assertEquals(4, predict.getMeanForY());
        assertEquals(3, predict.getMeanForX());

    }
    @Test
    public void declareYourElements_findTheMeanOfXandY_calculateTheNumerator_numeratorIs6Test(){
        //When
        predict.calculateMeanX();
        predict.calculateMeanY();

        //Check That
        assertEquals(6.0, predict.calculateNumerator());

    }

    @Test
    public void declareElements_findTheMeanOfX_calculateTheDenominator_denominatorIs10Test(){
        //When
        predict.calculateMeanX();

        //Check That
        assertEquals(10.0, predict.calculateDenominator());
    }

    @Test
    public void declareElements_findTheMeanOfXandY_calculateNumeratorAndDenominator_getSlope_checkThatSlopeIs0_6Test(){
        //When
        predict.calculateMeanX();
        predict.calculateMeanY();

        predict.calculateNumerator();
        predict.calculateDenominator();

        predict.setTheSlope();

        //Check that
        assertEquals(0.6, predict.getSlope());
    }

    @Test
    public void declareElements_findTheMeanOfXandY_calculateNumeratorAndDenominator_getSlope_getTheIntercept_checkinterceptResultToBe2_2Test(){
        //Given
        predict.calculateMeanX();
        predict.calculateMeanY();

        predict.calculateNumerator();
        predict.calculateDenominator();

        predict.setTheSlope();

        predict.checkIntercept();

        //Check that
        assertEquals(2.2, predict.getIntercept());
    }
    @Test
    public void declareElements_findTheMeanOfXandY_calculateNumeratorAndDenominator_getSlope_getTheIntercept_ifThePredictionis10_theResultIs8_2Test(){
        //Given
        predict.calculateMeanX();
        predict.calculateMeanY();

        predict.calculateNumerator();
        predict.calculateDenominator();

        predict.setTheSlope();

        predict.checkIntercept();

        //Check that
        assertEquals(8.2, predict.predictedOutcome(10));
    }
}
