package generation;

import addressbook.model.GroupData;
import org.junit.runners.Parameterized;

import  java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GroupDataGenerator {

    @Parameterized.Parameter(names = "-c", description ="Group count")
    public int count;

    @Parameterized.Parameter(names ="-f", description ="Target file")
    public String file;
    private Object format;

    public static <JCommander> void main(String[] args) throws IOException {
        GroupDataGenerator generator = new GroupDataGenerator();
       JCommander jCommander = new JCommander(generator);
        int count = integer.parseInt(args[0]);//Передаём колличество групп/ Параметры указываются в настройках конфигураций и + путь к файлу
        File file = new File (args[1]); //Передаём файл

        try {
            JCommander.parse(args);

        } catch (ParameterException ex){
            jCommander.usage();
            return;
        }
        generator.run();
    }
        private void run() throws IOException {


            //Генерация данных
            List<GroupData> groups = generateGroups(count);
            
            //Сохранение данных в формате csv
            if(format.equals("csv")){
                saveAsCsv(groups, new File(file));
            }//Сохранение данных в формате xml
            else if(format.equals("xml")) {
                saveAsXml(groups, new File(file));
            }  //Сохранение данных в формате json
            else  if(format.equals("json")) {
                saveAsJson(groups, new File(file));
            }//Сохранение данных в файл
            save(groups, new File(file));
            


    }

    private void saveAsCsv(List<GroupData> groups, File file) {
        System.out.println(new File(".").getAbsolutePath()){
            try (Writer writer = new FileWriter(file)) {
                for(GroupData group : groups){
                    writer.write(String.format("%s;%s;%s\n", group.getName(), group.getHeader(), group.getFooter()));
                }
            }
        }
    }

    private void saveAsXml(List<GroupData> groups, File file) {
    XStream xstrean = new XStream();
    xstrean.processAnotations(GroupData.class);
        String xml = xstrean.toXML(groups);
        try (Writer writer = new FileWriter(file)) {
            writer.write(xml);
        }
    }
    private void saveAsJson(List<GroupData> groups, File file) throws IOException{
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      String json = Gson.toJson(groups);
      try(Writer writer = new FileWriter(file)){
            writer.write(json);
        }
    }


    //Сохранение в файл
    private void save(List<GroupData> groups, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (GroupData group : groups){
            writer.write(String.format("%s; %s;%s\n",group.getName(),group.getHeader(),group.getFooter()));
        }
        //Закрытие файла
        writer.close();

    }

    //Генерация данных
    private List<GroupData> generateGroups(int count) {

        List<GroupData> groups = new ArrayList<GroupData>();
        for (int i=0;i<count; i++){
            groups.add(new GroupData().withName(String.format("test %s",i))
                    .withHeader(String.format("header %s",i))
                    .withFooter(String.format("footer %s",i)));

        }
        return groups;

    }

    public void setFormat(Object format) {
        this.format = format;
    }
}
