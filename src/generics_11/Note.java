package generics_11;

public class Note {

    public <T extends AbstractTable> List<T> getTable (WebElement table, Class<T> t){
        List<T> r = new ArrayList<T>();
        try{
            List<WebElement> wrp = table.findElements(By.tagName("tr"));
            for (int i = 0; i<wrp.size(); i++){
                T d = t.newInstance();
                d.setElement(wrp.get(i));
                r.add(d);
            }}catch(Exception e){

        }
        return r;
    }
}
