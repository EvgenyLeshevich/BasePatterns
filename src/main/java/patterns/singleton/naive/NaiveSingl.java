package patterns.singleton.naive;

public class NaiveSingl {
    private static NaiveSingl naiveSingl;
    public String value;

    private NaiveSingl(String value){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    public static NaiveSingl getInstance(String value){
        if(naiveSingl==null){
            naiveSingl = new NaiveSingl(value);
        }
        return naiveSingl;
    }
}
