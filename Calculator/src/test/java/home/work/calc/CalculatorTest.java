package home.work.calc;

        import org.junit.Assert;
        import org.junit.Test;


public class CalculatorTest {
    @Test
    public void CheckSumm() {
        Calculator obj1 = new Calculator();
        obj1.setNum(3,8);
        Assert.assertEquals(11, obj1.getSumm());
        obj1.setNum(133,7);
        Assert.assertEquals(140, obj1.getSumm());
    }
    @Test
    public void CheckMinus() {
        Calculator obj1 = new Calculator();
        obj1.setNum(3,8);
        Assert.assertEquals(-5, obj1.getMinus());
    }
    @Test
    public void CheckMult() {
        Calculator obj1 = new Calculator();
        obj1.setNum(3,8);
        Assert.assertEquals(24, obj1.getMult());
    }
    @Test
    public void CheckDev() {
        Calculator obj1 = new Calculator();
        obj1.setNum(3,8);
        Assert.assertEquals(0.37, obj1.getDiv(),2);
    }
}
