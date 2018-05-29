package json.jackson_my;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.LinkedHashMap;
import java.util.Map;


public abstract class MainObject {

    @JsonIgnore
    private String param;

    private String param_1 = RandomStringUtils.randomAlphanumeric(10);
    private String param_2 = "Test";
    private String param_3 = "UA";
    private String param_4 = "MainObject";

    public MainObject(String param) {
        this.param = param;
    }

    public class MainSmallObj {

        private String param_1 = getParam_1();
        private String param_2 = getParam_2();
        private String param_3 = getParam_3();
        private String param_4 = getParam_4();

        @JsonGetter("param_1")
        public String getParam_11() {
            return param_1;
        }

        @JsonGetter("param_2")
        public String getParam_21() {
            return param_2;
        }

        @JsonGetter("param_3")
        public String getParam_31() {
            return param_3;
        }

        @JsonGetter("param_4")
        public String getParam_41() {
            return param_4;
        }
    }


    public String toJson() {

        try {
            Map<String, MainObject> map = new LinkedHashMap<>();
            map.put(this.param, this);
            return new ObjectMapper().writeValueAsString(map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public String toJsonSmall() {
        try {
            Map<String, MainSmallObj> map = new LinkedHashMap<>();
            map.put(this.param, new MainSmallObj());
            return new ObjectMapper().writeValueAsString(map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getParam_1() {
        return param_1;
    }

    public void setParam_1(String param_1) {
        this.param_1 = param_1;
    }

    public String getParam_2() {
        return param_2;
    }

    public void setParam_2(String param_2) {
        this.param_2 = param_2;
    }

    public String getParam_3() {
        return param_3;
    }

    public void setParam_3(String param_3) {
        this.param_3 = param_3;
    }

    public String getParam_4() {
        return param_4;
    }

    public void setParam_4(String param_4) {
        this.param_4 = param_4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MainObject{");
        sb.append("param='").append(param).append('\'');
        sb.append(", param_1='").append(param_1).append('\'');
        sb.append(", param_2='").append(param_2).append('\'');
        sb.append(", param_3='").append(param_3).append('\'');
        sb.append(", param_4='").append(param_4).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
