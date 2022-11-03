public class Main {
    public static void main(String[] args) {

    Lamp lamp_on = new Lamp("Samsung", "On", "Белый");
    lamp_on.display_info();

    Lamp lamp_off = new Lamp("LG", "Off", "Серый");
    lamp_off.display_info();
    }
}

class Lamp{
    String name;
    String condition;
    String color;

    Lamp( String name, String condition, String color){
        this.name = name;
        this.condition = condition;
        this.color = color;
    }

    void display_info(){
        System.out.println("Название - "+name+"\n"+"Состоние - " + condition + "\n" + "Цвет - " + color+'\n');
    }
}