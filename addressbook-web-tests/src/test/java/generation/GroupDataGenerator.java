package generation;

import addressbook.model.GroupData;

import  java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GroupDataGenerator {

    public static void main(String[] args) throws IOException {
        int count = integer.parseInt(args[0]);//Передаём колличество групп/ Параметры указываются в настройках конфигураций и + путь к файлу
        File file = new File (args[1]); //Передаём файл

      //Генерация данных
        List<GroupData> groups = generateGroups(count);
      //Сохранение данных в файл
save(groups, file);
    }
//Сохранение в файл
    private static void save(List<GroupData> groups, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (GroupData group : groups){
            writer.write(String.format("%s; %s;%s\n",group.getName(),group.getHeader(),group.getFooter()));
        }
        //Закрытие файла
        writer.close();

    }

    //Генерация данных
    private static List<GroupData> generateGroups(int count) {

        List<GroupData> groups = new ArrayList<GroupData>();
        for (int i=0;i<count; i++){
            groups.add(new GroupData().withName(String.format("test %s",i))
                    .withHeader(String.format("header %s",i))
                    .withFooter(String.format("footer %s",i)));

        }
        return groups;

    }
}
