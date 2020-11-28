package enumerators;

public enum Months {
    JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,SEPT,OCT,NOV,DEC;

    public static void main(String[] args) {
        for (Months month:Months.values()) {
            System.out.println(month.toString());
        }
    }

}
