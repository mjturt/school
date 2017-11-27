public class diamond {
//Algorithm draws diamond the height of given command line parameters. Parameter must be positive uneven integer 

    public static void main(String[] args){
        int luku = Integer.parseInt(args[0]);
        if (luku % 2 == 0) {
            //Error, parameter is not positive uneven integer
            System.out.println("Virhe, parametri ei ole positiivinen pariton kokonaisluku");
        }
        else {
        int valit = luku / 2;
        int tahdet1 = luku - 1;
        int tahdet = luku - tahdet1;
        for (int i = 1; i <= luku / 2 + 1; i++) {
            for (int j = 1; j <= valit; j++) {
                System.out.print(" ");
            }
            valit = valit - 1;
            for (int h = 0; h < tahdet; h++) {
                System.out.print("*");
            }
            tahdet = tahdet + 2;
            System.out.println("");
        }
        valit = valit + 1;
        tahdet = tahdet - 2;
        for (int i = 1; i <= luku / 2; i++) {
            valit = valit + 1;
            for (int j = 1; j <= valit; j++) {
                System.out.print(" ");
            }
            tahdet = tahdet - 2;
            for (int h = 0; h < tahdet; h++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    }
}
