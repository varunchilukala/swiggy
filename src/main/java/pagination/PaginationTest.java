package pagination;

import java.util.List;

public class PaginationTest {
    public static void main(String[] args) {
        Dataservice dataservice = new Dataservice();
        List <String> names = dataservice.getnames();
        Pagination pagination = new Pagination();
        pagination.perPageRecordsSize=10;
        System.out.println(names.size()%10);
        if (names.size()% 10 > 0){

            pagination.totalPages=names.size()/10+1;
        }
        else {
        pagination.totalPages= names.size()/10;
        }
       for (int i=0; i<pagination.totalPages;i++){
           int endindex=(i*pagination.perPageRecordsSize)+pagination.perPageRecordsSize;
           if (endindex > names.size()){
               endindex=names.size();
           }
           List<String> stringList =names.subList(i*pagination.perPageRecordsSize,endindex);

           System.out.println("page value"+i+ "values" + stringList);

}

    }
}
