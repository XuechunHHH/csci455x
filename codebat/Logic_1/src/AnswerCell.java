public class AnswerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(true, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep) return false;
        if(isMorning&&!isMom) return false;
        return true;
    }
}
