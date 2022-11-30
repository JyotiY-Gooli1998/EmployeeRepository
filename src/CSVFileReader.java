import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

        public static void main(String[] args) throws IOException {

            CSVFileReader csv=new CSVFileReader();
           String filepath="C:\\jyoti\\Employee.csv";
            csv.readCsvFile(filepath);
        }

public  List<Employee> readCsvFile(String filepath ) throws IOException{
            String line="";
          //  filepath="C:\\Users\\Jyoti.Goli@sainsburys.co.uk\\OneDrive - Sainsbury's Supermarkets Ltd\\Desktop";
            List<Employee> employees=new ArrayList<Employee>();


            try {
                BufferedReader br = new BufferedReader(new FileReader(filepath));

                line = br.readLine();
                while ((line= br.readLine())!= null){
                 // list.add(line.split(","));
                    String[] emp=line.split(",");
                    employees.add(new Employee(Integer.valueOf(emp[0]),emp[1],emp[2],Integer.valueOf(emp[3])));
                }
            }
            catch (FileNotFoundException e){
                e.printStackTrace();

            }
return employees;
}


}
