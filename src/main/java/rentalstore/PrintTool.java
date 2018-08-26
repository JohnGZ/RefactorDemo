package rentalstore;

public class PrintTool {
    public static String printNameLine(String name){
        return CONST.NAME_LINE_BEGIN + name + CONST.NAME_LINE_END;
    }
    public static String printRecordLine(String title,Double amount){
        return CONST.RECORD_BEGIN + title + CONST.EQUAL + String.valueOf(amount) + CONST.RECORD_END;
    }
    public static String printOweLine(Double sumAmount){
        return CONST.OWE_LINE_BEGIN + String.valueOf(sumAmount) + CONST.OWE_LINE_END;
    }
    public static String printEarnedLine(Double sumPoint){
       return CONST.EARNED_LINE_BEGIN + String.valueOf(sumPoint) + CONST.EARNED_LINE_END;
    }
}
