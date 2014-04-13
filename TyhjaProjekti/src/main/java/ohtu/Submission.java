package ohtu;

public class Submission {
    private String  student_number;
    private int     week;
    private int     hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean[] getAnswers() {
        boolean[] array = new boolean[21];
        array[0]  = a1;
        array[1]  = a2;
        array[2]  = a3;
        array[3]  = a4;
        array[4]  = a5;
        array[5]  = a6;
        array[6]  = a7;
        array[7]  = a8;
        array[8]  = a9;
        array[9]  = a10;
        array[10] = a11;
        array[11] = a12;
        array[12] = a13;
        array[13] = a14;
        array[14] = a15;
        array[15] = a16;
        array[16] = a17;
        array[17] = a18;
        array[18] = a19;
        array[19] = a20;
        array[20] = a21;

        return array;
    }

    public int getWeek() {
        return this.week;
    }

    public int getHours() {
        return this.hours;
    }
    
}