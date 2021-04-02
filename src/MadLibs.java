import java.util.*;

public class MadLibs {
    public static void main(String[] args) {
        String adjective;
        String noun;
        String pob;
        String adjective2;
        String noun2;
        Scanner Userinput = new Scanner(System.in);
        String[] str = new String[]{"The" + "X" + "X" + "went to the" + "X" + "and asked them for a" + "X" + "X" + "."};


        System.out.println("Please enter an adjective: ");
        adjective = Userinput.nextLine();
        System.out.println("Please enter a noun: ");
        noun = Userinput.nextLine();
        System.out.println("Please enter a place of business: ");
        pob = Userinput.nextLine();
        System.out.println("Please enter another adjective");
        adjective2 = Userinput.nextLine();
        System.out.println("Please enter another noun");
        noun2 = Userinput.nextLine();
        String[] userArray = new String[]{adjective + noun + pob + adjective2 + noun2};

       for(int i=0;i<=str.length;i++){
            if(str[i]=="X"){
                for(int j=0;j<=userArray.length;j++){
                    str[i]=userArray[j];
                                                    }

                            }
                                    }

        }
    }