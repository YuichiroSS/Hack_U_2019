public class Main {

    public static int sex = 0;
    public static int day = 0;
    public static int level = 0;
    
    /** main **/
    public static void main(String[] args) {
        double[] colors = {3,1,4};
        Colorcheck colorcheck = new Colorcheck();
        Shape shape = new Shape();
        double[] calorie =shape.calorie_calc(day, sex, level, 2600);
        Menu_prop menuProp = new Menu_prop();
        Colorpoint cp = new Colorpoint();
        String[] suggestMenu = menuProp.proposal(0);
        for(String menu : suggestMenu){
            System.out.println(menu);
        }

        double[] colorpoint= cp.colorpoint(colors, sex);
        System.out.println(colorpoint[0]+" "+colorpoint[1]);

        /*
        System.out.println(calorie[0]+" "+calorie[1]);

        System.out.println(colorcheck.minColor(colors,day));
        colors = newColors(5,5,10);
        System.out.println(colorcheck.minColor(colors,day));
        colors = newColors(0,5,1);
        System.out.println(colorcheck.minColor(colors,day));

        Colorcheck.printList();
        
        Colorcheck.initializeList(day);
        Colorcheck.printList();

        System.out.println(colorcheck.salt(sex, 7));
        System.out.println(colorcheck.salt(sex, 8));
        System.out.println(colorcheck.salt(sex, 9));
        */
    }

    public static double[] newColors(double r,double g, double y){
        double[] colors = {r,g,y};
        return colors;
    
    }
}