package hometask_JavaCore02;

public class LimitsOfTypesApp {
    public static void main(String[] args) {

        boolean minBooleanValue= Boolean.FALSE;
        boolean maxBooleanValue = Boolean.TRUE;
        System.out.println("boolean: "+ minBooleanValue + " ... " + maxBooleanValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("byte: "+ minByteValue + " ... " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("short: "+ minShortValue + " ... " + maxShortValue);

        char minCharValue = Character.MIN_VALUE;
        char maxCharValue = Character.MAX_VALUE;
        System.out.println("char: "+ (int)minCharValue + " ... " + (int)maxCharValue);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("int: "+ minIntValue + " ... " + maxIntValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("long: "+ minLongValue + " ... " + maxLongValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("float: "+ minFloatValue + " ... " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("double: "+ minDoubleValue + " ... " + maxDoubleValue);
    }

}
