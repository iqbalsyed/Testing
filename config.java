public class config{

    public static void config(){
        System.out.println("test case find max");
        assertEquals(4,Calculation.FindMax(new int[]{1,3,4,2}));
         assertEquals(-2,Calculation.FindMax(new int[]{-12,-3,-4,-2}));
    }
}