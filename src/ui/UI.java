package ui;

public class ui {

    public static void printItems(int numberOf){
        StringBuilder line = new StringBuilder();

        for(int  i = 0; i < numberOf; i++){
            line.append(" |");
        }
        line.append("\n");
        line.append(line);
        System.out.print(line);;
    }

}
