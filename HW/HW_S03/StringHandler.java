package HW_S03;


public class StringHandler {
    public String setUserString(String us) {
        String[] list = parsUserString(us);
        int flag = checkString(list);
        if (flag == 1) {
            FileCreator.setList(list);
        }
        return getRes(flag, list[0]);
    }

    public int checkString(String[] s) {
        String[] str = s;
        String dataStr = str[3];
        FormatConverter.strToDate(dataStr);
        if (str.length != 6) {
            return 0;
        }
        if (!(((dataStr.matches("^(\\d{4}).(0?[1-9]|1[012]).(0?[1-9]|[12][0-9]|3[01])$")) ||
                dataStr.matches("^(0?[1-9]|[12][0-9]|3[0-1]).(0?[1-9]|1[0-9]).\\d{4}$")))) {
            return -3;
        }
        if (!str[4].matches("[0-9]+")) {
            return -4;
        }
        if (!(str[5].equals("m") || str[5].equals("f"))) {
            return -5;
        }
        return 1;
    }

    public String[] parsUserString(String us) {
        String[] list = us.split(" ");
        return list;
    }

    public String getRes(int flag, String fn) {
        int fl = flag;
        String text = "Ошибка";
        if (fl == 1) {
            text = "Данные записаны в файл " + fn + ".txt";
            return text;
        }
        if (fl == 0) {
            text = "Количество данных не соответствует трубуемому.\nЗадайте ещё раз.";
            return text;
        }
        if (fl == -3) {
            text = "Неверно задана дата\nЗадайте ещё раз.";
            return text;
        }
        if (fl == -4) {
            text = "Неверно задан номер телефона\nЗадайте ещё раз.";
            return text;
        }
        if (fl == -5) {
            text = "Неверно задан пол\nЗадайте ещё раз.";
            return text;
        }
        return text;
    }
}
