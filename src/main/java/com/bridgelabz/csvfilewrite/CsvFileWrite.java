package com.bridgelabz.csvfilewrite;

import com.bridgelabz.model.UserModel;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWrite {

    public static final String NEW_FILE="newfile.csv";

    public static void main(String[] args) {

        try (Writer writer= Files.newBufferedWriter(Paths.get(NEW_FILE))){

            StatefulBeanToCsv<UserModel> beanToCsv=new StatefulBeanToCsvBuilder<UserModel>(writer).build();

            List<UserModel> list=new ArrayList<>();

            UserModel userModel1=new UserModel("swapnil","pune","india");
            UserModel userModel2=new UserModel("sandip","hingoli","india");
            UserModel userModel3=new UserModel("shourya","mumbai","india");
            list.add(userModel1);
            list.add(userModel2);
            list.add(userModel3);
            beanToCsv.write(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvRequiredFieldEmptyException e) {
            throw new RuntimeException(e);
        } catch (CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);
        }
    }
}
