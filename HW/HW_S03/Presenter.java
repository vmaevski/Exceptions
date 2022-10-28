package HW_S03;

public class Presenter {
    FileCreator fileCreator;
    StringHandler stringHandler;
    View view;

    public Presenter(FileCreator fc, StringHandler sh, View v) {
        fileCreator = fc;
        stringHandler = sh;
        view = v;
    }

    public void clickButton() {
        int stop = 0;
        String printText = "Задайте данные, разделенные пробелом:\n<Фамилия> <Имя> <Отчество> <дата рождения> <номер телефона> <пол>";
        while (stop != 1) {

            printText = stringHandler.setUserString(view.getString(printText));
            if (printText.equals("txt")) {
                stop = 1;
                view.print(printText);
            } else {
            }
        }

    }

}
