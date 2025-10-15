package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder sB = new StringBuilder();
        int count = 0;
        for (String str : strs ){
            count++;
            if (str.contains("b")) {
                str = str.replace("b", "o");

            }
            sB.append(count)
                        .append(") ")
                        .append(str)
                        .append(System.lineSeparator());
        }
            return (sB.toString());
        }
    }