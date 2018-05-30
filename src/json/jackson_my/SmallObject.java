package json.jackson_my;

public class SmallObject extends MainObject {

    private String param_5;
    private String param_6;

    public SmallObject(String param_5, String param_6) {
        super("a.SmallObject");
        this.param_5 = param_5;
        this.param_6 = param_6;
    }

    public String getParam_5() {
        return param_5;
    }

    public void setParam_5(String param_5) {
        this.param_5 = param_5;
    }

    public String getParam_6() {
        return param_6;
    }

    public void setParam_6(String param_6) {
        this.param_6 = param_6;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmallObject{");
        sb.append("param ='").append(this.getParam()).append('\'');
        sb.append(", param_1 ='").append(this.getParam_1()).append('\'');
        sb.append(", param_2 ='").append(this.getParam_2()).append('\'');
        sb.append(", param_3 ='").append(this.getParam_3()).append('\'');
        sb.append(", param_4 ='").append(this.getParam_4()).append('\'');
        sb.append(", param_5 ='").append(param_5).append('\'');
        sb.append(", param_6 ='").append(param_6).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        // SmallObject{param_1='UjVI5QSZrr', param_2='Test', param_3='UA', param_4='MainObject', param_5='SmallObject_1', param_6='SmallObject_2'}
        SmallObject smallObject = new SmallObject("SmallObject_1","SmallObject_2");
        System.out.println(smallObject.toJson());
        System.out.println(smallObject.toJsonSmall());
    }
}
